package com.space.extended.basicblocks;

import java.util.Random;

import com.space.extended.SpaceextendedSoundEvents;
import com.space.extended.items.BasicItems;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class BlockSecretStoneDoor extends BlockCustomDoor {

	public BlockSecretStoneDoor() {
		super(Material.WOOD);
		setHardness(3);
		setResistance(20);
	}

	@Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
		return new ItemStack(BasicBlocks.secret_stone_door);
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos,
			EntityPlayer player) {
		return new ItemStack(BasicBlocks.secret_stone_door);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(BasicBlocks.secret_stone_door);
	}

	@Override
	protected Item getItem() {
		return BasicItems.secret_stone_door;
	}

	@Override
	protected SoundEvent getOpenSound() {
		return SpaceextendedSoundEvents.STONEDOOR_OPEN;
	}

	@Override
	protected SoundEvent getCloseSound() {
		return SpaceextendedSoundEvents.STONEDOOR_CLOSE;
	}

}
