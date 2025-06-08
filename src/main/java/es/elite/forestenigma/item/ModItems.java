package es.elite.forestenigma.item;

import es.elite.forestenigma.ForestEnigma;
import es.elite.forestenigma.item.custom.ModArmorItem;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
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

    public static  final RegistryObject<Item> SYLVANITE_SWORD = ITEMS.register("sylvanite_sword",
            () -> new SwordItem(ModToolTiers.SYLVANITE, 4, 4,  new Item.Properties()));

    public static  final RegistryObject<Item> SYLVANITE_PICKAXE = ITEMS.register("sylvanite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SYLVANITE, 1, 1,  new Item.Properties()));

    public static  final RegistryObject<Item> SYLVANITE_AXE = ITEMS.register("sylvanite_axe",
            () -> new AxeItem(ModToolTiers.SYLVANITE, 8, 1,  new Item.Properties()));

    public static  final RegistryObject<Item> SYLVANITE_SHOVEL = ITEMS.register("sylvanite_shovel",
            () -> new ShovelItem(ModToolTiers.SYLVANITE, 0, 0,  new Item.Properties()));

    public static  final RegistryObject<Item> SYLVANITE_HOE = ITEMS.register("sylvanite_hoe",
            () -> new HoeItem(ModToolTiers.SYLVANITE, 0, 0,  new Item.Properties()));

    public static  final RegistryObject<Item> SYLVANITE_HELMET = ITEMS.register("sylvanite_helmet",
            () -> new ModArmorItem(ModArmorMaterials.SYLVANITE, ArmorItem.Type.HELMET,  new Item.Properties()));

    public static  final RegistryObject<Item> SYLVANITE_CHESTPLATE = ITEMS.register("sylvanite_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.SYLVANITE, ArmorItem.Type.CHESTPLATE,  new Item.Properties()));

    public static  final RegistryObject<Item> SYLVANITE_LEGGINGS = ITEMS.register("sylvanite_leggings",
            () -> new ModArmorItem(ModArmorMaterials.SYLVANITE, ArmorItem.Type.LEGGINGS,  new Item.Properties()));

    public static  final RegistryObject<Item> SYLVANITE_BOOTS = ITEMS.register("sylvanite_boots",
            () -> new ModArmorItem(ModArmorMaterials.SYLVANITE, ArmorItem.Type.BOOTS,  new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
