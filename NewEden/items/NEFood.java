package tk.GryphonModding.NewEden.items;

import tk.GryphonModding.NewEden.*;
import net.minecraft.creativetab.*;
import net.minecraft.item.*;

public class NEFood extends ItemFood{
	public NEFood(int FeedAmout, boolean TrueOrFalse, String TextureName, String UnlocolizedName) {
		super(FeedAmout, TrueOrFalse);
		this.setAlwaysEdible();
		this.setCreativeTab(NETabs.tabNEItems);
		this.setTextureName("neweden:"+TextureName);
		this.setUnlocalizedName(UnlocolizedName);
	}
}
