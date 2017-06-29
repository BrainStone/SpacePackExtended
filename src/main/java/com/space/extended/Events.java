package com.space.extended;

import com.space.extended.basicblocks.BasicBlocks;
import com.space.extended.basicblocks.BlockMusicRack;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Events {
	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public void onItemUse(PlayerInteractEvent.RightClickBlock event) {
		ItemStack stack = event.getItemStack();
		Item item = stack.getItem();

		if (!(item instanceof ItemRecord))
			return;

		BlockPos pos = event.getPos();
		EntityPlayer player = event.getEntityPlayer();
		World world = player.getEntityWorld();
		EnumHand hand = event.getHand();

		IBlockState iblockstate = world.getBlockState(pos);

		if ((iblockstate.getBlock() == BasicBlocks.music_rack)
				&& !iblockstate.getValue(BlockMusicRack.HAS_RECORD).booleanValue()) {
			if (!world.isRemote) {
				ItemStack itemstack = player.getHeldItem(hand);
				((BlockMusicRack) BasicBlocks.music_rack).insertRecord(world, pos, iblockstate, itemstack);
				world.playEvent((EntityPlayer) null, 1010, pos, Item.getIdFromItem(item));
				itemstack.shrink(1);
				player.addStat(StatList.RECORD_PLAYED);
			}

			event.setResult(Result.ALLOW); 
		}
	}
}
