package dinglydell.tfhorsey;

import java.util.ArrayList;
import java.util.List;

import com.bioxx.tfc.Entities.Mobs.EntityHorseTFC;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

import net.minecraft.client.Minecraft;
import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.world.ChunkEvent;

public class TFHEventHandler {

	//@SubscribeEvent
	//public void onChunkLoad(ChunkEvent.Load event){
	//	List<Entity> horses = new ArrayList<Entity>();
	//	int x = event.getChunk().xPosition * 16;
	//	int z = event.getChunk().zPosition * 16;
	//	event.getChunk().getEntitiesOfTypeWithinAAAB(EntityHorseTFC.class, AxisAlignedBB.getBoundingBox(x, 120, z, x + 16, 160, z + 16), horses, new IEntitySelector() {
    //
	//		@Override
	//		public boolean isEntityApplicable(Entity p_82704_1_) {
    //
	//			return true;
	//		}
	//	});
	//	if(!horses.isEmpty() && !event.world.isRemote){
	//		for(Object player : event.world.playerEntities){
	//			((EntityPlayerMP) player).addChatMessage(new ChatComponentText(("HORSEYS! " + horses.get(0).posX + ", " + horses.get(0).posZ)));
	//		}
	//	}
	//}


	//this bit does the actual patching
	@SubscribeEvent(priority=EventPriority.HIGH, receiveCanceled=true)
	public void onEntityJoinWorldEvent(EntityJoinWorldEvent event){

		if(event.entity instanceof EntityHorseTFC){
			//for(Object player : event.world.playerEntities){
			////((EntityHorseTFC)event.entity).getHealth();
            //
			//	((EntityPlayer) player).addChatMessage(new ChatComponentText(("horse spawned: " + event.entity.isEntityAlive() + ", cancelled: " + event.isCanceled())));
            //
			//}
			event.setCanceled(false);
		}


	}
}
