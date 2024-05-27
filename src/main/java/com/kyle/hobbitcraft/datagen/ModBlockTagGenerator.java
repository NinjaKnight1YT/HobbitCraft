package com.kyle.hobbitcraft.datagen;

import com.kyle.hobbitcraft.HobbitCraft;
import com.kyle.hobbitcraft.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, HobbitCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.PYRITE_BLOCK.get(),
                        ModBlocks.PYRITE_DEEPSLATE_ORE.get(),
                        ModBlocks.PYRITE_ORE.get());

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.DREADED_BLOCK.get(),
                        ModBlocks.DREADED_DEEPSLATE_ORE.get(),
                        ModBlocks.DREADED_ORE.get(),

                        ModBlocks.KYLE_BLOCK.get(),
                        ModBlocks.KYLE_DEEPSLATE_ORE.get(),
                        ModBlocks.KYLE_ORE.get(),

                        ModBlocks.WIBKITIUM_BLOCK.get(),
                        ModBlocks.WIBKITIUM_DEEPSLATE_ORE.get(),
                        ModBlocks.WIBKITIUM_ORE.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.DREADED_BLOCK.get(),
                        ModBlocks.DREADED_DEEPSLATE_ORE.get(),
                        ModBlocks.DREADED_ORE.get(),

                        ModBlocks.KYLE_BLOCK.get(),
                        ModBlocks.KYLE_DEEPSLATE_ORE.get(),
                        ModBlocks.KYLE_ORE.get(),

                        ModBlocks.PYRITE_BLOCK.get(),
                        ModBlocks.PYRITE_DEEPSLATE_ORE.get(),
                        ModBlocks.PYRITE_ORE.get(),

                        ModBlocks.WIBKITIUM_BLOCK.get(),
                        ModBlocks.WIBKITIUM_DEEPSLATE_ORE.get(),
                        ModBlocks.WIBKITIUM_ORE.get());
    }
}
