package com.space.extended.mob;

import com.space.extended.SpaceextendedSoundEvents;
import com.space.extended.items.BasicItems;

import net.minecraft.block.Block;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityEvoker;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityVindicator;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityMobBeetle extends EntityMob {
	public EntityMobBeetle(World world) {
		super(world);
		setSize(1.4F, 0.9F);

		isImmuneToFire = true;
		tasks.addTask(1, new EntityAISwimming(this));
		tasks.addTask(2, new EntityAILeapAtTarget(this, 0.4F));
		targetTasks.addTask(3, new EntityAINearestAttackableTarget<>(this, EntityPlayer.class, true));
		tasks.addTask(4, new EntityAIWander(this, 0.6D));
		tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		tasks.addTask(6, new EntityAILookIdle(this));
		targetTasks.addTask(7, new EntityAIHurtByTarget(this, false));
		tasks.addTask(8, new EntityAIAttackMelee(this, 1.0D, false));
		targetTasks.addTask(9, new EntityAINearestAttackableTarget<>(this, EntityGuardian.class, true));
		targetTasks.addTask(10, new EntityAINearestAttackableTarget<>(this, EntityZombie.class, true));
		targetTasks.addTask(11, new EntityAINearestAttackableTarget<>(this, EntitySpider.class, true));
		targetTasks.addTask(12, new EntityAINearestAttackableTarget<>(this, EntitySkeleton.class, true));
		targetTasks.addTask(13, new EntityAINearestAttackableTarget<>(this, EntityEvoker.class, true));
		targetTasks.addTask(13, new EntityAINearestAttackableTarget<>(this, EntityVindicator.class, true));

	}

	@Override
	protected int getExperiencePoints(EntityPlayer player) {
		return 2 + world.rand.nextInt(3);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5f);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(6.0D);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
	}

	@Override
	protected SoundEvent getDeathSound() {
		return SpaceextendedSoundEvents.ENTITY_MOBBEETLE_DEATH;

	}

	@Override
	protected SoundEvent getAmbientSound() {
		return SpaceextendedSoundEvents.ENTITY_MOBBEETLE_AMBIENT;

	}

	@Override
	protected void playStepSound(BlockPos pos, Block blockIn) {
		playSound(SoundEvents.ENTITY_SPIDER_STEP, 0.15F, 1.0F);
	}

	@Override
	protected Item getDropItem() {
		return new ItemStack(BasicItems.cyberit_beetle).getItem();

	}
}
