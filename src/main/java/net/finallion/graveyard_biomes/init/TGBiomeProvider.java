package net.finallion.graveyard_biomes.init;


import com.mojang.datafixers.util.Pair;
import net.finallion.graveyard_biomes.TheGraveyardBiomes;
import net.finallion.graveyard_biomes.config.GraveyardConfig;
import net.finallion.graveyard_biomes.init.TGBiomes;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import net.minecraftforge.registries.ForgeRegistries;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;


public class TGBiomeProvider extends Region {

    public TGBiomeProvider(ResourceLocation name, int overworldWeight){
            super(name, RegionType.OVERWORLD, overworldWeight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper) {
        this.addModifiedVanillaOverworldBiomes(mapper, builder -> {

            if (GraveyardConfig.COMMON.enableHauntedForest.get()) {
                List<? extends String> configBiomes = GraveyardConfig.COMMON.replaceableBiomesHauntedForest.get();
                for (String configBiome : configBiomes) {
                    builder.replaceBiome(parseBiomeKeys(configBiome, registry.entrySet()), TGBiomes.HAUNTED_FOREST_KEY);
                }
            }

            if (GraveyardConfig.COMMON.enableErodedHauntedForest.get()) {
                List<? extends String> configBiomes = GraveyardConfig.COMMON.replaceableBiomesErodedHauntedForest.get();
                for (String configBiome : configBiomes) {
                    builder.replaceBiome(parseBiomeKeys(configBiome, registry.entrySet()), TGBiomes.ERODED_HAUNTED_FOREST_KEY);
                }
            }

            if (GraveyardConfig.COMMON.enableHauntedLakes.get()) {
                List<? extends String> configBiomes = GraveyardConfig.COMMON.replaceableBiomesHauntedlakes.get();
                for (String configBiome : configBiomes) {
                    builder.replaceBiome(parseBiomeKeys(configBiome, registry.entrySet()), TGBiomes.HAUNTED_LAKES_KEY);
                }
            }

            if (GraveyardConfig.COMMON.enableAncientDeadCoralReef.get()) {
                List<? extends String> configBiomes = GraveyardConfig.COMMON.replaceableBiomesDeadCoralReef.get();
                for (String configBiome : configBiomes) {
                    builder.replaceBiome(parseBiomeKeys(configBiome, registry.entrySet()), TGBiomes.ANCIENT_DEAD_CORAL_REEF_KEY);
                }
            }


            if (GraveyardConfig.COMMON.enableDeepDarkForest.get()) {
                List<? extends String> configBiomes = GraveyardConfig.COMMON.replaceableBiomesDeepDarkForest.get();
                for (String configBiome : configBiomes) {
                    builder.replaceBiome(parseBiomeKeys(configBiome, registry.entrySet()), TGBiomes.DEEP_DARK_FOREST_KEY);
                }
            }
        });
    }

    private ResourceKey<Biome> parseBiomeKeys(String configKey, Set<Map.Entry<ResourceKey<Biome>, Biome>> entrySet) {
        List<ResourceKey<Biome>> biomeKeys = entrySet.stream().map(Map.Entry::getKey).collect(Collectors.toList());
        for (ResourceKey<Biome> key : biomeKeys) {
            String biomeName = key.location().getPath();
            if (biomeName.equals(configKey)) {
                return key;
            }
        }

        TheGraveyardBiomes.LOGGER.error("Wrong biome key \"" + configKey + "\" in config!");
        return null;
    }

/*
    private ResourceKey<Biome> parseBiomeKeys(String configKey, Entry<>) {
        List<ResourceKey<Biome>> biomeKeys = ForgeRegistries.BIOMES.getEntries().stream().map(Map.Entry::getKey).collect(Collectors.toList());
        for (ResourceKey<Biome> key : biomeKeys) {
            String biomeName = key.location().getPath();
            if (biomeName.equals(configKey)) {
                return key;
            }
        }

        TheGraveyardBiomes.LOGGER.error("Wrong biome key \"" + configKey + "\" in config!");
        return null;
    }

 */

}

