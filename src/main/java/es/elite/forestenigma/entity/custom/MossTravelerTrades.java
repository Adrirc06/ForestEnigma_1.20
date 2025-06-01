package es.elite.forestenigma.entity.custom;

import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.item.trading.MerchantOffers;

public class MossTravelerTrades {
    public static void addTrades(MerchantOffers offers, Entity trader, RandomSource random) {
        offers.add(new MerchantOffer(
                new ItemStack(Items.EMERALD, 2),
                new ItemStack(Items.MOSS_BLOCK, 8),
                12, 5, 0.05f
        ));

        offers.add(new MerchantOffer(
                new ItemStack(Items.EMERALD, 1),
                new ItemStack(Items.VINE, 5),
                8, 10, 0.05f
        ));

        offers.add(new MerchantOffer(
                new ItemStack(Items.COAL, 4),
                new ItemStack(Items.EMERALD, 1),
                16, 2, 0.05f
        ));
    }
}