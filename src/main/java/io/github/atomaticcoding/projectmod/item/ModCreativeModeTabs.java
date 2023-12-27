package io.github.atomaticcoding.projectmod.item;

import io.github.atomaticcoding.projectmod.ProjectMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ProjectMod.MOD_ID);
    public static final RegistryObject<CreativeModeTab> ITEMS_TAB = CREATIVE_MODE_TABS.register("ingredients_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ATOM_INGOT.get()))
                    .title(Component.translatable("creativetab.ingredients_tab"))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ATOM_INGOT.get());
                        pOutput.accept(ModItems.ATOM_NUGGET.get());
                    }))
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
