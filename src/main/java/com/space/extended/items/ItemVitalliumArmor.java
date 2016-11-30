package com.space.extended.items;

import com.space.extended.SpaceExtendedMain;

import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemVitalliumArmor extends ItemArmor {

	public ItemVitalliumArmor(ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, 0, equipmentSlotIn);
		setCreativeTab(SpaceExtendedMain.tab2);
	}

	{
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
		if ((slot == EntityEquipmentSlot.HEAD) || (slot == EntityEquipmentSlot.CHEST)
				|| (slot == EntityEquipmentSlot.FEET))
			return SpaceExtendedMain.MODID + ":textures/models/armor/vitallium_layer_1.png";
		else if (slot == EntityEquipmentSlot.LEGS)
			return SpaceExtendedMain.MODID + ":textures/models/armor/vitallium_layer_2.png";
		else
			return null;

	}
}