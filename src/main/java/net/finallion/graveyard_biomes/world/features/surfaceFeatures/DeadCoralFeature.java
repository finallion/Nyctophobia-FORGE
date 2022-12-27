package net.finallion.graveyard_biomes.world.features.surfaceFeatures;

import com.mojang.serialization.Codec;
import net.finallion.graveyard_biomes.util.TGTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.BaseCoralWallFanBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Optional;
import java.util.Random;

public abstract class DeadCoralFeature extends Feature<NoneFeatureConfiguration> {
    public DeadCoralFeature(Codec<NoneFeatureConfiguration> p_65429_) {
        super(p_65429_);
    }

    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> p_159536_) {
        RandomSource random = p_159536_.random();
        WorldGenLevel worldgenlevel = p_159536_.level();
        BlockPos blockpos = p_159536_.origin();
        Optional<Block> optional = BuiltInRegistries.f_256975_.getTag(TGTags.DEAD_CORAL_BLOCKS).flatMap((p_204734_) -> {
            return p_204734_.getRandomElement(random);
        }).map(Holder::value);
        return optional.isEmpty() ? false : this.placeFeature(worldgenlevel, random, blockpos, optional.get().defaultBlockState());
    }

    protected abstract boolean placeFeature(LevelAccessor p_65430_, RandomSource p_65431_, BlockPos p_65432_, BlockState p_65433_);

    protected boolean placeCoralBlock(LevelAccessor world, RandomSource p_65448_, BlockPos pos, BlockState p_65450_) {
        BlockPos blockPos = pos.above();
        BlockState blockState = world.getBlockState(pos);
        if (world.getBlockState(pos.below()).is(Blocks.WATER) || world.getBlockState(pos.below()).is(Blocks.AIR)) {
            return false;
        }

        if (((blockState.is(Blocks.AIR) || blockState.is(Blocks.WATER)) || blockState.is(TGTags.DEAD_CORALS)) && (world.getBlockState(blockPos).is(Blocks.AIR) || world.getBlockState(blockPos).is(Blocks.WATER))) {
            world.setBlock(pos, p_65450_, 3);
            if (p_65448_.nextFloat() < 0.25F) {

                if (world.getBlockState(blockPos).is(Blocks.WATER)) {
                    BuiltInRegistries.f_256975_.getTag(TGTags.DEAD_CORALS).flatMap((p_204731_) -> {
                        return p_204731_.getRandomElement(p_65448_);
                    }).map(Holder::value).ifPresent((p_204720_) -> {
                        world.setBlock(blockPos, p_204720_.defaultBlockState().setValue(BlockStateProperties.WATERLOGGED, true), 2);
                    });

                } else if (world.getBlockState(blockPos).is(Blocks.AIR)) {
                    BuiltInRegistries.f_256975_.getTag(TGTags.DEAD_CORALS).flatMap((p_204731_) -> {
                        return p_204731_.getRandomElement(p_65448_);
                    }).map(Holder::value).ifPresent((p_204720_) -> {
                        world.setBlock(blockPos, p_204720_.defaultBlockState().setValue(BlockStateProperties.WATERLOGGED, false), 2);
                    });
                }
            }

            for(Direction direction : Direction.Plane.HORIZONTAL) {
                if (p_65448_.nextFloat() < 0.2F) {
                    BlockPos blockpos1 = pos.relative(direction);
                    if (world.getBlockState(blockpos1).is(Blocks.WATER)) {
                        BuiltInRegistries.f_256975_.getTag(TGTags.DEAD_WALL_CORALS).flatMap((p_204728_) -> {
                            return p_204728_.getRandomElement(p_65448_);
                        }).map(Holder::value).ifPresent((p_204725_) -> {
                            BlockState blockstate2 = p_204725_.defaultBlockState().setValue(BlockStateProperties.WATERLOGGED, true);
                            if (blockstate2.hasProperty(BaseCoralWallFanBlock.FACING)) {
                                blockstate2 = blockstate2.setValue(BaseCoralWallFanBlock.FACING, direction);
                            }

                            world.setBlock(blockpos1, blockstate2, 2);
                        });

                    } else if (world.getBlockState(blockpos1).is(Blocks.AIR)) {
                        BuiltInRegistries.f_256975_.getTag(TGTags.DEAD_WALL_CORALS).flatMap((p_204728_) -> {
                            return p_204728_.getRandomElement(p_65448_);
                        }).map(Holder::value).ifPresent((p_204725_) -> {
                            BlockState blockstate2 = p_204725_.defaultBlockState().setValue(BlockStateProperties.WATERLOGGED, false);
                            if (blockstate2.hasProperty(BaseCoralWallFanBlock.FACING)) {
                                blockstate2 = blockstate2.setValue(BaseCoralWallFanBlock.FACING, direction);
                            }

                            world.setBlock(blockpos1, blockstate2, 2);
                        });
                    }
                }
            }

            return true;
        } else {
            return false;
        }
    }
}

