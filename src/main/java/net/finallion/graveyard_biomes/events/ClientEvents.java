package net.finallion.graveyard_biomes.events;

import com.mojang.blaze3d.systems.RenderSystem;
import net.finallion.graveyard_biomes.TheGraveyardBiomes;
import net.finallion.graveyard_biomes.config.GraveyardConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.material.FogType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ViewportEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TheGraveyardBiomes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientEvents {
    // smaller values = denser fog
    private static double fogDensity;
    private static float fogStart = 32.0F;

    @SubscribeEvent
    public static void FogDensityEvent(ViewportEvent.RenderFog event) {
        BlockPos pos = event.getRenderer().getMainCamera().getBlockPosition();
        Entity entity = event.getCamera().getEntity();
        FogType cameraSubmersionType = event.getCamera().getFluidInCamera();
        // TODO: better biome name getter, too lazy
        String biomeName = entity.level.getBiome(pos).toString();

        if (!GraveyardConfig.COMMON.enableFogHauntedForest.get() &&
                !GraveyardConfig.COMMON.enableFogHauntedLakes.get() &&
                !GraveyardConfig.COMMON.enableFogErodedHauntedForest.get()) {
            return;
        }



        if (biomeName.contains("haunted_lakes") && GraveyardConfig.COMMON.enableFogHauntedLakes.get()) {
            if (pos.getY() > GraveyardConfig.COMMON.fogHauntedLakesMaxY.get()
                    || pos.getY() < GraveyardConfig.COMMON.fogHauntedLakesMinY.get()) {
                // fade fog out
                if (fogStart < event.getFarPlaneDistance() / 2) {
                    fogStart *= 1.05F;
                } else {
                    fogStart = event.getFarPlaneDistance() / 2;
                    return;
                }
            }
            fogDensity = GraveyardConfig.COMMON.fogHauntedLakesDensity.get();
        } else if (biomeName.contains("eroded_haunted_forest") && GraveyardConfig.COMMON.enableFogErodedHauntedForest.get()) {
            if (pos.getY() > GraveyardConfig.COMMON.fogErodedHauntedForestMaxY.get()
                    || pos.getY() < GraveyardConfig.COMMON.fogErodedHauntedForestMinY.get()) {
                // fade fog out
                if (fogStart < event.getFarPlaneDistance() / 2) {
                    fogStart *= 1.05F;
                } else {
                    fogStart = event.getFarPlaneDistance() / 2;
                    return;
                }
            }
            fogDensity = GraveyardConfig.COMMON.fogErodedHauntedForestDensity.get();
        } else if (biomeName.contains("haunted_forest") && !biomeName.contains("eroded") && GraveyardConfig.COMMON.enableFogHauntedForest.get()) {
            if (pos.getY() > GraveyardConfig.COMMON.fogHauntedForestMaxY.get()
                    || pos.getY() < GraveyardConfig.COMMON.fogHauntedForestMinY.get()) {
                // fade fog out
                if (fogStart < event.getFarPlaneDistance() / 2) {
                    fogStart *= 1.05F;
                } else {
                    fogStart = event.getFarPlaneDistance() / 2;
                    return;
                }
            }
            fogDensity = GraveyardConfig.COMMON.fogHauntedForestDensity.get();
        } else {

            // fade fog out
            if (fogStart < event.getFarPlaneDistance() / 2) {
                fogStart *= 1.05F;
            } else {
                fogStart = event.getFarPlaneDistance() / 2;
                return;
            }

        }


        if (cameraSubmersionType == FogType.NONE) {
            if (!(entity instanceof LivingEntity && ((LivingEntity) entity).hasEffect(MobEffects.BLINDNESS))) {

                float g = event.getRenderer().getRenderDistance();
                float viewDistance = Math.max(g - 16.0F, 32.0F);

                // fog fade in
                if (fogStart > fogDensity) {
                    fogStart *= 0.975F;
                }

                float start = viewDistance * 0.05F * fogStart;
                float end = Math.min(viewDistance, 192.0F) * 0.5F * fogStart;

                if (start > 64.0F) {
                    start = 64.0F;
                }

                if (end > event.getFarPlaneDistance()) {
                    end = event.getFarPlaneDistance();
                }

                RenderSystem.setShaderFogStart(start);
                RenderSystem.setShaderFogEnd(end);
            }
        }

    }


}