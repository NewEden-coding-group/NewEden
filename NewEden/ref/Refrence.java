package tk.GryphonModding.NewEden.ref;

import net.minecraft.client.*;
import net.minecraft.util.*;
import tk.GryphonModding.NewEden.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.*;

public class Refrence {

	public static final String MODID = "neweden";
	
	@Instance(value = Refrence.MODID)
    public static NewEden instance;
	
	@SidedProxy(clientSide="tk.GryphonModding.NewEden.ref.ClientProxy", 
				serverSide="tk.GryphonModding.NewEden.ref.CommonProxy")
    public static CommonProxy proxy;
	
}
