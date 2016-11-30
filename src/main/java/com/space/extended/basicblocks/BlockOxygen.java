package com.space.extended.basicblocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockOxygen extends Block {

	public BlockOxygen() {

		super(Material.IRON);
		setHardness(2F);
		setResistance(5F);
		setHarvestLevel("axe", 2);

	}
}