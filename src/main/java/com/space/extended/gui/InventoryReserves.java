package com.space.extended.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.common.util.Constants;

public class InventoryReserves extends InventoryBasic {

	private final ItemStack stack;

	public InventoryReserves(ItemStack stack) {
		super("Reserves", false, 27);
		this.stack = stack;

	}

	@Override
	public void openInventory(EntityPlayer player) {
		readFromNBT();
		super.openInventory(player);
	}

	@Override
	public void closeInventory(EntityPlayer player) {
		writeTONBT();
		super.closeInventory(player);
	}

	@Override
	public void markDirty() {
		writeTONBT();
		super.markDirty();
	}

	public void writeTONBT() {
		NBTTagCompound tag = stack.getTagCompound();
		if (tag == null) {
			tag = new NBTTagCompound();
			stack.setTagCompound(tag);
		}
		NBTTagList list = new NBTTagList();

		for (int i = 0; i < getSizeInventory(); i++) {
			ItemStack stack = getStackInSlot(i);

			if (stack != null) {
				NBTTagCompound slotTag = new NBTTagCompound();
				slotTag.setInteger("slotIndex", i);
				stack.writeToNBT(slotTag);
				list.appendTag(slotTag);
			}
		}
		tag.setTag("inventory", list);
	}

	public void readFromNBT() {
		NBTTagCompound tag = stack.getTagCompound();
		if (tag == null) {
			writeTONBT();
			return;
		}
		NBTTagList list = tag.getTagList("inventory", Constants.NBT.TAG_COMPOUND);
		if (list == null) {
			writeTONBT();
			return;
		}
		for (int i = 0; i < list.tagCount(); i++) {
			NBTTagCompound slotTag = list.getCompoundTagAt(i);
			int index = slotTag.getInteger("slotIndex");
			ItemStack stack = new ItemStack(slotTag);
			setInventorySlotContents(index, stack);
		}
	}

}
