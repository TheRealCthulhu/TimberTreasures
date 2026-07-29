package com.therealcthulhu.timbertreasures.item;

import com.therealcthulhu.timbertreasures.TimberTreasures;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TimberTreasures.MOD_ID);

    public static final DeferredItem<Item> DIRT_ACORN = ITEMS.register("dirt_acorn",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIRT_RESIN = ITEMS.register("dirt_resin",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> STONE_ACORN = ITEMS.register("stone_acorn",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STONE_RESIN = ITEMS.register("stone_resin",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GRAVEL_ACORN = ITEMS.register("gravel_acorn",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GRAVEL_RESIN = ITEMS.register("gravel_resin",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CLAY_ACORN = ITEMS.register("clay_acorn",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CLAY_RESIN = ITEMS.register("clay_resin",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SAND_ACORN = ITEMS.register("sand_acorn",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SAND_RESIN = ITEMS.register("sand_resin",
            () -> new Item(new Item.Properties()));




    public static void register(IEventBus eventBus)  {
        ITEMS.register(eventBus);
    }
}
