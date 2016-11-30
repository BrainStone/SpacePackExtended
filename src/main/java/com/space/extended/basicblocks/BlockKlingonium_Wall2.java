package com.space.extended.basicblocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockKlingonium_Wall2 extends Block {
	public BlockKlingonium_Wall2() {
		super(Material.IRON);
		setHardness(2F);
		setResistance(5F);
		setHarvestLevel("pickaxe", 2);
		setSoundType(SoundType.METAL);
	}
}
