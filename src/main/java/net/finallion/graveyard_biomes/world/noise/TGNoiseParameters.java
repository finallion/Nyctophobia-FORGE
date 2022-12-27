package net.finallion.graveyard_biomes.world.noise;


import net.finallion.graveyard_biomes.TheGraveyardBiomes;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import net.minecraftforge.registries.ForgeRegistries;

public class TGNoiseParameters {
    public static final ResourceKey<NormalNoise.NoiseParameters> HAUNTED_FOREST_SURFACE = registerNoiseParameter("haunted_forest_surface");
    public static final ResourceKey<NormalNoise.NoiseParameters> HAUNTED_FOREST_NOISE = registerNoiseParameter("haunted_forest_noise");
    public static final ResourceKey<NormalNoise.NoiseParameters> HAUNTED_FOREST_PARTICLE_MOSS = registerNoiseParameter("haunted_forest_high_noise");
    public static final ResourceKey<NormalNoise.NoiseParameters> HAUNTED_FOREST_MOSS = registerNoiseParameter("haunted_forest_high_moss");
    public static final ResourceKey<NormalNoise.NoiseParameters> HAUNTED_FOREST_SOUL_SOIL = registerNoiseParameter("haunted_forest_soul_soil");



    /*
    public static NormalNoise.NoiseParameters init() {
        register(HAUNTED_FOREST_SURFACE, -5, 1.1, 0.5, 1.25, 1.4);
        register(HAUNTED_FOREST_PARTICLE_MOSS, -2, 1.0, 0.75);
        register(HAUNTED_FOREST_SOUL_SOIL, -6, 1.2, 0.5);
        register(HAUNTED_FOREST_NOISE, -1, 1.0);
        register(HAUNTED_FOREST_MOSS, -3, 1.0, 1.25);
        return BuiltinRegistries.NOISE.iterator().next();
    }

     */



    private static ResourceKey<NormalNoise.NoiseParameters> registerNoiseParameter(String p_189310_) {
        return ResourceKey.create(Registries.f_256865_, new ResourceLocation(TheGraveyardBiomes.MOD_ID, p_189310_));
    }

    /*
    private static void register(ResourceKey<NormalNoise.NoiseParameters> p_194751_, int p_194752_, double p_194753_, double... p_194754_) {
        BuiltInRegistries.register(BuiltInRegistries., p_194751_, new NormalNoise.NoiseParameters(p_194752_, p_194753_, p_194754_));
    }

     */
}
