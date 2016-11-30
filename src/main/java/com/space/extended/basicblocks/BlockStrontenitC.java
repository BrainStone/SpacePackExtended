package com.space.extended.basicblocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockStrontenitC extends Block {

	public BlockStrontenitC() {

		super(Material.IRON);
		setHardness(2F);
		setResistance(5F);
		setHarvestLevel("pickaxe", 2);

	}

	private void setStepSound(SoundType metal) {
		setStepSound(SoundType.METAL);

	}

}
