package com.space.extended.basicblocks;

import java.util.Random;

import net.minecraft.block.BlockBreakable;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockStrontenium_Glass extends BlockBreakable {
	 

		public BlockStrontenium_Glass(Material materialIn, boolean ignoreSimilarityIn) {

			super(materialIn, ignoreSimilarityIn);
			this.blockSoundType = SoundType.GLASS;
			setHardness(0.3F);
			setResistance(1.5F);
		}

		public int quantityDropped(Random random) {
			return 0;
		}

		@SideOnly(Side.CLIENT)
		public BlockRenderLayer getBlockLayer() {
			return BlockRenderLayer.TRANSLUCENT;
		}

		public boolean isFullCube(IBlockState state) {
			return true;
		}

		protected boolean canSilkHarvest() {
			return true;
		}

	}

