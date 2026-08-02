package com.therealcthulhu.timbertreasures.datagen;

import com.therealcthulhu.timbertreasures.TimberTreasures;
import com.therealcthulhu.timbertreasures.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, TimberTreasures.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.DIRT_LOG.get().asItem())
                .add(ModBlocks.STONE_LOG.get().asItem())
                .add(ModBlocks.GRAVEL_LOG.get().asItem())
                .add(ModBlocks.CLAY_LOG.get().asItem())
                .add(ModBlocks.SAND_LOG.get().asItem())
                .add(ModBlocks.BONE_LOG.get().asItem())
                .add(ModBlocks.STRING_LOG.get().asItem())
                .add(ModBlocks.COAL_LOG.get().asItem())
                .add(ModBlocks.IRON_LOG.get().asItem())
                .add(ModBlocks.COPPER_LOG.get().asItem())
                .add(ModBlocks.GOLD_LOG.get().asItem())
                .add(ModBlocks.DIAMOND_LOG.get().asItem())
                .add(ModBlocks.REDSTONE_LOG.get().asItem())
                .add(ModBlocks.EMERALD_LOG.get().asItem())
                .add(ModBlocks.QUARTZ_LOG.get().asItem())
                .add(ModBlocks.LAPIS_LOG.get().asItem())
                .add(ModBlocks.AMETHYST_LOG.get().asItem())
                ;

        this.tag(ItemTags.LEAVES)
                .add(ModBlocks.DIRT_LEAVES.get().asItem())
                .add(ModBlocks.STONE_LEAVES.get().asItem())
                .add(ModBlocks.GRAVEL_LEAVES.get().asItem())
                .add(ModBlocks.CLAY_LEAVES.get().asItem())
                .add(ModBlocks.SAND_LEAVES.get().asItem())
                .add(ModBlocks.BONE_LEAVES.get().asItem())
                .add(ModBlocks.STRING_LEAVES.get().asItem())
                .add(ModBlocks.COAL_LEAVES.get().asItem())
                .add(ModBlocks.IRON_LEAVES.get().asItem())
                .add(ModBlocks.COPPER_LEAVES.get().asItem())
                .add(ModBlocks.GOLD_LEAVES.get().asItem())
                .add(ModBlocks.DIAMOND_LEAVES.get().asItem())
                .add(ModBlocks.REDSTONE_LEAVES.get().asItem())
                .add(ModBlocks.EMERALD_LEAVES.get().asItem())
                .add(ModBlocks.QUARTZ_LEAVES.get().asItem())
                .add(ModBlocks.LAPIS_LEAVES.get().asItem())
                .add(ModBlocks.AMETHYST_LEAVES.get().asItem())
                ;
    }
}
