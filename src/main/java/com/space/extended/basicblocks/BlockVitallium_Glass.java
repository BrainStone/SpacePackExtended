package com.space.extended.basicblocks;

import java.util.Random;

import net.minecraft.block.BlockBreakable;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockVitallium_Glass extends BlockBreakable {

	public BlockVitallium_Glass(Material materialIn, boolean ignoreSimilarityIn) {

		super(materialIn, ignoreSimilarityIn);
		this.blockSoundType = SoundType.GLASS;
		setHardness(0.3F);
		setResistance(1.5F);
	}

	public int quantityDropped(Random random) {
		return 0;
	}

	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}

	public boolean isFullCube(IBlockState state) {
		return true;
	}

	protected boolean canSilkHarvest() {
		return true;
	}

}
