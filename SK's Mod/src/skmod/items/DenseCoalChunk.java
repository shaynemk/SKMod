package skmod.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import skmod.main.lib.CreativeTab;

public class DenseCoalChunk extends Item {

	public DenseCoalChunk(int id) {
		super(id);
		
		setMaxStackSize(64);
		setCreativeTab(CreativeTab.SKMOD_TAB);
		setUnlocalizedName("denseCoalChunk");
		
	}

	// interact upon right click. function has been named, not sure what its supposed to be now.
	/*@Override
	public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase target){
		if(!target.worldObj.isRemote){
			if(target instanceof EntityPlayer){
				target.motionX = .5;
			} else {
				player.addChatMessage("Boo!");
			}
		}
	}*/
}
