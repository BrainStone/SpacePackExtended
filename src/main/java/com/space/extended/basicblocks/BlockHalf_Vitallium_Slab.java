package com.space.extended.basicblocks;

import net.minecraft.item.ItemStack;

public class BlockHalf_Vitallium_Slab extends BlockVitallium_Slab{
	
	
	public BlockHalf_Vitallium_Slab()
	{
		super();
	}
	
	@Override
	public boolean isDouble() {
		return false;
	}

	@Override
	public Comparable<?> getTypeForItem(ItemStack stack) {
		return null;
	}


}
