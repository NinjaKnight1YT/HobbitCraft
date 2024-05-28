package com.kyle.hobbitcraft.util;

import com.kyle.hobbitcraft.HobbitCraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_DREADED_TOOL = tag("needs_dreaded_tool");
        public static final TagKey<Block> NEEDS_KYLE_TOOL = tag("needs_kyle_tool");
        public static final TagKey<Block> NEEDS_WIBKITIUM_TOOL = tag("needs_wibkitium_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(HobbitCraft.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(HobbitCraft.MOD_ID, name));
        }
    }
}
