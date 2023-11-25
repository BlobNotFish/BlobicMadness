package com.blob.blobm.item;

import com.blob.blobm.BlobMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BlobMod.MOD_ID);


    public static final RegistryObject<Item> BLOBIUM_INGOT = ITEMS.register("blobium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNCOOKED_BLOBIUM_INGOT = ITEMS.register("uncooked_blobium_ingot",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
