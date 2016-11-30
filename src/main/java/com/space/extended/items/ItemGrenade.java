package com.space.extended.items;

import com.space.extended.entity.EntityGrenade;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemGrenade extends Item {

	public ItemGrenade() {
		super();
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn,
			EnumHand hand) {
		if (!playerIn.capabilities.isCreativeMode) {
			--itemStackIn.stackSize;
		}
		worldIn.playSound((EntityPlayer) null, playerIn.posX, playerIn.posY, playerIn.posZ,
				SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F,
				0.4F / ((itemRand.nextFloat() * 0.4F) + 0.8F));

		if (!worldIn.isRemote) {
			EntityGrenade grenade = new EntityGrenade(worldIn, playerIn);
			grenade.setHeadingFromThrower(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F,
					0.5F + ((float) Math.random() * 2), 1.0F);
			worldIn.spawnEntityInWorld(grenade);
		}

		return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
	}

}
