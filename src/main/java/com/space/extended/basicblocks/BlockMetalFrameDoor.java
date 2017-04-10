package com.space.extended.basicblocks;

import com.space.extended.items.BasicItems;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockMetalFrameDoor extends BlockCustomDoor {
	public BlockMetalFrameDoor() {
		super(Material.IRON);
		setHardness(3);
		setResistance(20);
	}

	@Override
	protected Item getItem() {
		return BasicItems.metalframe_door;
	}
}
