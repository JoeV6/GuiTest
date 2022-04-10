package com.LPC1.Lmod.injection.KeyInputHandler;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;

public class KeyBinds {

    public static KeyBinding LmodGUI;

    public static void init() {
        LmodGUI = new KeyBinding("key.LmodGUI", Keyboard.KEY_O, "key.categories.GUI");
        ClientRegistry.registerKeyBinding(LmodGUI);
    }
}

