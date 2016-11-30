package com.space.extended.basicblocks;

import java.util.Random;

import com.space.extended.items.BasicItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockKlingoniumOre extends Block {
	public BlockKlingoniumOre() {
		super(Material.IRON);
		setHardness(2F);
		setResistance(5F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(0.6F);
		setSoundType(SoundType.METAL);
	}

	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
		Random rand = world instanceof World ? ((World) world).rand : new Random();

		return MathHelper.getInt(rand, 2, 6);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return this == BasicBlocks.klingoniumOre ? BasicItems.klingoniumShard : (Item.getItemFromBlock(this));
	}

	@Override
	public int quantityDropped(Random random) {
		return this == BasicBlocks.klingoniumOre ? 2 + random.nextInt(2) : 1;
	}
}