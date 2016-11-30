package com.space.extended.basicblocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockVitallium extends Block {

	public BlockVitallium() {

		super(Material.IRON);
		setHardness(2F);
		setResistance(5F);
		setHarvestLevel("pickaxe", 2);

	}

	private void setStepSound(SoundType metal) {
		setStepSound(SoundType.METAL);

	}


}
