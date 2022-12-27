package net.finallion.graveyard_biomes.world.features.trees;

import net.finallion.graveyard_biomes.world.features.surfaceFeatures.FeatureHelper;
import net.finallion.graveyard_biomes.world.features.trees.config.TGTreeFeatureConfig;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;

import java.util.Random;

public class SmallSpruceTree01 extends BaseSpruceTree {
    private final int trunkHeight = 12;


    public SmallSpruceTree01(Codec<TGTreeFeatureConfig> configCodec) {
        super(configCodec);
    }

    @Override
    public boolean place(FeaturePlaceContext<TGTreeFeatureConfig> context) {
        BlockPos blockPos = context.origin();
        BlockPos.MutableBlockPos mutable = new BlockPos.MutableBlockPos().set(blockPos);
        BlockState wood = context.config().woodState;
        BlockState leaf = context.config().leafState;
        WorldGenLevel world = context.level();
        RandomSource random = context.random();
        TGTreeFeatureConfig config = context.config();
        int offsetTrunk = random.nextInt(3);

        if (!FeatureHelper.canBePlaced(world, blockPos.below(), world.getBlockState(blockPos.below()))) {
            return false;
        }

        if (!FeatureHelper.canGenerate(world, blockPos, 12)) {
            return false;
        }

        for (int i = 0; i < trunkHeight + offsetTrunk; i++) {
            world.setBlock(blockPos.above(i), wood, 2);
            mutable.move(0, 1, 0);
        }

        // single tree top
        setLeaves(world, mutable.offset(0, 3, 0), leaf);
        setLeaves(world, mutable.offset(0, 2, 0), leaf);
        setLeaves(world, mutable.offset(0, 1, 0), leaf);
        setLeaves(world, mutable.offset(0, 0, 0), leaf);

        generateOneStar(world, mutable.offset(0, 0, 0), false, config);
        randomSpreadTwo(world, mutable.offset(0, -1, 0), true, 2, config);

        // second layer
        generateOneStar(world, mutable.offset(0, -3, 0), false, config);
        generateTwoStar(world, mutable.offset(0, -4, 0), false, config);
        randomSpreadTwo(world, mutable.offset(0, -5, 0), false, 2, config);

        // third layer
        generateTwoStar(world, mutable.offset(0, -6, 0), false, config);
        generateThreeStar(world, mutable.offset(0, -7, 0), true, config);

        randomSpreadOne(world, mutable.offset(0, -8, 0), false, 4, config);

        // forth layer
        generateTwoStar(world, mutable.offset(0, -9, 0), false, config);
        generateThreeStar(world, mutable.offset(0, -10, 0), false, config);


        return false;
    }
}
