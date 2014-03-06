package tk.GryphonModding.NewEden;

import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.creativetab.*;
import net.minecraft.init.*;
import net.minecraft.item.*;

public class NETabs {
	//Creative Tabs Here:
	public static CreativeTabs tabNEItems = new NECreativeTab("NewEdenItems");
	public static CreativeTabs tabNEBlocks = new NECreativeTab2("NewEdenBlocks");
}

//Internal Class For Creative Tabs
class NECreativeTab extends CreativeTabs {
	public NECreativeTab(String tabLabel) {
		super(tabLabel);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return NEItems.TemporalTranslocator;
	}
}
//Internal Class for Creative Tabs
class NECreativeTab2 extends CreativeTabs {
	public NECreativeTab2(String tabLabel) {
		super(tabLabel);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return Item.getItemFromBlock(NEBlocks.OreResin);
	}
}