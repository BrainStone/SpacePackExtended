package com.space.extended.basicblocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockKlingonium_Wall1 extends Block {

	public BlockKlingonium_Wall1() {

		super(Material.IRON);
		setHardness(2F);
		setResistance(5F);
		setHarvestLevel("pickaxe", 2);

	}

	private void setStepSound(SoundType metal) {
		setStepSound(SoundType.METAL);

	}

}
