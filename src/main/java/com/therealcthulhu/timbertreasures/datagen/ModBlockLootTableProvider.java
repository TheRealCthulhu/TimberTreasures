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
                createResourceLeavesDrops(ModItems.GRAVEL_ACORN, ModBlocks.GRAVEL_SAPLING.asItem(), ModBlocks.GRAVEL_LEAVES.get()));

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
