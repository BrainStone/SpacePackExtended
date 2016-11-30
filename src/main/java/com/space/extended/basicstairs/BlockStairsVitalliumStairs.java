package com.space.extended.basicstairs;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.init.Blocks;

public class BlockStairsVitalliumStairs extends BlockStairs {

	public BlockStairsVitalliumStairs() {

		super(Blocks.IRON_BLOCK.getStateFromMeta(0));
		setHardness(2F);
		setResistance(5F);
		setHarvestLevel("axe", 2);

	}

	private void setStepSound(SoundType metal) {
		setStepSound(SoundType.METAL);

	}

	public boolean isOpaqueCube() {
		return false;
	}

}
