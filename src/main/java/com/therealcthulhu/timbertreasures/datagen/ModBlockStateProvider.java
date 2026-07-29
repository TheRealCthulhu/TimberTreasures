package com.therealcthulhu.timbertreasures.datagen;

import com.therealcthulhu.timbertreasures.TimberTreasures;
import com.therealcthulhu.timbertreasures.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TimberTreasures.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.DIRT_AMBER);
        logBlock((RotatedPillarBlock)ModBlocks.DIRT_LOG.get());
        blockItem(ModBlocks.DIRT_LOG);
        saplingBlock(ModBlocks.DIRT_SAPLING);
        leavesBlock(ModBlocks.DIRT_LEAVES);

        blockWithItem(ModBlocks.STONE_AMBER);
        logBlock((RotatedPillarBlock)ModBlocks.STONE_LOG.get());
        blockItem(ModBlocks.STONE_LOG);
        saplingBlock(ModBlocks.STONE_SAPLING);
        leavesBlock(ModBlocks.STONE_LEAVES);

        blockWithItem(ModBlocks.GRAVEL_AMBER);
        logBlock((RotatedPillarBlock)ModBlocks.GRAVEL_LOG.get());
        blockItem(ModBlocks.GRAVEL_LOG);
        saplingBlock(ModBlocks.GRAVEL_SAPLING);
        leavesBlock(ModBlocks.GRAVEL_LEAVES);

        blockWithItem(ModBlocks.CLAY_AMBER);
        logBlock((RotatedPillarBlock)ModBlocks.CLAY_LOG.get());
        blockItem(ModBlocks.CLAY_LOG);
        saplingBlock(ModBlocks.CLAY_SAPLING);
        leavesBlock(ModBlocks.CLAY_LEAVES);

        blockWithItem(ModBlocks.SAND_AMBER);
        logBlock((RotatedPillarBlock)ModBlocks.SAND_LOG.get());
        blockItem(ModBlocks.SAND_LOG);
        saplingBlock(ModBlocks.SAND_SAPLING);
        leavesBlock(ModBlocks.SAND_LEAVES);
    }


    private void saplingBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("timbertreasures:block/" + deferredBlock.getId().getPath()));
    }
}
