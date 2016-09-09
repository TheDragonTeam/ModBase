/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.modbase.util;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class NBTHelper {

    public static ItemStack checkNBT(ItemStack stack) {
        if (stack.getTagCompound() == null)
            stack.setTagCompound(new NBTTagCompound());

        return stack;
    }
}