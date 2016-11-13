/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.modbase.client.gui;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.modbase.ModBase;
import net.thedragonteam.modbase.registry.ModItems;

/**
 * net.thedragonteam.armorplus.client.gui
 * ArmorPlus created by sokratis12GR on 7/26/2016 4:42 PM.
 * - TheDragonTeam
 */
public class MBTab extends CreativeTabs {
    static ItemStack iconArmorPlus;
    private String label;
    private int tab;

    public MBTab(int id, String modid, String label, int tab) {
        super(id, modid);
        this.label = label;
        this.tab = tab;
        setBackgroundImageName(ModBase.MODID + ".png"); // Automatically has tab_ applied to it. Make sure you change the texture name.

    }

    public static void initialize() {
        iconArmorPlus = new ItemStack(ModItems.exampleItem);
    }

    public boolean hasSearchBar() {
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getIconItemStack() {
        return new ItemStack(ModItems.exampleItem);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return getIconItemStack().getItem();
    }

    @Override
    public String getTabLabel() {
        return this.label;
    }
}