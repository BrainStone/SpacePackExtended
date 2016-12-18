package com.space.extended.basicblocks;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;

public abstract class BlockVitallium_Slab extends BlockSlab {

	private static final PropertyBool VARIANT = PropertyBool.create("variant");

	public BlockVitallium_Slab() {
		super(Material.IRON);
		useNeighborBrightness = true;
		IBlockState state = blockState.getBaseState();
		state.withProperty(VARIANT, false);
		if (!isDouble()) {
			state.withProperty(HALF, EnumBlockHalf.BOTTOM);
			{

				setDefaultState(state);
			}
		}

	}

	@Override
	public String getUnlocalizedName(int meta) {
		return this.getUnlocalizedName();
	}

	public final Object getVariant(final ItemStack stack) {
		return false;
	}

	@Override
	public IProperty<?> getVariantProperty() {
		return VARIANT;
	}

	@Override
	public int damageDropped(IBlockState state) {
		return 0;
	}

	@Override
	public final IBlockState getStateFromMeta(final int meta) {
		IBlockState blockState = getDefaultState();
		blockState = blockState.withProperty(VARIANT, false);
		if (!isDouble()) {
			EnumBlockHalf value = EnumBlockHalf.BOTTOM;
			if ((meta & 8) != 0) {
				value = EnumBlockHalf.TOP;
			}

			blockState = blockState.withProperty(HALF, value);
		}

		return blockState;
	}

	@Override
	public final int getMetaFromState(final IBlockState state) {
		if (isDouble())
			return 0;

		if (state.getValue(HALF) == EnumBlockHalf.TOP)
			return 8;
		else
			return 0;
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return isDouble() ? new BlockStateContainer(this, new IProperty[] { VARIANT })
				: new BlockStateContainer(this, new IProperty[] { VARIANT, HALF });
	}

}
