package es.elite.forestenigma.item;

import es.elite.forestenigma.ForestEnigma;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ForestEnigma.MOD_ID);

    public static final RegistryObject<Item> CARITA = ITEMS.register("carita",
            () -> new Item(new Item.Properties()));

    public static  final RegistryObject<Item> SYLVANITE = ITEMS.register("sylvanite",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
