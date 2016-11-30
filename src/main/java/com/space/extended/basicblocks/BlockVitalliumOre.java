package com.space.extended.basicblocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockVitalliumOre extends Block {

	public BlockVitalliumOre() {
		super(Material.IRON);
		this.setHardness(2F);
		this.setResistance(5F);
		this.setHarvestLevel("pickaxe", 2);
		this.setLightLevel(0.6F);
	}

	private void setStepSound(SoundType metal) {
		this.setStepSound(SoundType.METAL);

	}

	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
		Random rand = world instanceof World ? ((World) world).rand : new Random();
		return MathHelper.getRandomIntegerInRange(rand, 2, 4);

	}
}
