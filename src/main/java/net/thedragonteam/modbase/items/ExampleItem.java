package net.thedragonteam.modbase.items;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.modbase.iface.IModdedItem;
import net.thedragonteam.modbase.items.base.ItemBase;

public class ExampleItem extends ItemBase implements IModdedItem {

    public ExampleItem() {
        super("example_item");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void initModel() {
        this.initModel(0);
    }
}
