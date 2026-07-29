package com.therealcthulhu.timbertreasures.block;

import com.therealcthulhu.timbertreasures.TimberTreasures;
import com.therealcthulhu.timbertreasures.block.custom.ModFlammableRotatedPillarBlock;
import com.therealcthulhu.timbertreasures.item.ModItems;
import com.therealcthulhu.timbertreasures.worldgen.tree.ModTreeGrowers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(TimberTreasures.MOD_ID);


    //Dirt Tree
    public static final DeferredBlock<Block> DIRT_AMBER = registerBlock("dirt_amber",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f).sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> DIRT_LOG = registerBlock("dirt_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));

    public static final DeferredBlock<Block> DIRT_SAPLING = registerBlock("dirt_sapling",
            () -> new SaplingBlock(ModTreeGrowers.DIRT_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> DIRT_LEAVES = registerBlock("dirt_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    //Stone Tree
    public static final DeferredBlock<Block> STONE_AMBER = registerBlock("stone_amber",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f).sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> STONE_LOG = registerBlock("stone_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));

    public static final DeferredBlock<Block> STONE_SAPLING = registerBlock("stone_sapling",
            () -> new SaplingBlock(ModTreeGrowers.STONE_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> STONE_LEAVES = registerBlock("stone_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    //Gravel Tree
    public static final DeferredBlock<Block> GRAVEL_AMBER = registerBlock("gravel_amber",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f).sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GRAVEL_LOG = registerBlock("gravel_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));

    public static final DeferredBlock<Block> GRAVEL_SAPLING = registerBlock("gravel_sapling",
            () -> new SaplingBlock(ModTreeGrowers.GRAVEL_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> GRAVEL_LEAVES = registerBlock("gravel_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    //Clay Tree
    public static final DeferredBlock<Block> CLAY_AMBER = registerBlock("clay_amber",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f).sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> CLAY_LOG = registerBlock("clay_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));

    public static final DeferredBlock<Block> CLAY_SAPLING = registerBlock("clay_sapling",
            () -> new SaplingBlock(ModTreeGrowers.CLAY_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> CLAY_LEAVES = registerBlock("clay_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    //Sand Tree
    public static final DeferredBlock<Block> SAND_AMBER = registerBlock("sand_amber",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f).sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> SAND_LOG = registerBlock("sand_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));

    public static final DeferredBlock<Block> SAND_SAPLING = registerBlock("sand_sapling",
            () -> new SaplingBlock(ModTreeGrowers.SAND_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> SAND_LEAVES = registerBlock("sand_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });



    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
