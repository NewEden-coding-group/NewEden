package tk.GryphonModding.NewEden.blocks;

import tk.GryphonModding.NewEden.NETabs;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.creativetab.*;

public class NEBlock extends Block{
	public NEBlock(Material material, String BlockUnlocolizedName, String TextureName) {
		super(material);
		setCreativeTab(NETabs.tabNEBlocks);
		setHardness(1F);
		setBlockTextureName("neweden:"+TextureName); //will setup soon
		setBlockName(BlockUnlocolizedName);
	}
}
