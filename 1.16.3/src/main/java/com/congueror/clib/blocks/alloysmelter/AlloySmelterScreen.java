package com.congueror.clib.blocks.alloysmelter;

/*import com.congueror.clib.ConguerorLib;
import com.congueror.clib.container.AlloySmelterContainer;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;

import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class AlloySmelterScreen extends ContainerScreen<AlloySmelterContainer>{

	private static final ResourceLocation TEXTURE = new ResourceLocation(ConguerorLib.MOD_ID, "textures/gui/alloy_smelter.png");
	PlayerInventory playerInv;
    ITextComponent name;
	
	public AlloySmelterScreen(AlloySmelterContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
		super(screenContainer, inv, titleIn);
		
		this.guiLeft = 0;
		this.guiTop = 0;
		this.xSize = 176;
		this.ySize = 166;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack matrixStack, float partialTicks, int x, int y) {
		// idk, idk, idk, Transparency
		RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
		this.minecraft.getTextureManager().bindTexture(TEXTURE);
		this.blit(matrixStack, this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack matrixStack, int mousex, int mousey) {
		this.minecraft.fontRenderer.drawString(this.playerInv.getDisplayName().getUnformattedComponentText(), 7, this.ySize - 93, 4210752);
        this.minecraft.fontRenderer.drawString(name.getUnformattedComponentText(), 7 + this.xSize / 2 - this.minecraft.fontRenderer.getStringWidth(name.getUnformattedComponentText()) / 2, 6, 4210752);
	}

	@Override
	public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
		super.render(matrixStack, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(matrixStack, mouseX, mouseY);
	}
}*/
