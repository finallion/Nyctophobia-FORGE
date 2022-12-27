package net.finallion.graveyard_biomes.world.biomes;


import net.finallion.graveyard_biomes.init.TGConfiguredFeatures;
import net.finallion.graveyard_biomes.init.TGPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.AquaticPlacements;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.sounds.Musics;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.levelgen.GenerationStep;

public class HauntedForestBiomes {

    public static Biome createHauntedForest(BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder();
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.FOX, 8, 2, 3));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 8, 3, 5));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 10, 3, 5));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 3, 5));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CAT, 1, 1, 1));
        BiomeDefaultFeatures.commonSpawns(spawnSettings);

        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder(context.m_255420_(Registries.f_256988_), context.m_255420_(Registries.f_257003_));
        addBasicFeatures(generationSettings);
        addTaigaFeatures(generationSettings);



        return (new Biome.BiomeBuilder())
                .precipitation(Biome.Precipitation.RAIN)
                .temperature(0.6F)
                .downfall(0.9F)
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .grassColorOverride(0x6F932A)
                        .foliageColorOverride(0x6F932A)
                        .waterColor(0xAEC1BE)
                        .waterFogColor(0xC9DDDA)
                        .fogColor(0x878787)
                        .skyColor(0x878787)
                        .backgroundMusic(Musics.GAME)
                        .ambientLoopSound(SoundEvents.AMBIENT_WARPED_FOREST_LOOP)
                        .ambientMoodSound(new AmbientMoodSettings(SoundEvents.AMBIENT_SOUL_SAND_VALLEY_MOOD, 6000, 8, 2.0D))
                        .ambientAdditionsSound(new AmbientAdditionsSettings(SoundEvents.AMBIENT_SOUL_SAND_VALLEY_ADDITIONS, 0.0111D))
                        .build())
                .mobSpawnSettings(spawnSettings.build())
                .generationSettings(generationSettings.m_255380_())
                .build();
    }


    public static Biome createHauntedLakes(BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder();
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.FOX, 8, 2, 3));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 8, 3, 5));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 10, 3, 5));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 3, 5));
        BiomeDefaultFeatures.commonSpawns(spawnSettings);

        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder(context.m_255420_(Registries.f_256988_), context.m_255420_(Registries.f_257003_));
        addBasicFeatures(generationSettings);
        addHauntedLakesFeatures(generationSettings);



        return (new Biome.BiomeBuilder())
                .precipitation(Biome.Precipitation.RAIN)
                .temperature(0.6F)
                .downfall(0.9F)
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .grassColorOverride(0x7EA530)
                        .foliageColorOverride(0x7EA530)
                        .waterColor(0x9B091C)
                        .waterFogColor(0xD80D28)
                        .fogColor(0xB2B2B2)
                        .skyColor(0xB2B2B2)
                        .backgroundMusic(Musics.GAME)
                        .ambientLoopSound(SoundEvents.AMBIENT_CRIMSON_FOREST_LOOP)
                        .ambientMoodSound(new AmbientMoodSettings(SoundEvents.AMBIENT_SOUL_SAND_VALLEY_MOOD, 6000, 8, 2.0D))
                        .ambientAdditionsSound(new AmbientAdditionsSettings(SoundEvents.AMBIENT_SOUL_SAND_VALLEY_ADDITIONS, 0.0111D))
                        .build())
                .mobSpawnSettings(spawnSettings.build())
                .generationSettings(generationSettings.m_255380_())
                .build();

    }


    public static Biome createErodedHauntedForest(BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder();
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITHER_SKELETON, 8, 2, 3));
        spawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 8, 1, 2));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 1, 1));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CAT, 1, 1, 1));

        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder(context.m_255420_(Registries.f_256988_), context.m_255420_(Registries.f_257003_));

        addBasicFeatures(generationSettings);
        addTaigaFeatures(generationSettings);

         

        return (new Biome.BiomeBuilder())
                .precipitation(Biome.Precipitation.RAIN)
                .temperature(0.4F)
                .downfall(0.4F)
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .grassColorOverride(0x77AB2F)
                        .foliageColorOverride(0x77AB2F)
                        .waterColor(0xAEC1BE)
                        .waterFogColor(0xC9DDDA)
                        .fogColor(0x6B6B6B)
                        .skyColor(0x6B6B6B)
                        .backgroundMusic(Musics.GAME)
                        .ambientLoopSound(SoundEvents.AMBIENT_BASALT_DELTAS_LOOP)
                        .ambientMoodSound(new AmbientMoodSettings(SoundEvents.AMBIENT_SOUL_SAND_VALLEY_MOOD, 6000, 8, 2.0D))
                        .ambientAdditionsSound(new AmbientAdditionsSettings(SoundEvents.AMBIENT_SOUL_SAND_VALLEY_ADDITIONS, 0.0111D))
                        .build())
                .mobSpawnSettings(spawnSettings.build())
                .generationSettings(generationSettings.m_255380_())
                .build();

    }

    private static void addBasicFeatures(BiomeGenerationSettings.Builder generationSettings) {
        BiomeDefaultFeatures.addDefaultCarversAndLakes(generationSettings);
        BiomeDefaultFeatures.addDefaultCrystalFormations(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultSprings(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
    }

    private static void addTaigaFeatures(BiomeGenerationSettings.Builder generationSettings) {
        BiomeDefaultFeatures.addMossyStoneBlock(generationSettings);
        BiomeDefaultFeatures.addFerns(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addGiantTaigaVegetation(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addDefaultExtraVegetation(generationSettings);
    }


    private static void addHauntedLakesFeatures(BiomeGenerationSettings.Builder generationSettings) {
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addSwampClayDisk(generationSettings);
        BiomeDefaultFeatures.addMossyStoneBlock(generationSettings);
        BiomeDefaultFeatures.addFerns(generationSettings);
        BiomeDefaultFeatures.addGiantTaigaVegetation(generationSettings);
        generationSettings.m_255155_(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_WATERLILY);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addSwampExtraVegetation(generationSettings);
        generationSettings.m_255155_(GenerationStep.Decoration.VEGETAL_DECORATION, AquaticPlacements.SEAGRASS_SWAMP);
    }



}
