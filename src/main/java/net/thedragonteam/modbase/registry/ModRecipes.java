/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.modbase.registry;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void init() {
        addShapedRecipes();
    }

    public static void addShapedRecipes() {
        GameRegistry.addRecipe(new ItemStack(ModItems.exampleItem, 1), "XXX", "XBX", "XXX", 'B', ModBlocks.exampleBlock);
    }
}
