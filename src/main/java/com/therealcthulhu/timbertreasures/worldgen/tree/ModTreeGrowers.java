package com.therealcthulhu.timbertreasures.worldgen.tree;

import com.therealcthulhu.timbertreasures.TimberTreasures;
import com.therealcthulhu.timbertreasures.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower DIRT_TREE = new TreeGrower(TimberTreasures.MOD_ID + ":dirt_tree",
            Optional.empty(), Optional.of(ModConfiguredFeatures.DIRT_KEY), Optional.empty());

    public static final TreeGrower STONE_TREE = new TreeGrower(TimberTreasures.MOD_ID + ":stone_tree",
            Optional.empty(), Optional.of(ModConfiguredFeatures.STONE_KEY), Optional.empty());

    public static final TreeGrower GRAVEL_TREE = new TreeGrower(TimberTreasures.MOD_ID + ":gravel_tree",
            Optional.empty(), Optional.of(ModConfiguredFeatures.GRAVEL_KEY), Optional.empty());

    public static final TreeGrower CLAY_TREE = new TreeGrower(TimberTreasures.MOD_ID + ":clay_tree",
            Optional.empty(), Optional.of(ModConfiguredFeatures.CLAY_KEY), Optional.empty());

    public static final TreeGrower SAND_TREE = new TreeGrower(TimberTreasures.MOD_ID + ":sand_tree",
            Optional.empty(), Optional.of(ModConfiguredFeatures.SAND_KEY), Optional.empty());
}
