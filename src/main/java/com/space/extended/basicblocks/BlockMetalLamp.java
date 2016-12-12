package com.space.extended.basicblocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockMetalLamp extends Block {
	private final boolean isOn;

	public BlockMetalLamp(boolean isOn) {
		super(Material.REDSTONE_LIGHT);
		this.isOn = isOn;

		if (isOn) {
			setLightLevel(1.0F);
		}
	}

	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
		if (!worldIn.isRemote) {
			if (isOn && !worldIn.isBlockPowered(pos)) {
				worldIn.setBlockState(pos, BasicBlocks.metal_lamp.getDefaultState(), 2);
			} else if (!isOn && worldIn.isBlockPowered(pos)) {
				worldIn.setBlockState(pos, BasicBlocks.metal_lamp_lit.getDefaultState(), 2);
			}
		}
	}

	@Override
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
		if (!worldIn.isRemote) {
			if (isOn && !worldIn.isBlockPowered(pos)) {
				worldIn.scheduleUpdate(pos, this, 4);
			} else if (!isOn && worldIn.isBlockPowered(pos)) {
				worldIn.setBlockState(pos, BasicBlocks.metal_lamp_lit.getDefaultState(), 2);
			}
		}
	}

	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		if (!worldIn.isRemote) {
			if (isOn && !worldIn.isBlockPowered(pos)) {
				worldIn.setBlockState(pos, BasicBlocks.metal_lamp.getDefaultState(), 2);
			}
		}
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(BasicBlocks.metal_lamp);
	}

	@Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
		return new ItemStack(BasicBlocks.metal_lamp);
	}

	@Override
	protected ItemStack getSilkTouchDrop(IBlockState state) {
		return new ItemStack(BasicBlocks.metal_lamp);
	}
}
