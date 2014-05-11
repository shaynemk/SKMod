package skmod.main.lib;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class CreativeTab
{
    public static final CreativeTabs SKMOD_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        //@Override
        public Item getTabIconItem()
        {
            return Item.diamond;
        }

        //@Override
        @SideOnly(Side.CLIENT)
        public String getTranslatedTabLabel()
        {
            return Reference.MOD_NAME;
        }
    };
}
