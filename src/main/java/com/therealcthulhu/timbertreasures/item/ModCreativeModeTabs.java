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
                            })
                                .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }


}
