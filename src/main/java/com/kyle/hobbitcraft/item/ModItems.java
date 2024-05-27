package com.kyle.hobbitcraft.item;

import com.kyle.hobbitcraft.HobbitCraft;
import com.kyle.hobbitcraft.block.custom.ModArmorItem;
import com.kyle.hobbitcraft.sound.ModSounds;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HobbitCraft.MOD_ID);

    public static final RegistryObject<Item> DREADED_INGOT = ITEMS.register("dreaded_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DREADED_SWORD = ITEMS.register("dreaded_sword",
            () -> new SwordItem(ModToolTiers.DREADED, 20, 1.6f, new Item.Properties()));

    public static final RegistryObject<Item> DREADED_HOE = ITEMS.register("dreaded_hoe",
            () -> new HoeItem(ModToolTiers.DREADED, 5, 1, new Item.Properties()));

    public static final RegistryObject<Item> DREADED_AXE = ITEMS.register("dreaded_axe",
            () -> new AxeItem(ModToolTiers.DREADED, 30, 0.8f, new Item.Properties()));

    public static final RegistryObject<Item> DREADED_PICKAXE = ITEMS.register("dreaded_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DREADED, 10, 1, new Item.Properties()));

    public static final RegistryObject<Item> DREADED_SHOVEL = ITEMS.register("dreaded_shovel",
            () -> new ShovelItem(ModToolTiers.DREADED, 8, 1, new Item.Properties()));

    public static final RegistryObject<Item> DREADED_HELMET = ITEMS.register("dreaded_helmet",
            () -> new ModArmorItem(ModArmorMaterials.DREADED, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> DREADED_CHESTPLATE = ITEMS.register("dreaded_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.DREADED, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> DREADED_LEGGINGS = ITEMS.register("dreaded_leggings",
            () -> new ModArmorItem(ModArmorMaterials.DREADED, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> DREADED_BOOTS = ITEMS.register("dreaded_boots",
            () -> new ModArmorItem(ModArmorMaterials.DREADED, ArmorItem.Type.BOOTS, new Item.Properties()));




    public static final RegistryObject<Item> KYLE_INGOT = ITEMS.register("kyle_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> KYLE_SWORD = ITEMS.register("kyle_sword",
            () -> new SwordItem(ModToolTiers.KYLE, 20, 1.6f, new Item.Properties()));

    public static final RegistryObject<Item> KYLE_HOE = ITEMS.register("kyle_hoe",
            () -> new HoeItem(ModToolTiers.KYLE, 5, 1, new Item.Properties()));

    public static final RegistryObject<Item> KYLE_AXE = ITEMS.register("kyle_axe",
            () -> new AxeItem(ModToolTiers.KYLE, 30, 0.8f, new Item.Properties()));

    public static final RegistryObject<Item> KYLE_PICKAXE = ITEMS.register("kyle_pickaxe",
            () -> new PickaxeItem(ModToolTiers.KYLE, 10, 1, new Item.Properties()));

    public static final RegistryObject<Item> KYLE_SHOVEL = ITEMS.register("kyle_shovel",
            () -> new ShovelItem(ModToolTiers.KYLE, 8, 1, new Item.Properties()));

    public static final RegistryObject<Item> KYLE_HELMET = ITEMS.register("kyle_helmet",
            () -> new ModArmorItem(ModArmorMaterials.KYLE, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> KYLE_CHESTPLATE = ITEMS.register("kyle_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.KYLE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> KYLE_LEGGINGS = ITEMS.register("kyle_leggings",
            () -> new ModArmorItem(ModArmorMaterials.KYLE, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> KYLE_BOOTS = ITEMS.register("kyle_boots",
            () -> new ModArmorItem(ModArmorMaterials.KYLE, ArmorItem.Type.BOOTS, new Item.Properties()));



    public static final RegistryObject<Item> PYRITE_INGOT = ITEMS.register("pyrite_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PYRITE_SWORD = ITEMS.register("pyrite_sword",
            () -> new SwordItem(Tiers.IRON, 3, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> PYRITE_HOE = ITEMS.register("pyrite_hoe",
            () -> new HoeItem(Tiers.IRON, -2, -1, new Item.Properties()));

    public static final RegistryObject<Item> PYRITE_AXE = ITEMS.register("pyrite_axe",
            () -> new AxeItem(Tiers.IRON, 6f, -3.1f, new Item.Properties()));

    public static final RegistryObject<Item> PYRITE_PICKAXE = ITEMS.register("pyrite_pickaxe",
            () -> new PickaxeItem(Tiers.IRON, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> PYRITE_SHOVEL = ITEMS.register("pyrite_shovel",
            () -> new ShovelItem(Tiers.IRON, 1.5f, -3.0f, new Item.Properties()));

    public static final RegistryObject<Item> PYRITE_HELMET = ITEMS.register("pyrite_helmet",
            () -> new ModArmorItem(ModArmorMaterials.PYRITE, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> PYRITE_CHESTPLATE = ITEMS.register("pyrite_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.PYRITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> PYRITE_LEGGINGS = ITEMS.register("pyrite_leggings",
            () -> new ModArmorItem(ModArmorMaterials.PYRITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> PYRITE_BOOTS = ITEMS.register("pyrite_boots",
            () -> new ModArmorItem(ModArmorMaterials.PYRITE, ArmorItem.Type.BOOTS, new Item.Properties()));



    public static final RegistryObject<Item> WIBKITIUM_INGOT = ITEMS.register("wibkitium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WIBKITIUM_SWORD = ITEMS.register("wibkitium_sword",
            () -> new SwordItem(ModToolTiers.WIBKITIUM, 20, 1.6f, new Item.Properties()));

    public static final RegistryObject<Item> WIBKITIUM_HOE = ITEMS.register("wibkitium_hoe",
            () -> new HoeItem(ModToolTiers.WIBKITIUM, 5, 1, new Item.Properties()));

    public static final RegistryObject<Item> WIBKITIUM_AXE = ITEMS.register("wibkitium_axe",
            () -> new AxeItem(ModToolTiers.WIBKITIUM, 30, 0.8f, new Item.Properties()));

    public static final RegistryObject<Item> WIBKITIUM_PICKAXE = ITEMS.register("wibkitium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WIBKITIUM, 10, 1, new Item.Properties()));

    public static final RegistryObject<Item> WIBKITIUM_SHOVEL = ITEMS.register("wibkitium_shovel",
            () -> new ShovelItem(ModToolTiers.WIBKITIUM, 8, 1, new Item.Properties()));
    public static final RegistryObject<Item> WIBKITIUM_HELMET = ITEMS.register("wibkitium_helmet",
            () -> new ModArmorItem(ModArmorMaterials.WIBKITIUM, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> WIBKITIUM_CHESTPLATE = ITEMS.register("wibkitium_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.WIBKITIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> WIBKITIUM_LEGGINGS = ITEMS.register("wibkitium_leggings",
            () -> new ModArmorItem(ModArmorMaterials.WIBKITIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> WIBKITIUM_BOOTS = ITEMS.register("wibkitium_boots",
            () -> new ModArmorItem(ModArmorMaterials.WIBKITIUM, ArmorItem.Type.BOOTS, new Item.Properties()));



    public static final RegistryObject<Item> BLANK_RECORD = ITEMS.register("blank_record",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DREADED_RECORD = ITEMS.register("dreaded_record",
            () -> new RecordItem(15, ModSounds.DREADED_RECORD, new Item.Properties().stacksTo(1), 3980));
    public static final RegistryObject<Item> KYLE_RECORD = ITEMS.register("kyle_record",
            () -> new RecordItem(15, ModSounds.KYLE_RECORD, new Item.Properties().stacksTo(1), 4520));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
