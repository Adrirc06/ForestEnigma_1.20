package es.elite.forestenigma.event;

import es.elite.forestenigma.ForestEnigma;
import es.elite.forestenigma.item.ModItems;
import es.elite.forestenigma.villages.ModVillagers;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
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
                    new ItemCost(Items.EMERALD, 5),
                    new ItemStack(ModItems.SYLVANITE.get(), 4), 6, 4, 0.05f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.DIAMOND, 3),
                    new ItemStack(ModItems.SYLVANITE.get(), 10), 6, 4, 0.05f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(ModItems.SYLVANITE.get(), 9),
                    new ItemStack(Items.BELL, 1), 1, 12, 0.05f));
        }
        if(event.getType() == VillagerProfession.FARMER) {
            var trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 5),
                    new ItemStack(ModItems.SYLVANITE.get(), 14), 6, 4, 0.05f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.DIAMOND, 3),
                    new ItemStack(Items.ARROW, 32), 6, 4, 0.05f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.BELL, 1),
                    new ItemStack(Items.ACTIVATOR_RAIL, 32), 1, 12, 0.05f));
        }


    }
}
