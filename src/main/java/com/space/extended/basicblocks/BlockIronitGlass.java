package com.space.extended.basicblocks;

import java.util.Random;

import net.minecraft.block.BlockBreakable;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockIronitGlass extends BlockBreakable {

	public BlockIronitGlass(Material materialIn, boolean ignoreSimilarityIn) {

		super(materialIn, ignoreSimilarityIn);
		blockSoundType = SoundType.GLASS;
		setHardness(0.3F);
		setResistance(1.5F);
	}

	@Override
	public int quantityDropped(Random random) {
		return 0;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return true;
	}

	@Override
	protected boolean canSilkHarvest() {
		return true;
	}

}
