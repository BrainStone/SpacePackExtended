package com.space.extended.basicblocks;

import net.minecraft.block.BlockLadder;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockMetal_Ladder extends BlockLadder {
	public Material getMaterial(IBlockState state) {
		return Material.IRON;
	}

	public MapColor getMapColor(IBlockState state) {
		return getMaterial(state).getMaterialMapColor();
	}
}
