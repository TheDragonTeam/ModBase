/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.modbase.registry;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.core.util.LogHelper;
import net.thedragonteam.modbase.items.base.ItemBase;

public class ModItems {

    public static ItemBase ITEM_BASE;

    public static void init() {
        LogHelper.info("Initializing Items...");
        ITEM_BASE = new ItemBase("item_base");
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        ITEM_BASE.initModel();
    }
}
