package com.space.extended.mob;

import com.space.extended.SpaceExtendedMain;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityBeetle {

	public static void createEntity(Class<? extends EntityLiving> entityClass, String entityName) {
		ResourceLocation beetle = new ResourceLocation(SpaceExtendedMain.MODID, "Beetle");

		EntityRegistry.registerModEntity(beetle, entityClass, entityName, 0, SpaceExtendedMain.INSTANCE, 64, 1, true,
				(255 << 16) + (102 << 8) + 102, (204 << 16) + (255 << 8) + 102);
		EntityRegistry.addSpawn(entityClass, 20, 2, 5, EnumCreatureType.MONSTER, Biomes.DESERT, Biomes.JUNGLE,
				Biomes.HELL);
		DungeonHooks.addDungeonMob(beetle, 120);

	}

}
