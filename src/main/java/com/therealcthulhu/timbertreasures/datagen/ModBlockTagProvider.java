package com.therealcthulhu.timbertreasures.datagen;

import com.therealcthulhu.timbertreasures.TimberTreasures;
import com.therealcthulhu.timbertreasures.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TimberTreasures.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.DIRT_LOG.get())
                .add(ModBlocks.STONE_LOG.get())
                .add(ModBlocks.GRAVEL_LOG.get())
                .add(ModBlocks.CLAY_LOG.get())
                .add(ModBlocks.SAND_LOG.get())
                .add(ModBlocks.BONE_LOG.get())
                .add(ModBlocks.STRING_LOG.get())
                .add(ModBlocks.COAL_LOG.get())
                .add(ModBlocks.IRON_LOG.get())
                .add(ModBlocks.COPPER_LOG.get())
                .add(ModBlocks.GOLD_LOG.get())
                .add(ModBlocks.DIAMOND_LOG.get())
                .add(ModBlocks.REDSTONE_LOG.get())
                .add(ModBlocks.EMERALD_LOG.get())
                .add(ModBlocks.QUARTZ_LOG.get())
                .add(ModBlocks.LAPIS_LOG.get())
                .add(ModBlocks.AMETHYST_LOG.get())
        ;

        tag(BlockTags.MINEABLE_WITH_HOE)
                .add(ModBlocks.DIRT_LEAVES.get())
                .add(ModBlocks.STONE_LEAVES.get())
                .add(ModBlocks.GRAVEL_LEAVES.get())
                .add(ModBlocks.CLAY_LEAVES.get())
                .add(ModBlocks.SAND_LEAVES.get())
                .add(ModBlocks.BONE_LEAVES.get())
                .add(ModBlocks.STRING_LEAVES.get())
                .add(ModBlocks.COAL_LEAVES.get())
                .add(ModBlocks.IRON_LEAVES.get())
                .add(ModBlocks.GOLD_LEAVES.get())
                .add(ModBlocks.COPPER_LEAVES.get())
                .add(ModBlocks.DIAMOND_LEAVES.get())
                .add(ModBlocks.EMERALD_LEAVES.get())
                .add(ModBlocks.REDSTONE_LEAVES.get())
                .add(ModBlocks.QUARTZ_LEAVES.get())
                .add(ModBlocks.LAPIS_LEAVES.get())
                .add(ModBlocks.AMETHYST_LEAVES.get())
        ;

        tag(BlockTags.LEAVES)
                .add(ModBlocks.DIRT_LEAVES.get())
                .add(ModBlocks.STONE_LEAVES.get())
                .add(ModBlocks.GRAVEL_LEAVES.get())
                .add(ModBlocks.CLAY_LEAVES.get())
                .add(ModBlocks.SAND_LEAVES.get())
                .add(ModBlocks.BONE_LEAVES.get())
                .add(ModBlocks.STRING_LEAVES.get())
                .add(ModBlocks.COAL_LEAVES.get())
                .add(ModBlocks.IRON_LEAVES.get())
                .add(ModBlocks.GOLD_LEAVES.get())
                .add(ModBlocks.COPPER_LEAVES.get())
                .add(ModBlocks.DIAMOND_LEAVES.get())
                .add(ModBlocks.EMERALD_LEAVES.get())
                .add(ModBlocks.REDSTONE_LEAVES.get())
                .add(ModBlocks.QUARTZ_LEAVES.get())
                .add(ModBlocks.LAPIS_LEAVES.get())
                .add(ModBlocks.AMETHYST_LEAVES.get())
        ;

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.DIRT_LOG.get())
                .add(ModBlocks.STONE_LOG.get())
                .add(ModBlocks.GRAVEL_LOG.get())
                .add(ModBlocks.CLAY_LOG.get())
                .add(ModBlocks.SAND_LOG.get())
                .add(ModBlocks.BONE_LOG.get())
                .add(ModBlocks.STRING_LOG.get())
                .add(ModBlocks.COAL_LOG.get())
                .add(ModBlocks.IRON_LOG.get())
                .add(ModBlocks.COPPER_LOG.get())
                .add(ModBlocks.GOLD_LOG.get())
                .add(ModBlocks.DIAMOND_LOG.get())
                .add(ModBlocks.REDSTONE_LOG.get())
                .add(ModBlocks.EMERALD_LOG.get())
                .add(ModBlocks.QUARTZ_LOG.get())
                .add(ModBlocks.LAPIS_LOG.get())
                .add(ModBlocks.AMETHYST_LOG.get())
        ;
    }
}
