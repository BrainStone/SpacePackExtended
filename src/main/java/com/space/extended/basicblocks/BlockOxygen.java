package com.space.extended.basicblocks;

import java.util.Random;

import com.space.extended.items.BasicItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionType;
import net.minecraft.util.datafix.fixes.PotionItems;

public class BlockOxygen extends Block {

	public BlockOxygen() {

		super(Material.IRON);
		setHardness(2F);
		setResistance(5F);
		setHarvestLevel("axe", 2);

	}
}