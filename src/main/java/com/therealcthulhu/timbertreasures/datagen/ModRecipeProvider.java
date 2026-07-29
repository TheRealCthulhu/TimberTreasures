package com.therealcthulhu.timbertreasures.datagen;

import com.therealcthulhu.timbertreasures.block.ModBlocks;
import com.therealcthulhu.timbertreasures.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
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

        //

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(ModItems.DIRT_ACORN.get()), RecipeCategory.MISC, ModItems.STONE_ACORN.get(), 0f, 600)
                .unlockedBy("has_dirt_acorn", has(ModItems.DIRT_ACORN))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STONE_SAPLING)
                .pattern("AAA")
                .pattern("ASA")
                .pattern("AAA")
                .define('A', ModItems.STONE_ACORN.get())
                .define('S', ModBlocks.DIRT_SAPLING)
                .unlockedBy("has_stone_acorn", has(ModItems.STONE_ACORN))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.COBBLESTONE)
                .pattern("RAR")
                .pattern("ARA")
                .pattern("RAR")
                .define('R', ModItems.STONE_RESIN.get())
                .define('A', ModItems.STONE_ACORN.get())
                .unlockedBy("has_stone_acorn", has(ModItems.STONE_ACORN))
                .unlockedBy("has_stone_resin", has(ModItems.STONE_RESIN))
                .save(recipeOutput, "timbertreasures:stone");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STONE_AMBER)
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('R', ModItems.STONE_RESIN.get())
                .define('A', ModItems.STONE_ACORN.get())
                .unlockedBy("has_stone_acorn", has(ModItems.STONE_ACORN))
                .unlockedBy("has_stone_resin", has(ModItems.STONE_RESIN))
                .save(recipeOutput);

        //

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.GRAVEL_ACORN)
                        .requires(ModItems.STONE_ACORN.get())
                        .requires(ModItems.STONE_ACORN.get())
                                .unlockedBy("has_stone_acorn", has(ModItems.STONE_ACORN))
                                        .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GRAVEL_SAPLING)
                .pattern("AAA")
                .pattern("ASA")
                .pattern("AAA")
                .define('A', ModItems.GRAVEL_ACORN.get())
                .define('S', ModBlocks.STONE_SAPLING)
                .unlockedBy("has_gravel_acorn", has(ModItems.GRAVEL_ACORN))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.GRAVEL)
                .pattern("RAR")
                .pattern("ARA")
                .pattern("RAR")
                .define('R', ModItems.GRAVEL_RESIN.get())
                .define('A', ModItems.GRAVEL_ACORN.get())
                .unlockedBy("has_gravel_acorn", has(ModItems.GRAVEL_ACORN))
                .unlockedBy("has_gravel_resin", has(ModItems.GRAVEL_RESIN))
                .save(recipeOutput, "timbertreasures:gravel");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GRAVEL_AMBER)
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('R', ModItems.GRAVEL_RESIN.get())
                .define('A', ModItems.GRAVEL_ACORN.get())
                .unlockedBy("has_gravel_acorn", has(ModItems.GRAVEL_ACORN))
                .unlockedBy("has_gravel_resin", has(ModItems.GRAVEL_RESIN))
                .save(recipeOutput);

        //

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CLAY_SAPLING)
                .pattern(" P ")
                .pattern("PDP")
                .pattern(" S ")
                .define('P', ModItems.STONE_RESIN.get())
                .define('D', ModItems.DIRT_RESIN.get())
                .define('S', ModBlocks.DIRT_SAPLING)
                .unlockedBy("has_stone_resin", has(ModItems.STONE_RESIN))
                .unlockedBy("has_dirt_resin", has(ModItems.DIRT_RESIN))
                .unlockedBy("has_dirt_sapling", has(ModBlocks.DIRT_SAPLING))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.CLAY)
                .pattern("RAR")
                .pattern("ARA")
                .pattern("RAR")
                .define('R', ModItems.CLAY_RESIN.get())
                .define('A', ModItems.CLAY_ACORN.get())
                .unlockedBy("has_clay_acorn", has(ModItems.CLAY_ACORN))
                .unlockedBy("has_clay_resin", has(ModItems.CLAY_RESIN))
                .save(recipeOutput, "timbertreasures:clay");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CLAY_AMBER)
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('R', ModItems.CLAY_RESIN.get())
                .define('A', ModItems.CLAY_ACORN.get())
                .unlockedBy("has_clay_acorn", has(ModItems.CLAY_ACORN))
                .unlockedBy("has_clay_resin", has(ModItems.CLAY_RESIN))
                .save(recipeOutput);

        //

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.SAND_ACORN)
                .requires(ModItems.GRAVEL_ACORN.get())
                .requires(ModItems.GRAVEL_ACORN.get())
                .unlockedBy("has_gravel_acorn", has(ModItems.GRAVEL_ACORN))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAND_SAPLING)
                .pattern("AAA")
                .pattern("ASA")
                .pattern("AAA")
                .define('A', ModItems.SAND_ACORN.get())
                .define('S', ModBlocks.GRAVEL_SAPLING)
                .unlockedBy("has_sand_acorn", has(ModItems.SAND_ACORN))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.SAND)
                .pattern("RAR")
                .pattern("ARA")
                .pattern("RAR")
                .define('R', ModItems.SAND_RESIN.get())
                .define('A', ModItems.SAND_ACORN.get())
                .unlockedBy("has_sand_acorn", has(ModItems.SAND_ACORN))
                .unlockedBy("has_sand_resin", has(ModItems.SAND_RESIN))
                .save(recipeOutput, "timbertreasures:sand");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAND_AMBER)
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('R', ModItems.SAND_RESIN.get())
                .define('A', ModItems.SAND_ACORN.get())
                .unlockedBy("has_sand_acorn", has(ModItems.SAND_ACORN))
                .unlockedBy("has_sand_resin", has(ModItems.SAND_RESIN))
                .save(recipeOutput);

    }
}
