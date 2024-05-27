package com.kyle.hobbitcraft.item;

import com.kyle.hobbitcraft.HobbitCraft;
import com.kyle.hobbitcraft.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier DREADED = TierSortingRegistry.registerTier(
            new ForgeTier(10, 5000, 10f, 8f, 50,
                    ModTags.Blocks.NEEDS_DREADED_TOOL, () -> Ingredient.of(ModItems.DREADED_INGOT.get())),
            new ResourceLocation(HobbitCraft.MOD_ID, "dreaded"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier KYLE = TierSortingRegistry.registerTier(
            new ForgeTier(10, 5000, 10f, 8f, 50,
                    ModTags.Blocks.NEEDS_KYLE_TOOL, () -> Ingredient.of(ModItems.KYLE_INGOT.get())),
            new ResourceLocation(HobbitCraft.MOD_ID, "kyle"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier WIBKITIUM = TierSortingRegistry.registerTier(
            new ForgeTier(10, 5000, 10f, 8f, 50,
                    ModTags.Blocks.NEEDS_WIBKITIUM_TOOL, () -> Ingredient.of(ModItems.WIBKITIUM_INGOT.get())),
            new ResourceLocation(HobbitCraft.MOD_ID, "wibkitium"), List.of(Tiers.NETHERITE), List.of());
}
