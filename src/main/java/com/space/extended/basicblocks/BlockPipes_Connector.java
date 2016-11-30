package com.space.extended.basicblocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

public class BlockPipes_Connector extends Block {

	public BlockPipes_Connector() {

		super(Material.IRON);
		setHardness(2F);
		setResistance(5F);
		setHarvestLevel("axe", 2);
	}

	private void setStepSound(SoundType metal) {
		setStepSound(SoundType.METAL);

	}

}
