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
    }

    private ItemModelBuilder saplingItem(DeferredBlock<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(TimberTreasures.MOD_ID, "block/" + item.getId().getPath()));
    }
}
