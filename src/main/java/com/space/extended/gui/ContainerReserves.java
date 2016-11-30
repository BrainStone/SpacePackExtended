package com.space.extended.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.inventory.IInventory;

public class ContainerReserves extends ContainerChest {

	public ContainerReserves(IInventory playerInventory, IInventory chestInventory, EntityPlayer player) {
		super(playerInventory, chestInventory, player);

	}

}
