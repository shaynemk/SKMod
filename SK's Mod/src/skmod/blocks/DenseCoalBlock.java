package skmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import skmod.main.lib.CreativeTab;

public class DenseCoalBlock extends Block {

	public DenseCoalBlock(int id, Material material) {
		super(id, material);
		
		setHardness(1.5F);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("compressedCoalBlock");
		setCreativeTab(CreativeTab.SKMOD_TAB);
	}

}
