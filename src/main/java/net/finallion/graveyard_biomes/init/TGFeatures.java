package net.finallion.graveyard_biomes.init;

import net.finallion.graveyard_biomes.TheGraveyardBiomes;
import net.finallion.graveyard_biomes.world.features.surfaceFeatures.*;
import net.finallion.graveyard_biomes.world.features.surfaceFeatures.coralFeatures.DeadCoralClawFeature;
import net.finallion.graveyard_biomes.world.features.surfaceFeatures.coralFeatures.DeadCoralMushroomFeature;
import net.finallion.graveyard_biomes.world.features.surfaceFeatures.coralFeatures.DeadCoralTreeFeature;
import net.finallion.graveyard_biomes.world.features.trees.*;
import net.finallion.graveyard_biomes.world.features.trees.config.TGTreeFeatureConfig;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class TGFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, TheGraveyardBiomes.MOD_ID);

    // tree features
    public static final RegistryObject<Feature<TGTreeFeatureConfig>> SMALL_SPRUCE_TREE_01 = FEATURES.register("small_spruce_tree_01", () -> new SmallSpruceTree01(TGTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<TGTreeFeatureConfig>> SMALL_SPRUCE_TREE_02 = FEATURES.register("small_spruce_tree_02", () -> new SmallSpruceTree02(TGTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<TGTreeFeatureConfig>> SMALL_SPRUCE_TREE_03 = FEATURES.register("small_spruce_tree_03", () -> new SmallSpruceTree03(TGTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<TGTreeFeatureConfig>> SMALL_SPRUCE_TREE_04 = FEATURES.register("small_spruce_tree_04", () -> new SmallSpruceTree04(TGTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<TGTreeFeatureConfig>> SMALL_SPRUCE_TREE_05 = FEATURES.register("small_spruce_tree_05", () -> new SmallSpruceTree05(TGTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<TGTreeFeatureConfig>> SMALL_SPRUCE_TREE_06 = FEATURES.register("small_spruce_tree_06", () -> new SmallSpruceTree06(TGTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<TGTreeFeatureConfig>> SMALL_BENT_SPRUCE_TREE_01 = FEATURES.register("small_bent_spruce_tree_01", () -> new SmallBentSpruceTree01(TGTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<TGTreeFeatureConfig>> FALLEN_SPRUCE_TREE = FEATURES.register("fallen_spruce_tree", () -> new FallenSpruceTree(TGTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<TGTreeFeatureConfig>> LARGE_BENT_SPRUCE_TREE_01 = FEATURES.register("large_bent_spruce_tree_01", () -> new LargeBentSpruceTree01(TGTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<TGTreeFeatureConfig>> LARGE_BENT_SPRUCE_TREE_02 = FEATURES.register("large_bent_spruce_tree_02", () -> new LargeBentSpruceTree02(TGTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<TGTreeFeatureConfig>> LARGE_SPRUCE_TREE_01 = FEATURES.register("large_spruce_tree_01", () -> new LargeSpruceTree01(TGTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<TGTreeFeatureConfig>> LARGE_SPRUCE_TREE_02 = FEATURES.register("large_spruce_tree_02", () -> new LargeSpruceTree02(TGTreeFeatureConfig.CODEC));
    public static final RegistryObject<Feature<TGTreeFeatureConfig>> LARGE_SPRUCE_TREE_03 = FEATURES.register("large_spruce_tree_03", () -> new LargeSpruceTree03(TGTreeFeatureConfig.CODEC));

    // other features
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> MOSS_CARPET_FEATURE = FEATURES.register("moss_carpet_feature", () -> new MossCarpetFeature(NoneFeatureConfiguration.CODEC));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> COBWEB_FEATURE = FEATURES.register("cobweb_feature", () -> new CobwebFeature(NoneFeatureConfiguration.CODEC));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> BUSH_FEATURE = FEATURES.register("bush_feature", () -> new BushFeature(NoneFeatureConfiguration.CODEC, (LeavesBlock) Blocks.SPRUCE_LEAVES));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> DEEP_DARK_FOREST_BUSH_FEATURE = FEATURES.register("deep_dark_forest_bush_feature", () -> new BushFeature(NoneFeatureConfiguration.CODEC, (LeavesBlock) Blocks.DARK_OAK_LEAVES));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> SOUL_LIGHT_FEATURE = FEATURES.register("soul_light_feature", () -> new SoulLightFeature(NoneFeatureConfiguration.CODEC));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> FALLEN_TREE_FEATURE = FEATURES.register("fallen_tree_feature", () -> new FallenTreeFeature(NoneFeatureConfiguration.CODEC));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> DEAD_CORAL_TREE_FEATURE = FEATURES.register("dead_coral_tree_feature", () -> new DeadCoralTreeFeature(NoneFeatureConfiguration.CODEC));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> DEAD_CORAL_CLAW_FEATURE = FEATURES.register("dead_coral_claw_feature", () -> new DeadCoralClawFeature(NoneFeatureConfiguration.CODEC));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> DEAD_CORAL_MUSHROOM_FEATURE = FEATURES.register("dead_coral_mushroom_feature", () -> new DeadCoralMushroomFeature(NoneFeatureConfiguration.CODEC));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> DEAD_CORAL_PATCH_FEATURE = FEATURES.register("dead_coral_patch_feature", () -> new DeadCoralPatchFeature(NoneFeatureConfiguration.CODEC));



}
