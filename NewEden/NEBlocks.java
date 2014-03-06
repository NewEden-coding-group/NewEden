package tk.GryphonModding.NewEden;

import tk.GryphonModding.NewEden.blocks.*;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.item.*;
import net.minecraft.world.*;

public class NEBlocks {
	//blocks here:
	public static Block OreResin = new OResin(Material.rock, "OreResin", "OreResin");
	public static Block OreAlumite = new NEBlock(Material.rock, "OreAlumite", "OreAlumite");
	public static Block OreArite = new NEBlock(Material.rock, "OreArite", "OreArite");
	
	//Register Blocks Here
	public static void RegisterBlocks(){
		RB(OreResin, "OreResin");
		RB(OreAlumite, "OreAlumite");
		RB(OreArite, "OreArite");

	}
	
	//Arguments that you have nothing to do with them!
	private static void RB(Block block, String name){
		GameRegistry.registerBlock(block, name);
	}
}
