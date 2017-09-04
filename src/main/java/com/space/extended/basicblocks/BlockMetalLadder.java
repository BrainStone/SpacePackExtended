package com.space.extended.basicblocks;

import net.minecraft.block.BlockLadder;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockMetalLadder extends BlockLadder {
	@Override
	public Material getMaterial(IBlockState state) {
		return Material.IRON;
	}
}
