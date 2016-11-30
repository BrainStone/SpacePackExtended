package com.space.extended;

import com.space.extended.basicblocks.BasicBlocks;
import com.space.extended.items.BasicItems;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BasicSmelting {

	public BasicSmelting() {
		register();
	}

	private void register() {
		GameRegistry.addSmelting(BasicBlocks.vitalliumOre, new ItemStack(BasicItems.vitalliumIngot, 1), 1.0F);
		GameRegistry.addSmelting(BasicBlocks.stronteniumOre, new ItemStack(BasicItems.stronteniumIngot, 1), 1.0F);
	}
}
