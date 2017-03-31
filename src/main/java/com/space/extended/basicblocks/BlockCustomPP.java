package com.space.extended.basicblocks;

import com.space.extended.SpaceExtendedMain;

import net.minecraft.block.BlockPressurePlateWeighted;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockCustomPP extends BlockPressurePlateWeighted {

	public BlockCustomPP() {
		super(Material.IRON, 10);
		setHardness(3);
		setResistance(20);
		setCreativeTab(SpaceExtendedMain.spaceTab);
	}

	@Override
	protected int computeRedstoneStrength(World worldIn, BlockPos pos) {
		return super.computeRedstoneStrength(worldIn, pos);
	}

	@Override
	protected void playClickOffSound(World worldIn, BlockPos pos) {
		super.playClickOffSound(worldIn, pos);
	}

	@Override
	protected void playClickOnSound(World worldIn, BlockPos color) {
		super.playClickOnSound(worldIn, color);
	}
}
