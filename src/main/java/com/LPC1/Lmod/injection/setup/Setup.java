package com.LPC1.Lmod.injection.setup;

import com.LPC1.Lmod.injection.KeyInputHandler.KeyBinds;
import com.LPC1.Lmod.injection.KeyInputHandler.KeyInputHandler;
import com.LPC1.Lmod.injection.clicker.AutoClicker;
import com.LPC1.Lmod.injection.clicker.Gui;
import com.LPC1.Lmod.injection.clicker.InGameCommands;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(modid = Setup.MODID, version = Setup.VERSION)
public class Setup {

    public static final String MODID = "LiamMod";
    public static final String VERSION = "1.0";

    public Setup() {

        ClientCommandHandler.instance.registerCommand(new InGameCommands());
        MinecraftForge.EVENT_BUS.register(new AutoClicker());
        MinecraftForge.EVENT_BUS.register(new KeyInputHandler());

        KeyBinds.init();
    }
}
