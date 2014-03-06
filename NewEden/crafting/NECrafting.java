package tk.GryphonModding.NewEden.crafting;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import tk.GryphonModding.NewEden.NEBlocks;
import tk.GryphonModding.NewEden.NEItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class NECrafting {
	GameRegistry gr = new GameRegistry();
	NEBlocks B = new NEBlocks();
	NEItems I = new NEItems();
	private Object[][] BlockSet;
	
	public NECrafting() {
		SmeltBlocks(B.OreAlumite, new ItemStack(I.AlumiteIngot), 1);
		SmeltBlocks(B.OreResin, new ItemStack(I.Resin), 1);
		SmeltBlocks(B.OreArite, new ItemStack(I.AriteIngot), 1);
	}
	private void SmeltBlocks(Block Input, ItemStack Output, float OutEXP) {
		GameRegistry.addSmelting(Input, Output, OutEXP);
	}
}
