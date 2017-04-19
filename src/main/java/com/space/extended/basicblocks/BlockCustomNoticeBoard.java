package com.space.extended.basicblocks;

import com.space.extended.SpaceExtendedMain;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
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

public class BlockCustomNoticeBoard extends Block{
	

	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	protected static final AxisAlignedBB AABB_NORTH = new AxisAlignedBB(0.12D, 0.12D, 0.9D, 0.88D, 0.88D, 1.0D);
	protected static final AxisAlignedBB AABB_SOUTH = new AxisAlignedBB(0.12D, 0.12D, 0.0D, 0.88D, 0.88D, 0.08D);
	protected static final AxisAlignedBB AABB_WEST = new AxisAlignedBB(0.9D, 0.12D, 0.12D, 1.0D, 0.88D, 0.88D);
	protected static final AxisAlignedBB AABB_EAST = new AxisAlignedBB(0.0D, 0.12D, 0.12D, 0.08D, 0.88D, 0.88D);

	public BlockCustomNoticeBoard() {

		super(Material.WOOD);
		blockSoundType = SoundType.WOOD;
		setHardness(2F);
		setResistance(5F);
		this.setHarvestLevel("axe", 1);
		setLightOpacity(1);
		setCreativeTab(SpaceExtendedMain.furnitureTab);
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
