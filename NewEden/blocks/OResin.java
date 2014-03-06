package tk.GryphonModding.NewEden.blocks;

import java.util.Random;

import tk.GryphonModding.NewEden.NEItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class OResin extends NEBlock{

	public OResin(Material material, String BlockUnlocolizedName,
			String TextureName) {
		super(material, BlockUnlocolizedName, TextureName);
		
	}
	@Override
	public Item getItemDropped(int p_149650_1_, Random random, int fortuneLevel){
		  return NEItems.Resin;
		 }
    public int quantityDropped(Random par1Random){
		        return 2;
		    }

}
