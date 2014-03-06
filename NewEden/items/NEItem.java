package tk.GryphonModding.NewEden.items;

import tk.GryphonModding.NewEden.NETabs;
import net.minecraft.client.*;
import net.minecraft.client.gui.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.world.*;
import net.minecraftforge.client.event.RenderGameOverlayEvent.*;
import net.minecraftforge.common.*;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.relauncher.*;

public class NEItem extends Item {
	public NEItem(String TextureName, String UnlocolizedName) {
		super();
		this.setCreativeTab(NETabs.tabNEItems);
		this.setMaxStackSize(64);
		this.setTextureName("neweden:"+TextureName);
		this.setUnlocalizedName(UnlocolizedName);
	}
	public NEItem(String TextureName, String UnlocolizedName, int StackSize) {
		super();
		this.setCreativeTab(NETabs.tabNEItems);
		this.setMaxStackSize(StackSize);
		this.setTextureName("neweden:"+TextureName);
		this.setUnlocalizedName(UnlocolizedName);
	}
	public NEItem(String TextureName, String UnlocolizedName, int StackSize, Boolean HasEffect) {
		super();
		this.setCreativeTab(NETabs.tabNEItems);
		this.setMaxStackSize(StackSize);
		this.setTextureName("neweden:"+TextureName);
		this.setUnlocalizedName(UnlocolizedName);
		if(HasEffect)
			Eff = true;
	}
	@Override
	public boolean hasEffect(ItemStack par1ItemStack){
		return Eff;
	}
	private boolean Eff = false;
}
