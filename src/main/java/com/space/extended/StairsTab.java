package com.space.extended;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class StairsTab extends CreativeTabs {

	public StairsTab() {

		super("stairstab");

	}

	@Override
	public ItemStack getTabIconItem() {

		return new ItemStack(Item.getItemFromBlock(Blocks.STONE_STAIRS));
	}

	public boolean hasScrollBar() {
		return true;
	}
}
