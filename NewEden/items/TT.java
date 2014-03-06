package tk.GryphonModding.NewEden.items;

import net.minecraft.client.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.potion.*;
import net.minecraft.world.*;
import tk.GryphonModding.NewEden.*;

public class TT extends Item {
	public TT(String TextureName, String UnlocolizedName) {
		super();
		this.setCreativeTab(NETabs.tabNEItems);
		this.setMaxStackSize(64);
		this.setTextureName("neweden:" + TextureName);
		this.setUnlocalizedName(UnlocolizedName);

	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
	{
		player.playSound("mob.wither.death", 10, 10);
		Minecraft.getMinecraft().gameSettings.gammaSetting = 0;
		Minecraft.getMinecraft().gameSettings.renderDistanceChunks = 1;
		player.addPotionEffect(new PotionEffect(Potion.blindness.id, 200, 1));
		
		return itemStack;
	}
	
}
