package com.therealcthulhu.timbertreasures.datagen;

import com.therealcthulhu.timbertreasures.block.ModBlocks;
import com.therealcthulhu.timbertreasures.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.NestedLootTable;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.BonusLevelTableCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    private final float[] ACORN_CHANCES = {0.1f, 0.125f, 0.15f, 0.2f};
    private final float[] SAPLING_CHANCES = {0.05f, 0.0625f, 0.0833f, 0.1f};
    private final float[] STICK_CHANCES = {0.02f, 0.0222f, 0.025f, 0.0333f};


    HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);

    @Override
    protected void generate() {
        dropSelf(ModBlocks.DIRT_AMBER.get());
        dropSelf(ModBlocks.DIRT_SAPLING.get());
        add(ModBlocks.DIRT_LOG.get(),
                createResourceLogDrops(ModItems.DIRT_RESIN, Items.OAK_LOG));
        add(ModBlocks.DIRT_LEAVES.get(),
        createResourceLeavesDrops(ModItems.DIRT_ACORN, ModBlocks.DIRT_SAPLING.asItem(), ModBlocks.DIRT_LEAVES.get()));

        dropSelf(ModBlocks.STONE_AMBER.get());
        dropSelf(ModBlocks.STONE_SAPLING.get());
        add(ModBlocks.STONE_LOG.get(),
                createResourceLogDrops(ModItems.STONE_RESIN, Items.OAK_LOG));
        add(ModBlocks.STONE_LEAVES.get(),
                createResourceLeavesDrops(ModItems.STONE_ACORN, ModBlocks.STONE_SAPLING.asItem(), ModBlocks.STONE_LEAVES.get()));

        dropSelf(ModBlocks.GRAVEL_AMBER.get());
        dropSelf(ModBlocks.GRAVEL_SAPLING.get());
        add(ModBlocks.GRAVEL_LOG.get(),
                createResourceLogDrops(ModItems.GRAVEL_RESIN, Items.OAK_LOG));
        add(ModBlocks.GRAVEL_LEAVES.get(),
                createResourceLeavesDrops(ModItems.GRAVEL_ACORN, ModBlocks.GRAVEL_SAPLING.asItem(), ModBlocks.GRAVEL_LEAVES.get())
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1.0f))
                                .add(LootItem.lootTableItem(Items.FLINT)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)))
                                        .when(BonusLevelTableCondition.bonusLevelFlatChance(registrylookup.getOrThrow(Enchantments.FORTUNE), new float[] {0.04f, 0.06f, 0.08f, 0.1f})
                                        )
                                )));

        dropSelf(ModBlocks.CLAY_AMBER.get());
        dropSelf(ModBlocks.CLAY_SAPLING.get());
        add(ModBlocks.CLAY_LOG.get(),
                createResourceLogDrops(ModItems.CLAY_RESIN, Items.OAK_LOG));
        add(ModBlocks.CLAY_LEAVES.get(),
                createResourceLeavesDrops(ModItems.CLAY_ACORN, ModBlocks.CLAY_SAPLING.asItem(), ModBlocks.CLAY_LEAVES.get()));

        dropSelf(ModBlocks.SAND_AMBER.get());
        dropSelf(ModBlocks.SAND_SAPLING.get());
        add(ModBlocks.SAND_LOG.get(),
                createResourceLogDrops(ModItems.SAND_RESIN, Items.OAK_LOG));
        add(ModBlocks.SAND_LEAVES.get(),
                createResourceLeavesDrops(ModItems.SAND_ACORN, ModBlocks.SAND_SAPLING.asItem(), ModBlocks.SAND_LEAVES.get()));


        dropSelf(ModBlocks.BONE_AMBER.get());
        dropSelf(ModBlocks.BONE_SAPLING.get());
        add(ModBlocks.BONE_LOG.get(),
                createResourceLogDrops(ModItems.BONE_RESIN, Items.OAK_LOG));
        add(ModBlocks.BONE_LEAVES.get(),
                createResourceLeavesDrops(ModItems.BONE_ACORN, ModBlocks.BONE_SAPLING.asItem(), ModBlocks.BONE_LEAVES.get())
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1.0f))
                                .add(LootItem.lootTableItem(Items.BONE_MEAL)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)))
                                        .when(BonusLevelTableCondition.bonusLevelFlatChance(registrylookup.getOrThrow(Enchantments.FORTUNE), new float[] {0.04f, 0.06f, 0.08f, 0.1f})
                                        )
                                )));

        dropSelf(ModBlocks.STRING_AMBER.get());
        dropSelf(ModBlocks.STRING_SAPLING.get());
        add(ModBlocks.STRING_LOG.get(),
                createResourceLogDrops(ModItems.STRING_RESIN, Items.OAK_LOG));
        add(ModBlocks.STRING_LEAVES.get(),
                createResourceLeavesDrops(ModItems.STRING_ACORN, ModBlocks.STRING_SAPLING.asItem(), ModBlocks.STRING_LEAVES.get())
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1.0f))
                                .add(LootItem.lootTableItem(Items.STRING)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)))
                                        .when(BonusLevelTableCondition.bonusLevelFlatChance(registrylookup.getOrThrow(Enchantments.FORTUNE), new float[] {0.04f, 0.06f, 0.08f, 0.1f})
                                        )
                                )));

        dropSelf(ModBlocks.COAL_AMBER.get());
        dropSelf(ModBlocks.COAL_SAPLING.get());
        add(ModBlocks.COAL_LOG.get(),
                createResourceLogDrops(ModItems.COAL_RESIN, Items.OAK_LOG));
        add(ModBlocks.COAL_LEAVES.get(),
                createResourceLeavesDrops(ModItems.COAL_ACORN, ModBlocks.COAL_SAPLING.asItem(), ModBlocks.COAL_LEAVES.get()));

        dropSelf(ModBlocks.IRON_AMBER.get());
        dropSelf(ModBlocks.IRON_SAPLING.get());
        add(ModBlocks.IRON_LOG.get(),
                createResourceLogDrops(ModItems.IRON_RESIN, Items.OAK_LOG));
        add(ModBlocks.IRON_LEAVES.get(),
                createResourceLeavesDrops(ModItems.IRON_ACORN, ModBlocks.IRON_SAPLING.asItem(), ModBlocks.IRON_LEAVES.get()));

        dropSelf(ModBlocks.COPPER_AMBER.get());
        dropSelf(ModBlocks.COPPER_SAPLING.get());
        add(ModBlocks.COPPER_LOG.get(),
                createResourceLogDrops(ModItems.COPPER_RESIN, Items.OAK_LOG));
        add(ModBlocks.COPPER_LEAVES.get(),
                createResourceLeavesDrops(ModItems.COPPER_ACORN, ModBlocks.COPPER_SAPLING.asItem(), ModBlocks.COPPER_LEAVES.get()));

        dropSelf(ModBlocks.GOLD_AMBER.get());
        dropSelf(ModBlocks.GOLD_SAPLING.get());
        add(ModBlocks.GOLD_LOG.get(),
                createResourceLogDrops(ModItems.GOLD_RESIN, Items.OAK_LOG));
        add(ModBlocks.GOLD_LEAVES.get(),
                createResourceLeavesDrops(ModItems.GOLD_ACORN, ModBlocks.GOLD_SAPLING.asItem(), ModBlocks.GOLD_LEAVES.get()));

        dropSelf(ModBlocks.DIAMOND_AMBER.get());
        dropSelf(ModBlocks.DIAMOND_SAPLING.get());
        add(ModBlocks.DIAMOND_LOG.get(),
                createResourceLogDrops(ModItems.DIAMOND_RESIN, Items.OAK_LOG));
        add(ModBlocks.DIAMOND_LEAVES.get(),
                createResourceLeavesDrops(ModItems.DIAMOND_ACORN, ModBlocks.DIAMOND_SAPLING.asItem(), ModBlocks.DIAMOND_LEAVES.get()));

        dropSelf(ModBlocks.REDSTONE_AMBER.get());
        dropSelf(ModBlocks.REDSTONE_SAPLING.get());
        add(ModBlocks.REDSTONE_LOG.get(),
                createResourceLogDrops(ModItems.REDSTONE_RESIN, Items.OAK_LOG));
        add(ModBlocks.REDSTONE_LEAVES.get(),
                createResourceLeavesDrops(ModItems.REDSTONE_ACORN, ModBlocks.REDSTONE_SAPLING.asItem(), ModBlocks.REDSTONE_LEAVES.get()));

        dropSelf(ModBlocks.EMERALD_AMBER.get());
        dropSelf(ModBlocks.EMERALD_SAPLING.get());
        add(ModBlocks.EMERALD_LOG.get(),
                createResourceLogDrops(ModItems.EMERALD_RESIN, Items.OAK_LOG));
        add(ModBlocks.EMERALD_LEAVES.get(),
                createResourceLeavesDrops(ModItems.EMERALD_ACORN, ModBlocks.EMERALD_SAPLING.asItem(), ModBlocks.EMERALD_LEAVES.get()));

        dropSelf(ModBlocks.QUARTZ_AMBER.get());
        dropSelf(ModBlocks.QUARTZ_SAPLING.get());
        add(ModBlocks.QUARTZ_LOG.get(),
                createResourceLogDrops(ModItems.QUARTZ_RESIN, Items.OAK_LOG));
        add(ModBlocks.QUARTZ_LEAVES.get(),
                createResourceLeavesDrops(ModItems.QUARTZ_ACORN, ModBlocks.QUARTZ_SAPLING.asItem(), ModBlocks.QUARTZ_LEAVES.get()));

        dropSelf(ModBlocks.LAPIS_AMBER.get());
        dropSelf(ModBlocks.LAPIS_SAPLING.get());
        add(ModBlocks.LAPIS_LOG.get(),
                createResourceLogDrops(ModItems.LAPIS_RESIN, Items.OAK_LOG));
        add(ModBlocks.LAPIS_LEAVES.get(),
                createResourceLeavesDrops(ModItems.LAPIS_ACORN, ModBlocks.LAPIS_SAPLING.asItem(), ModBlocks.LAPIS_LEAVES.get()));

        dropSelf(ModBlocks.AMETHYST_AMBER.get());
        dropSelf(ModBlocks.AMETHYST_SAPLING.get());
        add(ModBlocks.AMETHYST_LOG.get(),
                createResourceLogDrops(ModItems.AMETHYST_RESIN, Items.OAK_LOG));
        add(ModBlocks.AMETHYST_LEAVES.get(),
                createResourceLeavesDrops(ModItems.AMETHYST_ACORN, ModBlocks.AMETHYST_SAPLING.asItem(), ModBlocks.AMETHYST_LEAVES.get()));
    }

    protected LootTable.Builder createResourceLogDrops(DeferredItem<Item> resinItem, Item log) {

        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0f))
                        .add(LootItem.lootTableItem(log)))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0f))
                        .add(LootItem.lootTableItem(resinItem)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 2.0f)))
                                .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE))
                                ))
                        );
    }

    protected LootTable.Builder createResourceLeavesDrops(DeferredItem<Item> acornItem,
                                                          Item saplingItem,
                                                          Block leaf) {

        LootTable.Builder normalDrops = LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0f))
                        .add(LootItem.lootTableItem(saplingItem)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)))
                                .when(BonusLevelTableCondition.bonusLevelFlatChance(registrylookup.getOrThrow(Enchantments.FORTUNE), SAPLING_CHANCES)
                        ))
                )
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0f))
                        .add(LootItem.lootTableItem(acornItem)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 2.0f)))
                                .when(BonusLevelTableCondition.bonusLevelFlatChance(registrylookup.getOrThrow(Enchantments.FORTUNE), ACORN_CHANCES)
                                )
                        )
                )
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0f))
                        .add(LootItem.lootTableItem(Items.STICK)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 2.0f)))
                                .when(BonusLevelTableCondition.bonusLevelFlatChance(registrylookup.getOrThrow(Enchantments.FORTUNE), STICK_CHANCES)
                        )
                ));
        return this.createShearsDispatchTable(leaf, NestedLootTable.inlineLootTable(normalDrops.build()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
