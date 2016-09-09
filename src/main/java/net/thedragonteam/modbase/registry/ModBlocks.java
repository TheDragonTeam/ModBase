/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.modbase.registry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.modbase.blocks.base.BlockBase;

public class ModBlocks {

    public static Block BLOCK_BASE;

    public static void init() {
        BLOCK_BASE = new BlockBase(Material.WOOD, "block_base").setRegistryName("block_base");
    }

    public static void register() {
        registerBlock(BLOCK_BASE);
    }

    public static void registerRenders() {
        registerRender(BLOCK_BASE);
    }

    public static void registerBlock(Block block) {
        GameRegistry.registerBlock(block, block.getRegistryName().toString());
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
