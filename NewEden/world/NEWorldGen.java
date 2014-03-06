package tk.GryphonModding.NewEden.world;

import java.util.Random;

import tk.GryphonModding.NewEden.NEBlocks;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class NEWorldGen implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case 0:
				generateSurface(world, random, chunkX * 16, chunkZ * 16);
		}
	}
	private void generateSurface(World world, Random random, int BlockX, int BlockZ) {
		for (int i = 0; i < 120; i++) {
			int Xcoord = BlockX + random.nextInt(16);
			int Zcoord = BlockZ + random.nextInt(16);
			int Ycoord = random.nextInt(100);
			(new WorldGenMinable(NEBlocks.OreResin, 8)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for (int i = 0; i < 120; i++) {
			int Xcoord = BlockX + random.nextInt(16);
			int Zcoord = BlockZ + random.nextInt(16);
			int Ycoord = random.nextInt(42);
			(new WorldGenMinable(NEBlocks.OreAlumite, 6)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for (int i = 0; i < 120; i++) {
			int Xcoord = BlockX + random.nextInt(16);
			int Zcoord = BlockZ + random.nextInt(16);
			int Ycoord = random.nextInt(36);
			(new WorldGenMinable(NEBlocks.OreArite, 9)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
	}
		
  public static void Register() {
		  GameRegistry.registerWorldGenerator(worldGen, 1);
		 }

		 public static NEWorldGen worldGen = new NEWorldGen();

}
