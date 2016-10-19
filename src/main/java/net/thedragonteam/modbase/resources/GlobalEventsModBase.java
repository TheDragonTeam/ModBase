/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.modbase.resources;

import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.thedragonteam.modbase.ModBase;
import net.thedragonteam.thedragonlib.util.TextHelper;

public class GlobalEventsModBase {

    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
        ModBase.logger.info(TextHelper.localize("info." + ModBase.MODID + ".console.config.refresh"));
    }
}