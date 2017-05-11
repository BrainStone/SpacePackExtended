package com.space.extended.items;

import com.space.extended.SpaceExtendedMain;
import com.space.extended.basicblocks.BasicBlocks;

import net.minecraft.item.ItemDoor;

public class ItemGlassDoor extends ItemDoor {

	public ItemGlassDoor() {
		super(BasicBlocks.glass_door);
		setCreativeTab(SpaceExtendedMain.furnitureTab);
	}

}
