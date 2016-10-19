/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.modbase.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;
import net.thedragonteam.modbase.ModBase;
import net.thedragonteam.thedragonlib.util.TextHelper;

import java.util.ArrayList;
import java.util.List;

public class ConfigGui extends GuiConfig {
    public ConfigGui(GuiScreen parentScreen) {
        super(parentScreen, getConfigElements(parentScreen), ModBase.MODID, false, true,
                TextHelper.localize("gui." + ModBase.MODID + ".config.title"));
    }

    private static List<IConfigElement> getConfigElements(GuiScreen parent) {
        List<IConfigElement> list = new ArrayList<IConfigElement>();

        /** adds sections declared in ConfigHandler. toLowerCase() is used because the configuration class automatically does this, so must we. */
        list.add(new ConfigElement(ModBase.configuration.getCategory("Example".toLowerCase())));
        return list;
    }
}