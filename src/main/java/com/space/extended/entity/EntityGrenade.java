package com.space.extended.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityGrenade extends EntityThrowable {

	public EntityGrenade(World worldIn) {
		super(worldIn);

	}

	public EntityGrenade(World worldIn, EntityLivingBase throwerIn) {
		super(worldIn, throwerIn);

	}

	@Override
	protected void onImpact(RayTraceResult result) {
		if (!worldObj.isRemote) {
			setDead();
			worldObj.createExplosion((Entity) null, posX, posY, posZ, 2.5F, true);
		}
	}

	@Override
	public void onUpdate() {
		super.onUpdate();

		if (worldObj.isRemote && !inGround) {

			worldObj.spawnParticle(EnumParticleTypes.FIREWORKS_SPARK, posX, posY, posZ, 0.0D, 0.0D, 0.0D, new int[0]);
			worldObj.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, posX, posY, posZ, 0.0D, 0.0D, 0.0D, new int[0]);
		}

	}

}
