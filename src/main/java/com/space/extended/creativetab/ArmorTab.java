package com.space.extended.creativetab;

import com.space.extended.items.BasicItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ArmorTab extends CreativeTabs {
	public ArmorTab() {
		super("armortab");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getTabIconItem() {
		return new ItemStack(BasicItems.kit1);
	}
}
