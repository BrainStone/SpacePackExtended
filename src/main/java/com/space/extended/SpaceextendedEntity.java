package com.space.extended;

import com.space.extended.entity.EntityGrenade;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class SpaceextendedEntity {
	public static int grenade = 1;

	public SpaceextendedEntity() {
		register();
	}

	public void register() {
		EntityRegistry.registerModEntity(new ResourceLocation(SpaceExtendedMain.MODID, "grenade"), EntityGrenade.class,
				"grenade", grenade, SpaceExtendedMain.INSTANCE, 64, 1, true);
	}
}
