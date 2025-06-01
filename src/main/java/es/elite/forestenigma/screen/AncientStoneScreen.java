package es.elite.forestenigma.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import es.elite.forestenigma.ForestEnigma;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class AncientStoneScreen extends AbstractContainerScreen<AncientStoneMenu> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(ForestEnigma.MOD_ID, "textures/gui/ancient_stone_gui.png");

    public AncientStoneScreen(AncientStoneMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }

    @Override
    protected void init() {
        super.init();

    }

    @Override
    protected void renderBg(GuiGraphics GuiGraphics, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageWidth) / 2;

        GuiGraphics.blit(TEXTURE, x, y, 0, 0, imageWidth, imageHeight);
    }

    @Override
    public void render(GuiGraphics guiGraphics, int MouseX, int MouseY, float PartialTick) {
        renderBackground(guiGraphics);
        super.render(guiGraphics, MouseX, MouseY, PartialTick);
        renderTooltip(guiGraphics, MouseX, MouseY);
    }
}
