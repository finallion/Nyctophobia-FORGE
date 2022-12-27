package net.finallion.graveyard_biomes.init;


import net.finallion.graveyard_biomes.TheGraveyardBiomes;
import net.finallion.graveyard_biomes.world.features.trees.config.TGTreeFeatureConfig;
import net.finallion.graveyard_biomes.world.trunk.DeepDarkOakTrunkPlacer;
import net.minecraft.core.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.TreePlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.InclusiveRange;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.ThreeLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.DarkOakFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.DualNoiseProvider;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Properties;


public class TGConfiguredFeatures {

    public static final DeferredRegister<ConfiguredFeature<?,?>> CONFIGURED_FEATURES = DeferredRegister.create(Registries.f_256911_, TheGraveyardBiomes.MOD_ID);

    public static ResourceKey<ConfiguredFeature<?, ?>> of(String featureName) {
        return ResourceKey.create(Registries.f_256911_, new ResourceLocation(TheGraveyardBiomes.MOD_ID, featureName));
    }

    public static final ResourceKey<ConfiguredFeature<?, ?>> MOSS_CARPET_FEATURE = of("moss_carpet_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COBWEB_FEATURE = of("cobweb_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BUSH_FEATURE = of("bush_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEP_DARK_FOREST_BUSH_FEATURE = of("deep_dark_forest_bush_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SOUL_LIGHT_FEATURE = of("soul_light_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FALLEN_TREE_FEATURE = of("fallen_tree_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEAD_CORAL_PATCH_FEATURE = of("dead_coral_patch_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_SPRUCE_TREE_01_STRIPPED = of("small_spruce_tree_stripped_01");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_SPRUCE_TREE_01 = of("small_spruce_tree_01");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_SPRUCE_TREE_02_STRIPPED = of("small_spruce_tree_stripped_02");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_SPRUCE_TREE_02 = of("small_spruce_tree_02");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_SPRUCE_TREE_03_STRIPPED = of("small_spruce_tree_stripped_03");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_SPRUCE_TREE_03 = of("small_spruce_tree_03");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_SPRUCE_TREE_04_STRIPPED = of("small_spruce_tree_stripped_04");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_SPRUCE_TREE_04 = of("small_spruce_tree_04");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_SPRUCE_TREE_05_STRIPPED = of("small_spruce_tree_stripped_05");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_SPRUCE_TREE_05 = of("small_spruce_tree_05");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_SPRUCE_TREE_06_STRIPPED = of("small_spruce_tree_stripped_06");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_SPRUCE_TREE_06 = of("small_spruce_tree_06");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_BENT_SPRUCE_TREE_01_STRIPPED = of("small_bent_spruce_tree_stripped_01");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_BENT_SPRUCE_TREE_01 = of("small_bent_spruce_tree_01");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FALLEN_SPRUCE_TREE_STRIPPED = of("fallen_spruce_stripped_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FALLEN_SPRUCE_TREE = of("fallen_spruce_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LARGE_SPRUCE_TREE_01_STRIPPED = of("large_spruce_tree_stripped_01");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LARGE_SPRUCE_TREE_01 = of("large_spruce_tree_01");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LARGE_SPRUCE_TREE_02_STRIPPED = of("large_spruce_tree_stripped_02");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LARGE_SPRUCE_TREE_02 = of("large_spruce_tree_02");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LARGE_SPRUCE_TREE_03_STRIPPED = of("large_spruce_tree_stripped_03");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LARGE_SPRUCE_TREE_03 = of("large_spruce_tree_03");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LARGE_BENT_SPRUCE_TREE_01_STRIPPED = of("large_bent_spruce_tree_stripped_01");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LARGE_BENT_SPRUCE_TREE_01 = of("large_bent_spruce_tree_01");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LARGE_BENT_SPRUCE_TREE_02_STRIPPED = of("large_bent_spruce_tree_stripped_02");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LARGE_BENT_SPRUCE_TREE_02 = of("large_bent_spruce_tree_02");

    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEP_DARK_OAK = of("deep_dark_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TG_PATCH_LARGE_FERN = of("tg_patch_large_fern_config");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TG_PATCH_LEAVES = of("tg_patch_leaves_config");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TG_PATCH_MEADOW_FLOWER = of("tg_patch_meadow_flower_config");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        HolderGetter<ConfiguredFeature<?, ?>> featureGetter = context.m_255420_(Registries.f_256911_);
        HolderGetter<PlacedFeature> featureGetter2 = context.m_255420_(Registries.f_256988_);

        context.m_255272_(MOSS_CARPET_FEATURE, new ConfiguredFeature<>(TGFeatures.MOSS_CARPET_FEATURE.get(), FeatureConfiguration.NONE));
        context.m_255272_(COBWEB_FEATURE, new ConfiguredFeature<>(TGFeatures.COBWEB_FEATURE.get(), FeatureConfiguration.NONE));
        context.m_255272_(BUSH_FEATURE, new ConfiguredFeature<>(TGFeatures.BUSH_FEATURE.get(), FeatureConfiguration.NONE));
        context.m_255272_(DEEP_DARK_FOREST_BUSH_FEATURE, new ConfiguredFeature<>(TGFeatures.DEEP_DARK_FOREST_BUSH_FEATURE.get(), FeatureConfiguration.NONE));
        context.m_255272_(SOUL_LIGHT_FEATURE, new ConfiguredFeature<>(TGFeatures.SOUL_LIGHT_FEATURE.get(), FeatureConfiguration.NONE));
        context.m_255272_(FALLEN_TREE_FEATURE, new ConfiguredFeature<>(TGFeatures.FALLEN_TREE_FEATURE.get(), FeatureConfiguration.NONE));
        context.m_255272_(DEAD_CORAL_PATCH_FEATURE, new ConfiguredFeature<>(TGFeatures.DEAD_CORAL_PATCH_FEATURE.get(), FeatureConfiguration.NONE));

        context.m_255272_(SMALL_SPRUCE_TREE_01_STRIPPED, new ConfiguredFeature<>(TGFeatures.SMALL_SPRUCE_TREE_01.get(), new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
        context.m_255272_(SMALL_SPRUCE_TREE_01, new ConfiguredFeature<>(TGFeatures.SMALL_SPRUCE_TREE_01.get(), new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
        context.m_255272_(SMALL_SPRUCE_TREE_02_STRIPPED, new ConfiguredFeature<>(TGFeatures.SMALL_SPRUCE_TREE_02.get(), new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
        context.m_255272_(SMALL_SPRUCE_TREE_02, new ConfiguredFeature<>(TGFeatures.SMALL_SPRUCE_TREE_02.get(), new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
        context.m_255272_(SMALL_SPRUCE_TREE_03_STRIPPED, new ConfiguredFeature<>(TGFeatures.SMALL_SPRUCE_TREE_03.get(), new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
        context.m_255272_(SMALL_SPRUCE_TREE_03, new ConfiguredFeature<>(TGFeatures.SMALL_SPRUCE_TREE_03.get(), new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
        context.m_255272_(SMALL_SPRUCE_TREE_04_STRIPPED, new ConfiguredFeature<>(TGFeatures.SMALL_SPRUCE_TREE_04.get(), new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
        context.m_255272_(SMALL_SPRUCE_TREE_04, new ConfiguredFeature<>(TGFeatures.SMALL_SPRUCE_TREE_04.get(), new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
        context.m_255272_(SMALL_SPRUCE_TREE_05_STRIPPED, new ConfiguredFeature<>(TGFeatures.SMALL_SPRUCE_TREE_05.get(), new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
        context.m_255272_(SMALL_SPRUCE_TREE_05, new ConfiguredFeature<>(TGFeatures.SMALL_SPRUCE_TREE_05.get(), new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
        context.m_255272_(SMALL_SPRUCE_TREE_06_STRIPPED, new ConfiguredFeature<>(TGFeatures.SMALL_SPRUCE_TREE_06.get(), new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
        context.m_255272_(SMALL_SPRUCE_TREE_06, new ConfiguredFeature<>(TGFeatures.SMALL_SPRUCE_TREE_06.get(), new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
        context.m_255272_(SMALL_BENT_SPRUCE_TREE_01_STRIPPED, new ConfiguredFeature<>(TGFeatures.SMALL_BENT_SPRUCE_TREE_01.get(), new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
        context.m_255272_(SMALL_BENT_SPRUCE_TREE_01, new ConfiguredFeature<>(TGFeatures.SMALL_BENT_SPRUCE_TREE_01.get(), new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
        context.m_255272_(FALLEN_SPRUCE_TREE_STRIPPED, new ConfiguredFeature<>(TGFeatures.FALLEN_SPRUCE_TREE.get(), new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
        context.m_255272_(FALLEN_SPRUCE_TREE, new ConfiguredFeature<>(TGFeatures.FALLEN_SPRUCE_TREE.get(), new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
        context.m_255272_(LARGE_SPRUCE_TREE_01_STRIPPED, new ConfiguredFeature<>(TGFeatures.LARGE_SPRUCE_TREE_01.get(), new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
        context.m_255272_(LARGE_SPRUCE_TREE_01, new ConfiguredFeature<>(TGFeatures.LARGE_SPRUCE_TREE_01.get(), new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
        context.m_255272_(LARGE_SPRUCE_TREE_02_STRIPPED, new ConfiguredFeature<>(TGFeatures.LARGE_SPRUCE_TREE_02.get(), new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
        context.m_255272_(LARGE_SPRUCE_TREE_02, new ConfiguredFeature<>(TGFeatures.LARGE_SPRUCE_TREE_02.get(), new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
        context.m_255272_(LARGE_SPRUCE_TREE_03_STRIPPED, new ConfiguredFeature<>(TGFeatures.LARGE_SPRUCE_TREE_03.get(), new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
        context.m_255272_(LARGE_SPRUCE_TREE_03, new ConfiguredFeature<>(TGFeatures.LARGE_SPRUCE_TREE_03.get(), new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
        context.m_255272_(LARGE_BENT_SPRUCE_TREE_01_STRIPPED, new ConfiguredFeature<>(TGFeatures.LARGE_BENT_SPRUCE_TREE_01.get(), new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
        context.m_255272_(LARGE_BENT_SPRUCE_TREE_01, new ConfiguredFeature<>(TGFeatures.LARGE_BENT_SPRUCE_TREE_01.get(), new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
        context.m_255272_(LARGE_BENT_SPRUCE_TREE_02_STRIPPED, new ConfiguredFeature<>(TGFeatures.LARGE_BENT_SPRUCE_TREE_02.get(), new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
        context.m_255272_(LARGE_BENT_SPRUCE_TREE_02, new ConfiguredFeature<>(TGFeatures.LARGE_BENT_SPRUCE_TREE_02.get(), new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));

        context.m_255272_(DEEP_DARK_OAK, new ConfiguredFeature<>(Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.DARK_OAK_LOG), new DeepDarkOakTrunkPlacer(13, 4, 2), BlockStateProvider.simple(Blocks.DARK_OAK_LEAVES), new DarkOakFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)), new ThreeLayersFeatureSize(1, 1, 0, 1, 2,OptionalInt.empty()))).ignoreVines().build()));
        context.m_255272_(TG_PATCH_LARGE_FERN, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(96, 7, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.LARGE_FERN))))));
        context.m_255272_(TG_PATCH_LEAVES, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 6, 0, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.OAK_LEAVES.defaultBlockState().setValue(BlockStateProperties.PERSISTENT, true)))))));
        context.m_255272_(TG_PATCH_MEADOW_FLOWER, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(96, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new DualNoiseProvider(new InclusiveRange<>(1, 3), new NormalNoise.NoiseParameters(-10, 1.0D), 1.0F, 2345L, new NormalNoise.NoiseParameters(-3, 1.0D), 1.0F, List.of(Blocks.TALL_GRASS.defaultBlockState(), Blocks.ALLIUM.defaultBlockState(), Blocks.POPPY.defaultBlockState(), Blocks.AZURE_BLUET.defaultBlockState(), Blocks.DANDELION.defaultBlockState(), Blocks.CORNFLOWER.defaultBlockState(), Blocks.OXEYE_DAISY.defaultBlockState(), Blocks.GRASS.defaultBlockState())))))));

        context.m_255272_(TGPlacedFeatures.HAUNTED_FOREST_TREES, new ConfiguredFeature<>(Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_SPRUCE_TREE_01), PlacementUtils.isEmpty()), 0.25F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_SPRUCE_TREE_02), PlacementUtils.isEmpty()), 0.25F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_SPRUCE_TREE_03), PlacementUtils.isEmpty()), 0.375F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_SPRUCE_TREE_04), PlacementUtils.isEmpty()), 0.1F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_SPRUCE_TREE_05), PlacementUtils.isEmpty()), 0.1F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_SPRUCE_TREE_06), PlacementUtils.isEmpty()), 0.1F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_BENT_SPRUCE_TREE_01), PlacementUtils.isEmpty()), 0.1F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.FALLEN_SPRUCE_TREE), PlacementUtils.isEmpty()), 0.1F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.LARGE_SPRUCE_TREE_01), PlacementUtils.isEmpty()), 0.25F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.LARGE_SPRUCE_TREE_02), PlacementUtils.isEmpty()), 0.1F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.LARGE_SPRUCE_TREE_03), PlacementUtils.isEmpty()), 0.1F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_SPRUCE_TREE_01_STRIPPED)), 0.25F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_SPRUCE_TREE_02_STRIPPED), PlacementUtils.isEmpty()), 0.25F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_SPRUCE_TREE_03_STRIPPED), PlacementUtils.isEmpty()), 0.375F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_SPRUCE_TREE_04_STRIPPED), PlacementUtils.isEmpty()), 0.1F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_SPRUCE_TREE_05_STRIPPED), PlacementUtils.isEmpty()), 0.1F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_SPRUCE_TREE_06_STRIPPED), PlacementUtils.isEmpty()), 0.1F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_BENT_SPRUCE_TREE_01_STRIPPED), PlacementUtils.isEmpty()), 0.1F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.FALLEN_SPRUCE_TREE_STRIPPED), PlacementUtils.isEmpty()), 0.1F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.LARGE_SPRUCE_TREE_01_STRIPPED), PlacementUtils.isEmpty()), 0.25F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.LARGE_SPRUCE_TREE_02_STRIPPED), PlacementUtils.isEmpty()), 0.1F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.LARGE_SPRUCE_TREE_03_STRIPPED), PlacementUtils.isEmpty()), 0.1F)),
                featureGetter2.m_255043_(TreePlacements.SPRUCE_CHECKED))));

        context.m_255272_(TGPlacedFeatures.ERODED_HAUNTED_FOREST_TREES, new ConfiguredFeature<>(Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_BENT_SPRUCE_TREE_01), PlacementUtils.isEmpty()), 0.1F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.FALLEN_SPRUCE_TREE), PlacementUtils.isEmpty()), 0.0075F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.LARGE_BENT_SPRUCE_TREE_01), PlacementUtils.isEmpty()), 0.1F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.LARGE_BENT_SPRUCE_TREE_02), PlacementUtils.isEmpty()), 0.1F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.LARGE_SPRUCE_TREE_01), PlacementUtils.isEmpty()), 0.5F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.LARGE_SPRUCE_TREE_02), PlacementUtils.isEmpty()), 0.1F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.LARGE_SPRUCE_TREE_03), PlacementUtils.isEmpty()), 0.1F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.SMALL_BENT_SPRUCE_TREE_01_STRIPPED), PlacementUtils.isEmpty()), 0.1F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.FALLEN_SPRUCE_TREE_STRIPPED), PlacementUtils.isEmpty()), 0.0075F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.LARGE_BENT_SPRUCE_TREE_01_STRIPPED), PlacementUtils.isEmpty()), 0.1F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.LARGE_BENT_SPRUCE_TREE_02_STRIPPED), PlacementUtils.isEmpty()), 0.1F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.LARGE_SPRUCE_TREE_01_STRIPPED), PlacementUtils.isEmpty()), 0.5F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.LARGE_SPRUCE_TREE_02_STRIPPED), PlacementUtils.isEmpty()), 0.1F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TGConfiguredFeatures.LARGE_SPRUCE_TREE_03_STRIPPED), PlacementUtils.isEmpty()), 0.1F)),
                featureGetter2.m_255043_(TreePlacements.SPRUCE_CHECKED))));

        context.m_255272_(TGPlacedFeatures.ANCIENT_DEAD_REEF_VEGETATION, new ConfiguredFeature<>(Feature.SIMPLE_RANDOM_SELECTOR, new SimpleRandomFeatureConfiguration(HolderSet.direct(
                PlacementUtils.inlinePlaced(TGFeatures.DEAD_CORAL_TREE_FEATURE.get(), FeatureConfiguration.NONE, PlacementUtils.isEmpty()),
                PlacementUtils.inlinePlaced(TGFeatures.DEAD_CORAL_CLAW_FEATURE.get(), FeatureConfiguration.NONE, PlacementUtils.isEmpty()),
                PlacementUtils.inlinePlaced(TGFeatures.DEAD_CORAL_MUSHROOM_FEATURE.get(), FeatureConfiguration.NONE, PlacementUtils.isEmpty())))));


        context.m_255272_(TGPlacedFeatures.DEEP_DARK_FOREST_VEGETATION, new ConfiguredFeature(Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TreeFeatures.HUGE_BROWN_MUSHROOM), PlacementUtils.isEmpty()), 0.025F),
                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(featureGetter.m_255043_(TreeFeatures.HUGE_RED_MUSHROOM), PlacementUtils.isEmpty()), 0.025F),
                new WeightedPlacedFeature(featureGetter2.m_255043_(TGPlacedFeatures.DEEP_DARK_OAK), 0.8666667F),
                new WeightedPlacedFeature(featureGetter2.m_255043_(TreePlacements.DARK_OAK_CHECKED), 0.1F)),
                featureGetter2.m_255043_(TreePlacements.DARK_OAK_CHECKED))));

    }



    /*

    // configured features registry keys
    public static final RegistryObject<ConfiguredFeature<?, ?>> MOSS_CARPET_FEATURE = CONFIGURED_FEATURES.register("moss_carpet_feature", () -> new ConfiguredFeature<>(TGFeatures.MOSS_CARPET_FEATURE.get(), FeatureConfiguration.NONE));
    public static final RegistryObject<ConfiguredFeature<?, ?>> COBWEB_FEATURE = CONFIGURED_FEATURES.register("cobweb_feature", () -> new ConfiguredFeature<>(TGFeatures.COBWEB_FEATURE.get(), FeatureConfiguration.NONE));
    public static final RegistryObject<ConfiguredFeature<?, ?>> BUSH_FEATURE = CONFIGURED_FEATURES.register("bush_feature", () -> new ConfiguredFeature<>(TGFeatures.BUSH_FEATURE.get(), FeatureConfiguration.NONE));
    public static final RegistryObject<ConfiguredFeature<?, ?>> DEEP_DARK_FOREST_BUSH_FEATURE = CONFIGURED_FEATURES.register("deep_dark_forest_bush_feature", () -> new ConfiguredFeature<>(TGFeatures.DEEP_DARK_FOREST_BUSH_FEATURE.get(), FeatureConfiguration.NONE));
    public static final RegistryObject<ConfiguredFeature<?, ?>> SOUL_LIGHT_FEATURE = CONFIGURED_FEATURES.register("soul_light_feature", () -> new ConfiguredFeature<>(TGFeatures.SOUL_LIGHT_FEATURE.get(), FeatureConfiguration.NONE));
    public static final RegistryObject<ConfiguredFeature<?, ?>> FALLEN_TREE_FEATURE = CONFIGURED_FEATURES.register("fallen_tree_feature", () -> new ConfiguredFeature<>(TGFeatures.FALLEN_TREE_FEATURE.get(), FeatureConfiguration.NONE));
    public static final RegistryObject<ConfiguredFeature<?, ?>> DEAD_CORAL_PATCH_FEATURE = CONFIGURED_FEATURES.register("dead_coral_tree_feature", () -> new ConfiguredFeature<>(TGFeatures.DEAD_CORAL_PATCH_FEATURE.get(), FeatureConfiguration.NONE));


    public static final RegistryObject<ConfiguredFeature<?, ?>> SMALL_SPRUCE_TREE_01_STRIPPED_CONFIG = CONFIGURED_FEATURES.register("small_spruce_tree_01_stripped", () -> new ConfiguredFeature<>(TGFeatures.SMALL_SPRUCE_TREE_01.get(), new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> SMALL_SPRUCE_TREE_01_CONFIG = CONFIGURED_FEATURES.register("small_spruce_tree_01", () -> new ConfiguredFeature<>(TGFeatures.SMALL_SPRUCE_TREE_01.get(), new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> SMALL_SPRUCE_TREE_02_STRIPPED_CONFIG = CONFIGURED_FEATURES.register("small_spruce_tree_02_stripped", () -> new ConfiguredFeature<>(TGFeatures.SMALL_SPRUCE_TREE_02.get(), new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> SMALL_SPRUCE_TREE_02_CONFIG = CONFIGURED_FEATURES.register("small_spruce_tree_02", () -> new ConfiguredFeature<>(TGFeatures.SMALL_SPRUCE_TREE_02.get(), new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> SMALL_SPRUCE_TREE_03_STRIPPED_CONFIG = CONFIGURED_FEATURES.register("small_spruce_tree_03_stripped", () -> new ConfiguredFeature<>(TGFeatures.SMALL_SPRUCE_TREE_03.get(), new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> SMALL_SPRUCE_TREE_03_CONFIG = CONFIGURED_FEATURES.register("small_spruce_tree_03", () -> new ConfiguredFeature<>(TGFeatures.SMALL_SPRUCE_TREE_03.get(), new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> SMALL_SPRUCE_TREE_04_STRIPPED_CONFIG = CONFIGURED_FEATURES.register("small_spruce_tree_04_stripped", () -> new ConfiguredFeature<>(TGFeatures.SMALL_SPRUCE_TREE_04.get(), new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> SMALL_SPRUCE_TREE_04_CONFIG = CONFIGURED_FEATURES.register("small_spruce_tree_04", () -> new ConfiguredFeature<>(TGFeatures.SMALL_SPRUCE_TREE_04.get(), new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> SMALL_SPRUCE_TREE_05_STRIPPED_CONFIG = CONFIGURED_FEATURES.register("small_spruce_tree_05_stripped", () -> new ConfiguredFeature<>(TGFeatures.SMALL_SPRUCE_TREE_05.get(), new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> SMALL_SPRUCE_TREE_05_CONFIG = CONFIGURED_FEATURES.register("small_spruce_tree_05", () -> new ConfiguredFeature<>(TGFeatures.SMALL_SPRUCE_TREE_05.get(), new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> SMALL_SPRUCE_TREE_06_STRIPPED_CONFIG = CONFIGURED_FEATURES.register("small_spruce_tree_06_stripped", () -> new ConfiguredFeature<>(TGFeatures.SMALL_SPRUCE_TREE_06.get(), new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> SMALL_SPRUCE_TREE_06_CONFIG = CONFIGURED_FEATURES.register("small_spruce_tree_06", () -> new ConfiguredFeature<>(TGFeatures.SMALL_SPRUCE_TREE_06.get(), new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> SMALL_BENT_SPRUCE_TREE_01_STRIPPED_CONFIG = CONFIGURED_FEATURES.register("small_bent_spruce_tree_stripped_01", () -> new ConfiguredFeature<>(TGFeatures.SMALL_BENT_SPRUCE_TREE_01.get(), new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> SMALL_BENT_SPRUCE_TREE_01_CONFIG = CONFIGURED_FEATURES.register("small_bent_spruce_tree_01", () -> new ConfiguredFeature<>(TGFeatures.SMALL_BENT_SPRUCE_TREE_01.get(), new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> FALLEN_SPRUCE_TREE_STRIPPED_CONFIG = CONFIGURED_FEATURES.register("fallen_spruce_stripped_tree", () -> new ConfiguredFeature<>(TGFeatures.FALLEN_SPRUCE_TREE.get(), new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> FALLEN_SPRUCE_TREE_CONFIG = CONFIGURED_FEATURES.register("fallen_spruce_tree", () -> new ConfiguredFeature<>(TGFeatures.FALLEN_SPRUCE_TREE.get(), new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> LARGE_SPRUCE_TREE_01_STRIPPED_CONFIG = CONFIGURED_FEATURES.register("large_spruce_tree_stripped_01", () -> new ConfiguredFeature<>(TGFeatures.LARGE_SPRUCE_TREE_01.get(), new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> LARGE_SPRUCE_TREE_01_CONFIG = CONFIGURED_FEATURES.register("large_spruce_tree_01", () -> new ConfiguredFeature<>(TGFeatures.LARGE_SPRUCE_TREE_01.get(), new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> LARGE_SPRUCE_TREE_02_STRIPPED_CONFIG = CONFIGURED_FEATURES.register("large_spruce_tree_stripped_02", () -> new ConfiguredFeature<>(TGFeatures.LARGE_SPRUCE_TREE_02.get(), new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> LARGE_SPRUCE_TREE_02_CONFIG = CONFIGURED_FEATURES.register("large_spruce_tree_02", () -> new ConfiguredFeature<>(TGFeatures.LARGE_SPRUCE_TREE_02.get(), new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> LARGE_SPRUCE_TREE_03_STRIPPED_CONFIG = CONFIGURED_FEATURES.register("large_spruce_tree_stripped_03", () -> new ConfiguredFeature<>(TGFeatures.LARGE_SPRUCE_TREE_03.get(), new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> LARGE_SPRUCE_TREE_03_CONFIG = CONFIGURED_FEATURES.register("large_spruce_tree_03", () -> new ConfiguredFeature<>(TGFeatures.LARGE_SPRUCE_TREE_03.get(), new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> LARGE_BENT_SPRUCE_TREE_01_STRIPPED_CONFIG = CONFIGURED_FEATURES.register("large_bent_spruce_tree_stripped_01", () -> new ConfiguredFeature<>(TGFeatures.LARGE_BENT_SPRUCE_TREE_01.get(), new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> LARGE_BENT_SPRUCE_TREE_01_CONFIG = CONFIGURED_FEATURES.register("large_bent_spruce_tree_01", () -> new ConfiguredFeature<>(TGFeatures.LARGE_BENT_SPRUCE_TREE_01.get(), new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> LARGE_BENT_SPRUCE_TREE_02_STRIPPED_CONFIG = CONFIGURED_FEATURES.register("large_bent_spruce_tree_stripped_02", () -> new ConfiguredFeature<>(TGFeatures.LARGE_BENT_SPRUCE_TREE_02.get(), new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> LARGE_BENT_SPRUCE_TREE_02_CONFIG = CONFIGURED_FEATURES.register("large_bent_spruce_tree_02", () -> new ConfiguredFeature<>(TGFeatures.LARGE_BENT_SPRUCE_TREE_02.get(), new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.defaultBlockState(), Blocks.SPRUCE_LEAVES.defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> TG_PATCH_LARGE_FERN = CONFIGURED_FEATURES.register("tg_patch_large_fern_config",  () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(96, 7, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.LARGE_FERN))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> TG_PATCH_LEAVES = CONFIGURED_FEATURES.register("tg_patch_leaves_config", () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 6, 0, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.OAK_LEAVES.defaultBlockState().setValue(BlockStateProperties.PERSISTENT, true)))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> DEEP_DARK_OAK = CONFIGURED_FEATURES.register("deep_dark_oak", () -> new ConfiguredFeature<>(Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.DARK_OAK_LOG), new DeepDarkOakTrunkPlacer(13, 4, 2), BlockStateProvider.simple(Blocks.DARK_OAK_LEAVES), new DarkOakFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)), new ThreeLayersFeatureSize(1, 1, 0, 1, 2,OptionalInt.empty()))).ignoreVines().build()));
    public static final RegistryObject<ConfiguredFeature<?, ?>> TG_PATCH_MEADOW_FLOWER_CONFIG = CONFIGURED_FEATURES.register("tg_patch_meadow_flower_config", () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(96, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new DualNoiseProvider(new InclusiveRange<Integer>(1, 3), new NormalNoise.NoiseParameters(-10, 1.0D), 1.0F, 2345L, new NormalNoise.NoiseParameters(-3, 1.0D), 1.0F, List.of(Blocks.TALL_GRASS.defaultBlockState(), Blocks.ALLIUM.defaultBlockState(), Blocks.POPPY.defaultBlockState(), Blocks.AZURE_BLUET.defaultBlockState(), Blocks.DANDELION.defaultBlockState(), Blocks.CORNFLOWER.defaultBlockState(), Blocks.OXEYE_DAISY.defaultBlockState(), Blocks.GRASS.defaultBlockState())))))));


    // configured tree feature collections
    public static final RegistryObject<ConfiguredFeature<?, ?>> HAUNTED_FOREST_TREES = CONFIGURED_FEATURES.register("haunted_forest_trees", () -> new ConfiguredFeature<>(Feature.RANDOM_SELECTOR,
            new RandomFeatureConfiguration(List.of(
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(SMALL_SPRUCE_TREE_01_CONFIG.get())), 0.25F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(SMALL_SPRUCE_TREE_02_CONFIG.get())), 0.25F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(SMALL_SPRUCE_TREE_03_CONFIG.get())), 0.375F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(SMALL_SPRUCE_TREE_04_CONFIG.get())), 0.1F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(SMALL_SPRUCE_TREE_05_CONFIG.get())), 0.1F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(SMALL_SPRUCE_TREE_06_CONFIG.get())), 0.1F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(SMALL_BENT_SPRUCE_TREE_01_CONFIG.get())), 0.1F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(FALLEN_SPRUCE_TREE_CONFIG.get())), 0.1F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(LARGE_SPRUCE_TREE_01_CONFIG.get())), 0.25F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(LARGE_SPRUCE_TREE_02_CONFIG.get())), 0.1F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(LARGE_SPRUCE_TREE_03_CONFIG.get())), 0.1F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(SMALL_SPRUCE_TREE_01_STRIPPED_CONFIG.get())), 0.25F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(SMALL_SPRUCE_TREE_02_STRIPPED_CONFIG.get())), 0.25F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(SMALL_SPRUCE_TREE_03_STRIPPED_CONFIG.get())), 0.375F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(SMALL_SPRUCE_TREE_04_STRIPPED_CONFIG.get())), 0.1F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(SMALL_SPRUCE_TREE_05_STRIPPED_CONFIG.get())), 0.1F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(SMALL_SPRUCE_TREE_06_STRIPPED_CONFIG.get())), 0.1F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(SMALL_BENT_SPRUCE_TREE_01_STRIPPED_CONFIG.get())), 0.1F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(FALLEN_SPRUCE_TREE_STRIPPED_CONFIG.get())), 0.1F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(LARGE_SPRUCE_TREE_01_STRIPPED_CONFIG.get())), 0.25F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(LARGE_SPRUCE_TREE_02_STRIPPED_CONFIG.get())), 0.1F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(LARGE_SPRUCE_TREE_03_STRIPPED_CONFIG.get())), 0.1F)),
                    TreePlacements.SPRUCE_CHECKED)
    ));


    public static final RegistryObject<ConfiguredFeature<?, ?>> ERODED_HAUNTED_FOREST_TREES = CONFIGURED_FEATURES.register("eroded_haunted_forest_trees", () -> new ConfiguredFeature<>(Feature.RANDOM_SELECTOR,
            new RandomFeatureConfiguration(List.of(
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(SMALL_BENT_SPRUCE_TREE_01_CONFIG.get())), 0.1F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(FALLEN_SPRUCE_TREE_CONFIG.get())), 0.0075F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(LARGE_BENT_SPRUCE_TREE_01_CONFIG.get())), 0.1F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(LARGE_BENT_SPRUCE_TREE_02_CONFIG.get())), 0.1F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(LARGE_SPRUCE_TREE_01_CONFIG.get())), 0.5F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(LARGE_SPRUCE_TREE_02_CONFIG.get())), 0.1F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(LARGE_SPRUCE_TREE_03_CONFIG.get())), 0.1F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(SMALL_BENT_SPRUCE_TREE_01_STRIPPED_CONFIG.get())), 0.1F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(FALLEN_SPRUCE_TREE_STRIPPED_CONFIG.get())), 0.0075F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(LARGE_BENT_SPRUCE_TREE_01_STRIPPED_CONFIG.get())), 0.1F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(LARGE_BENT_SPRUCE_TREE_02_STRIPPED_CONFIG.get())), 0.1F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(LARGE_SPRUCE_TREE_01_STRIPPED_CONFIG.get())), 0.5F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(LARGE_SPRUCE_TREE_02_STRIPPED_CONFIG.get())), 0.1F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(Holder.direct(LARGE_SPRUCE_TREE_03_STRIPPED_CONFIG.get())), 0.1F)),
                    TreePlacements.SPRUCE_CHECKED)
    ));

    public static final RegistryObject<ConfiguredFeature<?, ?>> ANCIENT_DEAD_REEF_VEGETATION = CONFIGURED_FEATURES.register("ancient_dead_reef_vegetation", () -> new ConfiguredFeature<>(Feature.SIMPLE_RANDOM_SELECTOR,
            new SimpleRandomFeatureConfiguration(HolderSet.direct(
                    PlacementUtils.inlinePlaced(TGFeatures.DEAD_CORAL_TREE_FEATURE.get(), FeatureConfiguration.NONE),
                    PlacementUtils.inlinePlaced(TGFeatures.DEAD_CORAL_CLAW_FEATURE.get(), FeatureConfiguration.NONE),
                    PlacementUtils.inlinePlaced(TGFeatures.DEAD_CORAL_MUSHROOM_FEATURE.get(), FeatureConfiguration.NONE)))));


    public static final RegistryObject<ConfiguredFeature<?, ?>> DEEP_DARK_FOREST_VEGETATION = CONFIGURED_FEATURES.register("deep_dark_forest_vegetation", () -> new ConfiguredFeature<>(Feature.RANDOM_SELECTOR,
            new RandomFeatureConfiguration(List.of(
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(TreeFeatures.HUGE_BROWN_MUSHROOM, new PlacementModifier[0]), 0.025F),
                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(TreeFeatures.HUGE_RED_MUSHROOM, new PlacementModifier[0]), 0.025F),
                    new WeightedPlacedFeature(TGPlacedFeatures.DEEP_DARK_OAK_CHECKED.getHolder().get(), 0.8666667F),
                    new WeightedPlacedFeature(TreePlacements.DARK_OAK_CHECKED, 0.1F)), TreePlacements.DARK_OAK_CHECKED)));



     */


}
