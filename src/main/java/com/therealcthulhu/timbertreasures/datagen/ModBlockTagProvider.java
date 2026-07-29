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
        ;

        tag(BlockTags.MINEABLE_WITH_HOE)
                .add(ModBlocks.DIRT_LEAVES.get())
                .add(ModBlocks.STONE_LEAVES.get())
                .add(ModBlocks.GRAVEL_LEAVES.get())
                .add(ModBlocks.CLAY_LEAVES.get())
                .add(ModBlocks.SAND_LEAVES.get())
        ;

        tag(BlockTags.LEAVES)
                .add(ModBlocks.DIRT_LEAVES.get())
                .add(ModBlocks.STONE_LEAVES.get())
                .add(ModBlocks.GRAVEL_LEAVES.get())
                .add(ModBlocks.CLAY_LEAVES.get())
                .add(ModBlocks.SAND_LEAVES.get())
        ;

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.DIRT_LOG.get())
                .add(ModBlocks.STONE_LOG.get())
                .add(ModBlocks.GRAVEL_LOG.get())
                .add(ModBlocks.CLAY_LOG.get())
                .add(ModBlocks.SAND_LOG.get())
        ;
    }
}
