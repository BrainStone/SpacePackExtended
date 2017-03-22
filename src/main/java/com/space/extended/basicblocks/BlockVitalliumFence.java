package com.space.extended.basicblocks;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;

public class BlockVitalliumFence extends BlockFence{

	public BlockVitalliumFence(Material material ) {
		super(Material.IRON, Material.IRON.getMaterialMapColor());
		this.setHardness(3);
		this.setResistance(20);
		this.useNeighborBrightness = true;
	}

}
