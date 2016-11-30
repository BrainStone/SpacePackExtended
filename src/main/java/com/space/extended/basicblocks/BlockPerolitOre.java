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

public class BlockPerolitOre extends Block {

	public BlockPerolitOre() {
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

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {

		return this == BasicBlocks.perolitOre ? BasicItems.perolit_sphere : (Item.getItemFromBlock(this));
	}

	@Override
	public int quantityDropped(Random random) {

		return this == BasicBlocks.perolitOre ? 2 + random.nextInt(3) : 1;
	}

}
