/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.modbase;

import net.minecraft.creativetab.CreativeTabs;
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
import net.thedragonteam.thedragonlib.util.LogHelper;

import static net.thedragonteam.modbase.util.Utils.setName;


@Mod(modid = ModBase.MODID, name = ModBase.MODNAME, version = ModBase.VERSION, guiFactory = ModBase.GUIFACTORY, dependencies = ModBase.DEPEND)
public class ModBase {

    /**
     * Updates every time the mod updates minecraft version,
     * Updates MAJOR with 1 after each version upgrade
     */
    public static final String MCVERSION = "1.10.2";
    /**
     * Updates every MAJOR change,
     * never resets
     */
    public static final int MAJOR = 8;
    /**
     * Updates every time a new block, item or features is added or change,
     * resets on MAJOR changes
     */
    public static final int MINOR = 2;
    /**
     * Updates every time a bug is fixed or issue solved or very minor code changes,
     * resets on MINOR changes
     */
    public static final int PATCH = 0;
    /**
     * The Mod Version
     */
    public static final String VERSION = ModBase.MCVERSION + "-" + ModBase.MAJOR + "." + ModBase.MINOR + "." + ModBase.PATCH + "";
    public static final String MODID = "modbase";
    public static final String MODNAME = "Mod Base";
    public static final String LIB_VERSION = "1.10.2-1.0.3.0";
    public static final String DEPEND = "required-after:thedragonlib@[" + ModBase.LIB_VERSION + ",);";
    public static final String CLIENTPROXY = "net.thedragonteam.modbase.proxy.ClientProxy";
    public static final String SERVERPROXY = "net.thedragonteam.modbase.proxy.ServerProxy";
    public static final String GUIFACTORY = "net.thedragonteam.modbase.client.gui.ConfigGuiFactory";

    @SidedProxy(clientSide = CLIENTPROXY, serverSide = SERVERPROXY)
    public static CommonProxy proxy;

    public static CreativeTabs mbTab = new MBTab(CreativeTabs.getNextID(), ModBase.MODID, setName("mod_base"), 0);

    @Mod.Instance(MODID)
    public static ModBase instance;

    public ModBase() {
        LogHelper.info("Welcoming Minecraft");
    }

    @SideOnly(Side.CLIENT)
    @EventHandler
    public void initClient(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @SideOnly(Side.SERVER)
    @EventHandler
    public void initServer(FMLInitializationEvent event) {
        proxy.init(event);
    }


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @EventHandler
    public void serverLoad(FMLServerStartingEvent event) {
    }
}