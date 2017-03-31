package com.space.extended.creativetab;

import com.space.extended.basicstairs.BasicStairs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class StairsTab extends CreativeTabs {
	public StairsTab() {
		super("stairstab");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getTabIconItem() {
		return new ItemStack(BasicStairs.laboratory_bench);
	}
}
