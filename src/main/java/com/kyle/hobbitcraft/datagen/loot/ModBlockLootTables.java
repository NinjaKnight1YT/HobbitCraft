package com.kyle.hobbitcraft.datagen.loot;

import com.kyle.hobbitcraft.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;


import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.DREADED_BLOCK.get());
        this.dropSelf(ModBlocks.DREADED_DEEPSLATE_ORE.get());
        this.dropSelf(ModBlocks.DREADED_ORE.get());

        this.dropSelf(ModBlocks.KYLE_BLOCK.get());
        this.dropSelf(ModBlocks.KYLE_DEEPSLATE_ORE.get());
        this.dropSelf(ModBlocks.KYLE_ORE.get());

        this.dropSelf(ModBlocks.PYRITE_BLOCK.get());
        this.dropSelf(ModBlocks.PYRITE_DEEPSLATE_ORE.get());
        this.dropSelf(ModBlocks.PYRITE_ORE.get());

        this.dropSelf(ModBlocks.WIBKITIUM_BLOCK.get());
        this.dropSelf(ModBlocks.WIBKITIUM_DEEPSLATE_ORE.get());
        this.dropSelf(ModBlocks.WIBKITIUM_ORE.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
