package skmod.main.init;

import net.minecraft.item.Item;
import skmod.main.lib.ItemStacks;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {

	

	public static class Shaped {
		public static void init() {
			
			// coal block to dense coal block
			GameRegistry.addShapedRecipe(ItemStacks.denseCoalBlockSingle, "ccc", "ccc", "ccc", 'c', ItemStacks.coalBlockSingle);
			
			// dense coal block to dense coal chunk
			GameRegistry.addShapedRecipe(ItemStacks.denseCoalChunkSingle, "scs", "ccc", "scs", 's', ItemStacks.stoneSingle, 'c', ItemStacks.denseCoalBlockSingle);
			
			// dense coal shard to dense coal chunk
			GameRegistry.addShapedRecipe(ItemStacks.denseCoalChunkSingle, "ddd", "ddd", "ddd", 'd', ItemStacks.denseCoalShardSingle);
		}
	}
	
	public static class Shapeless {
		public static void init() {
			
		}
	}
	
	public static class Smelting {
		public static void init() {
			// dense coal chunk to diamond
			GameRegistry.addSmelting(ModItems.denseCoalChunk.itemID, ItemStacks.diamondSingle, 5.0f);
		}
	}


}
