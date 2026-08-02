package com.therealcthulhu.timbertreasures.datagen;

import com.therealcthulhu.timbertreasures.TimberTreasures;
import com.therealcthulhu.timbertreasures.block.ModBlocks;
import com.therealcthulhu.timbertreasures.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TimberTreasures.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.DIRT_ACORN.get());
        basicItem(ModItems.DIRT_RESIN.get());
        saplingItem(ModBlocks.DIRT_SAPLING);

        basicItem(ModItems.STONE_ACORN.get());
        basicItem(ModItems.STONE_RESIN.get());
        saplingItem(ModBlocks.STONE_SAPLING);

        basicItem(ModItems.GRAVEL_ACORN.get());
        basicItem(ModItems.GRAVEL_RESIN.get());
        saplingItem(ModBlocks.GRAVEL_SAPLING);

        basicItem(ModItems.CLAY_ACORN.get());
        basicItem(ModItems.CLAY_RESIN.get());
        saplingItem(ModBlocks.CLAY_SAPLING);

        basicItem(ModItems.SAND_ACORN.get());
        basicItem(ModItems.SAND_RESIN.get());
        saplingItem(ModBlocks.SAND_SAPLING);

        basicItem(ModItems.BONE_ACORN.get());
        basicItem(ModItems.BONE_RESIN.get());
        saplingItem(ModBlocks.BONE_SAPLING);

        basicItem(ModItems.STRING_ACORN.get());
        basicItem(ModItems.STRING_RESIN.get());
        saplingItem(ModBlocks.STRING_SAPLING);

        basicItem(ModItems.COAL_ACORN.get());
        basicItem(ModItems.COAL_RESIN.get());
        saplingItem(ModBlocks.COAL_SAPLING);

        basicItem(ModItems.IRON_ACORN.get());
        basicItem(ModItems.IRON_RESIN.get());
        saplingItem(ModBlocks.IRON_SAPLING);

        basicItem(ModItems.COPPER_ACORN.get());
        basicItem(ModItems.COPPER_RESIN.get());
        saplingItem(ModBlocks.COPPER_SAPLING);

        basicItem(ModItems.GOLD_ACORN.get());
        basicItem(ModItems.GOLD_RESIN.get());
        saplingItem(ModBlocks.GOLD_SAPLING);

        basicItem(ModItems.DIAMOND_ACORN.get());
        basicItem(ModItems.DIAMOND_RESIN.get());
        saplingItem(ModBlocks.DIAMOND_SAPLING);

        basicItem(ModItems.REDSTONE_ACORN.get());
        basicItem(ModItems.REDSTONE_RESIN.get());
        saplingItem(ModBlocks.REDSTONE_SAPLING);

        basicItem(ModItems.EMERALD_ACORN.get());
        basicItem(ModItems.EMERALD_RESIN.get());
        saplingItem(ModBlocks.EMERALD_SAPLING);

        basicItem(ModItems.QUARTZ_ACORN.get());
        basicItem(ModItems.QUARTZ_RESIN.get());
        saplingItem(ModBlocks.QUARTZ_SAPLING);

        basicItem(ModItems.LAPIS_ACORN.get());
        basicItem(ModItems.LAPIS_RESIN.get());
        saplingItem(ModBlocks.LAPIS_SAPLING);

        basicItem(ModItems.AMETHYST_ACORN.get());
        basicItem(ModItems.AMETHYST_RESIN.get());
        saplingItem(ModBlocks.AMETHYST_SAPLING);
    }

    private ItemModelBuilder saplingItem(DeferredBlock<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(TimberTreasures.MOD_ID, "block/" + item.getId().getPath()));
    }
}
