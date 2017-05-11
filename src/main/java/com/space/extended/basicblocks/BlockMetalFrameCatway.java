package com.space.extended.basicblocks;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockMetalFrameCatway extends BlockMetalFrame {
	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	protected static final AxisAlignedBB FRAME_BOTTOM = new AxisAlignedBB(0.0, 0.0, 0.0, 1.0, 1.5 / 16.0, 1.0);
	protected static final AxisAlignedBB[] FRAME_SIDES = { new AxisAlignedBB(0.0, 0.0, 0.0, 1.0, 1.0, 2.0 / 16.0),
			new AxisAlignedBB(14.0 / 16.0, 0.0, 0.0, 1.0, 1.0, 1.0),
			new AxisAlignedBB(0.0, 0.0, 14.0 / 16.0, 1.0, 1.0, 1.0),
			new AxisAlignedBB(0.0, 0.0, 0.0, 2.0 / 16.0, 1.0, 1.0) };
	protected static final AxisAlignedBB[] FRAME_CORNERS = {
			new AxisAlignedBB(0.0, 0.0, 0.0, 2.0 / 16.0, 1.0, 2.0 / 16.0),
			new AxisAlignedBB(14.0 / 16.0, 0.0, 0.0, 1.0, 1.0, 2.0 / 16.0),
			new AxisAlignedBB(0.0, 0.0, 14.0 / 16.0, 2.0 / 16.0, 1.0, 1.0),
			new AxisAlignedBB(14.0 / 16.0, 0.0, 14.0 / 16.0, 1.0, 1.0, 1.0) };

	private final CatwayType type;

	public BlockMetalFrameCatway(CatwayType type) {
		setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		this.type = type;
	}

	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox,
			List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn_, boolean p_185477_7_) {
		int meta = state.getValue(FACING).getHorizontalIndex();

		if (type != CatwayType.POST) {
			addCollisionBoxToList(pos, entityBox, collidingBoxes, FRAME_BOTTOM);
		}

		switch (type) {
		case L:
			addCollisionBoxToList(pos, entityBox, collidingBoxes, FRAME_SIDES[(meta + 3) % 4]);
		case T:
			addCollisionBoxToList(pos, entityBox, collidingBoxes, FRAME_SIDES[meta % 4]);
			break;
		case STRAIGHT:
			addCollisionBoxToList(pos, entityBox, collidingBoxes, FRAME_SIDES[(meta + 3) % 4]);
			addCollisionBoxToList(pos, entityBox, collidingBoxes, FRAME_SIDES[(meta + 1) % 4]);
			break;
		case X:
		case POST:
			for (AxisAlignedBB box : FRAME_CORNERS) {
				addCollisionBoxToList(pos, entityBox, collidingBoxes, box);
			}
			break;
		case ZERO:
		default:
			// Nothing
		}
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
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
		return getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
	}

	public enum CatwayType {
		STRAIGHT, X, T, L, ZERO, POST;
	}
}
