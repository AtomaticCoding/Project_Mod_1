package io.github.atomaticcoding.projectmod.item;

import io.github.atomaticcoding.projectmod.ProjectMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, ProjectMod.MOD_ID);

    public static final RegistryObject<Item> ATOM_INGOT = ITEMS.register("atom_ingot",
            () -> new Item( new Item.Properties()));
    public static final RegistryObject<Item> ATOM_NUGGET = ITEMS.register("atom_nugget",
            () -> new Item( new Item.Properties()));
    public static final RegistryObject<Item> RAW_ATOM = ITEMS.register("raw_atom",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
