package com.kyle.hobbitcraft.datagen;

import com.kyle.hobbitcraft.HobbitCraft;
import com.kyle.hobbitcraft.block.ModBlocks;
import com.kyle.hobbitcraft.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> DREADED_SMELTABLES = List.of(ModBlocks.DREADED_ORE.get(), ModBlocks.DREADED_DEEPSLATE_ORE.get());

    private static final List<ItemLike> KYLE_SMELTABLES = List.of(ModBlocks.KYLE_ORE.get(), ModBlocks.KYLE_DEEPSLATE_ORE.get());

    private static final List<ItemLike> PYRITE_SMELTABLES = List.of(ModBlocks.PYRITE_ORE.get(), ModBlocks.PYRITE_DEEPSLATE_ORE.get());

    private static final List<ItemLike> WIBKITIUM_SMELTABLES = List.of(ModBlocks.WIBKITIUM_ORE.get(), ModBlocks.WIBKITIUM_DEEPSLATE_ORE.get());


    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreBlasting(pWriter, DREADED_SMELTABLES, RecipeCategory.MISC, ModItems.DREADED_INGOT.get(), 0.25f, 100, "dreaded_blasting");
        oreSmelting(pWriter, DREADED_SMELTABLES, RecipeCategory.MISC, ModItems.DREADED_INGOT.get(), 0.25f, 200, "dreaded_smelting");

        oreBlasting(pWriter, KYLE_SMELTABLES, RecipeCategory.MISC, ModItems.KYLE_INGOT.get(), 0.25f, 100, "kyle_blasting");
        oreSmelting(pWriter, KYLE_SMELTABLES, RecipeCategory.MISC, ModItems.KYLE_INGOT.get(), 0.25f, 200, "kyle_smelting");

        oreBlasting(pWriter, PYRITE_SMELTABLES, RecipeCategory.MISC, ModItems.PYRITE_INGOT.get(), 0.25f, 100, "pyrite_blasting");
        oreSmelting(pWriter, PYRITE_SMELTABLES, RecipeCategory.MISC, ModItems.PYRITE_INGOT.get(), 0.25f, 200, "pyrite_smelting");

        oreBlasting(pWriter, WIBKITIUM_SMELTABLES, RecipeCategory.MISC, ModItems.WIBKITIUM_INGOT.get(), 0.25f, 100, "wibkitium_blasting");
        oreSmelting(pWriter, WIBKITIUM_SMELTABLES, RecipeCategory.MISC, ModItems.WIBKITIUM_INGOT.get(), 0.25f, 200, "wibkitium_smelting");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BLANK_RECORD.get(), 1)
                        .requires(ModItems.DREADED_INGOT.get())
                        .requires(ModItems.KYLE_INGOT.get())
                        .requires(ModItems.PYRITE_INGOT.get())
                        .requires(ModItems.WIBKITIUM_INGOT.get())
                        .unlockedBy(getHasName(ModItems.DREADED_INGOT.get()), has(ModItems.DREADED_INGOT.get()))
                        .unlockedBy(getHasName(ModItems.KYLE_INGOT.get()), has(ModItems.KYLE_INGOT.get()))
                        .unlockedBy(getHasName(ModItems.PYRITE_INGOT.get()), has(ModItems.PYRITE_INGOT.get()))
                        .unlockedBy(getHasName(ModItems.WIBKITIUM_INGOT.get()), has(ModItems.WIBKITIUM_INGOT.get()))
                        .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DREADED_INGOT.get(), 9)
                .requires(ModBlocks.DREADED_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.DREADED_BLOCK.get()), has(ModBlocks.DREADED_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.KYLE_INGOT.get(), 9)
                .requires(ModBlocks.KYLE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.KYLE_BLOCK.get()), has(ModBlocks.KYLE_BLOCK.get()))
                .save(pWriter);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PYRITE_INGOT.get(), 9)
                .requires(ModBlocks.PYRITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.PYRITE_BLOCK.get()), has(ModBlocks.PYRITE_BLOCK.get()))
                .save(pWriter);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.WIBKITIUM_INGOT.get(), 9)
                .requires(ModBlocks.WIBKITIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.WIBKITIUM_BLOCK.get()), has(ModBlocks.WIBKITIUM_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DREADED_RECORD.get(), 1)
                .requires(ModItems.DREADED_INGOT.get())
                .requires(ModItems.BLANK_RECORD.get())
                .unlockedBy(getHasName(ModItems.DREADED_INGOT.get()), has(ModItems.DREADED_INGOT.get()))
                .unlockedBy(getHasName(ModItems.BLANK_RECORD.get()), has(ModItems.BLANK_RECORD.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.KYLE_RECORD.get(), 1)
                .requires(ModItems.KYLE_INGOT.get())
                .requires(ModItems.BLANK_RECORD.get())
                .unlockedBy(getHasName(ModItems.KYLE_INGOT.get()), has(ModItems.KYLE_INGOT.get()))
                .unlockedBy(getHasName(ModItems.BLANK_RECORD.get()), has(ModItems.BLANK_RECORD.get()))
                .save(pWriter);




        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DREADED_BLOCK.get())
                .pattern("DDD")
                .pattern("DDD")
                .pattern("DDD")
                .define('D', ModItems.DREADED_INGOT.get())
                .unlockedBy(getHasName(ModItems.DREADED_INGOT.get()), has(ModItems.DREADED_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DREADED_HELMET.get())
                .pattern("DDD")
                .pattern("D D")
                .define('D', ModItems.DREADED_INGOT.get())
                .unlockedBy(getHasName(ModItems.DREADED_INGOT.get()), has(ModItems.DREADED_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DREADED_CHESTPLATE.get())
                .pattern("D D")
                .pattern("DDD")
                .pattern("DDD")
                .define('D', ModItems.DREADED_INGOT.get())
                .unlockedBy(getHasName(ModItems.DREADED_INGOT.get()), has(ModItems.DREADED_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DREADED_LEGGINGS.get())
                .pattern("DDD")
                .pattern("D D")
                .pattern("D D")
                .define('D', ModItems.DREADED_INGOT.get())
                .unlockedBy(getHasName(ModItems.DREADED_INGOT.get()), has(ModItems.DREADED_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DREADED_BOOTS.get())
                .pattern("D D")
                .pattern("D D")
                .define('D', ModItems.DREADED_INGOT.get())
                .unlockedBy(getHasName(ModItems.DREADED_INGOT.get()), has(ModItems.DREADED_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DREADED_AXE.get())
                .pattern(" II")
                .pattern(" NI")
                .pattern(" N ")
                .define('I', ModItems.DREADED_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.DREADED_INGOT.get()), has(ModItems.DREADED_INGOT.get()))
                .save(pWriter, new ResourceLocation(HobbitCraft.MOD_ID, "dreaded_axe_alt1"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DREADED_AXE.get())
                .pattern("II ")
                .pattern("IN ")
                .pattern(" N ")
                .define('I', ModItems.DREADED_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.DREADED_INGOT.get()), has(ModItems.DREADED_INGOT.get()))
                .save(pWriter, new ResourceLocation(HobbitCraft.MOD_ID, "dreaded_axe_alt2"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DREADED_PICKAXE.get())
                .pattern("III")
                .pattern(" N ")
                .pattern(" N ")
                .define('I', ModItems.DREADED_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.DREADED_INGOT.get()), has(ModItems.DREADED_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DREADED_SHOVEL.get())
                .pattern("I")
                .pattern("N")
                .pattern("N")
                .define('I', ModItems.DREADED_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.DREADED_INGOT.get()), has(ModItems.DREADED_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DREADED_SWORD.get())
                .pattern("I")
                .pattern("I")
                .pattern("N")
                .define('I', ModItems.DREADED_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.DREADED_INGOT.get()), has(ModItems.DREADED_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DREADED_HOE.get())
                .pattern("II ")
                .pattern(" N ")
                .pattern(" N ")
                .define('I', ModItems.DREADED_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.DREADED_INGOT.get()), has(ModItems.DREADED_INGOT.get()))
                .save(pWriter, new ResourceLocation(HobbitCraft.MOD_ID, "dreaded_hoe_alt1"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DREADED_HOE.get())
                .pattern(" II")
                .pattern(" N ")
                .pattern(" N ")
                .define('I', ModItems.DREADED_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.DREADED_INGOT.get()), has(ModItems.DREADED_INGOT.get()))
                .save(pWriter, new ResourceLocation(HobbitCraft.MOD_ID, "dreaded_hoe_alt2"));


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.KYLE_BLOCK.get())
                .pattern("KKK")
                .pattern("KKK")
                .pattern("KKK")
                .define('K', ModItems.KYLE_INGOT.get())
                .unlockedBy(getHasName(ModItems.KYLE_INGOT.get()), has(ModItems.KYLE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.KYLE_HELMET.get())
                .pattern("KKK")
                .pattern("K K")
                .define('K', ModItems.KYLE_INGOT.get())
                .unlockedBy(getHasName(ModItems.KYLE_INGOT.get()), has(ModItems.KYLE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.KYLE_CHESTPLATE.get())
                .pattern("K K")
                .pattern("KKK")
                .pattern("KKK")
                .define('K', ModItems.KYLE_INGOT.get())
                .unlockedBy(getHasName(ModItems.KYLE_INGOT.get()), has(ModItems.KYLE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.KYLE_LEGGINGS.get())
                .pattern("KKK")
                .pattern("K K")
                .pattern("K K")
                .define('K', ModItems.KYLE_INGOT.get())
                .unlockedBy(getHasName(ModItems.KYLE_INGOT.get()), has(ModItems.KYLE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.KYLE_BOOTS.get())
                .pattern("K K")
                .pattern("K K")
                .define('K', ModItems.KYLE_INGOT.get())
                .unlockedBy(getHasName(ModItems.KYLE_INGOT.get()), has(ModItems.KYLE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.KYLE_AXE.get())
                .pattern(" II")
                .pattern(" NI")
                .pattern(" N ")
                .define('I', ModItems.KYLE_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.KYLE_INGOT.get()), has(ModItems.KYLE_INGOT.get()))
                .save(pWriter, new ResourceLocation(HobbitCraft.MOD_ID, "kyle_axe_alt1"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.KYLE_AXE.get())
                .pattern("II ")
                .pattern("IN ")
                .pattern(" N ")
                .define('I', ModItems.KYLE_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.KYLE_INGOT.get()), has(ModItems.KYLE_INGOT.get()))
                .save(pWriter, new ResourceLocation(HobbitCraft.MOD_ID, "kyle_axe_alt2"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.KYLE_PICKAXE.get())
                .pattern("III")
                .pattern(" N ")
                .pattern(" N ")
                .define('I', ModItems.KYLE_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.KYLE_INGOT.get()), has(ModItems.KYLE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.KYLE_SHOVEL.get())
                .pattern("I")
                .pattern("N")
                .pattern("N")
                .define('I', ModItems.KYLE_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.KYLE_INGOT.get()), has(ModItems.KYLE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.KYLE_SWORD.get())
                .pattern("I")
                .pattern("I")
                .pattern("N")
                .define('I', ModItems.KYLE_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.KYLE_INGOT.get()), has(ModItems.KYLE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.KYLE_HOE.get())
                .pattern("II ")
                .pattern(" N ")
                .pattern(" N ")
                .define('I', ModItems.KYLE_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.KYLE_INGOT.get()), has(ModItems.KYLE_INGOT.get()))
                .save(pWriter, new ResourceLocation(HobbitCraft.MOD_ID, "kyle_hoe_alt1"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.KYLE_HOE.get())
                .pattern(" II")
                .pattern(" N ")
                .pattern(" N ")
                .define('I', ModItems.KYLE_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.KYLE_INGOT.get()), has(ModItems.KYLE_INGOT.get()))
                .save(pWriter, new ResourceLocation(HobbitCraft.MOD_ID, "kyle_hoe_alt2"));


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PYRITE_BLOCK.get())
                .pattern("PPP")
                .pattern("PPP")
                .pattern("PPP")
                .define('P', ModItems.PYRITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.PYRITE_INGOT.get()), has(ModItems.PYRITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PYRITE_HELMET.get())
                .pattern("PPP")
                .pattern("P P")
                .define('P', ModItems.PYRITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.PYRITE_INGOT.get()), has(ModItems.PYRITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PYRITE_CHESTPLATE.get())
                .pattern("P P")
                .pattern("PPP")
                .pattern("PPP")
                .define('P', ModItems.PYRITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.PYRITE_INGOT.get()), has(ModItems.PYRITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PYRITE_LEGGINGS.get())
                .pattern("PPP")
                .pattern("P P")
                .pattern("P P")
                .define('P', ModItems.PYRITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.PYRITE_INGOT.get()), has(ModItems.PYRITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PYRITE_BOOTS.get())
                .pattern("P P")
                .pattern("P P")
                .define('P', ModItems.PYRITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.PYRITE_INGOT.get()), has(ModItems.PYRITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PYRITE_AXE.get())
                .pattern(" II")
                .pattern(" NI")
                .pattern(" N ")
                .define('I', ModItems.PYRITE_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.PYRITE_INGOT.get()), has(ModItems.PYRITE_INGOT.get()))
                .save(pWriter, new ResourceLocation(HobbitCraft.MOD_ID, "pyrite_axe_alt1"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PYRITE_AXE.get())
                .pattern("II ")
                .pattern("IN ")
                .pattern(" N ")
                .define('I', ModItems.PYRITE_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.PYRITE_INGOT.get()), has(ModItems.PYRITE_INGOT.get()))
                .save(pWriter, new ResourceLocation(HobbitCraft.MOD_ID, "pyrite_axe_alt2"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PYRITE_PICKAXE.get())
                .pattern("III")
                .pattern(" N ")
                .pattern(" N ")
                .define('I', ModItems.PYRITE_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.PYRITE_INGOT.get()), has(ModItems.PYRITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PYRITE_SHOVEL.get())
                .pattern("I")
                .pattern("N")
                .pattern("N")
                .define('I', ModItems.PYRITE_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.PYRITE_INGOT.get()), has(ModItems.PYRITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PYRITE_SWORD.get())
                .pattern("I")
                .pattern("I")
                .pattern("N")
                .define('I', ModItems.PYRITE_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.PYRITE_INGOT.get()), has(ModItems.PYRITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PYRITE_HOE.get())
                .pattern("II ")
                .pattern(" N ")
                .pattern(" N ")
                .define('I', ModItems.PYRITE_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.PYRITE_INGOT.get()), has(ModItems.PYRITE_INGOT.get()))
                .save(pWriter, new ResourceLocation(HobbitCraft.MOD_ID, "pyrite_hoe_alt1"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PYRITE_HOE.get())
                .pattern(" II")
                .pattern(" N ")
                .pattern(" N ")
                .define('I', ModItems.PYRITE_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.PYRITE_INGOT.get()), has(ModItems.PYRITE_INGOT.get()))
                .save(pWriter, new ResourceLocation(HobbitCraft.MOD_ID, "pyrite_hoe_alt2"));



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WIBKITIUM_BLOCK.get())
                .pattern("WWW")
                .pattern("WWW")
                .pattern("WWW")
                .define('W', ModItems.WIBKITIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.WIBKITIUM_INGOT.get()), has(ModItems.WIBKITIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WIBKITIUM_HELMET.get())
                .pattern("WWW")
                .pattern("W W")
                .define('W', ModItems.WIBKITIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.WIBKITIUM_INGOT.get()), has(ModItems.WIBKITIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WIBKITIUM_CHESTPLATE.get())
                .pattern("W W")
                .pattern("WWW")
                .pattern("WWW")
                .define('W', ModItems.WIBKITIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.WIBKITIUM_INGOT.get()), has(ModItems.WIBKITIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WIBKITIUM_LEGGINGS.get())
                .pattern("WWW")
                .pattern("W W")
                .pattern("W W")
                .define('W', ModItems.WIBKITIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.WIBKITIUM_INGOT.get()), has(ModItems.WIBKITIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WIBKITIUM_BOOTS.get())
                .pattern("W W")
                .pattern("W W")
                .define('W', ModItems.WIBKITIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.WIBKITIUM_INGOT.get()), has(ModItems.WIBKITIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WIBKITIUM_AXE.get())
                .pattern(" II")
                .pattern(" NI")
                .pattern(" N ")
                .define('I', ModItems.WIBKITIUM_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.WIBKITIUM_INGOT.get()), has(ModItems.WIBKITIUM_INGOT.get()))
                .save(pWriter, new ResourceLocation(HobbitCraft.MOD_ID, "wibkitium_axe_alt1"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WIBKITIUM_AXE.get())
                .pattern("II ")
                .pattern("IN ")
                .pattern(" N ")
                .define('I', ModItems.WIBKITIUM_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.WIBKITIUM_INGOT.get()), has(ModItems.WIBKITIUM_INGOT.get()))
                .save(pWriter, new ResourceLocation(HobbitCraft.MOD_ID, "wibkitium_axe_alt2"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WIBKITIUM_PICKAXE.get())
                .pattern("III")
                .pattern(" N ")
                .pattern(" N ")
                .define('I', ModItems.WIBKITIUM_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.WIBKITIUM_INGOT.get()), has(ModItems.WIBKITIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WIBKITIUM_SHOVEL.get())
                .pattern("I")
                .pattern("N")
                .pattern("N")
                .define('I', ModItems.WIBKITIUM_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.WIBKITIUM_INGOT.get()), has(ModItems.WIBKITIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WIBKITIUM_SWORD.get())
                .pattern("I")
                .pattern("I")
                .pattern("N")
                .define('I', ModItems.WIBKITIUM_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.WIBKITIUM_INGOT.get()), has(ModItems.WIBKITIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WIBKITIUM_HOE.get())
                .pattern("II ")
                .pattern(" N ")
                .pattern(" N ")
                .define('I', ModItems.WIBKITIUM_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.WIBKITIUM_INGOT.get()), has(ModItems.WIBKITIUM_INGOT.get()))
                .save(pWriter, new ResourceLocation(HobbitCraft.MOD_ID, "wibkitium_hoe_alt1"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WIBKITIUM_HOE.get())
                .pattern(" II")
                .pattern(" N ")
                .pattern(" N ")
                .define('I', ModItems.WIBKITIUM_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.WIBKITIUM_INGOT.get()), has(ModItems.WIBKITIUM_INGOT.get()))
                .save(pWriter, new ResourceLocation(HobbitCraft.MOD_ID, "wibkitium_hoe_alt2"));

    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  HobbitCraft.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
