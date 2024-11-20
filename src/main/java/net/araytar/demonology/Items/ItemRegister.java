package net.araytar.demonology.Items;

import net.araytar.demonology.Demonology;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegister {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Demonology.MODID);

    public static final RegistryObject<Item> DEMONOLOGY_TOME = ITEMS.register( "demonology_tome",
            () -> new Item(new Item.Properties().stacksTo(69))
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
