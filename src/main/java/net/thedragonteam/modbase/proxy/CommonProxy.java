/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.modbase.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.thedragonteam.modbase.ModBase;
import net.thedragonteam.modbase.client.gui.MBTab;
import net.thedragonteam.thedragonlib.util.LogHelper;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        LogHelper.info("Finished PreInitialization");
    }

    public void init(FMLInitializationEvent event) {
        MBTab.initialize();
        LogHelper.info("Finished Initialization");
    }

    public void postInit(FMLPostInitializationEvent event) {
        LogHelper.info("Finished PostInitialization");
    }

    public void registerRenderers(ModBase modBase) {
    }
}