package com.space.extended.mob;

import com.space.extended.SpaceExtendedMain;


import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;




public class EntityBeetle {

	public static void createEntity(Class entityClass, String entityName) {

		EntityRegistry.registerModEntity(entityClass, entityName, 0, SpaceExtendedMain.INSTANCE, 64, 1, true,
				(255 << 16) + (102 << 8) + 102, (204 << 16) + (255 << 8) + 102);

		EntityRegistry.addSpawn(entityClass, 20, 2, 5, EnumCreatureType.MONSTER, Biomes.DESERT, Biomes.JUNGLE,
				Biomes.HELL);
		DungeonHooks.addDungeonMob("Beetle", 120);

	}

}

		
	
		
		
	


