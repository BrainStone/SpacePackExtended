package com.space.extended.basicblocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Block_Space_QuartzA extends Block {

	public Block_Space_QuartzA() {
		super(Material.ROCK);
		setHardness(2F);
		setResistance(5F);
		setHarvestLevel("pickaxe", 2);

	}

}
