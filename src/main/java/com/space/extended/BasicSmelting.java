package com.space.extended;

import com.space.extended.basicblocks.BasicBlocks;
import com.space.extended.items.BasicItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BasicSmelting {

	public BasicSmelting() {
		register();
	}

	private void register() {
		GameRegistry.addSmelting(BasicBlocks.vitallium_ore, new ItemStack(BasicItems.vitallium_ingot, 1), 1.0F);
		GameRegistry.addSmelting(BasicBlocks.strontenium_ore, new ItemStack(BasicItems.strontenium_ingot, 1), 1.0F);
	}
}
