package skmod.items;

import net.minecraft.item.Item;
import skmod.main.lib.CreativeTab;

public class DenseCoalShard extends Item {

	public DenseCoalShard(int id) {
		super(id);
		
		setMaxStackSize(64);
		setCreativeTab(CreativeTab.SKMOD_TAB);
		setUnlocalizedName("denseCoalShard");
		
	}

}
