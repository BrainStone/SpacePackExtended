package com.space.extended.items;

import com.space.extended.SpaceExtendedMain;
import com.space.extended.basicblocks.BasicBlocks;

import net.minecraft.item.ItemDoor;

public class ItemMetalFrameDoor extends ItemDoor {
	
	public ItemMetalFrameDoor() {
		super(BasicBlocks.metalframe_door);
		setCreativeTab(SpaceExtendedMain.furnitureTab);
	}

}
