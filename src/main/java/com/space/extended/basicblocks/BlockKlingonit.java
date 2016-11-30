package com.space.extended.basicblocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockKlingonit extends Block {
	public BlockKlingonit() {
		super(Material.IRON);
		setHardness(2F);
		setResistance(5F);
		setHarvestLevel("pickaxe", 2);
		setSoundType(SoundType.METAL);
	}
}
