package com.space.extended.basicblocks;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockCellarLamp extends Block {

	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

	private final boolean isOn;

	public BlockCellarLamp(boolean isOn) {
		super(Material.REDSTONE_LIGHT);
		setHardness(2F);
		setResistance(5F);
		this.setHarvestLevel("axe", 2);
		setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		this.isOn = isOn;

		if (isOn) {
			setLightLevel(1.0F);
		}
	}

	@Override
	@Nullable
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
		return NULL_AABB;
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		EnumFacing enumFacing = EnumFacing.getFront(meta);

		if (enumFacing.getAxis() == EnumFacing.Axis.Y) {
			enumFacing = EnumFacing.NORTH;
		}
		return getDefaultState().withProperty(FACING, enumFacing);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(FACING).getIndex();
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { FACING });
	}

	@Override
	public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY,
			float hitZ, int meta, EntityLivingBase placer) {
		if (canPlaceAt(worldIn, pos, facing))
			return getDefaultState().withProperty(FACING, facing);
		else {
			for (EnumFacing enumfacing : EnumFacing.Plane.HORIZONTAL) {
				if (canPlaceAt(worldIn, pos, enumfacing))
					return getDefaultState().withProperty(FACING, enumfacing);
			}

			return getDefaultState();
		}
	}

	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
		if (!worldIn.isRemote) {
			if (!checkForDrop(worldIn, pos, state))
				return;

			if (isOn && !worldIn.isBlockPowered(pos)) {
				worldIn.setBlockState(pos, BasicBlocks.cellar_lamp.getDefaultState().withProperty(FACING,
						worldIn.getBlockState(pos).getValue(FACING)), 2);
			} else if (!isOn && worldIn.isBlockPowered(pos)) {
				worldIn.setBlockState(pos, BasicBlocks.cellar_lamp_lit.getDefaultState().withProperty(FACING,
						worldIn.getBlockState(pos).getValue(FACING)), 2);
			}
		}
	}

	@Override
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
		if (!worldIn.isRemote) {
			if (!checkForDrop(worldIn, pos, state))
				return;

			if (isOn && !worldIn.isBlockPowered(pos)) {
				worldIn.scheduleUpdate(pos, this, 4);
			} else if (!isOn && worldIn.isBlockPowered(pos)) {
				worldIn.setBlockState(pos, BasicBlocks.cellar_lamp_lit.getDefaultState().withProperty(FACING,
						worldIn.getBlockState(pos).getValue(FACING)), 2);
			}
		}
	}

	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		if (!worldIn.isRemote) {
			if (isOn && !worldIn.isBlockPowered(pos)) {
				worldIn.setBlockState(pos, BasicBlocks.cellar_lamp.getDefaultState().withProperty(FACING,
						worldIn.getBlockState(pos).getValue(FACING)), 2);
			}
		}
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(BasicBlocks.cellar_lamp);
	}

	@Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
		return new ItemStack(BasicBlocks.cellar_lamp);
	}

	@Override
	protected ItemStack getSilkTouchDrop(IBlockState state) {
		return new ItemStack(BasicBlocks.cellar_lamp);
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
		return false;
	}

	private boolean canPlaceAt(World worldIn, BlockPos pos, EnumFacing facing) {
		BlockPos blockpos = pos.offset(facing.getOpposite());
		return facing.getAxis().isHorizontal() && worldIn.isSideSolid(blockpos, facing, true);
	}

	@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
		for (EnumFacing enumfacing : FACING.getAllowedValues()) {
			if (canPlaceAt(worldIn, pos, enumfacing))
				return true;
		}

		return false;
	}

	protected boolean checkForDrop(World worldIn, BlockPos pos, IBlockState state) {
		if ((state.getBlock() == this) && canPlaceAt(worldIn, pos, state.getValue(FACING)))
			return true;
		else {
			if (worldIn.getBlockState(pos).getBlock() == this) {
				dropBlockAsItem(worldIn, pos, BasicBlocks.cellar_lamp.getDefaultState(), 0);
				worldIn.setBlockToAir(pos);
			}

			return false;
		}
	}

}
