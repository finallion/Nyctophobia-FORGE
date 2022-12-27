package net.finallion.graveyard_biomes.util;

import net.finallion.graveyard_biomes.TheGraveyardBiomes;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;


public class TGTags {

    public static final TagKey<Block> DEAD_CORAL_BLOCKS = TagKey.create(Registries.f_256747_, new ResourceLocation(TheGraveyardBiomes.MOD_ID, "dead_coral_blocks"));
    public static final TagKey<Block> DEAD_CORAL_PLANTS = TagKey.create(Registries.f_256747_, new ResourceLocation(TheGraveyardBiomes.MOD_ID, "dead_coral_plants"));
    public static final TagKey<Block> DEAD_CORALS = TagKey.create(Registries.f_256747_, new ResourceLocation(TheGraveyardBiomes.MOD_ID, "dead_corals"));
    public static final TagKey<Block> DEAD_WALL_CORALS = TagKey.create(Registries.f_256747_, new ResourceLocation(TheGraveyardBiomes.MOD_ID, "dead_wall_corals"));
}
