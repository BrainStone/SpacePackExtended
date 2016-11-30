package com.space.extended.spaceTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SpaceTab extends CreativeTabs {

	public SpaceTab() {
		super("spacetab");

	}

	@Override
	public ItemStack getTabIconItem() {

		return new ItemStack(Item.getItemFromBlock(Blocks.CRAFTING_TABLE));
	}

	public boolean hasScrollBar() {
		return true;
	}

}
