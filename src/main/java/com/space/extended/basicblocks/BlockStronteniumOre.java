package com.space.extended.basicblocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockStronteniumOre extends Block {
	public BlockStronteniumOre() {
		super(Material.IRON);
		setHardness(2F);
		setResistance(5F);
		this.setHarvestLevel("pickaxe", 2);
		setLightLevel(0.6F);
		setSoundType(SoundType.METAL);
	}

	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
		Random rand = world instanceof World ? ((World) world).rand : new Random();

		return MathHelper.getInt(rand, 2, 6);
	}
}
