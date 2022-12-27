package net.finallion.graveyard_biomes.world.trunk;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.finallion.graveyard_biomes.init.TGTrunkPlacer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.TreeFeature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;

public class DeepDarkOakTrunkPlacer extends TrunkPlacer {

    public static final Codec<DeepDarkOakTrunkPlacer> CODEC = RecordCodecBuilder.create((instance)->
            trunkPlacerParts(instance).apply(instance, DeepDarkOakTrunkPlacer::new));

    public DeepDarkOakTrunkPlacer(int i, int j, int k) {
        super(i, j, k);
    }

    protected TrunkPlacerType<?> type() {
        return TGTrunkPlacer.DEEP_DARK_OAK_TRUNK_PLACER.get();
    }

    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader world, BiConsumer<BlockPos, BlockState> replacer, RandomSource random, int height, BlockPos startPos, TreeConfiguration config) {
        List<FoliagePlacer.FoliageAttachment> list = Lists.newArrayList();
        BlockPos blockPos = startPos.below();
        setDirtAt(world, replacer, random, blockPos, config);
        setDirtAt(world, replacer, random, blockPos.east(), config);
        setDirtAt(world, replacer, random, blockPos.south(), config);
        setDirtAt(world, replacer, random, blockPos.south().east(), config);
        setDirtAt(world, replacer, random, blockPos.east().east(), config);
        setDirtAt(world, replacer, random, blockPos.north().east(), config);
        setDirtAt(world, replacer, random, blockPos.north(), config);
        setDirtAt(world, replacer, random, blockPos.south().south().east(), config);
        setDirtAt(world, replacer, random, blockPos.south().east().east(), config);
        setDirtAt(world, replacer, random, blockPos.south().south(), config);
        setDirtAt(world, replacer, random, blockPos.west(), config);
        setDirtAt(world, replacer, random, blockPos.south().west(), config);

        int startPosX = startPos.getX();
        int startPosY = startPos.getY();
        int startPosZ = startPos.getZ();

        // lower extra trunk
        for (int i = -1; i <= 2; ++i) {
            for (int ii = -1; ii <= 2; ++ii) {
                // corner cases
                if ((i == -1 && ii == -1) || (i == -1 && ii == 2) || (i == 2 && ii == -1) || (i == 2 && ii == 2)) {
                    continue;
                }

                if ((i < 0 || i > 1 || ii < 0 || ii > 1)) {
                    int extraTrunkLength = random.nextInt(6) + 5;

                    for(int trunkCounter = 0; trunkCounter < extraTrunkLength; ++trunkCounter) {
                        this.placeLog(world, replacer, random, new BlockPos(startPosX + i, startPosY + trunkCounter, startPosZ + ii), config);
                    }
                }

            }
        }

        // main trunk
        for(int heightCounter = 0; heightCounter < height; ++heightCounter) {
            BlockPos blockPos2 = new BlockPos(startPosX, startPosY + heightCounter, startPosZ);
            if (TreeFeature.isAirOrLeaves(world, blockPos2)) {
                this.placeLog(world, replacer, random, blockPos2, config);
                this.placeLog(world, replacer, random, blockPos2.east(), config);
                this.placeLog(world, replacer, random, blockPos2.south(), config);
                this.placeLog(world, replacer, random, blockPos2.east().south(), config);
            }
        }

        // outwards reaching branches
        for (int i = 1; i <= 8; i++) {
            BlockPos.MutableBlockPos blockPos3 = new BlockPos.MutableBlockPos(startPosX, startPosY + height - 1, startPosZ);
            Direction[] branchDir = new Direction[2];
            if (i <= 2) {
                blockPos3.east();
                branchDir[0] = Direction.NORTH;
                branchDir[1] = Direction.EAST;
            } else if (i <= 4) {
                blockPos3.south();
                branchDir[0] = Direction.SOUTH;
                branchDir[1] = Direction.WEST;
            } else if (i <= 6) {
                blockPos3.east().south();
                branchDir[0] = Direction.EAST;
                branchDir[1] = Direction.SOUTH;
            } else {
                branchDir[0] = Direction.WEST;
                branchDir[1] = Direction.NORTH;
            }

            int branchLength = 5;
            for (int ii = 0; ii < branchLength; ii++) {
                blockPos3.move(Direction.UP);

                if (i % 2 == 0) {
                    blockPos3.move(branchDir[0]);
                } else {
                    blockPos3.move(branchDir[random.nextInt(2)]);
                }

                if (TreeFeature.validTreePos(world, blockPos3)) {
                    this.placeLog(world, replacer, random, blockPos3, config);
                }

            }
            list.add(new FoliagePlacer.FoliageAttachment(blockPos3.above(), 0, true));
        }

        // straight up branches
        for (int i = 1; i <= 4; i++) {
            BlockPos.MutableBlockPos blockPos3 = new BlockPos.MutableBlockPos(startPosX, startPosY + height - 1, startPosZ);
            Direction[] branchDir = new Direction[2];

            if (i <= 1) {
                blockPos3.east();
                branchDir[0] = Direction.EAST;
                branchDir[1] = Direction.NORTH;
            } else if (i <= 2) {
                blockPos3.south();
                branchDir[0] = Direction.SOUTH;
                branchDir[1] = Direction.WEST;
            } else if (i <= 3) {
                blockPos3.east().south();
                branchDir[0] = Direction.EAST;
                branchDir[1] = Direction.SOUTH;
            } else {
                branchDir[0] = Direction.WEST;
                branchDir[1] = Direction.NORTH;
            }

            int branchLength = 6;
            for (int ii = 0; ii < branchLength; ii++) {
                blockPos3.move(Direction.UP);
                if (random.nextInt(2) == 0) {
                    blockPos3.move(branchDir[random.nextInt(2)]);
                }

                if (TreeFeature.validTreePos(world, blockPos3)) {
                    this.placeLog(world, replacer, random, blockPos3, config);
                }

            }
            list.add(new FoliagePlacer.FoliageAttachment(blockPos3.above(), 0, true));
        }

        return list;
    }
}
