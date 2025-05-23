package es.elite.forestenigma.villages;

import com.google.common.collect.ImmutableSet;
import es.elite.forestenigma.ForestEnigma;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.level.block.Blocks;
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



    public static final RegistryObject<PoiType> ForestEnigma_POI = POI_TYPES.register("forestenigma_poi",
            () -> new PoiType(ImmutableSet.copyOf(Blocks.FURNACE.getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> KAUPENGER = VILLAGER_PROFESSIONS.register("kaupenger",
            () -> new VillagerProfession("kaupenger", holder -> holder.value() == ForestEnigma_POI.get(),
                    holder -> holder.value() == ForestEnigma_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    VILLAGER_WORK_BUTCHER));
    public static final RegistryObject<PoiType> ANVIL_POI = POI_TYPES.register("anvil_poi",
            () -> new PoiType(ImmutableSet.copyOf(Blocks.ANVIL.getStateDefinition().getPossibleStates()), 1, 1));

    public static final RegistryObject<PoiType> BEACON_POI = POI_TYPES.register("beacon_poi",
            () -> new PoiType(ImmutableSet.copyOf(Blocks.BEACON.getStateDefinition().getPossibleStates()), 1, 1));

    public static final RegistryObject<VillagerProfession> HURK = VILLAGER_PROFESSIONS.register("hurk",
            () -> new VillagerProfession("hurk", holder -> holder.value() == ANVIL_POI.get(),
                    holder -> holder.value() == ANVIL_POI.get(), ImmutableSet.of(), ImmutableSet.of(), VILLAGER_WORK_ARMORER));

    public static final RegistryObject<VillagerProfession> LUMI = VILLAGER_PROFESSIONS.register("lumi",
            () -> new VillagerProfession("lumi", holder -> holder.value() == BEACON_POI.get(),
                    holder -> holder.value() == BEACON_POI.get(), ImmutableSet.of(), ImmutableSet.of(), VILLAGER_WORK_FLETCHER));



    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }

}
