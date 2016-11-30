package com.space.extended.basicstairs;

import java.util.Random;

import com.space.extended.items.BasicItems;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockStairsChairMonitorStairs extends BlockStairs {

	public BlockStairsChairMonitorStairs() {
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

	@SideOnly(Side.CLIENT)
	public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
		return state.isOpaqueCube();
	}

}
