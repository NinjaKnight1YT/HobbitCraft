package com.kyle.hobbitcraft.item;

import com.kyle.hobbitcraft.HobbitCraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HobbitCraft.MOD_ID);

    public static final RegistryObject<Item> DREADED_INGOT = ITEMS.register("dreaded_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KYLE_INGOT = ITEMS.register("kyle_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PYRITE_INGOT = ITEMS.register("pyrite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WIBKITIUM_INGOT = ITEMS.register("wibkitium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLANK_RECORD = ITEMS.register("blank_record",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
