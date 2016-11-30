package com.space.extended.basicstairs;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Block_Space_QuartzB extends BlockStairs {

	protected Block_Space_QuartzB() {
		super(Blocks.STONE_STAIRS.getStateFromMeta(0));
		setHardness(2F);
		setResistance(2F);
		setHarvestLevel("axe", 1);
		this.setLightOpacity(1);
	}

	private void setStepSound(SoundType stone) {
		setStepSound(SoundType.STONE);

	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@SideOnly(Side.CLIENT)
	public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
		return false;
	}
		
	}


