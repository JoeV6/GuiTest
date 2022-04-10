package com.LPC1.Lmod.injection.clicker;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Shadow;

public class Gui extends GuiScreen {

    private static final ResourceLocation MainGuiPng = new ResourceLocation("com/LPC1/Lmod/injection/GuiPng/GuiMainBackground.png");



    static final int GuiWidth = 200;
    static final int GuiHeight = 200;
    static int CenterX = 500;
    static int CenterY = 500;


    private static Minecraft mc;


    public static void drawScreen() {

        mc.renderEngine.bindTexture(MainGuiPng);
        drawScaledCustomSizeModalRect(CenterX, CenterY, 0, 0, 1080, 1080, GuiWidth, GuiHeight, 1080, 1080);
    }
}
