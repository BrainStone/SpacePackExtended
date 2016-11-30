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

public class BlockOfficeChair_Stairs extends BlockStairs {
	public BlockOfficeChair_Stairs() {
		super(Blocks.BIRCH_STAIRS.getStateFromMeta(0));
		setHardness(2F);
		setResistance(5F);
		setLightOpacity(1);
		setHarvestLevel("axe", 1);
		setSoundType(SoundType.WOOD);
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
		return false;
	}

}
