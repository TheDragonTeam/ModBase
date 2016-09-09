/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.modbase.blocks.base;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.thedragonteam.modbase.ModBase;

public class BlockBase extends Block {

    public BlockBase(Material material, String name) {
        super(material);
        setUnlocalizedName(name);
        this.setCreativeTab(ModBase.TAB_MOD_BASE);
    }
}