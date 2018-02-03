/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.modbase.registry;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import static net.minecraftforge.fml.common.registry.GameRegistry.addShapedRecipe;

public class ModRecipes {

    public static void init() {
        addShapedRecipes();
    }

    public static void addShapedRecipes() {
        addShapedRecipe(
            new ResourceLocation("example_item_recipe"), new ResourceLocation("examples"),
            new ItemStack(ModItems.exampleItem, 1), "   ", " B ", "   ", 'B', ModBlocks.exampleBlock
        );
    }
}
