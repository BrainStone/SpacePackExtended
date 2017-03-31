package com.space.extended.basicblocks;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;

public class BlockVitalliumFence extends BlockFence {

	public BlockVitalliumFence(Material material) {
		super(Material.IRON, Material.IRON.getMaterialMapColor());
		setHardness(3);
		setResistance(20);
		useNeighborBrightness = true;
	}

}
