package com.space.extended.items;

import com.space.extended.SpaceExtendedMain;
import com.space.extended.basicblocks.BasicBlocks;

import net.minecraft.item.ItemDoor;

public class ItemVitalliumDoor extends ItemDoor {
	public ItemVitalliumDoor() {
		super(BasicBlocks.vitallium_door);
		setCreativeTab(SpaceExtendedMain.furnitureTab);
	}
}
