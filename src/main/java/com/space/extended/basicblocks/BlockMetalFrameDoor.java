package com.space.extended.basicblocks;

import com.space.extended.SpaceextendedSoundEvents;
import com.space.extended.items.BasicItems;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;

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
	@Override
	protected SoundEvent getOpenSound() {
		return SpaceextendedSoundEvents.METALFRAMEDOOR_OPEN;
	}

	@Override
	protected SoundEvent getCloseSound() {
		return SpaceextendedSoundEvents.METALFRAMEDOOR_CLOSE;
	}
}
