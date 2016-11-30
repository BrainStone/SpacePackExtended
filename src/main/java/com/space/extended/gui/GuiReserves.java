package com.space.extended.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.inventory.IInventory;

public class GuiReserves extends GuiChest {
	public GuiReserves(IInventory lowerInv) {
		super(Minecraft.getMinecraft().player.inventory, lowerInv);
	}
}
