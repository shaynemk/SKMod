package skmod.main.init;

import skmod.blocks.DenseCoalBlock;
import skmod.ores.DenseCoalOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModBlocks {

	public final static Block denseCoalBlock = new DenseCoalBlock(500, Material.rock);
	public final static Block denseCoalOre = new DenseCoalOre(501,Material.rock);
	
	
	public static void init()
	{
		GameRegistry.registerBlock(denseCoalBlock, "denseCoalBlock");
		LanguageRegistry.addName(denseCoalBlock, "Dense Coal Block");
		MinecraftForge.setBlockHarvestLevel(denseCoalBlock, "pickaxe", 2);// 0=wood, 1=stone, 2=iron, 3=diamond

		GameRegistry.registerBlock(denseCoalOre, "denseCoalOre");
		LanguageRegistry.addName(denseCoalOre, "Dense Coal Ore");
		MinecraftForge.setBlockHarvestLevel(denseCoalOre, "pickaxe", 2);
	}
	
	public ModBlocks() {
		
	}

}
