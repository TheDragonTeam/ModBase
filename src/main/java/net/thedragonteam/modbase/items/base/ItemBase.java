/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.modbase.items.base;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.modbase.ModBase;


public class ItemBase extends Item {

    public ItemBase(String name) {
        setRegistryName(name);
        setUnlocalizedName(name);
        GameRegistry.register(this);
        this.setCreativeTab(ModBase.mbTab);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}