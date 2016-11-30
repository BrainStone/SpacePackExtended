package com.space.extended.items;

import com.space.extended.SpaceExtendedMain;
import com.space.extended.gui.InventoryReserves;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemReserves extends Item {

	public ItemReserves() {
		super();
	}

	@Override
	public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
		super.onCreated(stack, worldIn, playerIn);
		new InventoryReserves(stack);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn,
			EnumHand hand) {
		if (!worldIn.isRemote) {
			playerIn.openGui(SpaceExtendedMain.INSTANCE, SpaceExtendedMain.RESERVESGUIID, worldIn, 0, 0, 0);

		}

		return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
	}
}
