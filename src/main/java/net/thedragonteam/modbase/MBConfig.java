/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.modbase;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;

import static net.thedragonteam.modbase.ModBase.MODID;

@Config(modid = MODID, category = "example")
public class MBConfig {

    @Comment({"This is an example config"})
    public static int exampleConfig = 1;
}
