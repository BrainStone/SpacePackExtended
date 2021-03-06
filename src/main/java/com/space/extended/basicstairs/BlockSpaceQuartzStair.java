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

public class BlockSpaceQuartzStair extends BlockStairs {
	protected BlockSpaceQuartzStair() {
		super(Blocks.STONE_STAIRS.getDefaultState());
		setHardness(2F);
		setResistance(2F);
		setHarvestLevel("axe", 1);
		setLightOpacity(1);
		setSoundType(SoundType.STONE);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
		return false;
	}
}
