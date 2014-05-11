package skmod.main.lib;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import skmod.main.init.ModBlocks;
import skmod.main.init.ModItems;

public class ItemStacks {

	// Vanilla
	public static final ItemStack coalBlockSingle = new ItemStack(Block.coalBlock);
	public static final ItemStack coalBlockHalfStack = new ItemStack(Block.coalBlock, 32);
	public static final ItemStack dirtStack = new ItemStack(Block.dirt, 64);
	public static final ItemStack stoneStack = new ItemStack(Block.stone, 64);
	public static final ItemStack stoneSingle = new ItemStack(Block.stone);
	public static final ItemStack diamondSingle = new ItemStack(Item.diamond);
	public static final ItemStack diamondBlockSingle = new ItemStack(Block.blockDiamond);
	
	// Mine
	public static final ItemStack denseCoalBlockSingle = new ItemStack(ModBlocks.denseCoalBlock);
	public static final ItemStack denseCoalShardSingle = new ItemStack(ModItems.denseCoalShard);
	public static final ItemStack denseCoalChunkSingle = new ItemStack(ModItems.denseCoalChunk);
	
	

}
