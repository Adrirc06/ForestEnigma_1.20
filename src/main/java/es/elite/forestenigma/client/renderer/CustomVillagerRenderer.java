package es.elite.forestenigma.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.VillagerRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.npc.Villager;

public class CustomVillagerRenderer extends VillagerRenderer {

    public CustomVillagerRenderer(EntityRendererProvider.Context context) {
        super(context);
        this.shadowRadius = 0.3f;
    }


    @Override
    public ResourceLocation getTextureLocation(Villager villager) {
        if ("kaupenger".equals(villager.getVillagerData().getProfession().toString())) {
            return ResourceLocation.fromNamespaceAndPath("forestenigma", "textures/entity/villager/profession/kaupenger.png");
        }
        return super.getTextureLocation(villager);
    }


    @Override
    public void render(Villager villager, float entityYaw, float partialTicks,
                       PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        if ("kaupenger".equals(villager.getVillagerData().getProfession().toString())) {
            poseStack.pushPose();
            poseStack.translate(0.0, 0.0, 0.0); // Baja el aldeano
            poseStack.scale(0.5f, 0.5f, 0.5f);    // Lo hace más pequeño
            super.render(villager, entityYaw, partialTicks, poseStack, buffer, packedLight);
            poseStack.popPose();
        } else {
            super.render(villager, entityYaw, partialTicks, poseStack, buffer, packedLight);
        }
    }
}


