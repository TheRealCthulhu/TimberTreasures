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

    public static final TreeGrower BONE_TREE = new TreeGrower(TimberTreasures.MOD_ID + ":bone_tree",
            Optional.empty(), Optional.of(ModConfiguredFeatures.BONE_KEY), Optional.empty());

    public static final TreeGrower STRING_TREE = new TreeGrower(TimberTreasures.MOD_ID + ":string_tree",
            Optional.empty(), Optional.of(ModConfiguredFeatures.STRING_KEY), Optional.empty());

    public static final TreeGrower COAL_TREE = new TreeGrower(TimberTreasures.MOD_ID + ":coal_tree",
            Optional.empty(), Optional.of(ModConfiguredFeatures.COAL_KEY), Optional.empty());

    public static final TreeGrower IRON_TREE = new TreeGrower(TimberTreasures.MOD_ID + ":iron_tree",
            Optional.empty(), Optional.of(ModConfiguredFeatures.IRON_KEY), Optional.empty());

    public static final TreeGrower COPPER_TREE = new TreeGrower(TimberTreasures.MOD_ID + ":copper_tree",
            Optional.empty(), Optional.of(ModConfiguredFeatures.COPPER_KEY), Optional.empty());

    public static final TreeGrower GOLD_TREE = new TreeGrower(TimberTreasures.MOD_ID + ":gold_tree",
            Optional.empty(), Optional.of(ModConfiguredFeatures.GOLD_KEY), Optional.empty());

    public static final TreeGrower REDSTONE_TREE = new TreeGrower(TimberTreasures.MOD_ID + ":redstone_tree",
            Optional.empty(), Optional.of(ModConfiguredFeatures.REDSTONE_KEY), Optional.empty());

    public static final TreeGrower DIAMOND_TREE = new TreeGrower(TimberTreasures.MOD_ID + ":diamond_tree",
            Optional.empty(), Optional.of(ModConfiguredFeatures.DIAMOND_KEY), Optional.empty());

    public static final TreeGrower EMERALD_TREE = new TreeGrower(TimberTreasures.MOD_ID + ":emerald_tree",
            Optional.empty(), Optional.of(ModConfiguredFeatures.EMERALD_KEY), Optional.empty());

    public static final TreeGrower LAPIS_TREE = new TreeGrower(TimberTreasures.MOD_ID + ":lapis_tree",
            Optional.empty(), Optional.of(ModConfiguredFeatures.LAPIS_KEY), Optional.empty());

    public static final TreeGrower QUARTZ_TREE = new TreeGrower(TimberTreasures.MOD_ID + ":quartz_tree",
            Optional.empty(), Optional.of(ModConfiguredFeatures.QUARTZ_KEY), Optional.empty());

    public static final TreeGrower AMETHYST_TREE = new TreeGrower(TimberTreasures.MOD_ID + ":amethyst_tree",
            Optional.empty(), Optional.of(ModConfiguredFeatures.AMETHYST_KEY), Optional.empty());
}
