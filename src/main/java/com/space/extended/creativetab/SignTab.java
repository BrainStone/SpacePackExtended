package com.space.extended.creativetab;

import com.space.extended.basicblocks.BasicBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SignTab extends CreativeTabs{
	
	public SignTab() {
		super("signtab");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getTabIconItem() {
		return new ItemStack(BasicBlocks.notice_board);
	}

}
