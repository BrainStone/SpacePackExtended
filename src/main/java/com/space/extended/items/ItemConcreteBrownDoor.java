package com.space.extended.items;

import com.space.extended.SpaceExtendedMain;
import com.space.extended.basicblocks.BasicBlocks;

import net.minecraft.item.ItemDoor;

public class ItemConcreteBrownDoor extends ItemDoor {

	public ItemConcreteBrownDoor() {
		super(BasicBlocks.concrete_brown_door);
		setCreativeTab(SpaceExtendedMain.furnitureTab);
	}

}
