package com.space.extended.basicblocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockStrontopalA extends Block {

	public BlockStrontopalA() {

		super(Material.WOOD);
		setHardness(2F);
		setResistance(1F);
		setHarvestLevel("axe", 2);
		this.setLightOpacity(1);
	}

	private void setStepSound(SoundType metal) {
		setStepSound(SoundType.WOOD);

	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean isFullCube(IBlockState state) {
		return true;
	}

	public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
		return false;
	}
}
