/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.modbase.items.base;

import net.minecraft.item.Item;
import net.thedragonteam.modbase.ModBase;

import static net.thedragonteam.modbase.util.Utils.setName;

public class ItemBase extends Item {

    public ItemBase(String name) {
        this.setRegistryName(name);
        this.setUnlocalizedName(setName(name));
        this.setCreativeTab(ModBase.mbTab);
    }
}