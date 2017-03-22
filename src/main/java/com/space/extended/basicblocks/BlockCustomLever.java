package com.space.extended.basicblocks;

import com.space.extended.SpaceExtendedMain;

import net.minecraft.block.BlockLever;

public class BlockCustomLever extends BlockLever {
	public BlockCustomLever() {
		setCreativeTab(SpaceExtendedMain.spaceTab);
		setHardness(2F);
		setResistance(5F);
		this.setHarvestLevel("axe", 2);
	}
}
