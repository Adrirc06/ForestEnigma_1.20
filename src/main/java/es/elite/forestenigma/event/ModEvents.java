package es.elite.forestenigma.event;

import es.elite.forestenigma.ForestEnigma;
import es.elite.forestenigma.item.ModItems;
import es.elite.forestenigma.villages.ModVillagers;
import net.minecraft.world.entity.npc.VillagerProfession;
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
                    new ItemStack(ModItems.SYLVANITE.get(), 4),
                    6, 4, 0.05f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.DIAMOND, 3),
                    ItemStack.EMPTY,
                    new ItemStack(ModItems.SYLVANITE.get(), 10),
                    6, 4, 0.05f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SYLVANITE.get(), 9),
                    ItemStack.EMPTY,
                    new ItemStack(Items.BELL, 1),
                    1, 12, 0.05f));

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
                    new ItemStack(ModItems.SYLVANITE.get(), 9),
                    ItemStack.EMPTY,
                    new ItemStack(Items.BELL, 1),
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
                    new ItemStack(Items.EMERALD, 12),
                    new ItemStack(Items.DIAMOND, 1),
                    6, 6, 0.05f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.GOLD_INGOT, 5),
                    new ItemStack(Items.EMERALD, 1),
                    6, 6, 0.05f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(Items.OBSIDIAN, 4),
                    6, 8, 0.05f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.STONE, 32),
                    new ItemStack(Items.EMERALD, 1),
                    6, 8, 0.05f));
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
                    new ItemStack(Items.EMERALD, 12),
                    new ItemStack(Items.SEA_LANTERN, 1),
                    6, 6, 0.05f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.CAMPFIRE, 1),
                    new ItemStack(Items.EMERALD, 3),
                    6, 6, 0.05f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.BELL, 1),
                    new ItemStack(Items.EMERALD, 15),
                    6, 8, 0.05f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.SHROOMLIGHT, 4),
                    new ItemStack(Items.EMERALD, 4),
                    6, 8, 0.05f));
        }



    }
}
