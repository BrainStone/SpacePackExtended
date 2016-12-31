package com.space.extended.basicblocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSpaceQuartzA extends Block {
	public BlockSpaceQuartzA() {
		super(Material.ROCK);
		setHardness(2F);
		setResistance(5F);
		setHarvestLevel("pickaxe", 2);
	}
}
