package com.therealcthulhu.timbertreasures.datagen;

import com.therealcthulhu.timbertreasures.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.Compostable;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;

import java.util.concurrent.CompletableFuture;

public class ModDataMapProvider extends DataMapProvider {
    /**
     * Create a new provider.
     *
     * @param packOutput     the output location
     * @param lookupProvider a {@linkplain CompletableFuture} supplying the registries
     */
    protected ModDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather() {
        this.builder(NeoForgeDataMaps.COMPOSTABLES)
                .add(ModItems.DIRT_ACORN.getId(), new Compostable(0.3f), false)
                .add(ModItems.STONE_ACORN.getId(), new Compostable(0.3f), false)
                .add(ModItems.GRAVEL_ACORN.getId(), new Compostable(0.3f), false)
                .add(ModItems.CLAY_ACORN.getId(), new Compostable(0.3f), false)
                .add(ModItems.SAND_ACORN.getId(), new Compostable(0.3f), false)
                .add(ModItems.BONE_ACORN.getId(), new Compostable(0.3f), false)
                .add(ModItems.STRING_ACORN.getId(), new Compostable(0.3f), false)
                .add(ModItems.COAL_ACORN.getId(), new Compostable(0.3f), false)
                .add(ModItems.IRON_ACORN.getId(), new Compostable(0.3f), false)
                .add(ModItems.GOLD_ACORN.getId(), new Compostable(0.3f), false)
                .add(ModItems.COPPER_ACORN.getId(), new Compostable(0.3f), false)
                .add(ModItems.REDSTONE_ACORN.getId(), new Compostable(0.3f), false)
                .add(ModItems.DIAMOND_ACORN.getId(), new Compostable(0.3f), false)
                .add(ModItems.EMERALD_ACORN.getId(), new Compostable(0.3f), false)
                .add(ModItems.QUARTZ_ACORN.getId(), new Compostable(0.3f), false)
                .add(ModItems.LAPIS_ACORN.getId(), new Compostable(0.3f), false)
                .add(ModItems.AMETHYST_ACORN.getId(), new Compostable(0.3f), false)
                ;
    }
}
