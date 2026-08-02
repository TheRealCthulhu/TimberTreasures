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

    public static final DeferredItem<Item> BONE_ACORN = ITEMS.register("bone_acorn",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BONE_RESIN = ITEMS.register("bone_resin",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> STRING_ACORN = ITEMS.register("string_acorn",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STRING_RESIN = ITEMS.register("string_resin",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COAL_ACORN = ITEMS.register("coal_acorn",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COAL_RESIN = ITEMS.register("coal_resin",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<Item> IRON_ACORN = ITEMS.register("iron_acorn",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_RESIN = ITEMS.register("iron_resin",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<Item> REDSTONE_ACORN = ITEMS.register("redstone_acorn",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REDSTONE_RESIN = ITEMS.register("redstone_resin",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<Item> COPPER_ACORN = ITEMS.register("copper_acorn",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_RESIN = ITEMS.register("copper_resin",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<Item> GOLD_ACORN = ITEMS.register("gold_acorn",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLD_RESIN = ITEMS.register("gold_resin",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<Item> DIAMOND_ACORN = ITEMS.register("diamond_acorn",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_RESIN = ITEMS.register("diamond_resin",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<Item> EMERALD_ACORN = ITEMS.register("emerald_acorn",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EMERALD_RESIN = ITEMS.register("emerald_resin",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<Item> QUARTZ_ACORN = ITEMS.register("quartz_acorn",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> QUARTZ_RESIN = ITEMS.register("quartz_resin",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<Item> LAPIS_ACORN = ITEMS.register("lapis_acorn",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LAPIS_RESIN = ITEMS.register("lapis_resin",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<Item> AMETHYST_ACORN = ITEMS.register("amethyst_acorn",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AMETHYST_RESIN = ITEMS.register("amethyst_resin",
            () -> new Item(new Item.Properties()));




    public static void register(IEventBus eventBus)  {
        ITEMS.register(eventBus);
    }
}
