package com.space.extended.basicblocks;

import net.minecraft.item.ItemStack;

public class BlockDouble_Vitallium_Slab extends BlockVitallium_Slab {

	public BlockDouble_Vitallium_Slab() {

		super();
	}

	@Override
	public boolean isDouble() {
		return true;
	}

	@Override
	public Comparable<?> getTypeForItem(ItemStack stack) {
		return null;
	}

}
