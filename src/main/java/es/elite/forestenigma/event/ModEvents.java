package es.elite.forestenigma.event;

import es.elite.forestenigma.ForestEnigma;
import es.elite.forestenigma.item.ModItems;
import es.elite.forestenigma.villages.ModVillagers;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = ForestEnigma.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModEvents {
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if(event.getType() == ModVillagers.KAUPENGER.get()) {
            var trades = event.getTrades();
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    ItemStack.EMPTY,
                    new ItemStack(ModItems.SYLVANITE.get(), 3),
                    6, 4, 0.05f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.DIAMOND, 2),
                    ItemStack.EMPTY,
                    new ItemStack(ModItems.SYLVANITE.get(), 4),
                    6, 4, 0.05f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SYLVANITE.get(), 4),
                    ItemStack.EMPTY,
                    new ItemStack(Items.BELL, 1),
                    1, 12, 0.05f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.DIAMOND, 3),
                    ItemStack.EMPTY,
                    new ItemStack(ModItems.SYLVANITE_SWORD.get()),
                    1, 12, 0.05f));
            trades.get(3).add((Entity pTrader, RandomSource pRandom) -> new MerchantOffer(
                    new ItemStack(Items.DIAMOND_HORSE_ARMOR, 1),
                    new ItemStack(ModItems.SYLVANITE.get(), 1),
                    new ItemStack(Items.DIAMOND, 5),
                    1, 12, 0.05F));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.GOLDEN_CARROT, 16),
                    new ItemStack(ModItems.SYLVANITE.get(), 1),
                    new ItemStack(Items.GOLDEN_APPLE, 1),
                    5, 10, 0.05f));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SYLVANITE.get(), 5),
                    new ItemStack(Items.ENDER_PEARL, 1),
                    5, 10, 0.05f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SYLVANITE.get(), 22),
                    new ItemStack(Items.BOOK, 1),
                    new ItemStack(Items.ENCHANTED_BOOK, 1),
                    2, 20, 0.05f));
        }
        if(event.getType() == VillagerProfession.FARMER) {
            var trades = event.getTrades();
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    ItemStack.EMPTY,
                    new ItemStack(ModItems.SYLVANITE.get(), 4),
                    6, 4, 0.05f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.DIAMOND, 3),
                    ItemStack.EMPTY,
                    new ItemStack(ModItems.SYLVANITE.get(), 10),
                    6, 4, 0.05f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SYLVANITE.get(), 8),
                    ItemStack.EMPTY,
                    new ItemStack(Items.GOLDEN_APPLE, 1),
                    1, 12, 0.05f));

        }
        if (event.getType() == ModVillagers.HURK.get()) {
            var trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4),
                    new ItemStack(Items.COBBLESTONE, 16),
                    6, 4, 0.05f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 8),
                    new ItemStack(Items.IRON_INGOT, 4),
                    6, 4, 0.05f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.DIAMOND_AXE, 1),
                    new ItemStack(ModItems.SYLVANITE.get(), 1),
                    new ItemStack(ModItems.SYLVANITE_AXE.get(), 1),
                    4, 6, 0.05f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.GOLDEN_HELMET, 1),
                    new ItemStack(ModItems.SYLVANITE.get(), 2),
                    new ItemStack(ModItems.SYLVANITE_HELMET.get(), 1),
                    4, 6, 0.05f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SYLVANITE.get(), 16),
                    new ItemStack(Items.OBSIDIAN, 4),
                    6, 8, 0.05f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.STONE, 12),
                    new ItemStack(ModItems.SYLVANITE.get(), 1),
                    6, 8, 0.05f));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.DIAMOND_LEGGINGS, 1),
                    new ItemStack(ModItems.SYLVANITE.get(), 1),
                    new ItemStack(ModItems.SYLVANITE_LEGGINGS.get(), 1),
                    5, 10, 0.05f));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SYLVANITE.get(), 24),
                    new ItemStack(Items.DIAMOND_HORSE_ARMOR, 1),
                    2, 20, 0.05f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SYLVANITE_CHESTPLATE.get(), 1),
                    new ItemStack(ModItems.SYLVANITE.get(), 1),
                    new ItemStack(ModItems.SYLVANITE_CHESTPLATE.get(), 1),
                    1, 20, 0.05f));

        }

        if (event.getType() == ModVillagers.LUMI.get()) {
            var trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(Items.LANTERN, 2),
                    6, 4, 0.05f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.GLOWSTONE_DUST, 8),
                    new ItemStack(Items.EMERALD, 1),
                    6, 4, 0.05f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SYLVANITE.get(), 8),
                    new ItemStack(Items.SEA_LANTERN, 1),
                    6, 6, 0.05f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 3),
                    new ItemStack(Items.CAMPFIRE, 1),
                    6, 6, 0.05f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 15),
                    new ItemStack(Items.BELL, 1),
                    6, 8, 0.05f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4),
                    new ItemStack(Items.SHROOMLIGHT, 4),
                    6, 8, 0.05f));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 3),
                    new ItemStack(Items.SEA_LANTERN, 5),
                    5, 10, 0.05f));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SYLVANITE.get(), 1),
                    new ItemStack(Items.TORCH, 2),
                    new ItemStack(Items.LANTERN, 1),
                    5, 10, 0.05f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SYLVANITE.get(), 24),
                    new ItemStack(Items.SLIME_BLOCK, 1),
                    6, 20, 0.05f));
        }
    }
}
