package net.finallion.graveyard_biomes.data;

import net.finallion.graveyard_biomes.init.TGBiomes;
import net.finallion.graveyard_biomes.init.TGConfiguredFeatures;
import net.finallion.graveyard_biomes.init.TGPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.registries.VanillaRegistries;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus= Mod.EventBusSubscriber.Bus.MOD)
public class TGDataGen {

    @SubscribeEvent
    public void onGatherDataRegistry(final GatherDataEvent gatherEvent) {
        DataGenerator generator = gatherEvent.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper fileHelper = gatherEvent.getExistingFileHelper();
        HolderLookup.Provider lookupProvider = new RegistrySetBuilder()
                .m_254916_(Registries.f_256911_, (RegistrySetBuilder.RegistryBootstrap) TGConfiguredFeatures::bootstrap)
                .m_254916_(Registries.f_256988_, (RegistrySetBuilder.RegistryBootstrap) TGPlacedFeatures::bootstrap)
                .m_254916_(Registries.f_256952_, TGBiomes::bootstrap)
                .m_254929_(RegistryAccess.fromRegistryOfRegistries(BuiltInRegistries.f_257047_), VanillaRegistries.m_255371_());


    }
}
