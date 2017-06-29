package com.space.extended.items;

import java.util.Random;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ItemFlameThrower extends Item {
	public ItemFlameThrower() {
		setMaxStackSize(1);
		setMaxDamage(4000);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		Vec3d lookVector = playerIn.getLookVec();
		double x = lookVector.x / 10;
		double y = lookVector.y / 10;
		double z = lookVector.z / 10;
		Random random = new Random();

		for (int i = 0; i < 100; i++) {
			double xCoord = playerIn.posX + (x * i) + random.nextDouble();
			double yCoord = playerIn.posY + (y * i) + random.nextDouble();
			double zCoord = playerIn.posZ + (z * i) + random.nextDouble();

			if (worldIn.isRemote) {
				worldIn.spawnParticle(EnumParticleTypes.FIREWORKS_SPARK, xCoord, yCoord, zCoord, x * 10, y * 10,
						z * 10);
			} else {
				if (worldIn.isBlockFullCube(new BlockPos(xCoord, yCoord, zCoord))
						&& (worldIn.getBlockState(new BlockPos(xCoord, yCoord + 1, zCoord)).getBlock() == Blocks.AIR)) {
					worldIn.setBlockState(new BlockPos(xCoord, yCoord + 1, zCoord + 1), Blocks.FIRE.getDefaultState());
				}

				for (Object obj : worldIn.getEntitiesWithinAABBExcludingEntity(playerIn,
						new AxisAlignedBB(xCoord - 1, yCoord - 1, zCoord - 1, xCoord + 1, yCoord + 1, zCoord + 1))) {
					if (obj instanceof EntityLivingBase) {
						EntityLivingBase entity = (EntityLivingBase) obj;
						entity.setFire(7);
					}

					itemstack.damageItem(2, playerIn);
				}
			}
		}

		for (int i = 0; i < 100; i++) {
			worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, playerIn.posX + (x * i) + random.nextDouble(),
					playerIn.posY + (y * i) + random.nextDouble(), playerIn.posZ + (z * i) + random.nextDouble(),
					x * 10, y * 10, z * 10);
		}

		worldIn.playSound((EntityPlayer) null, playerIn.posX, playerIn.posY, playerIn.posZ,
				SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.NEUTRAL, 0.1F,
				0.3F / ((itemRand.nextFloat() * 0.3F) + 0.6F));

		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
	}

	@Override
	public int getItemEnchantability() {
		return 1;
	}
}
