package net.thedragonteam.modbase.blocks;

import net.minecraft.block.material.Material;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.modbase.ModBase;
import net.thedragonteam.modbase.blocks.base.BaseBlock;
import net.thedragonteam.modbase.iface.IModdedBlock;

public class ExampleBlock extends BaseBlock implements IModdedBlock {

    public ExampleBlock() {
        super(Material.WOOD, "example_block");
        this.setCreativeTab(ModBase.mbTab);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void initModel() {
        this.initModel(0);
    }
}
