package es.elite.forestenigma.villages;

import com.google.common.collect.ImmutableSet;
import es.elite.forestenigma.ForestEnigma;
import es.elite.forestenigma.block.ModBlocks;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.sounds.SoundEvents.*;


public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
                DeferredRegister.create(ForgeRegistries.POI_TYPES, ForestEnigma.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
                DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, ForestEnigma.MOD_ID);



    public static final RegistryObject<PoiType> Kaupenger_POI = POI_TYPES.register("forestenigma_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.ANCIENT_STONE.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> KAUPENGER = VILLAGER_PROFESSIONS.register("kaupenger",
            () -> new VillagerProfession("kaupenger", holder -> holder.value() == Kaupenger_POI.get(),
                    holder -> holder.value() == Kaupenger_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    VILLAGER_WORK_BUTCHER));
    public static final RegistryObject<PoiType> Lumi_POI = POI_TYPES.register("anvil_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.RARE_MOSSY_BLOCK.get().getStateDefinition().getPossibleStates()), 1, 1));

    public static final RegistryObject<PoiType> Hurk_POI = POI_TYPES.register("beacon_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.HOLY_EYE_BLOCK.get().getStateDefinition().getPossibleStates()), 1, 1));

    public static final RegistryObject<VillagerProfession> HURK = VILLAGER_PROFESSIONS.register("hurk",
            () -> new VillagerProfession("hurk", holder -> holder.value() == Lumi_POI.get(),
                    holder -> holder.value() == Lumi_POI.get(), ImmutableSet.of(), ImmutableSet.of(), VILLAGER_WORK_ARMORER));

    public static final RegistryObject<VillagerProfession> LUMI = VILLAGER_PROFESSIONS.register("lumi",
            () -> new VillagerProfession("lumi", holder -> holder.value() == Hurk_POI.get(),
                    holder -> holder.value() == Hurk_POI.get(), ImmutableSet.of(), ImmutableSet.of(), VILLAGER_WORK_FLETCHER));



    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }

}
