package com.kyle.hobbitcraft.datagen;

import com.kyle.hobbitcraft.HobbitCraft;
import com.kyle.hobbitcraft.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, HobbitCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.DREADED_HELMET.get(),
                        ModItems.DREADED_CHESTPLATE.get(),
                        ModItems.DREADED_LEGGINGS.get(),
                        ModItems.DREADED_BOOTS.get(),
                        ModItems.KYLE_HELMET.get(),
                        ModItems.KYLE_CHESTPLATE.get(),
                        ModItems.KYLE_LEGGINGS.get(),
                        ModItems.KYLE_BOOTS.get(),
                        ModItems.PYRITE_HELMET.get(),
                        ModItems.PYRITE_CHESTPLATE.get(),
                        ModItems.PYRITE_LEGGINGS.get(),
                        ModItems.PYRITE_BOOTS.get(),
                        ModItems.WIBKITIUM_HELMET.get(),
                        ModItems.WIBKITIUM_CHESTPLATE.get(),
                        ModItems.WIBKITIUM_LEGGINGS.get(),
                        ModItems.WIBKITIUM_BOOTS.get());
        this.tag(ItemTags.PIGLIN_LOVED)
                .add(ModItems.PYRITE_INGOT.get(),
                        ModItems.DREADED_HELMET.get(),
                        ModItems.DREADED_CHESTPLATE.get(),
                        ModItems.DREADED_LEGGINGS.get(),
                        ModItems.DREADED_BOOTS.get(),
                        ModItems.KYLE_HELMET.get(),
                        ModItems.KYLE_CHESTPLATE.get(),
                        ModItems.KYLE_LEGGINGS.get(),
                        ModItems.KYLE_BOOTS.get(),
                        ModItems.PYRITE_HELMET.get(),
                        ModItems.PYRITE_CHESTPLATE.get(),
                        ModItems.PYRITE_LEGGINGS.get(),
                        ModItems.PYRITE_BOOTS.get(),
                        ModItems.WIBKITIUM_HELMET.get(),
                        ModItems.WIBKITIUM_CHESTPLATE.get(),
                        ModItems.WIBKITIUM_LEGGINGS.get(),
                        ModItems.WIBKITIUM_BOOTS.get());

        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.DREADED_RECORD.get(),
                        ModItems.KYLE_RECORD.get());

        this.tag(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(ModItems.DREADED_RECORD.get(),
                        ModItems.KYLE_RECORD.get());
    }
}
