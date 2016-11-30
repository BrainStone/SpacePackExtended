package com.space.extended;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ArmorTab extends CreativeTabs {

	public ArmorTab() {
		super("armortab");

	}

	@Override
	public ItemStack getTabIconItem() {

		return new ItemStack(Item.getItemFromBlock(Blocks.IRON_BLOCK));
	}

	public boolean hasScrollBar() {
		return true;
	}

}
