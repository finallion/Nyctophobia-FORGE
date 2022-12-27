package net.finallion.graveyard_biomes.world.features.surfaceFeatures;

import com.mojang.serialization.Codec;
import net.finallion.graveyard_biomes.util.TGTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

import java.util.Random;

public class DeadCoralPatchFeature extends Feature<NoneFeatureConfiguration> {


    public DeadCoralPatchFeature(Codec<NoneFeatureConfiguration> configCodec) {
        super(configCodec);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        WorldGenLevel world = context.level();
        BlockPos blockPos = context.origin();
        RandomSource random = context.random();
        BlockPos.MutableBlockPos mutable = new BlockPos.MutableBlockPos().set(blockPos);


        for (int i = 61; i < 80; i++) {
            mutable.set(blockPos);
            mutable.move(random.nextInt(3) - random.nextInt(3), 0, random.nextInt(3) - random.nextInt(3));
            mutable.setY(i);
            if (world.getBlockState(mutable).isSolidRender(world, mutable) && world.getBlockState(mutable.above()).isAir() && world.getBiome(mutable).unwrapKey().get().toString().contains("ancient_dead_coral_reef")) {
                if (random.nextInt(7) == 0) {
                    BuiltInRegistries.f_256975_.getTag(TGTags.DEAD_CORALS).flatMap((p_204731_) -> {
                        return p_204731_.getRandomElement(random);
                    }).map(Holder::value).ifPresent((p_204720_) -> {
                        world.setBlock(mutable.above(), p_204720_.defaultBlockState().setValue(BlockStateProperties.WATERLOGGED, false), 2);
                    });
                    break;
                }
            } else if (world.getBlockState(mutable).isSolidRender(world, mutable) && world.getBlockState(mutable.above()).getBlock() == Blocks.WATER && world.getBiome(mutable).unwrapKey().get().toString().contains("ancient_dead_coral_reef")) {
                if (random.nextBoolean()) {
                    BuiltInRegistries.f_256975_.getTag(TGTags.DEAD_CORALS).flatMap((p_204731_) -> {
                        return p_204731_.getRandomElement(random);
                    }).map(Holder::value).ifPresent((p_204720_) -> {
                        world.setBlock(mutable.above(), p_204720_.defaultBlockState().setValue(BlockStateProperties.WATERLOGGED, true), 2);
                    });
                    break;
                }
            }
        }

        return true;

    }

}

