package com.space.extended.world;

import java.util.Random;

import com.space.extended.basicblocks.BasicBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class BasicWorldgenerater implements IWorldGenerator {

	private void nether(Random random, int x, int z, World world) {
		GenerationUtil.generateOre(BasicBlocks.constructor1.getDefaultState(), Blocks.NETHERRACK, random, x, z, world,
				10, 20, 75, 3, 5);
		GenerationUtil.generateOre(BasicBlocks.constructor2.getDefaultState(), Blocks.NETHERRACK, random, x, z, world,
				10, 25, 74, 3, 4);
		GenerationUtil.generateOre(BasicBlocks.constructor3.getDefaultState(), Blocks.NETHERRACK, random, x, z, world,
				10, 35, 84, 3, 4);
		GenerationUtil.generateOre(BasicBlocks.constructor4.getDefaultState(), Blocks.NETHERRACK, random, x, z, world,
				10, 45, 94, 3, 4);
		GenerationUtil.generateOre(BasicBlocks.constructor5.getDefaultState(), Blocks.NETHERRACK, random, x, z, world,
				10, 35, 70, 3, 5);
	}

	private void overworld(Random random, int x, int z, World world) {
		GenerationUtil.generateOre(BasicBlocks.vitallium_ore.getDefaultState(), random, x, z, world, 8, 17, 64, 3, 5);
		GenerationUtil.generateOre(BasicBlocks.klingonium_ore.getDefaultState(), random, x, z, world, 7, 30, 64, 3, 4);
		GenerationUtil.generateOre(BasicBlocks.strontenium_ore.getDefaultState(), random, x, z, world, 12, 15, 64, 3,
				6);
		GenerationUtil.generateOre(BasicBlocks.perolit_ore.getDefaultState(), random, x, z, world, 9, 15, 60, 3, 5);
		GenerationUtil.generateOre(BasicBlocks.cyberit_Ore.getDefaultState(), random, x, z, world, 7, 17, 67, 3, 5);
		GenerationUtil.generateOre(BasicBlocks.space_quartz_ore.getDefaultState(), random, x, z, world, 9, 12, 55, 4,
				7);
		GenerationUtil.generateOre(BasicBlocks.ironium_ore.getDefaultState(), random, x, z, world, 3, 23, 75, 2, 4);
	}

	private void end(Random random, int x, int z, World world) {

	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		int x = chunkX * 16;
		int z = chunkZ * 16;
		switch (world.provider.getDimension()) {
		case -1:
			nether(random, x, z, world);
			break;
		case 0:
			overworld(random, x, z, world);
			break;
		case 1:
			end(random, x, z, world);
			break;
		}

	}

}
