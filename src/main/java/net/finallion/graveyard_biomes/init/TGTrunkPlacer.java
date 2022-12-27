package net.finallion.graveyard_biomes.init;

import com.mojang.serialization.Codec;
import net.finallion.graveyard_biomes.TheGraveyardBiomes;
import net.finallion.graveyard_biomes.world.structures.MushroomStructure;
import net.finallion.graveyard_biomes.world.trunk.DeepDarkOakTrunkPlacer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class TGTrunkPlacer {
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACERS = DeferredRegister.create(Registries.f_256963_, TheGraveyardBiomes.MOD_ID);

    public static RegistryObject<TrunkPlacerType<DeepDarkOakTrunkPlacer>> DEEP_DARK_OAK_TRUNK_PLACER = TRUNK_PLACERS.register("deep_dark_oak_trunk_placer", () -> new TrunkPlacerType<>(DeepDarkOakTrunkPlacer.CODEC));

}