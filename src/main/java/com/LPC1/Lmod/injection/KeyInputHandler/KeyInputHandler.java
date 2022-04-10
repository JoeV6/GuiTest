package com.LPC1.Lmod.injection.KeyInputHandler;

import com.LPC1.Lmod.injection.clicker.Gui;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

import static com.LPC1.Lmod.injection.KeyInputHandler.KeyBinds.LmodGUI;

public class KeyInputHandler {

    public static boolean GuiOpened = false;

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {

        if (LmodGUI.isPressed()) {

            if (GuiOpened) {
                GuiOpened = false;
            }
            else {
                GuiOpened = true;
                Gui.drawScreen();
            }

        }
    }
}
