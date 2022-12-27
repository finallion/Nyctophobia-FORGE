package net.finallion.graveyard_biomes;

import com.mojang.serialization.Codec;
import net.finallion.graveyard_biomes.config.GraveyardConfig;
import net.finallion.graveyard_biomes.init.*;
import net.finallion.graveyard_biomes.util.BiomeModification;
import net.finallion.graveyard_biomes.init.TGBiomeProvider;
import net.finallion.graveyard_biomes.world.noise.TGNoiseParameters;
import net.finallion.graveyard_biomes.world.surfacerules.TGSurfaceRules;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.registries.VanillaRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;



@Mod("graveyard_biomes")
public class TheGraveyardBiomes {
    public static final String MOD_ID = "graveyard_biomes";
    public static final Logger LOGGER = LogManager.getLogger();

    public TheGraveyardBiomes() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;

        TGTrunkPlacer.TRUNK_PLACERS.register(modEventBus);
        TGFeatures.FEATURES.register(modEventBus);
        //TGConfiguredFeatures.CONFIGURED_FEATURES.register(modEventBus);
        //TGPlacedFeatures.PLACED_FEATURES.register(modEventBus);
        TGStructures.STRUCTURES.register(modEventBus);
        TGBiomes.BIOMES.register(modEventBus);

        modEventBus.addListener(this::setup);
        final DeferredRegister<Codec<? extends BiomeModifier>> serializers = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MOD_ID);
        serializers.register(modEventBus);
        serializers.register("biome_modification", BiomeModification.ModBiomeModifier::makeCodec);
        ModLoadingContext.get().registerConfig(net.minecraftforge.fml.config.ModConfig.Type.COMMON, GraveyardConfig.COMMON_SPEC);
    }

    public void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            TGBiomes.init();
            Regions.register(new TGBiomeProvider(new ResourceLocation(TheGraveyardBiomes.MOD_ID, "biome_provider"), GraveyardConfig.COMMON.theGraveyardBiomesWeight.get()));
            SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, "graveyard_biomes", TGSurfaceRules.makeRules());

        });

    }

}
