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

public class BlockMetal1_Stairs extends BlockStairs {
	public BlockMetal1_Stairs() {
		super(Blocks.IRON_BLOCK.getStateFromMeta(0));
		setHardness(2F);
		setResistance(5F);
		setHarvestLevel("axe", 2);
		setLightLevel(1.0F);
		setLightOpacity(1);
		setSoundType(SoundType.METAL);
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
		return state.isOpaqueCube();
	}
}
