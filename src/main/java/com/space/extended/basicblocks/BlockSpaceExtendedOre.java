package com.space.extended.basicblocks;

import java.util.Random;

import com.space.extended.items.BasicItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockSpaceExtendedOre extends Block {
	public BlockSpaceExtendedOre() {
		this(Material.IRON);
	}

	public BlockSpaceExtendedOre(Material material) {
		this(material, (material == Material.IRON) ? SoundType.METAL : SoundType.STONE,
				(material == Material.IRON) ? 2.0f : 3.0f, 5.0f, (material == Material.IRON) ? 0.6f : 0.5f);
	}

	public BlockSpaceExtendedOre(Material material, SoundType stepSound, float hardness, float resistance,
			float lightLevel) {
		super(material);
		setSoundType(stepSound);
		setHardness(hardness);
		setResistance(resistance);
		setLightLevel(lightLevel);
		setHarvestLevel("pickaxe", 2);
	}

	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
		Random rand = world instanceof World ? ((World) world).rand : new Random();

		if (getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this)) {
			int exp = 0;

			if (this == BasicBlocks.space_quartz_ore) {
				exp = MathHelper.getInt(rand, 1, 3);
			} else if (this == BasicBlocks.perolit_ore) {
				exp = MathHelper.getInt(rand, 2, 4);
			} else if (this == BasicBlocks.klingonium_ore) {
				exp = MathHelper.getInt(rand, 2, 6);
			} else if (this == BasicBlocks.cyberit_Ore) {
				exp = MathHelper.getInt(rand, 1, 3);
			} else if (this == BasicBlocks.ironium_ore) {
				exp = MathHelper.getInt(rand, 1, 2);
			}

			return exp;
		}

		return 0;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random random, int fortune) {
		if (this == BasicBlocks.space_quartz_ore)
			return BasicItems.quartz_component;
		else if (this == BasicBlocks.perolit_ore)
			return BasicItems.perolit_sphere;
		else if (this == BasicBlocks.klingonium_ore)
			return BasicItems.klingonium_shard;
		else if (this == BasicBlocks.cyberit_Ore)
			return BasicItems.cyberit_gem;
		else if (this == BasicBlocks.ironium_ore)
			return BasicItems.ironit_crystal;
		else
			return Item.getItemFromBlock(this);
	}

	@Override
	public int quantityDropped(Random random) {
		if (this == BasicBlocks.space_quartz_ore)
			return MathHelper.getInt(random, 1, 4);
		else if (this == BasicBlocks.perolit_ore)
			return MathHelper.getInt(random, 2, 4);
		else if (this == BasicBlocks.klingonium_ore)
			return MathHelper.getInt(random, 2, 3);
		else if (this == BasicBlocks.cyberit_Ore)
			return MathHelper.getInt(random, 1, 2);
		else if (this == BasicBlocks.ironium_ore)
			return MathHelper.getInt(random, 1, 2);
		else
			return 1;
	}

	@Override
	public int quantityDroppedWithBonus(int fortune, Random random) {
		if ((fortune > 0)
				&& (Item.getItemFromBlock(this) != getItemDropped(getBlockState().getValidStates().iterator().next(),
						random, fortune))) {
			int bonus = random.nextInt(fortune + 2);

			if (bonus < 1) {
				bonus = 1;
			}

			return this.quantityDropped(random) * bonus;
		} else
			return this.quantityDropped(random);
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return true;
	}

	@Override
	public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
		return false;
	}
	@Override
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}
}
