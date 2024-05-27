package com.kyle.hobbitcraft.item;

import com.kyle.hobbitcraft.HobbitCraft;
import com.kyle.hobbitcraft.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HobbitCraft.MOD_ID);

    public static final RegistryObject<CreativeModeTab> HOBBITCRAFT = CREATIVE_MODE_TABS.register("hobbitcraft",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WIBKITIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.hobbitcraft"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.DREADED_INGOT.get());
                        pOutput.accept(ModBlocks.DREADED_BLOCK.get());
                        pOutput.accept(ModBlocks.DREADED_ORE.get());
                        pOutput.accept(ModBlocks.DREADED_DEEPSLATE_ORE.get());
                        pOutput.accept(ModItems.DREADED_AXE.get());
                        pOutput.accept(ModItems.DREADED_HOE.get());
                        pOutput.accept(ModItems.DREADED_PICKAXE.get());
                        pOutput.accept(ModItems.DREADED_SHOVEL.get());
                        pOutput.accept(ModItems.DREADED_SWORD.get());
                        pOutput.accept(ModItems.DREADED_HELMET.get());
                        pOutput.accept(ModItems.DREADED_CHESTPLATE.get());
                        pOutput.accept(ModItems.DREADED_LEGGINGS.get());
                        pOutput.accept(ModItems.DREADED_BOOTS.get());


                        pOutput.accept(ModItems.KYLE_INGOT.get());
                        pOutput.accept(ModBlocks.KYLE_BLOCK.get());
                        pOutput.accept(ModBlocks.KYLE_ORE.get());
                        pOutput.accept(ModBlocks.KYLE_DEEPSLATE_ORE.get());
                        pOutput.accept(ModItems.KYLE_AXE.get());
                        pOutput.accept(ModItems.KYLE_HOE.get());
                        pOutput.accept(ModItems.KYLE_PICKAXE.get());
                        pOutput.accept(ModItems.KYLE_SHOVEL.get());
                        pOutput.accept(ModItems.KYLE_SWORD.get());
                        pOutput.accept(ModItems.KYLE_HELMET.get());
                        pOutput.accept(ModItems.KYLE_CHESTPLATE.get());
                        pOutput.accept(ModItems.KYLE_LEGGINGS.get());
                        pOutput.accept(ModItems.KYLE_BOOTS.get());


                        pOutput.accept(ModItems.PYRITE_INGOT.get());
                        pOutput.accept(ModBlocks.PYRITE_BLOCK.get());
                        pOutput.accept(ModBlocks.PYRITE_ORE.get());
                        pOutput.accept(ModBlocks.PYRITE_DEEPSLATE_ORE.get());
                        pOutput.accept(ModItems.PYRITE_AXE.get());
                        pOutput.accept(ModItems.PYRITE_HOE.get());
                        pOutput.accept(ModItems.PYRITE_PICKAXE.get());
                        pOutput.accept(ModItems.PYRITE_SHOVEL.get());
                        pOutput.accept(ModItems.PYRITE_SWORD.get());
                        pOutput.accept(ModItems.PYRITE_HELMET.get());
                        pOutput.accept(ModItems.PYRITE_CHESTPLATE.get());
                        pOutput.accept(ModItems.PYRITE_LEGGINGS.get());
                        pOutput.accept(ModItems.PYRITE_BOOTS.get());


                        pOutput.accept(ModItems.WIBKITIUM_INGOT.get());
                        pOutput.accept(ModBlocks.WIBKITIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.WIBKITIUM_ORE.get());
                        pOutput.accept(ModBlocks.WIBKITIUM_DEEPSLATE_ORE.get());
                        pOutput.accept(ModItems.WIBKITIUM_AXE.get());
                        pOutput.accept(ModItems.WIBKITIUM_HOE.get());
                        pOutput.accept(ModItems.WIBKITIUM_PICKAXE.get());
                        pOutput.accept(ModItems.WIBKITIUM_SHOVEL.get());
                        pOutput.accept(ModItems.WIBKITIUM_SWORD.get());
                        pOutput.accept(ModItems.WIBKITIUM_HELMET.get());
                        pOutput.accept(ModItems.WIBKITIUM_CHESTPLATE.get());
                        pOutput.accept(ModItems.WIBKITIUM_LEGGINGS.get());
                        pOutput.accept(ModItems.WIBKITIUM_BOOTS.get());


                        pOutput.accept(ModItems.BLANK_RECORD.get());
                        pOutput.accept(ModItems.DREADED_RECORD.get());
                        pOutput.accept(ModItems.KYLE_RECORD.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
     CREATIVE_MODE_TABS.register(eventBus);
    }
}
