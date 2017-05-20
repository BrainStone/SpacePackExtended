package com.space.extended.items;

import com.space.extended.NameUtils;
import com.space.extended.SpaceExtendedMain;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BasicItems {
	public static ArmorMaterial vitalliumarmor;

	public static Item vitallium_ingot;
	public static Item klingonium_shard;
	public static Item strontenium_ingot;
	public static Item perolit_sphere;
	public static Item ironit_crystal;
	public static Item kit1;
	public static Item kit2;
	public static Item kit3;
	public static Item kit4;
	public static Item kit5;
	public static Item flamethrower;
	public static Item grenade;
	public static Item reserves;
	public static Item cyberit_gem;
	public static Item cyberit_beetle;
	public static Item quartz_component;
	public static Item vitallium_helmet;
	public static Item vitallium_chestplate;
	public static Item vitallium_leggings;
	public static Item vitallium_boots;
	public static Item bed1;
	public static Item vitallium_door;
	public static Item strontenit_door;
	public static Item metalframe_door;
	public static Item ironit_door;
	public static Item glass_door;
	public static Item concrete_brown_door;

	public BasicItems() {
		init();
		register();
	}

	public void init() {
		vitalliumarmor = EnumHelper.addArmorMaterial("vitalliumarmor", "", 40, new int[] { 5, 8, 10, 5 }, 50,
				SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3);

		vitallium_ingot = new Item().setCreativeTab(SpaceExtendedMain.armorTab);
		NameUtils.setNames(vitallium_ingot, "vitallium_ingot");
		klingonium_shard = new Item().setCreativeTab(SpaceExtendedMain.armorTab);
		NameUtils.setNames(klingonium_shard, "klingonium_shard");
		strontenium_ingot = new Item().setCreativeTab(SpaceExtendedMain.armorTab);
		NameUtils.setNames(strontenium_ingot, "strontenium_ingot");
		perolit_sphere = new Item().setCreativeTab(SpaceExtendedMain.armorTab);
		NameUtils.setNames(perolit_sphere, "perolit_sphere");
		ironit_crystal = new Item().setCreativeTab(SpaceExtendedMain.armorTab);
		NameUtils.setNames(ironit_crystal, "ironit_crystal");
		kit1 = new Item().setCreativeTab(SpaceExtendedMain.armorTab);
		NameUtils.setNames(kit1, "kit1");
		kit2 = new Item().setCreativeTab(SpaceExtendedMain.armorTab);
		NameUtils.setNames(kit2, "kit2");
		kit3 = new Item().setCreativeTab(SpaceExtendedMain.armorTab);
		NameUtils.setNames(kit3, "kit3");
		kit4 = new Item().setCreativeTab(SpaceExtendedMain.armorTab);
		NameUtils.setNames(kit4, "kit4");
		kit5 = new Item().setCreativeTab(SpaceExtendedMain.armorTab);
		NameUtils.setNames(kit5, "kit5");
		reserves = new ItemReserves().setCreativeTab(SpaceExtendedMain.armorTab);
		NameUtils.setNames(reserves, "reserves");
		cyberit_gem = new Item().setCreativeTab(SpaceExtendedMain.armorTab);
		NameUtils.setNames(cyberit_gem, "cyberit_gem");
		cyberit_beetle = new ItemCyberitBeetle().setCreativeTab(SpaceExtendedMain.armorTab);
		NameUtils.setNames(cyberit_beetle, "cyberit_beetle");
		quartz_component = new Item().setCreativeTab(SpaceExtendedMain.armorTab);
		NameUtils.setNames(quartz_component, "quartz_component");

		grenade = new ItemGrenade().setCreativeTab(SpaceExtendedMain.armorTab);
		NameUtils.setNames(grenade, "grenade");
		flamethrower = new ItemFlameThrower().setCreativeTab(SpaceExtendedMain.armorTab);
		NameUtils.setNames(flamethrower, "flamethrower");

		vitallium_helmet = new ItemVitalliumArmor(vitalliumarmor, EntityEquipmentSlot.HEAD);
		NameUtils.setNames(vitallium_helmet, "vitallium_helmet");
		vitallium_chestplate = new ItemVitalliumArmor(vitalliumarmor, EntityEquipmentSlot.CHEST);
		NameUtils.setNames(vitallium_chestplate, "vitallium_chestplate");
		vitallium_leggings = new ItemVitalliumArmor(vitalliumarmor, EntityEquipmentSlot.LEGS);
		NameUtils.setNames(vitallium_leggings, "vitallium_leggings");
		vitallium_boots = new ItemVitalliumArmor(vitalliumarmor, EntityEquipmentSlot.FEET);
		NameUtils.setNames(vitallium_boots, "vitallium_boots");

		bed1 = new ItemCustomBed();
		NameUtils.setNames(bed1, "bed1");
		vitallium_door = new ItemVitalliumDoor();
		NameUtils.setNames(vitallium_door, "vitallium_door");
		strontenit_door = new ItemStrontenitDoor();
		NameUtils.setNames(strontenit_door, "strontenit_door");
		metalframe_door = new ItemMetalFrameDoor();
		NameUtils.setNames(metalframe_door, "metalframe_door");
		ironit_door = new ItemIronitDoor();
		NameUtils.setNames(ironit_door, "ironit_door");
		glass_door = new ItemGlassDoor();
		NameUtils.setNames(glass_door, "glass_door");
		concrete_brown_door = new ItemConcreteBrownDoor();
		NameUtils.setNames(concrete_brown_door, "concrete_brown_door");

	}

	public void register() {
		registerItem(vitallium_ingot);
		registerItem(klingonium_shard);
		registerItem(strontenium_ingot);
		registerItem(perolit_sphere);
		registerItem(ironit_crystal);
		registerItem(cyberit_gem);
		registerItem(cyberit_beetle);
		registerItem(kit1);
		registerItem(kit2);
		registerItem(kit4);
		registerItem(kit3);
		registerItem(kit5);
		registerItem(reserves);
		registerItem(grenade);
		registerItem(flamethrower);
		registerItem(vitallium_helmet);
		registerItem(vitallium_chestplate);
		registerItem(vitallium_leggings);
		registerItem(vitallium_boots);
		registerItem(quartz_component);
		registerItem(bed1);
		registerItem(vitallium_door);
		registerItem(strontenit_door);
		registerItem(metalframe_door);
		registerItem(ironit_door);
		registerItem(glass_door);
		registerItem(concrete_brown_door);
	}

	private void registerItem(Item item) {
		GameRegistry.register(item);
	}
}
