package tk.GryphonModding.NewEden;

import tk.GryphonModding.NewEden.items.*;
import net.minecraft.client.*;
import net.minecraft.client.gui.*;
import net.minecraft.entity.player.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.world.*;
import net.minecraftforge.client.event.RenderGameOverlayEvent.*;
import net.minecraftforge.common.*;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.item.*;
import cpw.mods.fml.common.registry.*;

public class NEItems {
	//Items Here:
	public static Item TemporalTranslocator = new TT("TemporalTrans", "TemporalTranslocator");
	public static Item Resin = new NEItem("Resin", "Resin");
	public static Item AlumiteIngot = new NEItem("AlumiteIngot", "AlumiteIngot");
	public static Item AriteIngot = new NEItem("AriteIngot", "AriteIngot");

	//Foods!
	public static Item ExampleFood = new NEFood(2, true, "something", "ExampleFood");
	
	// Register Items In Game
	public static void RegisterItems(){

		RI(ExampleFood, "ExampleFood");
		RI(TemporalTranslocator, "TemporalTranslocator");
		RI(Resin, "Resin");
		RI(AlumiteIngot, "AlumiteIngot");
		RI(AriteIngot, "AriteIngot");
	}
	
	//Arguments that you have nothing to do with them!
	private static void RI(Item item, String name){
		GameRegistry.registerItem(item, name);
	}
}
