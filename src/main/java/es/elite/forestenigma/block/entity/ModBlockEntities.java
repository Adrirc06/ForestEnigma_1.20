package es.elite.forestenigma.block.entity;

import es.elite.forestenigma.ForestEnigma;
import es.elite.forestenigma.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ForestEnigma.MOD_ID);

    public static final RegistryObject<BlockEntityType<AncientStoneEntity>> ANCIENT_STONE_ENTITY =
            BLOCK_ENTITIES.register("ancient_stone_entity", () ->
                    BlockEntityType.Builder.of(AncientStoneEntity::new,
                            ModBlocks.ANCIENT_STONE.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
