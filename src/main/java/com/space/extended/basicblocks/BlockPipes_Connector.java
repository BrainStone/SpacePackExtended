package com.space.extended.basicblocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockPipes_Connector extends Block {
	public BlockPipes_Connector() {
		super(Material.IRON);
		setHardness(2F);
		setResistance(5F);
		setHarvestLevel("axe", 2);
		setSoundType(SoundType.METAL);
	}
}
