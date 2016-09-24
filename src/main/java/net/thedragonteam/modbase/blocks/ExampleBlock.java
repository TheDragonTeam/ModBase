package net.thedragonteam.modbase.blocks;

import net.minecraft.block.material.Material;
import net.thedragonteam.modbase.ModBase;
import net.thedragonteam.modbase.blocks.base.BaseBlock;

public class ExampleBlock extends BaseBlock {

    public ExampleBlock() {
        super(Material.WOOD, "example_block");
        setCreativeTab(ModBase.mbTab);
    }
}
