package dinglydell.tfhorsey;

import java.util.List;

import com.bioxx.tfc.WorldGen.TFCBiome;
import com.bioxx.tfc.WorldGen.TFCChunkProviderGenerate;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.biome.BiomeGenBase.SpawnListEntry;

// command to test what animals can spawn in the chunk the player is in, only available to OPs
public class HorseCommand extends CommandBase {

	@Override
	public String getCommandName() {
		// TODO Auto-generated method stub
		return "horse";
	}

	@Override
	public String getCommandUsage(ICommandSender p_71518_1_) {
		// TODO Auto-generated method stub
		return "horse";
	}



	@Override
	public void processCommand(ICommandSender sender, String[] p_71515_2_) {
		int xCoord = sender.getPlayerCoordinates().posX;
		int zCoord = sender.getPlayerCoordinates().posZ;
		TFCBiome biome = (TFCBiome) sender.getEntityWorld().getBiomeGenForCoords(xCoord + 16, zCoord + 16);
		List<SpawnListEntry> spawns = TFCChunkProviderGenerate.getCreatureSpawnsByChunk(sender.getEntityWorld(), biome, xCoord, zCoord);
		sender.addChatMessage(new ChatComponentText("Can spawn: "));
		for(SpawnListEntry spawn : spawns){
			sender.addChatMessage(new ChatComponentText(spawn.minGroupCount + "-" + spawn.maxGroupCount + " " + spawn.entityClass.getTypeName() + " (" + spawn.itemWeight + ")"));
		}


	}

}
