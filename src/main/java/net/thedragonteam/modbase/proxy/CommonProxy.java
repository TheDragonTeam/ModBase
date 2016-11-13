/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.modbase.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.thedragonteam.modbase.MBConfig;
import net.thedragonteam.modbase.client.gui.MBTab;
import net.thedragonteam.modbase.registry.ModBlocks;
import net.thedragonteam.modbase.registry.ModItems;
import net.thedragonteam.modbase.registry.ModRecipes;
import net.thedragonteam.modbase.resources.GlobalEventsModBase;
import net.thedragonteam.thedragonlib.config.ModConfigProcessor;
import net.thedragonteam.thedragonlib.util.LogHelper;

public class CommonProxy {

    public static ModConfigProcessor configProcessor = new ModConfigProcessor();

    public static Configuration configuration;

    public void preInit(FMLPreInitializationEvent event) {
        ModItems.init();
        ModBlocks.init();
        configuration = new Configuration(event.getSuggestedConfigurationFile());
        configProcessor.processConfig(MBConfig.class, configuration);
        LogHelper.info("Finished PreInitialization");
    }

    public void init(FMLInitializationEvent event) {
        MBTab.initialize();
        MinecraftForge.EVENT_BUS.register(new GlobalEventsModBase());
        ModRecipes.init();
        LogHelper.info("Finished Initialization");
    }

    public void postInit(FMLPostInitializationEvent event) {
        LogHelper.info("Finished PostInitialization");
    }
}