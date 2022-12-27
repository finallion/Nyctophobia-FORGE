package net.finallion.graveyard_biomes.util;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.finallion.graveyard_biomes.TheGraveyardBiomes;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ModifiableBiomeInfo;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BiomeModification {

    public record ModBiomeModifier(HolderSet<Biome> biomes, GenerationStep.Decoration generationStage, HolderSet<PlacedFeature> features) implements BiomeModifier {

        private static final RegistryObject<Codec<? extends BiomeModifier>> SERIALIZER =
                RegistryObject.create(
                        new ResourceLocation(TheGraveyardBiomes.MOD_ID, "biome_modification"),
                        ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, TheGraveyardBiomes.MOD_ID);

        @Override
        public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
            if (phase == BiomeModifier.Phase.ADD && biomes.contains(biome)) {
                BiomeGenerationSettingsBuilder generation = builder.getGenerationSettings();
                this.features.forEach(holder -> generation.m_255419_(this.generationStage, holder));
            }
        }

        @Override
        public Codec<? extends BiomeModifier> codec() {
            return SERIALIZER.get();
        }

        public static Codec<ModBiomeModifier> makeCodec() {
            return RecordCodecBuilder.create(builder -> builder.group(
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(ModBiomeModifier::biomes),
                    Codec.STRING.comapFlatMap(ModBiomeModifier::generationStageFromString, GenerationStep.Decoration::toString).fieldOf("generation_stage").forGetter(ModBiomeModifier::generationStage),
                    PlacedFeature.LIST_CODEC.fieldOf("features").forGetter(ModBiomeModifier::features)
            ).apply(builder, ModBiomeModifier::new));
        }

        private static DataResult<GenerationStep.Decoration> generationStageFromString(String name) {
            try {
                return DataResult.success(GenerationStep.Decoration.valueOf(name));
            } catch (Exception e) {
                return DataResult.error("Not a decoration stage: " + name);
            }
        }

    }
}
