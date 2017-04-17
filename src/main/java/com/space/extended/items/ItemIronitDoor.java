package com.space.extended.items;

import com.space.extended.SpaceExtendedMain;
import com.space.extended.basicblocks.BasicBlocks;

import net.minecraft.item.ItemDoor;

public class ItemIronitDoor extends ItemDoor {
	
	public ItemIronitDoor() {
		super(BasicBlocks.ironit_door);
		setCreativeTab(SpaceExtendedMain.furnitureTab);
	}

}
