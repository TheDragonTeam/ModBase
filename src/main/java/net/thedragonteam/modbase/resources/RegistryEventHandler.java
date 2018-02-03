package net.thedragonteam.modbase.resources;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static net.thedragonteam.modbase.ModBase.MODID;
import static net.thedragonteam.modbase.registry.ModBlocks.exampleBlock;
import static net.thedragonteam.modbase.registry.ModItems.exampleItem;

@EventBusSubscriber(modid = MODID)
public class RegistryEventHandler {

    @SubscribeEvent
    public static void registerBlocks(Register<Block> event) {
        event.getRegistry().register(exampleBlock);
    }

    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        event.getRegistry().register(new ItemBlock(exampleBlock) {{
            if (exampleBlock.getRegistryName() != null) {
                setRegistryName(exampleBlock.getRegistryName());
            }
        }});
        event.getRegistry().register(exampleItem);
    }


}
