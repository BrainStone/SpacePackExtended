package com.space.extended.items;

import com.space.extended.SpaceExtendedMain;
import com.space.extended.basicblocks.BasicBlocks;

import net.minecraft.item.ItemDoor;

public class ItemSecretStoneDoor extends ItemDoor {

	public ItemSecretStoneDoor() {
		super(BasicBlocks.secret_stone_door);
		setCreativeTab(SpaceExtendedMain.furnitureTab);
	}

}
