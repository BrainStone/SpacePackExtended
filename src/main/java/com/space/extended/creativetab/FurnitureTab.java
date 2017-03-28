package com.space.extended.creativetab;

import com.space.extended.basicstairs.BasicStairs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FurnitureTab extends CreativeTabs {
	public FurnitureTab() {
		super("furnituretab");
	}
	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getTabIconItem() {
		return new ItemStack(BasicStairs.officechair_stairs);
	}

}
