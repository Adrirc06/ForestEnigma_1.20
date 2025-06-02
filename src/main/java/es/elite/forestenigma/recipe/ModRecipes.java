package es.elite.forestenigma.recipe;

import es.elite.forestenigma.ForestEnigma;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, ForestEnigma.MOD_ID);

    public static final RegistryObject<RecipeSerializer<AncientStoneRecipe>> ANCIENT_STONE_SERIALIZER =
            SERIALIZERS.register("ancient_stone", () -> AncientStoneRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
