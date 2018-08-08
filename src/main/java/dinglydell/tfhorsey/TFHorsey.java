package dinglydell.tfhorsey;

import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.FMLEventChannel;

@Mod(modid = TFHorsey.MODID, version = TFHorsey.VERSION)
public class TFHorsey
{
    public static final String MODID = "TFHorsey";
    public static final String VERSION = "1.0";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	MinecraftForge.EVENT_BUS.register(new TFHEventHandler());
    }


   @EventHandler
   public static void init(FMLServerStartingEvent event)
   {
	   event.registerServerCommand(new HorseCommand());
   }
}
