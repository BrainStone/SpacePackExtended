package com.space.extended.basicblocks;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockStronteniumFence extends BlockFence {

	public BlockStronteniumFence(Material material) {
		super(Material.IRON, Material.IRON.getMaterialMapColor());
		setHardness(3);
		setResistance(20);
		useNeighborBrightness = true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}
}
