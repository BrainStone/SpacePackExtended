package com.space.extended.basicblocks;

import net.minecraft.block.BlockJukebox;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.datafix.FixTypes;
import net.minecraft.util.datafix.walkers.ItemStackData;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockMusicRack extends BlockJukebox {

	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	public static final PropertyBool HAS_RECORD = PropertyBool.create("has_record");
	protected static final AxisAlignedBB AABB_NORTH = new AxisAlignedBB(0.0D, 0.0D, 0.7D, 1.0D, 0.6D, 1.0D);
	protected static final AxisAlignedBB AABB_SOUTH = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.6D, 0.30D);
	protected static final AxisAlignedBB AABB_WEST = new AxisAlignedBB(0.70D, 0.0D, 0.0D, 1.0D, 0.6D, 1.0D);
	protected static final AxisAlignedBB AABB_EAST = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.3D, 0.6D, 1.0D);

	public static void registerFixesJukebox(DataFixer fixer) {
		fixer.registerWalker(FixTypes.BLOCK_ENTITY,
				new ItemStackData(BlockJukebox.TileEntityJukebox.class, new String[] { "RecordItem" }));
	}

	public BlockMusicRack() {

		super();
		blockSoundType = SoundType.WOOD;
		setHardness(2F);
		setResistance(5F);
		setLightOpacity(1);
		this.setHarvestLevel("axe", 2);
		setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		setDefaultState(blockState.getBaseState().withProperty(HAS_RECORD, Boolean.valueOf(false)));
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
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (state.getValue(HAS_RECORD).booleanValue()) {
			dropRecord(worldIn, pos, state);
			state = state.withProperty(HAS_RECORD, Boolean.valueOf(false));
			worldIn.setBlockState(pos, state, 2);
			return true;
		} else
			return false;
	}

	@Override
	public void insertRecord(World worldIn, BlockPos pos, IBlockState state, ItemStack recordStack) {
		if (!worldIn.isRemote) {
			TileEntity tileentity = worldIn.getTileEntity(pos);

			if (tileentity instanceof BlockJukebox.TileEntityJukebox) {
				((BlockJukebox.TileEntityJukebox) tileentity).setRecord(recordStack.copy());
				worldIn.setBlockState(pos, state.withProperty(HAS_RECORD, Boolean.valueOf(true)), 2);
			}
		}
	}

	private void dropRecord(World worldIn, BlockPos pos, IBlockState state) {
		if (!worldIn.isRemote) {
			TileEntity tileentity = worldIn.getTileEntity(pos);

			if (tileentity instanceof BlockJukebox.TileEntityJukebox) {
				BlockJukebox.TileEntityJukebox blockjukebox$tileentityjukebox = (BlockJukebox.TileEntityJukebox) tileentity;
				ItemStack itemstack = blockjukebox$tileentityjukebox.getRecord();

				if (!itemstack.isEmpty()) {
					worldIn.playEvent(1010, pos, 0);
					worldIn.playRecord(pos, (SoundEvent) null);
					blockjukebox$tileentityjukebox.setRecord(ItemStack.EMPTY);
					float f = 0.7F;
					double d0 = worldIn.rand.nextFloat() * 0.7F + 0.15000000596046448D;
					double d1 = worldIn.rand.nextFloat() * 0.7F + 0.06000000238418579D + 0.6D;
					double d2 = worldIn.rand.nextFloat() * 0.7F + 0.15000000596046448D;
					ItemStack itemstack1 = itemstack.copy();
					EntityItem entityitem = new EntityItem(worldIn, pos.getX() + d0, pos.getY() + d1, pos.getZ() + d2,
							itemstack1);
					entityitem.setDefaultPickupDelay();
					worldIn.spawnEntity(entityitem);
				}
			}
		}
	}

	public IBlockState getStateForEntityRender(IBlockState state) {
		return getDefaultState().withProperty(FACING, EnumFacing.SOUTH);
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
		return new BlockStateContainer(this, new IProperty[] { FACING, HAS_RECORD });
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
