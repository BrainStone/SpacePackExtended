package com.space.extended.proxy;

import com.space.extended.SpaceextendedSoundEvents;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void registerModels() {
	}

	public void registerRenderer() {
	}

	public void preInit() {

		SpaceextendedSoundEvents.registerSounds();

	}

	public void load() {

	}

	public void postInit() {

	}

}
