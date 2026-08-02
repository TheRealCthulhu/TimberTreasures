package com.therealcthulhu.timbertreasures.item;

import com.therealcthulhu.timbertreasures.TimberTreasures;
import com.therealcthulhu.timbertreasures.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TimberTreasures.MOD_ID);


    public static final Supplier<CreativeModeTab> TIMBER_TREASURES_TAB = CREATIVE_MODE_TAB.register("timber_treasures_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.DIRT_ACORN.get()))
                    .title(Component.translatable("creativetab.timbertreasures.timber_treasures"))
                    .displayItems((parameters, output) ->
                            {
                                output.accept(ModBlocks.DIRT_SAPLING);
                                output.accept(ModBlocks.DIRT_LOG);
                                output.accept(ModBlocks.DIRT_LEAVES);
                                output.accept(ModBlocks.DIRT_AMBER);
                                output.accept(ModItems.DIRT_ACORN);
                                output.accept(ModItems.DIRT_RESIN);

                                output.accept(ModBlocks.STONE_SAPLING);
                                output.accept(ModBlocks.STONE_LOG);
                                output.accept(ModBlocks.STONE_LEAVES);
                                output.accept(ModBlocks.STONE_AMBER);
                                output.accept(ModItems.STONE_ACORN);
                                output.accept(ModItems.STONE_RESIN);

                                output.accept(ModBlocks.GRAVEL_SAPLING);
                                output.accept(ModBlocks.GRAVEL_LOG);
                                output.accept(ModBlocks.GRAVEL_LEAVES);
                                output.accept(ModBlocks.GRAVEL_AMBER);
                                output.accept(ModItems.GRAVEL_ACORN);
                                output.accept(ModItems.GRAVEL_RESIN);

                                output.accept(ModBlocks.CLAY_SAPLING);
                                output.accept(ModBlocks.CLAY_LOG);
                                output.accept(ModBlocks.CLAY_LEAVES);
                                output.accept(ModBlocks.CLAY_AMBER);
                                output.accept(ModItems.CLAY_ACORN);
                                output.accept(ModItems.CLAY_RESIN);

                                output.accept(ModBlocks.SAND_SAPLING);
                                output.accept(ModBlocks.SAND_LOG);
                                output.accept(ModBlocks.SAND_LEAVES);
                                output.accept(ModBlocks.SAND_AMBER);
                                output.accept(ModItems.SAND_ACORN);
                                output.accept(ModItems.SAND_RESIN);

                                output.accept(ModBlocks.BONE_SAPLING);
                                output.accept(ModBlocks.BONE_LOG);
                                output.accept(ModBlocks.BONE_LEAVES);
                                output.accept(ModBlocks.BONE_AMBER);
                                output.accept(ModItems.BONE_ACORN);
                                output.accept(ModItems.BONE_RESIN);

                                output.accept(ModBlocks.STRING_SAPLING);
                                output.accept(ModBlocks.STRING_LOG);
                                output.accept(ModBlocks.STRING_LEAVES);
                                output.accept(ModBlocks.STRING_AMBER);
                                output.accept(ModItems.STRING_ACORN);
                                output.accept(ModItems.STRING_RESIN);

                                output.accept(ModBlocks.COAL_SAPLING);
                                output.accept(ModBlocks.COAL_LOG);
                                output.accept(ModBlocks.COAL_LEAVES);
                                output.accept(ModBlocks.COAL_AMBER);
                                output.accept(ModItems.COAL_ACORN);
                                output.accept(ModItems.COAL_RESIN);

                                output.accept(ModBlocks.COPPER_SAPLING);
                                output.accept(ModBlocks.COPPER_LOG);
                                output.accept(ModBlocks.COPPER_LEAVES);
                                output.accept(ModBlocks.COPPER_AMBER);
                                output.accept(ModItems.COPPER_ACORN);
                                output.accept(ModItems.COPPER_RESIN);

                                output.accept(ModBlocks.IRON_SAPLING);
                                output.accept(ModBlocks.IRON_LOG);
                                output.accept(ModBlocks.IRON_LEAVES);
                                output.accept(ModBlocks.IRON_AMBER);
                                output.accept(ModItems.IRON_ACORN);
                                output.accept(ModItems.IRON_RESIN);

                                output.accept(ModBlocks.GOLD_SAPLING);
                                output.accept(ModBlocks.GOLD_LOG);
                                output.accept(ModBlocks.GOLD_LEAVES);
                                output.accept(ModBlocks.GOLD_AMBER);
                                output.accept(ModItems.GOLD_ACORN);
                                output.accept(ModItems.GOLD_RESIN);

                                output.accept(ModBlocks.REDSTONE_SAPLING);
                                output.accept(ModBlocks.REDSTONE_LOG);
                                output.accept(ModBlocks.REDSTONE_LEAVES);
                                output.accept(ModBlocks.REDSTONE_AMBER);
                                output.accept(ModItems.REDSTONE_ACORN);
                                output.accept(ModItems.REDSTONE_RESIN);

                                output.accept(ModBlocks.DIAMOND_SAPLING);
                                output.accept(ModBlocks.DIAMOND_LOG);
                                output.accept(ModBlocks.DIAMOND_LEAVES);
                                output.accept(ModBlocks.DIAMOND_AMBER);
                                output.accept(ModItems.DIAMOND_ACORN);
                                output.accept(ModItems.DIAMOND_RESIN);

                                output.accept(ModBlocks.EMERALD_SAPLING);
                                output.accept(ModBlocks.EMERALD_LOG);
                                output.accept(ModBlocks.EMERALD_LEAVES);
                                output.accept(ModBlocks.EMERALD_AMBER);
                                output.accept(ModItems.EMERALD_ACORN);
                                output.accept(ModItems.EMERALD_RESIN);

                                output.accept(ModBlocks.QUARTZ_SAPLING);
                                output.accept(ModBlocks.QUARTZ_LOG);
                                output.accept(ModBlocks.QUARTZ_LEAVES);
                                output.accept(ModBlocks.QUARTZ_AMBER);
                                output.accept(ModItems.QUARTZ_ACORN);
                                output.accept(ModItems.QUARTZ_RESIN);

                                output.accept(ModBlocks.LAPIS_SAPLING);
                                output.accept(ModBlocks.LAPIS_LOG);
                                output.accept(ModBlocks.LAPIS_LEAVES);
                                output.accept(ModBlocks.LAPIS_AMBER);
                                output.accept(ModItems.LAPIS_ACORN);
                                output.accept(ModItems.LAPIS_RESIN);

                                output.accept(ModBlocks.AMETHYST_SAPLING);
                                output.accept(ModBlocks.AMETHYST_LOG);
                                output.accept(ModBlocks.AMETHYST_LEAVES);
                                output.accept(ModBlocks.AMETHYST_AMBER);
                                output.accept(ModItems.AMETHYST_ACORN);
                                output.accept(ModItems.AMETHYST_RESIN);
                            })
                                .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }


}
