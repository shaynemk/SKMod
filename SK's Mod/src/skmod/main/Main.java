package skmod.main;

import skmod.main.init.ModBlocks;
import skmod.main.init.ModItems;
import skmod.main.init.Recipes;
import skmod.main.lib.CommonProxy;
import skmod.main.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Main {
	
	// the instance of mod that Forge uses
	@Instance(Reference.MOD_NAME)
	public static Main instance;
	
	// says where client and server 'proxy' code is loaded.
	@SidedProxy(clientSide=Reference.CLIENTPROXY + "ClientProxy", serverSide=Reference.COMMONPROXY + "CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// stub method
	}
	
	// where you add recipes and items/blocks
	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
		
		// == Load blocks/items ==
		ModBlocks.init();
		ModItems.init();

		// == Load Recipes == 
		Recipes.Shaped.init();
		Recipes.Shapeless.init();
		Recipes.Smelting.init();
		
		
	}
	
	@EventHandler
	public void preInit(FMLPostInitializationEvent event) {
		// stub method
	}
}