package com.therealcthulhu.timbertreasures.datagen;

import com.therealcthulhu.timbertreasures.block.ModBlocks;
import com.therealcthulhu.timbertreasures.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }


    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> ACORN_COOKABLES = List.of(ModItems.DIRT_ACORN);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.DIRT)
                .pattern("RAR")
                .pattern("ARA")
                .pattern("RAR")
                .define('R', ModItems.DIRT_RESIN.get())
                .define('A', ModItems.DIRT_ACORN.get())
                .unlockedBy("has_dirt_acorn", has(ModItems.DIRT_ACORN))
                .unlockedBy("has_dirt_resin", has(ModItems.DIRT_RESIN))
                .save(recipeOutput, "timbertreasures:dirt");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DIRT_AMBER)
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('R', ModItems.DIRT_RESIN.get())
                .define('A', ModItems.DIRT_ACORN.get())
                .unlockedBy("has_dirt_acorn", has(ModItems.DIRT_ACORN))
                .unlockedBy("has_dirt_resin", has(ModItems.DIRT_RESIN))
                .save(recipeOutput);

    }
}
