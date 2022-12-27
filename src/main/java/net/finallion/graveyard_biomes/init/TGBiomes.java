package net.finallion.graveyard_biomes.init;

import net.finallion.graveyard_biomes.TheGraveyardBiomes;
import net.finallion.graveyard_biomes.world.biomes.AncientDeadCoralReef;
import net.finallion.graveyard_biomes.world.biomes.DeepDarkForest;
import net.finallion.graveyard_biomes.world.biomes.HauntedForestBiomes;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

public class TGBiomes {
    public static final ResourceKey<Biome> ERODED_HAUNTED_FOREST_KEY = registerBiomeKeys("eroded_haunted_forest");
    public static final ResourceKey<Biome> HAUNTED_LAKES_KEY = registerBiomeKeys("haunted_lakes");
    public static final ResourceKey<Biome> HAUNTED_FOREST_KEY = registerBiomeKeys("haunted_forest");
    public static final ResourceKey<Biome> ANCIENT_DEAD_CORAL_REEF_KEY = registerBiomeKeys("ancient_dead_coral_reef");
    public static final ResourceKey<Biome> DEEP_DARK_FOREST_KEY = registerBiomeKeys("deep_dark_forest");

    private static ResourceKey<Biome> registerBiomeKeys(String name) {
        return ResourceKey.create(Registries.f_256952_, new ResourceLocation(TheGraveyardBiomes.MOD_ID, name));
    }

    public static void init() {}

    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, TheGraveyardBiomes.MOD_ID);

    public static void bootstrap(BootstapContext<Biome> context) {
        context.m_255272_(HAUNTED_FOREST_KEY, HauntedForestBiomes.createHauntedForest(context));
        context.m_255272_(ERODED_HAUNTED_FOREST_KEY, HauntedForestBiomes.createErodedHauntedForest(context));
        context.m_255272_(HAUNTED_LAKES_KEY, HauntedForestBiomes.createHauntedLakes(context));
        context.m_255272_(ANCIENT_DEAD_CORAL_REEF_KEY, AncientDeadCoralReef.createAncientDeadCoralReef(context));
        context.m_255272_(DEEP_DARK_FOREST_KEY, DeepDarkForest.createDeepDarkForest(context));

    }


}
