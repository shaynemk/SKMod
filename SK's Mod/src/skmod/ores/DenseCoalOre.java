package skmod.ores;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import skmod.main.init.ModItems;
import skmod.main.lib.CreativeTab;

public class DenseCoalOre extends Block {

	public DenseCoalOre(int id, Material material) {
		super(id, material);
		
		setHardness(4.0f);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("CompressedCoalOre");
		setCreativeTab(CreativeTab.SKMOD_TAB);
		
	}
	
	public int idDropped(int metadata, Random random, int fortune) {
		return ModItems.denseCoalShard.itemID;
	}

}
