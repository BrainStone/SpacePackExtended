package com.space.extended.basicblocks;

import com.space.extended.SpaceextendedSoundEvents;
import com.space.extended.items.BasicItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockGlassDoor extends BlockCustomDoor {

	public BlockGlassDoor() {
		super(Material.IRON);
		setHardness(3);
		setResistance(20);
		blockSoundType = SoundType.GLASS;
	}

	@Override
	protected Item getItem() {
		return BasicItems.glass_door;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}

	@Override
	protected SoundEvent getOpenSound() {
		return SpaceextendedSoundEvents.GLASSDOOR_OPEN;
	}

	@Override
	protected SoundEvent getCloseSound() {
		return SpaceextendedSoundEvents.GLASSDOOR_CLOSE;
	}
}
