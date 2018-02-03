/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.modbase.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.thedragonteam.modbase.client.gui.MBTab;
import net.thedragonteam.modbase.registry.ModRecipes;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
    }

    public void init(FMLInitializationEvent event) {
        MBTab.initialize();
        ModRecipes.init();
    }

    public void postInit(FMLPostInitializationEvent event) {
    }
}