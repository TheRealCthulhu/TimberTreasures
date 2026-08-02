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

        blockWithItem(ModBlocks.BONE_AMBER);
        logBlock((RotatedPillarBlock)ModBlocks.BONE_LOG.get());
        blockItem(ModBlocks.BONE_LOG);
        saplingBlock(ModBlocks.BONE_SAPLING);
        leavesBlock(ModBlocks.BONE_LEAVES);

        blockWithItem(ModBlocks.STRING_AMBER);
        logBlock((RotatedPillarBlock)ModBlocks.STRING_LOG.get());
        blockItem(ModBlocks.STRING_LOG);
        saplingBlock(ModBlocks.STRING_SAPLING);
        leavesBlock(ModBlocks.STRING_LEAVES);

        blockWithItem(ModBlocks.COAL_AMBER);
        logBlock((RotatedPillarBlock)ModBlocks.COAL_LOG.get());
        blockItem(ModBlocks.COAL_LOG);
        saplingBlock(ModBlocks.COAL_SAPLING);
        leavesBlock(ModBlocks.COAL_LEAVES);

        blockWithItem(ModBlocks.IRON_AMBER);
        logBlock((RotatedPillarBlock)ModBlocks.IRON_LOG.get());
        blockItem(ModBlocks.IRON_LOG);
        saplingBlock(ModBlocks.IRON_SAPLING);
        leavesBlock(ModBlocks.IRON_LEAVES);

        blockWithItem(ModBlocks.COPPER_AMBER);
        logBlock((RotatedPillarBlock)ModBlocks.COPPER_LOG.get());
        blockItem(ModBlocks.COPPER_LOG);
        saplingBlock(ModBlocks.COPPER_SAPLING);
        leavesBlock(ModBlocks.COPPER_LEAVES);

        blockWithItem(ModBlocks.GOLD_AMBER);
        logBlock((RotatedPillarBlock)ModBlocks.GOLD_LOG.get());
        blockItem(ModBlocks.GOLD_LOG);
        saplingBlock(ModBlocks.GOLD_SAPLING);
        leavesBlock(ModBlocks.GOLD_LEAVES);

        blockWithItem(ModBlocks.DIAMOND_AMBER);
        logBlock((RotatedPillarBlock)ModBlocks.DIAMOND_LOG.get());
        blockItem(ModBlocks.DIAMOND_LOG);
        saplingBlock(ModBlocks.DIAMOND_SAPLING);
        leavesBlock(ModBlocks.DIAMOND_LEAVES);

        blockWithItem(ModBlocks.REDSTONE_AMBER);
        logBlock((RotatedPillarBlock)ModBlocks.REDSTONE_LOG.get());
        blockItem(ModBlocks.REDSTONE_LOG);
        saplingBlock(ModBlocks.REDSTONE_SAPLING);
        leavesBlock(ModBlocks.REDSTONE_LEAVES);

        blockWithItem(ModBlocks.EMERALD_AMBER);
        logBlock((RotatedPillarBlock)ModBlocks.EMERALD_LOG.get());
        blockItem(ModBlocks.EMERALD_LOG);
        saplingBlock(ModBlocks.EMERALD_SAPLING);
        leavesBlock(ModBlocks.EMERALD_LEAVES);

        blockWithItem(ModBlocks.QUARTZ_AMBER);
        logBlock((RotatedPillarBlock)ModBlocks.QUARTZ_LOG.get());
        blockItem(ModBlocks.QUARTZ_LOG);
        saplingBlock(ModBlocks.QUARTZ_SAPLING);
        leavesBlock(ModBlocks.QUARTZ_LEAVES);

        blockWithItem(ModBlocks.LAPIS_AMBER);
        logBlock((RotatedPillarBlock)ModBlocks.LAPIS_LOG.get());
        blockItem(ModBlocks.LAPIS_LOG);
        saplingBlock(ModBlocks.LAPIS_SAPLING);
        leavesBlock(ModBlocks.LAPIS_LEAVES);

        blockWithItem(ModBlocks.AMETHYST_AMBER);
        logBlock((RotatedPillarBlock)ModBlocks.AMETHYST_LOG.get());
        blockItem(ModBlocks.AMETHYST_LOG);
        saplingBlock(ModBlocks.AMETHYST_SAPLING);
        leavesBlock(ModBlocks.AMETHYST_LEAVES);
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
