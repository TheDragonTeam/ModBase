/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.modbase.registry;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.modbase.blocks.ExampleBlock;

public class ModBlocks {

    public static Block exmpleBlock;

    public static void init() {
        exmpleBlock = new ExampleBlock().setRegistryName("example_block");
    }

    public static void register() {
        registerBlock(exmpleBlock);
    }

    public static void registerRenders() {
        registerRender(exmpleBlock);
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
