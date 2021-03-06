package com.space.extended.items;

import com.space.extended.SpaceExtendedMain;

import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;;

public class ItemStronteniumArmor extends ItemArmor {
	
	public ItemStronteniumArmor(ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, 0, equipmentSlotIn);
		setCreativeTab(SpaceExtendedMain.armorTab);

}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
		if ((slot == EntityEquipmentSlot.HEAD) || (slot == EntityEquipmentSlot.CHEST)
				|| (slot == EntityEquipmentSlot.FEET))
			return SpaceExtendedMain.MODID + ":textures/models/armor/diving_suit_layer_1.png";
		else if (slot == EntityEquipmentSlot.LEGS)
			return SpaceExtendedMain.MODID + ":textures/models/armor/diving_suit_layer_2.png";
		else
			return null;

	}
}