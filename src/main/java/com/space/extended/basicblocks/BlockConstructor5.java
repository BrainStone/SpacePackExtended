package com.space.extended.basicblocks;

import java.util.Random;

import com.space.extended.items.BasicItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockConstructor5 extends Block {
	public BlockConstructor5() {
		super(Material.IRON);
		setHardness(2F);
		setResistance(5F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(0.6F);
		setSoundType(SoundType.METAL);
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return true;
	}

	@Override
	public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
		return false;
	}

	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
		Random rand = world instanceof World ? ((World) world).rand : new Random();

		return MathHelper.getInt(rand, 1, 3);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return BasicItems.kit5;
	}

	@Override
	public int quantityDropped(Random random) {
		return 1;
	}
}
