package tk.GryphonModding.NewEden;

import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import tk.GryphonModding.NewEden.ref.*;
import tk.GryphonModding.NewEden.world.NEWorldGen;

@Mod(modid = Refrence.MODID, name = "New Eden", version = "1.0.0")
public class NewEden extends Refrence{

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//the stuff ;)
		NEBlocks B = new NEBlocks();
		B.RegisterBlocks();
		NEItems I = new NEItems();
		I.RegisterItems();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.registerRenderers();
		//nothing here yet!
		NEWorldGen.Register();
	}
}
