/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.modbase.util;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import java.util.Objects;

import static java.lang.String.format;
import static net.thedragonteam.modbase.ModBase.MODID;

public final class Utils {

    public static ItemStack setUnbreakable(ItemStack stack) {
        NBTHelper.checkNBT(stack);
        stack.getTagCompound().setBoolean("Unbreakable", true);
        return stack;
    }

    public static String setName(String name) {
        return MODID + "." + name;
    }

    public static ResourceLocation setRL(String path) {
        return new ResourceLocation(MODID, path);
    }

    public static String setLocation(String path) {
        return format("%s:%s", MODID, path);
    }

    public static boolean isNotEmpty(ItemStack stack) {
        return !stack.isEmpty();
    }

    public static boolean isEmpty(ItemStack stack) {
        return stack.isEmpty();
    }

    public static boolean isNotNull(Object object) {
        return object != null;
    }

    public static boolean areNotNull(Object object1, Object object2) {
        return object1 != null && object2 != null;
    }

    public static boolean isNotNullNorEmpty(String object) {
        return isNotNull(object) && !Objects.equals(object, "");
    }

    public static boolean isNull(Object object) {
        return object == null;
    }

    public static boolean isNullOrEmpty(String object) {
        return isNull(object) || Objects.equals(object, "");
    }

}