package net.finallion.graveyard_biomes.config;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.*;

public class CommonConfig {
    public final ForgeConfigSpec.IntValue theGraveyardBiomesWeight;

    public final ForgeConfigSpec.BooleanValue enableHauntedForest;
    public final ForgeConfigSpec.BooleanValue enableHauntedLakes;
    public final ForgeConfigSpec.BooleanValue enableErodedHauntedForest;
    public final ForgeConfigSpec.BooleanValue enableAncientDeadCoralReef;
    public final ForgeConfigSpec.BooleanValue enableDeepDarkForest;

    public final ForgeConfigSpec.ConfigValue<List<? extends String>> replaceableBiomesHauntedForest;
    public final ForgeConfigSpec.ConfigValue<List<? extends String>> replaceableBiomesErodedHauntedForest;
    public final ForgeConfigSpec.ConfigValue<List<? extends String>> replaceableBiomesHauntedlakes;
    public final ForgeConfigSpec.ConfigValue<List<? extends String>> replaceableBiomesDeadCoralReef;
    public final ForgeConfigSpec.ConfigValue<List<? extends String>> replaceableBiomesDeepDarkForest;

    public final ForgeConfigSpec.BooleanValue enableFogHauntedForest;
    public final ForgeConfigSpec.DoubleValue fogHauntedForestDensity;
    public final ForgeConfigSpec.IntValue fogHauntedForestMinY;
    public final ForgeConfigSpec.IntValue fogHauntedForestMaxY;

    public final ForgeConfigSpec.BooleanValue enableFogHauntedLakes;
    public final ForgeConfigSpec.DoubleValue fogHauntedLakesDensity;
    public final ForgeConfigSpec.IntValue fogHauntedLakesMinY;
    public final ForgeConfigSpec.IntValue fogHauntedLakesMaxY;

    public final ForgeConfigSpec.BooleanValue enableFogErodedHauntedForest;
    public final ForgeConfigSpec.DoubleValue fogErodedHauntedForestDensity;
    public final ForgeConfigSpec.IntValue fogErodedHauntedForestMinY;
    public final ForgeConfigSpec.IntValue fogErodedHauntedForestMaxY;

    public final ForgeConfigSpec.BooleanValue useSoulLanternsInHauntedLakes;



    public CommonConfig(ForgeConfigSpec.Builder builder) {
        builder.comment("Welcome to The Graveyard Biomes Config!\n" +
                "\n" +
                "Configure the weight of the biomes by changing \"theGraveyardBiomesWeight\".\n" +
                "Configure which minecraft biomes can be replaced by The Graveyard biomes.\n" +
                "A full list of all the biomes can be found here https:minecraft.fandom.com/wiki/Biome#Biome_IDs.\n" +
                "Configure fog density and fog height.\n");

        builder.push("The Graveyard - Biome Config");
        this.theGraveyardBiomesWeight = builder.comment("Set weight of the Graveyard biomes").defineInRange("the_graveyard_weight.weight", 1, 0, 100);
        this.enableAncientDeadCoralReef = builder.comment("Allow the biome to spawn: ").define("ancient_dead_coral_reef.generate", true);
        this.replaceableBiomesDeadCoralReef = builder.comment("Set minecraft biomes in which the Graveyard biome will spawn: ").defineList("ancient_dead_coral_reef.replaceableBiomes", Arrays.asList("beach"), o -> o instanceof String);
        this.enableHauntedForest = builder.comment("Allow the biome to spawn: ").define("haunted_forest.generate", true);
        this.replaceableBiomesHauntedForest = builder.comment("Set minecraft biomes in which the Graveyard biome will spawn: ").defineList("haunted_forest.replaceableBiomes", Arrays.asList("windswept_forest"), o -> o instanceof String);
        this.enableHauntedLakes = builder.comment("Allow the biome to spawn: ").define("haunted_lakes.generate", true);
        this.replaceableBiomesHauntedlakes = builder.comment("Set minecraft biomes in which the Graveyard biome will spawn: ").defineList("haunted_lakes.replaceableBiomes", Arrays.asList("swamp"), o -> o instanceof String);
        this.enableErodedHauntedForest = builder.comment("Allow the biome to spawn: ").define("eroded_haunted_forest.generate", true);
        this.replaceableBiomesErodedHauntedForest = builder.comment("Set minecraft biomes in which the Graveyard biome will spawn: ").defineList("eroded_haunted_forest.replaceableBiomes", Arrays.asList("meadow"), o -> o instanceof String);
        this.enableDeepDarkForest = builder.comment("Allow the biome to spawn: ").define("deep_dark_forest.generate", true);
        this.replaceableBiomesDeepDarkForest = builder.comment("Set minecraft biomes in which the Graveyard biome will spawn: ").defineList("deep_dark_forest.replaceableBiomes", Arrays.asList("dark_forest"), o -> o instanceof String);

        builder.pop();

        builder.push("The Graveyard - Biome Fog Config");
        this.enableFogHauntedForest = builder.comment("Enable fog in the biome: ").define("fog_haunted_forest.generate", true);
        this.fogHauntedForestDensity = builder.comment("Set density of the fog (smaller values = denser): ").defineInRange("fog_haunted_forest.density", 0.35D, 0.0D, 32.0D);
        this.fogHauntedForestMinY = builder.comment("Set Y value, where the fog starts: ").defineInRange("fog_haunted_forest.minY", 63, -64, 256);
        this.fogHauntedForestMaxY = builder.comment("Set Y value, where the fog ends: ").defineInRange("fog_haunted_forest.maxY", 148, -64, 256);

        this.enableFogHauntedLakes = builder.comment("Enable fog in the biome: ").define("fog_haunted_lakes.generate", true);
        this.fogHauntedLakesDensity = builder.comment("Set density of the fog (smaller values = denser): ").defineInRange("fog_haunted_lakes.density", 0.3D, 0.0D, 32.0D);
        this.fogHauntedLakesMinY = builder.comment("Set Y value, where the fog starts: ").defineInRange("fog_haunted_lakes.minY", 63, -64, 256);
        this.fogHauntedLakesMaxY = builder.comment("Set Y value, where the fog ends: ").defineInRange("fog_haunted_lakes.maxY", 128, -64, 256);

        this.enableFogErodedHauntedForest = builder.comment("Enable fog in the biome: ").define("fog_eroded_haunted_forest.generate", true);
        this.fogErodedHauntedForestDensity = builder.comment("Set density of the fog (smaller values = denser): ").defineInRange("fog_eroded_haunted_forest.density", 0.35D, 0.0D, 32.0D);
        this.fogErodedHauntedForestMinY = builder.comment("Set Y value, where the fog starts: ").defineInRange("fog_eroded_haunted_forest.minY", 93, -64, 256);
        this.fogErodedHauntedForestMaxY = builder.comment("Set Y value, where the fog ends: ").defineInRange("fog_eroded_haunted_forest.maxY", 160, -64, 256);
        builder.pop();

        builder.push("The Graveyard - Misc Config");
        this.useSoulLanternsInHauntedLakes = builder.comment("Soul Lanterns will spawn instead of candles in the Hauntes Lakes.").define("haunted_lakes_soul_lanterns", false);
        builder.pop();
    }
}
