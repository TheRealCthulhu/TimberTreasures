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

        //

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BONE_SAPLING)
                .pattern("BBB")
                .pattern("BSB")
                .pattern("BBB")
                .define('B', Items.BONE_MEAL)
                .define('S', ModBlocks.STONE_SAPLING)
                .unlockedBy("has_bone_meal", has(Items.BONE_MEAL))
                .unlockedBy("has_stone_sapling", has(ModBlocks.STONE_SAPLING))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.BONE_BLOCK)
                .pattern("RAR")
                .pattern("ARA")
                .pattern("RAR")
                .define('R', ModItems.BONE_RESIN.get())
                .define('A', ModItems.BONE_ACORN.get())
                .unlockedBy("has_bone_acorn", has(ModItems.BONE_ACORN))
                .unlockedBy("has_bone_resin", has(ModItems.BONE_RESIN))
                .save(recipeOutput, "timbertreasures:bone_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BONE_AMBER)
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('R', ModItems.BONE_RESIN.get())
                .define('A', ModItems.BONE_ACORN.get())
                .unlockedBy("has_bone_acorn", has(ModItems.BONE_ACORN))
                .unlockedBy("has_bone_resin", has(ModItems.BONE_RESIN))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.BONE, 3)
                .requires(ModBlocks.BONE_AMBER)
                .unlockedBy("has_bone_amber", has(ModBlocks.BONE_AMBER))
                .save(recipeOutput, "timbertreasures:bones");

        //

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRING_SAPLING)
                .pattern(" B ")
                .pattern("BVB")
                .pattern(" S ")
                .define('B', Items.BONE_MEAL)
                .define('V', Blocks.VINE)
                .define('S', Blocks.JUNGLE_SAPLING)
                .unlockedBy("has_bone_meal", has(Items.BONE_MEAL))
                .unlockedBy("has_jungle_sapling", has(Blocks.JUNGLE_SAPLING))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.WHITE_WOOL)
                .pattern("RAR")
                .pattern("ARA")
                .pattern("RAR")
                .define('R', ModItems.STRING_RESIN.get())
                .define('A', ModItems.STRING_ACORN.get())
                .unlockedBy("has_string_acorn", has(ModItems.STRING_ACORN))
                .unlockedBy("has_string_resin", has(ModItems.STRING_RESIN))
                .save(recipeOutput, "timbertreasures:white_wool");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRING_AMBER)
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('R', ModItems.STRING_RESIN.get())
                .define('A', ModItems.STRING_ACORN.get())
                .unlockedBy("has_string_acorn", has(ModItems.STRING_ACORN))
                .unlockedBy("has_string_resin", has(ModItems.STRING_RESIN))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.STRING, 4)
                .requires(ModBlocks.STRING_AMBER)
                .unlockedBy("has_string_amber", has(ModBlocks.STRING_AMBER))
                .save(recipeOutput, "timbertreasures:string");

        //

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.BIRCH_SAPLING), RecipeCategory.MISC, ModBlocks.COAL_SAPLING.get(), 0.35f, 200)
                        .unlockedBy("has_birch_sapling", has(Blocks.BIRCH_SAPLING))
                                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.COAL)
                .pattern("RAR")
                .pattern("ARA")
                .pattern("RAR")
                .define('R', ModItems.COAL_RESIN.get())
                .define('A', ModItems.COAL_ACORN.get())
                .unlockedBy("has_coal_acorn", has(ModItems.COAL_ACORN))
                .unlockedBy("has_coal_resin", has(ModItems.COAL_RESIN))
                .save(recipeOutput, "timbertreasures:coal_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COAL_AMBER)
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('R', ModItems.COAL_RESIN.get())
                .define('A', ModItems.COAL_ACORN.get())
                .unlockedBy("has_coal_acorn", has(ModItems.COAL_ACORN))
                .unlockedBy("has_coal_resin", has(ModItems.COAL_RESIN))
                .save(recipeOutput);

        //

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.IRON_SAPLING)
                .pattern("CGC")
                .pattern("SAS")
                .pattern("CLC")
                .define('C', ModItems.COAL_RESIN.get())
                .define('G', ModItems.GRAVEL_RESIN.get())
                .define('S', ModItems.SAND_RESIN.get())
                .define('L', ModItems.CLAY_RESIN.get())
                .define('A', Blocks.ACACIA_SAPLING)
                .unlockedBy("has_coal_resin", has(ModItems.COAL_RESIN.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.IRON_AMBER)
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('R', ModItems.IRON_RESIN.get())
                .define('A', ModItems.IRON_ACORN.get())
                .unlockedBy("has_iron_acorn", has(ModItems.IRON_ACORN))
                .unlockedBy("has_iron_resin", has(ModItems.IRON_RESIN))
                .save(recipeOutput);

        //

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COPPER_SAPLING)
                .pattern("PCP")
                .pattern("SRS")
                .pattern("PCP")
                .define('C', ModItems.CLAY_RESIN.get())
                .define('P', ModItems.STONE_RESIN.get())
                .define('S', ModItems.SAND_RESIN.get())
                .define('R', Blocks.SPRUCE_SAPLING)
                .unlockedBy("has_sand_resin", has(ModItems.SAND_RESIN.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COPPER_AMBER)
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('R', ModItems.COPPER_RESIN.get())
                .define('A', ModItems.COPPER_ACORN.get())
                .unlockedBy("has_copper_acorn", has(ModItems.COPPER_ACORN))
                .unlockedBy("has_copper_resin", has(ModItems.COPPER_RESIN))
                .save(recipeOutput);

        //

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GOLD_SAPLING)
                .pattern("IYI")
                .pattern("SOS")
                .pattern("IYI")
                .define('I', ModItems.IRON_RESIN.get())
                .define('Y', Items.YELLOW_DYE)
                .define('S', ModItems.SAND_RESIN.get())
                .define('O', Blocks.OAK_SAPLING)
                .unlockedBy("has_iron_resin", has(ModItems.IRON_RESIN.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GOLD_AMBER)
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('R', ModItems.GOLD_RESIN.get())
                .define('A', ModItems.GOLD_ACORN.get())
                .unlockedBy("has_gold_acorn", has(ModItems.GOLD_ACORN))
                .unlockedBy("has_gold_resin", has(ModItems.GOLD_RESIN))
                .save(recipeOutput);

        //

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DIAMOND_SAPLING)
                .pattern(" L ")
                .pattern("GPG")
                .pattern(" R ")
                .define('G', ModItems.GOLD_RESIN.get())
                .define('L', Items.LIGHT_GRAY_DYE)
                .define('P', ModItems.LAPIS_RESIN.get())
                .define('R', ModBlocks.REDSTONE_SAPLING)
                .unlockedBy("has_lapis_resin", has(ModItems.LAPIS_RESIN.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.DIAMOND)
                .pattern("DDD")
                .pattern("DDD")
                .pattern("DDD")
                .define('D', ModItems.DIAMOND_ACORN.get())
                .unlockedBy("has_diamond_acorn", has(ModItems.DIAMOND_ACORN))
                .save(recipeOutput);

        //

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.REDSTONE_SAPLING)
                .pattern(" R ")
                .pattern("ISI")
                .pattern(" C ")
                .define('I', ModItems.IRON_RESIN.get())
                .define('R', Items.RED_DYE)
                .define('S', ModItems.STONE_RESIN.get())
                .define('C', ModBlocks.COAL_SAPLING)
                .unlockedBy("has_iron_resin", has(ModItems.IRON_RESIN.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.REDSTONE_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.REDSTONE_ACORN.get())
                .unlockedBy("has_redstone_acorn", has(ModItems.REDSTONE_ACORN))
                .save(recipeOutput);

        //

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.EMERALD_SAPLING)
                .pattern(" I ")
                .pattern("CDC")
                .pattern(" S ")
                .define('I', ModItems.IRON_RESIN.get())
                .define('D', Items.DIAMOND)
                .define('S', ModBlocks.DIAMOND_SAPLING.get())
                .define('C', ModItems.COPPER_RESIN)
                .unlockedBy("has_diamond_sapling", has(ModBlocks.DIAMOND_SAPLING.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.EMERALD)
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .define('E', ModItems.EMERALD_ACORN.get())
                .unlockedBy("has_emerald_acorn", has(ModItems.EMERALD_ACORN))
                .save(recipeOutput);


        //

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.QUARTZ_SAPLING)
                .pattern(" D ")
                .pattern("NEN")
                .pattern(" S ")
                .define('E', Items.EMERALD)
                .define('D', ModItems.DIAMOND_RESIN)
                .define('N', Blocks.NETHERRACK)
                .define('S', ModBlocks.EMERALD_SAPLING)
                .unlockedBy("has_emerald_sapling", has(ModBlocks.EMERALD_SAPLING.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.QUARTZ, 4)
                .pattern("RAR")
                .pattern("ARA")
                .pattern("RAR")
                .define('R', ModItems.QUARTZ_RESIN.get())
                .define('A', ModItems.QUARTZ_ACORN.get())
                .unlockedBy("has_quartz_acorn", has(ModItems.QUARTZ_ACORN))
                .save(recipeOutput);


        //

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AMETHYST_SAPLING)
                .pattern(" D ")
                .pattern("AEA")
                .pattern(" S ")
                .define('E', Items.EMERALD)
                .define('D', ModItems.DIAMOND_RESIN)
                .define('A', ModItems.AMETHYST_RESIN)
                .define('S', ModBlocks.QUARTZ_SAPLING)
                .unlockedBy("has_quartz_sapling", has(ModBlocks.QUARTZ_SAPLING.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.AMETHYST_SHARD, 4)
                .pattern("RAR")
                .pattern("ARA")
                .pattern("RAR")
                .define('R', ModItems.AMETHYST_RESIN.get())
                .define('A', ModItems.AMETHYST_ACORN.get())
                .unlockedBy("has_amethyst_acorn", has(ModItems.AMETHYST_ACORN))
                .save(recipeOutput);


        //

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LAPIS_SAPLING)
                .pattern(" B ")
                .pattern("CWC")
                .pattern(" S ")
                .define('W', Items.POTION)
                .define('C', ModItems.CLAY_RESIN)
                .define('B', ModItems.BONE_RESIN)
                .define('S', Blocks.DARK_OAK_SAPLING)
                .unlockedBy("has_bone_resin", has(ModItems.BONE_RESIN.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.LAPIS_BLOCK)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.LAPIS_ACORN.get())
                .unlockedBy("has_lapis_acorn", has(ModItems.LAPIS_ACORN))
                .save(recipeOutput);
    }
}
