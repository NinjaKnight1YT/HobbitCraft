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


                        pOutput.accept(ModItems.KYLE_INGOT.get());
                        pOutput.accept(ModBlocks.KYLE_BLOCK.get());


                        pOutput.accept(ModItems.PYRITE_INGOT.get());
                        pOutput.accept(ModBlocks.PYRITE_BLOCK.get());


                        pOutput.accept(ModItems.WIBKITIUM_INGOT.get());
                        pOutput.accept(ModBlocks.WIBKITIUM_BLOCK.get());

                        pOutput.accept(ModItems.BLANK_RECORD.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
     CREATIVE_MODE_TABS.register(eventBus);
    }
}
