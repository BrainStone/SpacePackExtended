package com.space.extended.basicblocks;

import java.util.Random;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class BlockVitallium_Slab extends BlockSlab {
	public static final PropertyEnum<Variant> VARIANT = PropertyEnum.<Variant>create("variant", Variant.class);

	public BlockVitallium_Slab() {
		super(Material.IRON);
		useNeighborBrightness = true;
		IBlockState state = blockState.getBaseState();

		if (!isDouble()) {
			state.withProperty(HALF, EnumBlockHalf.BOTTOM);
			setDefaultState(state);
		}
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(BasicBlocks.vitallium_slab_half);
	}

	@Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
		return new ItemStack(BasicBlocks.vitallium_slab_half);
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		IBlockState iblockstate = getDefaultState().withProperty(VARIANT, Variant.DEFAULT);

		if (!isDouble()) {
			iblockstate = iblockstate.withProperty(HALF,
					(meta & 8) == 0 ? BlockSlab.EnumBlockHalf.BOTTOM : BlockSlab.EnumBlockHalf.TOP);
		}

		return iblockstate;
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		int i = 0;

		if (!isDouble() && (state.getValue(HALF) == BlockSlab.EnumBlockHalf.TOP)) {
			i |= 8;
		}

		return i;
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return isDouble() ? new BlockStateContainer(this, new IProperty[] { VARIANT })
				: new BlockStateContainer(this, new IProperty[] { HALF, VARIANT });
	}

	@Override
	public String getUnlocalizedName(int meta) {
		return super.getUnlocalizedName();
	}

	@Override
	public IProperty<?> getVariantProperty() {
		return VARIANT;
	}

	@Override
	public Comparable<?> getTypeForItem(ItemStack stack) {
		return Variant.DEFAULT;
	}

	public static class Double extends BlockVitallium_Slab {
		@Override
		public boolean isDouble() {
			return true;
		}
	}

	public static class Half extends BlockVitallium_Slab {
		@Override
		public boolean isDouble() {
			return false;
		}
	}

	public static enum Variant implements IStringSerializable {
		DEFAULT;

		@Override
		public String getName() {
			return "default";
		}
	}
}
