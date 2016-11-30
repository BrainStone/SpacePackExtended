package com.space.extended.tileentity;

import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityTresor extends TileEntity {

	public InventoryBasic inventory;

	public TileEntityTresor() {
		inventory = new InventoryBasic("InventoryTresor", false, 15);
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);

		NBTTagList list = new NBTTagList();

		for (int i = 0; i < inventory.getSizeInventory(); i++) {
			if (inventory.getStackInSlot(i) != null) {
				NBTTagCompound tag = new NBTTagCompound();
				tag.setByte("Slot", (byte) i);
				inventory.getStackInSlot(i).writeToNBT(tag);
				list.appendTag(tag);
			}
		}
		compound.setTag("ItemStacks", list);
		return compound;
	}

	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);

		NBTTagList list = compound.getTagList("ItemStacks", 10);
		inventory = new InventoryBasic("InventoryTresor", false, 25);

		for (int i = 0; i < list.tagCount(); i++) {
			NBTTagCompound tag = list.getCompoundTagAt(i);
			byte b = tag.getByte("Slot");
			if ((b >= 0) && (b < inventory.getSizeInventory())) {
				inventory.setInventorySlotContents(b, new ItemStack(tag));
			}
		}
	}
}
