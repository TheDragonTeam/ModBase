/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.modbase.blocks.base;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BaseBlock extends Block {

    public BaseBlock(Material material, String name) {
        super(material);
        setUnlocalizedName(name);
    }

    public BaseBlock(Material material, String name, float resistance, float hardness) {
        super(material);
        setUnlocalizedName(name);
        this.setResistance(resistance);
        this.setHardness(hardness);
    }

    public BaseBlock(Material material, String name, float resistance, float hardness, String tool, int harvestLevel) {
        super(material);
        setUnlocalizedName(name);
        this.setResistance(resistance);
        this.setHardness(hardness);
        this.setHarvestLevel(tool, harvestLevel);
    }

    public BaseBlock(Material material, String name, float resistance, float hardness, String tool, int harvestLevel, float lightLevel) {
        super(material);
        setUnlocalizedName(name);
        this.setResistance(resistance);
        this.setHardness(hardness);
        this.setHarvestLevel(tool, harvestLevel);
        this.setLightLevel(lightLevel);
    }
}
