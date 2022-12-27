package net.finallion.graveyard_biomes.init;

import net.finallion.graveyard_biomes.TheGraveyardBiomes;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.TreePlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleRandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class TGPlacedFeatures {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registries.f_256988_, TheGraveyardBiomes.MOD_ID);

    public static ResourceKey<PlacedFeature> of(String placementName) {
        return ResourceKey.create(Registries.f_256988_, new ResourceLocation(TheGraveyardBiomes.MOD_ID, placementName));
    }

    public static final ResourceKey<PlacedFeature> MOSS_CARPET_FEATURE = of("moss_carpet_feature");
    public static final ResourceKey<PlacedFeature> COBWEB_FEATURE = of("cobweb_feature");
    public static final ResourceKey<PlacedFeature> BUSH_FEATURE = of("bush_feature");
    public static final ResourceKey<PlacedFeature> DEEP_DARK_FOREST_BUSH_FEATURE = of("deep_dark_forest_bush_feature");
    public static final ResourceKey<PlacedFeature> SOUL_LIGHT_FEATURE = of("soul_light_feature");
    public static final ResourceKey<PlacedFeature> FALLEN_TREE_FEATURE = of("fallen_tree_feature");
    public static final ResourceKey<PlacedFeature> DEAD_CORAL_PATCH_FEATURE = of("dead_coral_patch_feature");
    public static final ResourceKey<PlacedFeature> DEEP_DARK_OAK = of("deep_dark_oak");
    public static final ResourceKey<PlacedFeature> TG_PATCH_LARGE_FERN = of("tg_patch_large_fern_config");
    public static final ResourceKey<PlacedFeature> TG_PATCH_LEAVES = of("tg_patch_leaves_config");
    public static final ResourceKey<PlacedFeature> TG_PATCH_MEADOW_FLOWER = of("tg_patch_meadow_flower_config");

    public static final ResourceKey<PlacedFeature> HAUNTED_FOREST_TREES_PLACED = of("haunted_forest_trees");
    public static final ResourceKey<PlacedFeature> ERODED_HAUNTED_FOREST_TREES_PLACED = of("eroded_haunted_forest_trees");
    public static final ResourceKey<PlacedFeature> ANCIENT_DEAD_REEF_VEGETATION_PLACED = of("ancient_dead_reef_vegetation");
    public static final ResourceKey<PlacedFeature> ANCIENT_DEAD_REEF_WATER_VEGETATION_PLACED = of("ancient_dead_reef_water_vegetation");
    public static final ResourceKey<PlacedFeature> DEEP_DARK_FOREST_VEGETATION_PLACED = of("deep_dark_forest_vegetation");

    public static final ResourceKey<ConfiguredFeature<?, ?>> HAUNTED_FOREST_TREES = TGConfiguredFeatures.of("haunted_forest_trees");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ERODED_HAUNTED_FOREST_TREES = TGConfiguredFeatures.of("eroded_haunted_forest_trees");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_DEAD_REEF_VEGETATION = TGConfiguredFeatures.of("ancient_dead_reef_vegetation");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEP_DARK_FOREST_VEGETATION = TGConfiguredFeatures.of("deep_dark_forest_vegetation");

    public static final ResourceKey<PlacedFeature> SMALL_SPRUCE_TREE_01_STRIPPED = of("small_spruce_tree_stripped_01");
    public static final ResourceKey<PlacedFeature> SMALL_SPRUCE_TREE_01 = of("small_spruce_tree_01");
    public static final ResourceKey<PlacedFeature> SMALL_SPRUCE_TREE_02_STRIPPED = of("small_spruce_tree_stripped_02");
    public static final ResourceKey<PlacedFeature> SMALL_SPRUCE_TREE_02 = of("small_spruce_tree_02");
    public static final ResourceKey<PlacedFeature> SMALL_SPRUCE_TREE_03_STRIPPED = of("small_spruce_tree_stripped_03");
    public static final ResourceKey<PlacedFeature> SMALL_SPRUCE_TREE_03 = of("small_spruce_tree_03");
    public static final ResourceKey<PlacedFeature> SMALL_SPRUCE_TREE_04_STRIPPED = of("small_spruce_tree_stripped_04");
    public static final ResourceKey<PlacedFeature> SMALL_SPRUCE_TREE_04 = of("small_spruce_tree_04");
    public static final ResourceKey<PlacedFeature> SMALL_SPRUCE_TREE_05_STRIPPED = of("small_spruce_tree_stripped_05");
    public static final ResourceKey<PlacedFeature> SMALL_SPRUCE_TREE_05 = of("small_spruce_tree_05");
    public static final ResourceKey<PlacedFeature> SMALL_SPRUCE_TREE_06_STRIPPED = of("small_spruce_tree_stripped_06");
    public static final ResourceKey<PlacedFeature> SMALL_SPRUCE_TREE_06 = of("small_spruce_tree_06");
    public static final ResourceKey<PlacedFeature> SMALL_BENT_SPRUCE_TREE_01_STRIPPED = of("small_bent_spruce_tree_stripped_01");
    public static final ResourceKey<PlacedFeature> SMALL_BENT_SPRUCE_TREE_01 = of("small_bent_spruce_tree_01");
    public static final ResourceKey<PlacedFeature> FALLEN_SPRUCE_TREE_STRIPPED = of("fallen_spruce_stripped_tree");
    public static final ResourceKey<PlacedFeature> FALLEN_SPRUCE_TREE = of("fallen_spruce_tree");
    public static final ResourceKey<PlacedFeature> LARGE_SPRUCE_TREE_01_STRIPPED = of("large_spruce_tree_stripped_01");
    public static final ResourceKey<PlacedFeature> LARGE_SPRUCE_TREE_01 = of("large_spruce_tree_01");
    public static final ResourceKey<PlacedFeature> LARGE_SPRUCE_TREE_02_STRIPPED = of("large_spruce_tree_stripped_02");
    public static final ResourceKey<PlacedFeature> LARGE_SPRUCE_TREE_02 = of("large_spruce_tree_02");
    public static final ResourceKey<PlacedFeature> LARGE_SPRUCE_TREE_03_STRIPPED = of("large_spruce_tree_stripped_03");
    public static final ResourceKey<PlacedFeature> LARGE_SPRUCE_TREE_03 = of("large_spruce_tree_03");
    public static final ResourceKey<PlacedFeature> LARGE_BENT_SPRUCE_TREE_01_STRIPPED = of("large_bent_spruce_tree_stripped_01");
    public static final ResourceKey<PlacedFeature> LARGE_BENT_SPRUCE_TREE_01 = of("large_bent_spruce_tree_01");
    public static final ResourceKey<PlacedFeature> LARGE_BENT_SPRUCE_TREE_02_STRIPPED = of("large_bent_spruce_tree_stripped_02");
    public static final ResourceKey<PlacedFeature> LARGE_BENT_SPRUCE_TREE_02 = of("large_bent_spruce_tree_02");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> featureGetter = context.m_255420_(Registries.f_256911_);
        HolderGetter<PlacedFeature> featureGetter2 = context.m_255420_(Registries.f_256988_);

        context.m_255272_(SMALL_SPRUCE_TREE_01, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_SPRUCE_TREE_01), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING))));
        context.m_255272_(SMALL_SPRUCE_TREE_01_STRIPPED, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_SPRUCE_TREE_01_STRIPPED), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING))));
        context.m_255272_(SMALL_SPRUCE_TREE_02, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_SPRUCE_TREE_02), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING))));
        context.m_255272_(SMALL_SPRUCE_TREE_02_STRIPPED, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_SPRUCE_TREE_02_STRIPPED), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING))));
        context.m_255272_(SMALL_SPRUCE_TREE_03, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_SPRUCE_TREE_03), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING))));
        context.m_255272_(SMALL_SPRUCE_TREE_03_STRIPPED, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_SPRUCE_TREE_03_STRIPPED), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING))));
        context.m_255272_(SMALL_SPRUCE_TREE_04, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_SPRUCE_TREE_04), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING))));
        context.m_255272_(SMALL_SPRUCE_TREE_04_STRIPPED, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_SPRUCE_TREE_04_STRIPPED), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING))));
        context.m_255272_(SMALL_SPRUCE_TREE_05, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_SPRUCE_TREE_05), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING))));
        context.m_255272_(SMALL_SPRUCE_TREE_05_STRIPPED, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_SPRUCE_TREE_05_STRIPPED), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING))));
        context.m_255272_(SMALL_SPRUCE_TREE_06, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_SPRUCE_TREE_06), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING))));
        context.m_255272_(SMALL_SPRUCE_TREE_06_STRIPPED, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_SPRUCE_TREE_06_STRIPPED), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING))));
        context.m_255272_(SMALL_BENT_SPRUCE_TREE_01, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_BENT_SPRUCE_TREE_01), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING))));
        context.m_255272_(SMALL_BENT_SPRUCE_TREE_01_STRIPPED, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_BENT_SPRUCE_TREE_01_STRIPPED), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING))));
        context.m_255272_(LARGE_BENT_SPRUCE_TREE_01, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.LARGE_BENT_SPRUCE_TREE_01), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING))));
        context.m_255272_(LARGE_BENT_SPRUCE_TREE_01_STRIPPED, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.LARGE_BENT_SPRUCE_TREE_01_STRIPPED), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING))));
        context.m_255272_(LARGE_BENT_SPRUCE_TREE_02, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.LARGE_BENT_SPRUCE_TREE_02), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING))));
        context.m_255272_(LARGE_BENT_SPRUCE_TREE_02_STRIPPED, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.LARGE_BENT_SPRUCE_TREE_02_STRIPPED), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING))));
        context.m_255272_(FALLEN_SPRUCE_TREE, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.FALLEN_SPRUCE_TREE), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING))));
        context.m_255272_(FALLEN_SPRUCE_TREE_STRIPPED, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.FALLEN_SPRUCE_TREE_STRIPPED), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING))));
        context.m_255272_(LARGE_SPRUCE_TREE_01, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.LARGE_SPRUCE_TREE_01), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING))));
        context.m_255272_(LARGE_SPRUCE_TREE_01_STRIPPED, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.LARGE_SPRUCE_TREE_01_STRIPPED), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING))));
        context.m_255272_(LARGE_SPRUCE_TREE_02, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.LARGE_SPRUCE_TREE_02), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING))));
        context.m_255272_(LARGE_SPRUCE_TREE_02_STRIPPED, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.LARGE_SPRUCE_TREE_02_STRIPPED), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING))));
        context.m_255272_(LARGE_SPRUCE_TREE_03, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.LARGE_SPRUCE_TREE_03), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING))));
        context.m_255272_(LARGE_SPRUCE_TREE_03_STRIPPED, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.LARGE_SPRUCE_TREE_03_STRIPPED), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING))));

        context.m_255272_(MOSS_CARPET_FEATURE, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.MOSS_CARPET_FEATURE), List.of(RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, CountPlacement.of(100))));
        context.m_255272_(COBWEB_FEATURE, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.COBWEB_FEATURE), List.of(RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, CountPlacement.of(40))));
        context.m_255272_(BUSH_FEATURE, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.BUSH_FEATURE), List.of(RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, CountPlacement.of(35))));
        context.m_255272_(DEEP_DARK_FOREST_BUSH_FEATURE, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.DEEP_DARK_FOREST_BUSH_FEATURE), List.of(RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, CountPlacement.of(35))));
        context.m_255272_(SOUL_LIGHT_FEATURE, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.SOUL_LIGHT_FEATURE), List.of(RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, CountPlacement.of(100))));
        context.m_255272_(FALLEN_TREE_FEATURE, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.FALLEN_TREE_FEATURE), List.of(RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, CountPlacement.of(20))));
        context.m_255272_(DEAD_CORAL_PATCH_FEATURE, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.DEAD_CORAL_PATCH_FEATURE), List.of(RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, CountPlacement.of(35))));

        context.m_255272_(DEEP_DARK_OAK, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.DEEP_DARK_OAK), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.DARK_OAK_SAPLING))));
        context.m_255272_(TG_PATCH_LARGE_FERN, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.TG_PATCH_LARGE_FERN), List.of(RarityFilter.onAverageOnceEvery(5), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
        context.m_255272_(TG_PATCH_LEAVES, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.TG_PATCH_LEAVES), List.of(RarityFilter.onAverageOnceEvery(5), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
        context.m_255272_(TG_PATCH_MEADOW_FLOWER, new PlacedFeature(featureGetter.m_255043_(TGConfiguredFeatures.TG_PATCH_MEADOW_FLOWER), List.of(InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

        context.m_255272_(ERODED_HAUNTED_FOREST_TREES_PLACED, new PlacedFeature(featureGetter.m_255043_(ERODED_HAUNTED_FOREST_TREES), List.of(PlacementUtils.countExtra(10, 0.1F, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome())));
        context.m_255272_(HAUNTED_FOREST_TREES_PLACED, new PlacedFeature(featureGetter.m_255043_(HAUNTED_FOREST_TREES), List.of(PlacementUtils.countExtra(15, 0.1F, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome())));
        context.m_255272_(ANCIENT_DEAD_REEF_VEGETATION_PLACED, new PlacedFeature(featureGetter.m_255043_(ANCIENT_DEAD_REEF_VEGETATION), List.of(NoiseBasedCountPlacement.of(20, 400.0D, 0.0D), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome())));
        context.m_255272_(ANCIENT_DEAD_REEF_WATER_VEGETATION_PLACED, new PlacedFeature(featureGetter.m_255043_(ANCIENT_DEAD_REEF_VEGETATION), List.of(NoiseBasedCountPlacement.of(20, 200.0D, 0.0D), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome())));
        context.m_255272_(DEEP_DARK_FOREST_VEGETATION_PLACED, new PlacedFeature(featureGetter.m_255043_(DEEP_DARK_FOREST_VEGETATION), List.of(CountPlacement.of(35), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome())));
    }

    /*
    // placed features
    public static RegistryObject<PlacedFeature> MOSS_CARPET_FEATURE = PLACED_FEATURES.register("moss_carpet_feature", () -> new PlacedFeature(TGConfiguredFeatures.MOSS_CARPET_FEATURE.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, CountPlacement.of(100))));
    public static RegistryObject<PlacedFeature> COBWEB_FEATURE = PLACED_FEATURES.register("cobweb_feature", () -> new PlacedFeature(TGConfiguredFeatures.COBWEB_FEATURE.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, CountPlacement.of(40))));
    public static RegistryObject<PlacedFeature> BUSH_FEATURE = PLACED_FEATURES.register("bush_feature", () -> new PlacedFeature(TGConfiguredFeatures.BUSH_FEATURE.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, CountPlacement.of(35))));
    public static RegistryObject<PlacedFeature> DEEP_DARK_FOREST_BUSH_FEATURE = PLACED_FEATURES.register("deep_dark_forest_bush_feature", () -> new PlacedFeature(TGConfiguredFeatures.DEEP_DARK_FOREST_BUSH_FEATURE.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, CountPlacement.of(35))));
    public static RegistryObject<PlacedFeature> SOUL_LIGHT_FEATURE = PLACED_FEATURES.register("soul_light_feature", () -> new PlacedFeature(TGConfiguredFeatures.SOUL_LIGHT_FEATURE.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, CountPlacement.of(100))));
    public static RegistryObject<PlacedFeature> FALLEN_TREE_FEATURE = PLACED_FEATURES.register("fallen_tree_feature", () -> new PlacedFeature(TGConfiguredFeatures.FALLEN_TREE_FEATURE.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, CountPlacement.of(20))));
    public static RegistryObject<PlacedFeature> DEAD_CORAL_PATCH_FEATURE = PLACED_FEATURES.register("dead_coral_patch_feature", () -> new PlacedFeature(TGConfiguredFeatures.DEAD_CORAL_PATCH_FEATURE.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, CountPlacement.of(35))));

    public static RegistryObject<PlacedFeature> DEEP_DARK_OAK_CHECKED = PLACED_FEATURES.register("deep_dark_oak_checked", () -> new PlacedFeature(TGConfiguredFeatures.DEEP_DARK_OAK.getHolder().get(), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.DARK_OAK_SAPLING))));
    public static RegistryObject<PlacedFeature> TG_PATCH_LARGE_FERN = PLACED_FEATURES.register("tg_patch_large_fern", () -> new PlacedFeature(TGConfiguredFeatures.TG_PATCH_LARGE_FERN.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(5), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
    public static RegistryObject<PlacedFeature> TG_PATCH_LEAVES = PLACED_FEATURES.register("tg_patch_leaves", () -> new PlacedFeature(TGConfiguredFeatures.TG_PATCH_LEAVES.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(5), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    public static RegistryObject<PlacedFeature> ERODED_HAUNTED_FOREST_TREES_FEATURE = PLACED_FEATURES.register("eroded_haunted_forest_trees", () -> new PlacedFeature(TGConfiguredFeatures.ERODED_HAUNTED_FOREST_TREES.getHolder().get(), List.of(PlacementUtils.countExtra(10, 0.1F, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome())));
    public static RegistryObject<PlacedFeature> HAUNTED_FOREST_TREES_FEATURE = PLACED_FEATURES.register("haunted_forest_trees", () -> new PlacedFeature(TGConfiguredFeatures.HAUNTED_FOREST_TREES.getHolder().get(), List.of(PlacementUtils.countExtra(15, 0.1F, 1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome())));
    public static RegistryObject<PlacedFeature> ANCIENT_DEAD_CORAL_REEF_WATER_FEATURE = PLACED_FEATURES.register("ancient_dead_reef_vegetation", () -> new PlacedFeature(TGConfiguredFeatures.ANCIENT_DEAD_REEF_VEGETATION.getHolder().get(), List.of(NoiseBasedCountPlacement.of(20, 400.0D, 0.0D), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome())));
    public static RegistryObject<PlacedFeature> ANCIENT_DEAD_CORAL_REEF_FEATURE = PLACED_FEATURES.register("ancient_dead_reef_water_vegetation", () -> new PlacedFeature(TGConfiguredFeatures.ANCIENT_DEAD_REEF_VEGETATION.getHolder().get(), List.of(NoiseBasedCountPlacement.of(20, 200.0D, 0.0D), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome())));

    public static RegistryObject<PlacedFeature> DEEP_DARK_FOREST_VEGETATION = PLACED_FEATURES.register("deep_dark_forest_vegetation", () -> new PlacedFeature(TGConfiguredFeatures.DEEP_DARK_FOREST_VEGETATION.getHolder().get(), List.of(CountPlacement.of(35), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome())));
    public static RegistryObject<PlacedFeature> TG_PATCH_MEADOW_FLOWER = PLACED_FEATURES.register("tg_patch_meadow_flower", () -> new PlacedFeature(TGConfiguredFeatures.TG_PATCH_MEADOW_FLOWER_CONFIG.getHolder().get(), List.of(InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));



     */
}
