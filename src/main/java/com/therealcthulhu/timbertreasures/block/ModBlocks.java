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


    //Bone Tree
    public static final DeferredBlock<Block> BONE_AMBER = registerBlock("bone_amber",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f).sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> BONE_LOG = registerBlock("bone_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));

    public static final DeferredBlock<Block> BONE_SAPLING = registerBlock("bone_sapling",
            () -> new SaplingBlock(ModTreeGrowers.BONE_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> BONE_LEAVES = registerBlock("bone_leaves",
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

    //String Tree
    public static final DeferredBlock<Block> STRING_AMBER = registerBlock("string_amber",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f).sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> STRING_LOG = registerBlock("string_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));

    public static final DeferredBlock<Block> STRING_SAPLING = registerBlock("string_sapling",
            () -> new SaplingBlock(ModTreeGrowers.STRING_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> STRING_LEAVES = registerBlock("string_leaves",
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

    //Coal Tree
    public static final DeferredBlock<Block> COAL_AMBER = registerBlock("coal_amber",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f).sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> COAL_LOG = registerBlock("coal_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));

    public static final DeferredBlock<Block> COAL_SAPLING = registerBlock("coal_sapling",
            () -> new SaplingBlock(ModTreeGrowers.COAL_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> COAL_LEAVES = registerBlock("coal_leaves",
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

    //Copper Tree
    public static final DeferredBlock<Block> COPPER_AMBER = registerBlock("copper_amber",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f).sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> COPPER_LOG = registerBlock("copper_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));

    public static final DeferredBlock<Block> COPPER_SAPLING = registerBlock("copper_sapling",
            () -> new SaplingBlock(ModTreeGrowers.COPPER_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> COPPER_LEAVES = registerBlock("copper_leaves",
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

    //Iron Tree
    public static final DeferredBlock<Block> IRON_AMBER = registerBlock("iron_amber",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f).sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> IRON_LOG = registerBlock("iron_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));

    public static final DeferredBlock<Block> IRON_SAPLING = registerBlock("iron_sapling",
            () -> new SaplingBlock(ModTreeGrowers.IRON_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> IRON_LEAVES = registerBlock("iron_leaves",
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

    //Gold Tree
    public static final DeferredBlock<Block> GOLD_AMBER = registerBlock("gold_amber",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f).sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GOLD_LOG = registerBlock("gold_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));

    public static final DeferredBlock<Block> GOLD_SAPLING = registerBlock("gold_sapling",
            () -> new SaplingBlock(ModTreeGrowers.GOLD_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> GOLD_LEAVES = registerBlock("gold_leaves",
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

    //Diamond Tree
    public static final DeferredBlock<Block> DIAMOND_AMBER = registerBlock("diamond_amber",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f).sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> DIAMOND_LOG = registerBlock("diamond_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));

    public static final DeferredBlock<Block> DIAMOND_SAPLING = registerBlock("diamond_sapling",
            () -> new SaplingBlock(ModTreeGrowers.DIAMOND_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> DIAMOND_LEAVES = registerBlock("diamond_leaves",
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

    //Redstone Tree
    public static final DeferredBlock<Block> REDSTONE_AMBER = registerBlock("redstone_amber",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f).sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> REDSTONE_LOG = registerBlock("redstone_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));

    public static final DeferredBlock<Block> REDSTONE_SAPLING = registerBlock("redstone_sapling",
            () -> new SaplingBlock(ModTreeGrowers.REDSTONE_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> REDSTONE_LEAVES = registerBlock("redstone_leaves",
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

    //Emerald Tree
    public static final DeferredBlock<Block> EMERALD_AMBER = registerBlock("emerald_amber",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f).sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> EMERALD_LOG = registerBlock("emerald_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));

    public static final DeferredBlock<Block> EMERALD_SAPLING = registerBlock("emerald_sapling",
            () -> new SaplingBlock(ModTreeGrowers.EMERALD_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> EMERALD_LEAVES = registerBlock("emerald_leaves",
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

    //Quartz Tree
    public static final DeferredBlock<Block> QUARTZ_AMBER = registerBlock("quartz_amber",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f).sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> QUARTZ_LOG = registerBlock("quartz_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));

    public static final DeferredBlock<Block> QUARTZ_SAPLING = registerBlock("quartz_sapling",
            () -> new SaplingBlock(ModTreeGrowers.QUARTZ_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> QUARTZ_LEAVES = registerBlock("quartz_leaves",
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

    //Lapis Tree
    public static final DeferredBlock<Block> LAPIS_AMBER = registerBlock("lapis_amber",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f).sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> LAPIS_LOG = registerBlock("lapis_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));

    public static final DeferredBlock<Block> LAPIS_SAPLING = registerBlock("lapis_sapling",
            () -> new SaplingBlock(ModTreeGrowers.LAPIS_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> LAPIS_LEAVES = registerBlock("lapis_leaves",
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

    //Amethyst Tree
    public static final DeferredBlock<Block> AMETHYST_AMBER = registerBlock("amethyst_amber",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f).sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> AMETHYST_LOG = registerBlock("amethyst_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));

    public static final DeferredBlock<Block> AMETHYST_SAPLING = registerBlock("amethyst_sapling",
            () -> new SaplingBlock(ModTreeGrowers.AMETHYST_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> AMETHYST_LEAVES = registerBlock("amethyst_leaves",
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
