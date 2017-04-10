package com.space.extended.basicblocks;

import com.space.extended.items.BasicItems;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockVitalliumDoor extends BlockCustomDoor {
	public BlockVitalliumDoor() {
		super(Material.WOOD);
		setHardness(3);
		setResistance(20);
	}

	@Override
	protected Item getItem() {
		return BasicItems.vitallium_door;
	}
}
