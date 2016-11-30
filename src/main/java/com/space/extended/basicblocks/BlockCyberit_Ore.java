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

public class BlockCyberit_Ore extends Block {

	public BlockCyberit_Ore() {

		super(Material.IRON);
		setHardness(3F);
		setResistance(5F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(0.7F);

	}

	private void setStepSound(SoundType metal) {
		setStepSound(SoundType.METAL);

	}

	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
		Random rand = world instanceof World ? ((World) world).rand : new Random();
		return MathHelper.getRandomIntegerInRange(rand, 1, 3);

	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {

		return this == BasicBlocks.cyberit_Ore ? BasicItems.cyberit_gem : (Item.getItemFromBlock(this));
	}

	@Override
	public int quantityDropped(Random random) {

		return this == BasicBlocks.cyberit_Ore ? 1 + random.nextInt(1) : 1;
	}

}
