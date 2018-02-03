package net.thedragonteam.modbase.resources;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static net.thedragonteam.modbase.ModBase.MODID;
import static net.thedragonteam.modbase.registry.ModBlocks.exampleBlock;
import static net.thedragonteam.modbase.registry.ModItems.exampleItem;

@Mod.EventBusSubscriber(modid = MODID, value = Side.CLIENT)
@SideOnly(Side.CLIENT)
public class ModelsEventHandler {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        exampleBlock.initModel();
        exampleItem.initModel();
    }

}
