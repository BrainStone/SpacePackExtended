package com.space.extended.basicstairs;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockRoof_Stairs extends BlockStairs {

	public BlockRoof_Stairs() {
		super(Blocks.IRON_BLOCK.getStateFromMeta(0));
		setHardness(2F);
		setResistance(5F);
		this.setLightOpacity(1);
		setHarvestLevel("axe", 1);

	}

	private void setStepSound(SoundType metal) {
		setStepSound(SoundType.METAL);

	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean isFullCube(IBlockState state) {
		return false;
	}

	public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
		return state.isOpaqueCube();
	}

}
