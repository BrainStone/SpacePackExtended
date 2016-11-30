package com.space.extended;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;




public class SpaceextendedSoundEvents {
	
	public static SoundEvent ENTITY_MOBBEETLE_DEATH;
	public static SoundEvent ENTITY_MOBBEETLE_AMBIENT;
	
	public static void registerSounds() {
		
		ENTITY_MOBBEETLE_DEATH = registerSound("mobbeetle.death");
		ENTITY_MOBBEETLE_AMBIENT = registerSound("mobbeetle.say");
	}
	
private static SoundEvent registerSound( String soundName) {
	
	final ResourceLocation soundID = new ResourceLocation(SpaceExtendedMain.MODID, soundName);
	
	return GameRegistry.register(new SoundEvent(soundID).setRegistryName(soundID));
}
}
