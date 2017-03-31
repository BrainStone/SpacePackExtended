package com.space.extended.basicstairs;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.init.Blocks;

public class BlockConcreteStairs extends BlockStairs {
	public BlockConcreteStairs() {
		super(Blocks.IRON_BLOCK.getDefaultState());
		setHardness(2F);
		setResistance(5F);
		setHarvestLevel("axe", 2);
		setSoundType(SoundType.STONE);
	}

}
