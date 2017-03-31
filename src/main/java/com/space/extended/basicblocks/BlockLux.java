package com.space.extended.basicblocks;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockLux extends Block {

	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	protected static final AxisAlignedBB AABB_NORTH = new AxisAlignedBB(0.25D, 0.25D, 0.75D, 0.75D, 0.75D, 1.0D);
	protected static final AxisAlignedBB AABB_SOUTH = new AxisAlignedBB(0.25D, 0.25D, 0.0D, 0.75D, 0.75D, 0.25D);
	protected static final AxisAlignedBB AABB_WEST = new AxisAlignedBB(0.75D, 0.25D, 0.25D, 1.0D, 0.75D, 0.75D);
	protected static final AxisAlignedBB AABB_EAST = new AxisAlignedBB(0.0D, 0.25D, 0.25D, 0.25D, 0.75D, 0.75D);

	public BlockLux() {

		super(Material.GLASS);
		setHardness(2F);
		setResistance(5F);
		this.setHarvestLevel("axe", 2);
		setLightLevel(1F);
		setLightOpacity(130);
		setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
	}

	public IBlockState getStateForEntityRender(IBlockState state) {
		return getDefaultState().withProperty(FACING, EnumFacing.SOUTH);
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		switch (state.getValue(FACING)) {
		case NORTH:
		default:
			return AABB_NORTH;
		case SOUTH:
			return AABB_SOUTH;
		case WEST:
			return AABB_WEST;
		case EAST:
			return AABB_EAST;
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
			float hitZ, int meta, EntityLivingBase placer, EnumHand hand) {
		return getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
	}

	public boolean isOpaqueCube() {
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
}
