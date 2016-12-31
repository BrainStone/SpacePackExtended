package com.space.extended.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemCyberitBeetle extends ItemFood {
	public ItemCyberitBeetle() {
		super(2, 5.5F, false);
		setAlwaysEdible();
	}

	@Override
	public void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		if (!worldIn.isRemote) {
			player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 400, 1));
			player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 6000, 0));
			player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 6000, 0));
			player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 2400, 3));
		}
	}
}
