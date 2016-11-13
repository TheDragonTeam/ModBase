/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.modbase.registry;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.modbase.blocks.ExampleBlock;

public class ModBlocks {

    public static ExampleBlock exampleBlock;

    public static void init() {
        exampleBlock = new ExampleBlock();
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        exampleBlock.initModel();
    }
}
