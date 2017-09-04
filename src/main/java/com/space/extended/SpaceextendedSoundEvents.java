package com.space.extended;

import java.util.LinkedList;
import java.util.List;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SpaceextendedSoundEvents {
	private static final List<SoundEvent> sounds = new LinkedList<>();

	public static SoundEvent ENTITY_MOBBEETLE_DEATH;
	public static SoundEvent ENTITY_MOBBEETLE_AMBIENT;
	public static SoundEvent STRONTENITDOOR_OPEN;
	public static SoundEvent STRONTENITDOOR_CLOSE;
	public static SoundEvent IRONITDOOR_OPEN;
	public static SoundEvent IRONITDOOR_CLOSE;
	public static SoundEvent METALFRAMEDOOR_OPEN;
	public static SoundEvent METALFRAMEDOOR_CLOSE;
	public static SoundEvent GLASSDOOR_OPEN;
	public static SoundEvent GLASSDOOR_CLOSE;
	public static SoundEvent STONEDOOR_OPEN;
	public static SoundEvent STONEDOOR_CLOSE;
	
	public SpaceextendedSoundEvents() {
		registerSounds();
	}
	
	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<SoundEvent> event) {
		sounds.stream().forEach(event.getRegistry()::register);
	}

	private void registerSounds() {

		ENTITY_MOBBEETLE_DEATH = registerSound("mobbeetle.death");
		ENTITY_MOBBEETLE_AMBIENT = registerSound("mobbeetle.say");
		STRONTENITDOOR_OPEN = registerSound("block.strontenitdoor.open");
		STRONTENITDOOR_CLOSE = registerSound("block.strontenitdoor.close");
		IRONITDOOR_OPEN = registerSound("block.ironitdoor.open");
		IRONITDOOR_CLOSE = registerSound("block.ironitdoor.close");
		METALFRAMEDOOR_OPEN = registerSound("block.metalframedoor.open");
		METALFRAMEDOOR_CLOSE = registerSound("block.metalframedoor.close");
		GLASSDOOR_OPEN = registerSound("block.glassdoor.open");
		GLASSDOOR_CLOSE = registerSound("block.glassdoor.close");
		STONEDOOR_OPEN = registerSound("block.stonedoor.open");
		STONEDOOR_CLOSE = registerSound("block.stonedoor.close");

	}

	private static SoundEvent registerSound(String soundName) {

		final ResourceLocation soundID = new ResourceLocation(SpaceExtendedMain.MODID, soundName);
		SoundEvent event = new SoundEvent(soundID).setRegistryName(soundID);
		
		sounds.add(event);

		return event;
	}
}
