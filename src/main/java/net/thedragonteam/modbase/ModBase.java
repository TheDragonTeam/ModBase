/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.modbase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.modbase.client.gui.MBTab;
import net.thedragonteam.modbase.proxy.CommonProxy;
import net.thedragonteam.modbase.registry.ModBlocks;
import net.thedragonteam.modbase.registry.ModItems;
import net.thedragonteam.modbase.registry.ModRecipes;
import net.thedragonteam.modbase.resources.GlobalEventsModBase;
import net.thedragonteam.thedragonlib.config.ModConfigProcessor;
import net.thedragonteam.thedragonlib.util.LogHelper;
import net.thedragonteam.thedragonlib.util.TextHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;


@Mod(modid = ModBase.MODID, name = ModBase.MODNAME, version = ModBase.VERSION, guiFactory = ModBase.GUIFACTORY, dependencies = ModBase.DEPEND)
public class ModBase {

    public static final String MODID = "modbase";
    public static final String VERSION = "1.0.0";
    public static final String MODNAME = "Mod Base";
    public static final String LIBVERSION = "1.10.2-1.0.3.0";
    public static final String DEPEND = "required-after:thedragonlib@[" + ModBase.LIBVERSION + ",);";
    public static final String CLIENTPROXY = "net.thedragonteam.modbase.proxy.ClientProxy";
    public static final String COMMONPROXY = "net.thedragonteam.modbase.proxy.CommonProxy";
    public static final String GUIFACTORY = "net.thedragonteam.modbase.client.gui.ConfigGuiFactory";

    @SidedProxy(clientSide = CLIENTPROXY, serverSide = COMMONPROXY)
    public static CommonProxy proxy;

    public static CreativeTabs mbTab = new MBTab(CreativeTabs.getNextID(), ModBase.MODID, ModBase.MODID + "." + "mod_base", 0);

    public static Logger logger = LogManager.getLogger(ModBase.MODNAME);

    public static ModConfigProcessor configProcessor = new ModConfigProcessor();

    public static Configuration configuration;

    @Mod.Instance(MODID)
    public static ModBase instance;

    public static File configDir;

    public static File getConfigDir() {
        return configDir;
    }

    public ModBase() {
        LogHelper.info("Welcoming Minecraft");
    }


    @SideOnly(Side.CLIENT)
    @EventHandler
    public void initClient(FMLInitializationEvent event) {
        logger.info(TextHelper.localize("info." + ModBase.MODID + ".console.load.init"));
        MinecraftForge.EVENT_BUS.register(new GlobalEventsModBase());
        ModRecipes.init();

    }

    @SideOnly(Side.SERVER)
    @EventHandler
    public void initServer(FMLInitializationEvent event) {
        logger.info(TextHelper.localize("info." + ModBase.MODID + ".console.load.init"));
        MinecraftForge.EVENT_BUS.register(new GlobalEventsModBase());
        ModRecipes.init();

        proxy.init(event);
    }


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.init();
        ModBlocks.init();
        ModBlocks.register();

        configuration = new Configuration(event.getSuggestedConfigurationFile());
        configProcessor.processConfig(MBConfig.class, configuration);

        logger.info(TextHelper.localize("info." + ModBase.MODID + ".console.load.preInit"));
        configDir = new File(event.getModConfigurationDirectory() + "/" + ModBase.MODID);
        configDir.mkdirs();
        proxy.registerRenderers(this);
        proxy.preInit(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        logger.info(TextHelper.localize("info." + ModBase.MODID + ".console.load.postInit"));
        proxy.postInit(event);
    }

    @EventHandler
    public void serverLoad(FMLServerStartingEvent event) {
    }
}