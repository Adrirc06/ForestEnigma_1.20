package es.elite.forestenigma.item;

import es.elite.forestenigma.ForestEnigma;
import es.elite.forestenigma.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier SYLVANITE = TierSortingRegistry.registerTier(
            new ForgeTier(5,3000, 10f, 5f, 30,
                    ModTags.Blocks.NEEDS_SYLVANITE_TOOL, () -> Ingredient.of(ModItems.SYLVANITE.get())),
            new ResourceLocation(ForestEnigma.MOD_ID, "sylvanite"), List.of(Tiers.NETHERITE), List.of());
}
