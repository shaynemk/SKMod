package skmod.main.init;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import skmod.items.*;

public class ModItems
{

	public final static Item denseCoalChunk = new DenseCoalChunk(502);
	public final static Item denseCoalShard = new DenseCoalShard(503);
	
	public static void init() 
	{
		GameRegistry.registerItem(denseCoalChunk, "denseCoalChunk");
		LanguageRegistry.addName(denseCoalChunk, "Dense Coal Chunk");
		GameRegistry.registerItem(denseCoalShard, "denseCoalShard");
		LanguageRegistry.addName(denseCoalShard, "Dense Coal Shard");
	}
}
