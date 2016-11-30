package com.space.extended.basicblocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockStrontenium2 extends Block {
	public BlockStrontenium2() {
		super(Material.ROCK);
		setHardness(2F);
		setResistance(5F);
		setHarvestLevel("pickaxe", 2);
		setSoundType(SoundType.STONE);
	}
}
