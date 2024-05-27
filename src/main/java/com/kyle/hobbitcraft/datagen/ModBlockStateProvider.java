package com.kyle.hobbitcraft.datagen;

import com.kyle.hobbitcraft.HobbitCraft;
import com.kyle.hobbitcraft.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, HobbitCraft.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.DREADED_BLOCK);
        blockWithItem(ModBlocks.DREADED_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.DREADED_ORE);

        blockWithItem(ModBlocks.KYLE_BLOCK);
        blockWithItem(ModBlocks.KYLE_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.KYLE_ORE);

        blockWithItem(ModBlocks.PYRITE_BLOCK);
        blockWithItem(ModBlocks.PYRITE_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.PYRITE_ORE);

        blockWithItem(ModBlocks.WIBKITIUM_BLOCK);
        blockWithItem(ModBlocks.WIBKITIUM_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.WIBKITIUM_ORE);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
