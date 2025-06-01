package es.elite.forestenigma.entity;

import es.elite.forestenigma.ForestEnigma;
import es.elite.forestenigma.entity.custom.MossTravelerEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ForestEnigma.MOD_ID);

    public static final RegistryObject<EntityType<MossTravelerEntity>> MOSS_TRAVELER =
            ENTITIES.register("moss_traveler", () ->
                    EntityType.Builder.of(MossTravelerEntity::new, MobCategory.CREATURE)
                            .sized(0.6F, 1.95F) // Hitbox personalizada
                            .clientTrackingRange(10)
                            .build("moss_traveler"));
}