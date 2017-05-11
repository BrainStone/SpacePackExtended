package com.space.extended.basicblocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockIronitGlassPane extends BlockPane {

	private boolean ignoreSimilarity = true;

	public BlockIronitGlassPane(Material materialIn, boolean canDrop) {

		super(materialIn, canDrop);
		setHardness(0.3F);
		setResistance(1.5F);
		blockSoundType = SoundType.GLASS;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos,
			EnumFacing side) {
		IBlockState iblockstate = blockAccess.getBlockState(pos.offset(side));
		Block block = iblockstate.getBlock();

		if ((this == Blocks.GLASS) || (this == Blocks.GLASS_PANE)) {
			if (blockState != iblockstate)
				return true;

			if (block == this)
				return false;
		}

		return !ignoreSimilarity && (block == this) ? false
				: super.shouldSideBeRendered(blockState, blockAccess, pos, side);
	}

	@Override
	protected boolean canSilkHarvest() {
		return true;
	}

}
