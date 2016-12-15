package com.space.extended;

import com.space.extended.basicblocks.BasicBlocks;
import com.space.extended.basicstairs.BasicStairs;
import com.space.extended.items.BasicItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BasicCrafting {

	public BasicCrafting() {
		register();

	}

	private void register() {
		// 1 VitalliumBlock
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.vitallium, 1),
				new Object[] { "X X", " X ", " X ", 'X', new ItemStack(BasicItems.vitallium_ingot) });
		// 2 KlingoniumBlock
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.klingonium, 1),
				new Object[] { "X  ", "X  ", " X ", 'X', new ItemStack(BasicItems.klingonium_shard) });
		// 3 Klingonium_Stairs
		GameRegistry.addShapedRecipe(new ItemStack(BasicStairs.klingonium_stairs, 4),
				new Object[] { "  X", " XX", "XXX", 'X', new ItemStack(BasicItems.klingonium_shard) });
		// 4 ChairMonitor
		GameRegistry.addShapedRecipe(new ItemStack(BasicStairs.chairmonitorstairs, 1),
				new Object[] { "A  ", " BC", "   ", 'A', new ItemStack(BasicItems.kit1), 'B',
						new ItemStack(BasicItems.kit2), 'C', new ItemStack(BasicItems.kit3) });
		// 5 DrillMonitor
		GameRegistry.addShapedRecipe(new ItemStack(BasicStairs.drillmonitor, 1),
				new Object[] { "B  ", " CD", "   ", 'B', new ItemStack(BasicItems.kit2), 'C',
						new ItemStack(BasicItems.kit3), 'D', new ItemStack(BasicItems.kit4) });
		// 6 PcDeskAmmo
		GameRegistry.addShapedRecipe(new ItemStack(BasicStairs.pcdeskammo, 1),
				new Object[] { "C  ", " DE", "   ", 'C', new ItemStack(BasicItems.kit3), 'D',
						new ItemStack(BasicItems.kit4), 'E', new ItemStack(BasicItems.kit5) });
		// 7 MetalFrameStairs
		GameRegistry.addShapedRecipe(new ItemStack(BasicStairs.metalframestairs, 3), new Object[] { "  F", " FG", "FGG",
				'F', new ItemStack(BasicItems.vitallium_ingot), 'G', new ItemStack(Items.IRON_INGOT) });
		// 8 MetalFrameBlock
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.metalframeblock, 3),
				new Object[] { "F F", " F ", "F F", 'F', new ItemStack(BasicItems.vitallium_ingot) });
		// 9 Metal1_Stairs
		GameRegistry.addShapedRecipe(new ItemStack(BasicStairs.metal1_stairs, 3),
				new Object[] { "  X", " XG", "XGR", 'X', new ItemStack(BasicItems.vitallium_ingot), 'R',
						new ItemStack(Items.REDSTONE), 'G', new ItemStack(Items.IRON_INGOT) });
		// 10 VitalliumStairs
		GameRegistry.addShapedRecipe(new ItemStack(BasicStairs.vitalliumstairs, 4),
				new Object[] { "  F", " FF", "FFF", 'F', new ItemStack(BasicItems.vitallium_ingot) });
		// 11 Lamp
		GameRegistry.addShapedRecipe(new ItemStack(BasicStairs.lamp_stairs, 3), new Object[] { " R ", "EEE", " R ", 'E',
				new ItemStack(BasicItems.kit5), 'R', new ItemStack(Items.REDSTONE) });
		// 12 Strontenium
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.strontenium, 4),
				new Object[] { "SSS", "SSS", "SSS", 'S', new ItemStack(BasicItems.strontenium_ingot) });

		// 13 Strontenium0Block
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.strontenium0, 4), new Object[] { " S ", "SAS", " S ",
				'A', new ItemStack(BasicItems.kit1), 'S', new ItemStack(BasicItems.strontenium_ingot) });
		// 14 Strontenium1Block
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.strontenium1, 4), new Object[] { " S ", "SBS", " S ",
				'B', new ItemStack(BasicItems.kit2), 'S', new ItemStack(BasicItems.strontenium_ingot) });
		// 15 Strontenium2Block
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.strontenium2, 4), new Object[] { " S ", "SCS", " S ",
				'C', new ItemStack(BasicItems.kit3), 'S', new ItemStack(BasicItems.strontenium_ingot) });
		// 16 Strontenium_Stairs
		GameRegistry.addShapedRecipe(new ItemStack(BasicStairs.strontenium_stairs, 4),
				new Object[] { "  S", " SA", "SBC", 'S', new ItemStack(BasicItems.strontenium_ingot), 'A',
						new ItemStack(BasicItems.kit1), 'B', new ItemStack(BasicItems.kit2), 'C',
						new ItemStack(BasicItems.kit3) });
		// 17 Strontenium_Stairs1
		GameRegistry.addShapedRecipe(new ItemStack(BasicStairs.strontenium_stairs1, 4),
				new Object[] { "  S", " SB", "SCD", 'S', new ItemStack(BasicItems.strontenium_ingot), 'B',
						new ItemStack(BasicItems.kit2), 'C', new ItemStack(BasicItems.kit3), 'D',
						new ItemStack(BasicItems.kit4) });

		// 18 Office_Chair
		GameRegistry.addShapedRecipe(new ItemStack(BasicStairs.officechair_stairs, 4),
				new Object[] { "A  ", "B  ", "GGG", 'A', new ItemStack(BasicItems.kit1), 'B',
						new ItemStack(BasicItems.kit2), 'G', new ItemStack(Items.IRON_INGOT) });

		// 19 Roof_Stairs
		GameRegistry.addShapedRecipe(new ItemStack(BasicStairs.roof_stairs, 4),
				new Object[] { "F  ", " F ", "  F", 'F', new ItemStack(BasicItems.vitallium_ingot) });

		// 20 Klingonium_Wall0
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.klingonium_wall0, 4),
				new Object[] { "   ", "X  ", "XX ", 'X', new ItemStack(BasicItems.klingonium_shard) });
		// 21 Klingonium_Wall2
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.klingonium_wall2, 4),
				new Object[] { "   ", "  X", "X X", 'X', new ItemStack(BasicItems.klingonium_shard) });
		// 22 Klingonium_Wall6
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.klingonium_wall6, 4),
				new Object[] { "XXX", "X  ", "   ", 'X', new ItemStack(BasicItems.klingonium_shard) });
		// 23 Klingonium_Wall8
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.klingonium_wall8, 4),
				new Object[] { " XX", "   ", "  X", 'X', new ItemStack(BasicItems.klingonium_shard) });
		// 24 Klingonium_Wall1
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.klingonium_wall1, 4),
				new Object[] { "   ", " X ", " X ", 'X', new ItemStack(BasicItems.klingonium_shard) });
		// 25 Klingonium_Wall4
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.klingonium_wall4, 4),
				new Object[] { "   ", "XX ", "   ", 'X', new ItemStack(BasicItems.klingonium_shard) });
		// 26 Klingonium_Wall5
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.klingonium_wall5, 4),
				new Object[] { " X ", "  X", "   ", 'X', new ItemStack(BasicItems.klingonium_shard) });
		// 27 Klingonium_Wall7
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.klingonium_wall7, 4),
				new Object[] { "X  ", " X ", "   ", 'X', new ItemStack(BasicItems.klingonium_shard) });
		// 28 Klingonium_Wall3
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.klingonium_wall3, 4),
				new Object[] { " X ", "XXX", " X ", 'X', new ItemStack(BasicItems.klingonium_shard) });
		// 29 Klingonium0
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.klingonium0, 4),
				new Object[] { "   ", " XX", " XX", 'X', new ItemStack(BasicItems.klingonium_shard) });
		// 30 Klingonium1
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.klingonium1, 4),
				new Object[] { "X X", "   ", "X  ", 'X', new ItemStack(BasicItems.klingonium_shard) });
		// 31 Klingonium2
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.klingonium2, 4),
				new Object[] { "XX ", "X  ", "X  ", 'X', new ItemStack(BasicItems.klingonium_shard) });
		// 32 Klingonium3
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.klingonium3, 4),
				new Object[] { " X ", " XX", " X ", 'X', new ItemStack(BasicItems.klingonium_shard) });
		// 33 KlingoniumScrew
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.klingonium_screw, 4), new Object[] { "   ", "AXA", "   ",
				'X', new ItemStack(BasicItems.klingonium_shard), 'A', new ItemStack(BasicItems.kit1) });
		// 34 Klingonit
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.klingonit, 6),
				new Object[] { "KKK", "   ", "K K", 'K', new ItemStack(BasicBlocks.klingonium_ore) });
		// 35 Klingodur
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.klingodur, 4), new Object[] { "KXK", "   ", "KXK", 'X',
				new ItemStack(BasicItems.klingonium_shard), 'K', new ItemStack(BasicBlocks.klingonium_ore) });

		// 36 Pipes_Connector
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.pipes_connector, 5), new Object[] { "OOO", " S ", " S ",
				'O', new ItemStack(BasicBlocks.strontenium_ore), 'S', new ItemStack(BasicItems.strontenium_ingot) });

		// 37 Pipes_Stairs
		GameRegistry.addShapedRecipe(new ItemStack(BasicStairs.pipes_stairs, 8),
				new Object[] { "   ", "SSS", "   ", 'S', new ItemStack(BasicItems.strontenium_ingot) });

		// 38 PipesA_Stairs
		GameRegistry.addShapedRecipe(new ItemStack(BasicStairs.pipesa_stairs, 8),
				new Object[] { " S ", "SSS", "   ", 'S', new ItemStack(BasicItems.strontenium_ingot) });
		// 39 PipesB_Stairs
		GameRegistry.addShapedRecipe(new ItemStack(BasicStairs.pipesb_stairs, 8),
				new Object[] { "SS ", "SS ", "SS ", 'S', new ItemStack(BasicItems.strontenium_ingot) });
		// 40 PipesC_Stairs
		GameRegistry.addShapedRecipe(new ItemStack(BasicStairs.pipesc_stairs, 8),
				new Object[] { "SS ", "S  ", "SS ", 'S', new ItemStack(BasicItems.strontenium_ingot) });
		// 41 Klingonium_Pipes_stairs
		GameRegistry.addShapedRecipe(new ItemStack(BasicStairs.klingonium_pipes_stairs, 8),
				new Object[] { "   ", "X  ", "SX ", 'X', new ItemStack(BasicItems.klingonium_shard), 'S',
						new ItemStack(BasicItems.strontenium_ingot) });
		// 42 BlockPerolit
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.perolit, 4), new Object[] { "   ", "PRP", "PRP", 'P',
				new ItemStack(BasicItems.perolit_sphere), 'R', new ItemStack(Items.REDSTONE) });
		// 43 Perol A
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.perola, 4),
				new Object[] { "PPP", "P P", "P P", 'P', new ItemStack(BasicItems.perolit_sphere) });
		// 44 Perol B
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.perolb, 4),
				new Object[] { "PPP", "PPP", "P P", 'P', new ItemStack(BasicItems.perolit_sphere) });
		// 45 Perol C
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.perolc, 4),
				new Object[] { "PPP", "P  ", "PPP", 'P', new ItemStack(BasicItems.perolit_sphere) });
		// 46 Perol D
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.perold, 4),
				new Object[] { "PPP", "P P", "PPP", 'P', new ItemStack(BasicItems.perolit_sphere) });

		// 47 Strontenal
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.strontenal, 6), new Object[] { "S S", "DD ", "S S", 'S',
				new ItemStack(BasicItems.strontenium_ingot), 'D', new ItemStack(BasicItems.kit4) });
		// 48 Oxygen
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.oxygen, 4), new Object[] { "   ", " TD", "   ", 'D',
				new ItemStack(BasicItems.kit4), 'T', new ItemStack(BasicBlocks.strontenal) });
		// 49 Table
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.table, 4),
				new Object[] { "OOO", "O O", "O O", 'O', new ItemStack(BasicItems.kit5) });
		// 50 Strontopal
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.strontopal, 4), new Object[] { "BBB", "S S", "S S", 'B',
				new ItemStack(BasicItems.kit2), 'S', new ItemStack(BasicItems.strontenium_ingot) });
		// 51 StrontopalA
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.strontopala, 4), new Object[] { "CCC", "S S", "S S", 'C',
				new ItemStack(BasicItems.kit3), 'S', new ItemStack(BasicItems.strontenium_ingot) });
		// 52 StrontopalB
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.strontopalb, 4), new Object[] { "DDD", "S S", "S S", 'D',
				new ItemStack(BasicItems.kit4), 'S', new ItemStack(BasicItems.strontenium_ingot) });
		// 53 Lux
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.lux, 6), new Object[] { "RRR", "FFF", "   ", 'R',
				new ItemStack(Items.REDSTONE), 'F', new ItemStack(BasicItems.vitallium_ingot) });
		// 54 Ceiling_Lamp
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.ceiling_lamp, 6), new Object[] { "RRR", "TTT", "   ",
				'R', new ItemStack(Items.REDSTONE), 'T', new ItemStack(Blocks.REDSTONE_TORCH) });
		// 55 Grenade
		GameRegistry.addShapedRecipe(new ItemStack(BasicItems.grenade, 10),
				new Object[] { "XXX", "III", "EEE", 'X', new ItemStack(BasicItems.vitallium_ingot), 'I',
						new ItemStack(Items.GUNPOWDER), 'E', new ItemStack(BasicItems.kit5) });
		// 56 Laboratory_Bench
		GameRegistry.addShapedRecipe(new ItemStack(BasicStairs.laboratory_bench, 5), new Object[] { "CCC", "   ", "EEE",
				'C', new ItemStack(BasicItems.kit3), 'E', new ItemStack(BasicItems.kit5) });
		// 57 Speedway
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.speedway, 5), new Object[] { "C C", "   ", "E E", 'C',
				new ItemStack(Items.COMPARATOR), 'E', new ItemStack(BasicItems.kit4) });
		// 58 Vitallium_Helmet
		GameRegistry.addShapedRecipe(new ItemStack(BasicItems.vitallium_helmet, 1), new Object[] { "   ", "FBF", "B B",
				'B', new ItemStack(Items.BLAZE_ROD), 'F', new ItemStack(BasicItems.vitallium_ingot) });
		// 59 Vitallium_Chestplate
		GameRegistry.addShapedRecipe(new ItemStack(BasicItems.vitallium_chestplate, 1), new Object[] { "F F", "FBF",
				"FBF", 'B', new ItemStack(Items.BLAZE_ROD), 'F', new ItemStack(BasicItems.vitallium_ingot) });
		// 60 Vitallium_Leggings
		GameRegistry.addShapedRecipe(new ItemStack(BasicItems.vitallium_leggings, 1), new Object[] { "FFF", "B B",
				"F F", 'B', new ItemStack(Items.BLAZE_ROD), 'F', new ItemStack(BasicItems.vitallium_ingot) });
		// 61 Vitallium_Boots
		GameRegistry.addShapedRecipe(new ItemStack(BasicItems.vitallium_boots, 1), new Object[] { "   ", "B B", "F F",
				'B', new ItemStack(Items.BLAZE_ROD), 'F', new ItemStack(BasicItems.vitallium_ingot) });
		// 62 Reserves
		GameRegistry.addShapedRecipe(new ItemStack(BasicItems.reserves, 1), new Object[] { "S S", "F S", "F F", 'S',
				new ItemStack(BasicItems.strontenium_ingot), 'F', new ItemStack(BasicItems.vitallium_ingot) });
		// 63 StronteCore
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.strontecore, 3), new Object[] { "S S", "S S", "F F", 'S',
				new ItemStack(BasicItems.strontenium_ingot), 'F', new ItemStack(Items.EMERALD) });
		// 64 Flamethrower
		GameRegistry.addShapedRecipe(new ItemStack(BasicItems.flamethrower, 1),
				new Object[] { "SSS", "FFF", "KLK", 'S', new ItemStack(BasicItems.strontenium_ingot), 'L',
						new ItemStack(Items.FLINT_AND_STEEL), 'K', new ItemStack(BasicItems.cyberit_gem), 'F',
						new ItemStack(BasicItems.vitallium_ingot) });
		// 65 Vitallium_Glass
		GameRegistry.addShapelessRecipe(new ItemStack(BasicBlocks.vitallium_glass, 5), Blocks.GLASS,
				BasicItems.vitallium_ingot);

		// 66 Vitallium_Glass_Pane
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.vitallium_glass_pane, 16),
				new Object[] { "   ", "VVV", "VVV", 'V', new ItemStack(BasicBlocks.vitallium_glass) });
		// 67 Microscope
		GameRegistry.addShapedRecipe(new ItemStack(BasicStairs.microscope, 1), new Object[] { "   ", "FVF", "   ", 'F',
				new ItemStack(BasicItems.vitallium_ingot), 'V', new ItemStack(BasicBlocks.vitallium_glass) });
		// 68 Analyser
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.analyser, 1), new Object[] { "   ", "PSP", "PSP", 'P',
				new ItemStack(BasicItems.perolit_sphere), 'S', new ItemStack(BasicItems.strontenium_ingot) });
		// 69 Virtual Screen
		GameRegistry.addShapelessRecipe(new ItemStack(BasicBlocks.virtual_screen, 8), Blocks.GLASS,
				BasicItems.perolit_sphere);
		// 70 Strontenium_Glass
		GameRegistry.addShapelessRecipe(new ItemStack(BasicBlocks.strontenium_glass, 5), Blocks.GLASS,
				BasicItems.strontenium_ingot);

		// 71 Strontenium_Glass_Pane
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.strontenium_glass_pane, 16),
				new Object[] { "   ", "VVV", "VVV", 'V', new ItemStack(BasicBlocks.strontenium_glass) });
		// 72 Consoles_Stairs
		GameRegistry.addShapedRecipe(new ItemStack(BasicStairs.consoles_stairs, 5), new Object[] { "CCC", "   ", "EEE",
				'C', new ItemStack(BasicItems.kit2), 'E', new ItemStack(BasicItems.kit4) });
		// 73 SpaceMan_Seat
		GameRegistry.addShapedRecipe(new ItemStack(BasicStairs.spaceman_seat, 5),
				new Object[] { "C C", " S ", "E E", 'C', new ItemStack(BasicItems.kit1), 'E',
						new ItemStack(BasicItems.kit4), 'S', new ItemStack(BasicItems.strontenium_ingot) });
		// 74 KlingoPar
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.klingopar, 3), new Object[] { " X ", " S ", " S ", 'X',
				new ItemStack(BasicItems.klingonium_shard), 'S', new ItemStack(BasicItems.strontenium_ingot) });
		// 75 Tresor
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.tresor, 1),
				new Object[] { " X ", "PSP", "PSP", 'P', new ItemStack(Items.IRON_INGOT), 'S',
						new ItemStack(BasicItems.strontenium_ingot), 'X', new ItemStack(BasicItems.vitallium_ingot) });
		// 76 StrontenitA
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.strontenita, 6), new Object[] { " X ", "S S", "S S", 'X',
				new ItemStack(BasicBlocks.strontenium_ore), 'S', new ItemStack(BasicItems.strontenium_ingot) });
		// 77 StrontenitB
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.strontenitb, 6), new Object[] { "XX ", "SS ", "SS ", 'X',
				new ItemStack(BasicBlocks.strontenium_ore), 'S', new ItemStack(BasicItems.strontenium_ingot) });
		// 78 StrontenitC
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.strontenitc, 6), new Object[] { "XXX", "S  ", "XXX", 'X',
				new ItemStack(BasicBlocks.strontenium_ore), 'S', new ItemStack(BasicItems.strontenium_ingot) });
		// 79 StrontenitD
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.strontenitd, 6), new Object[] { "XXX", " XS", "XXX", 'X',
				new ItemStack(BasicBlocks.strontenium_ore), 'S', new ItemStack(BasicItems.strontenium_ingot) });
		// 80 Spaceship_Control
		GameRegistry.addShapedRecipe(new ItemStack(BasicStairs.spaceship_control, 5),
				new Object[] { "C C", " S ", "E E", 'C', new ItemStack(BasicStairs.spaceman_seat), 'E',
						new ItemStack(BasicItems.kit5), 'S', new ItemStack(BasicItems.strontenium_ingot) });
		// 81 Block_Space_Quartz
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.block_space_quartz, 6),
				new Object[] { "X X", " X ", "X X", 'X', new ItemStack(BasicItems.quartz_component) });
		// 82 Block_Space_Quartz_A
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.block_space_quartza, 6),
				new Object[] { "X X", "   ", "X X", 'X', new ItemStack(BasicItems.quartz_component) });
		// 83 Block_Space_Quartz_MFblock
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.block_space_quartz_mfblock, 8),
				new Object[] { "XX ", "XX ", "XX ", 'X', new ItemStack(BasicItems.quartz_component) });
		// 84 Block_Space_Quartz_MetalFrame
		GameRegistry.addShapedRecipe(new ItemStack(BasicStairs.space_quartz_metalframe, 8), new Object[] { "  S", " SQ",
				"SQQ", 'S', new ItemStack(BasicItems.quartz_component), 'Q', new ItemStack(BasicItems.cyberit_gem) });
		// 85 Block_Space_Quartz_B
		GameRegistry.addShapedRecipe(new ItemStack(BasicStairs.block_space_quartzb, 6),
				new Object[] { "XXX", "   ", "XXX", 'X', new ItemStack(BasicItems.quartz_component) });
		// 86 Block_Space_Quartz_C
		GameRegistry.addShapedRecipe(new ItemStack(BasicStairs.block_space_quartzc, 6),
				new Object[] { "   ", " XX", " X ", 'X', new ItemStack(BasicItems.quartz_component) });
		// 87 Block_Space_Quartz_D
		GameRegistry.addShapedRecipe(new ItemStack(BasicStairs.block_space_quartzd, 6),
				new Object[] { "X X", "X X", "X X", 'X', new ItemStack(BasicItems.quartz_component) });
		// 88 Block_Space_Quartz_T
		GameRegistry.addShapedRecipe(new ItemStack(BasicStairs.block_space_quartzt, 6),
				new Object[] { "   ", " X ", "XXX", 'X', new ItemStack(BasicItems.quartz_component) });
		// 89 Block_Space_Quartz_Stair
		GameRegistry.addShapedRecipe(new ItemStack(BasicStairs.space_quartz_stair, 8),
				new Object[] { "  X", " XX", "XXX", 'X', new ItemStack(BasicItems.quartz_component) });
		// 90 BlockSolar_Panel
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.solar_panel, 6), new Object[] { "  X", " XG", "XGG", 'X',
				new ItemStack(BasicItems.quartz_component), 'G', new ItemStack(BasicBlocks.vitallium_glass) });
		// 91 BlockSatellite_Antenna
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.satellite_antenna, 8),
				new Object[] { " X ", "X X", " X ", 'X', new ItemStack(BasicItems.quartz_component) });
		// 92 BlockLight_Box(Limiting Light)
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.light_box, 8),
				new Object[] { "   ", " X ", "X X", 'X', new ItemStack(BasicItems.quartz_component) });
		// 93 Quartz_Window
		GameRegistry.addShapelessRecipe(new ItemStack(BasicBlocks.quartz_window, 5), Blocks.GLASS,
				BasicItems.quartz_component);

		// 94 Quartz_Window_Pane
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.quartz_window_pane, 16),
				new Object[] { "   ", "VVV", "VVV", 'V', new ItemStack(BasicBlocks.quartz_window) });
		// 95 Block_Engine
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.block_engine, 1),
				new Object[] { "AAA", "B B", "C C", 'A', new ItemStack(BasicItems.quartz_component), 'B',
						new ItemStack(BasicItems.kit3), 'C', new ItemStack(Blocks.REDSTONE_TORCH) });
		// 96 Block_Cyberol
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.block_cyberol, 5),
				new Object[] { "A A", " A ", "A A", 'A', new ItemStack(BasicItems.cyberit_gem) });
		// 97 Metal_Frame_L
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.metal_frame_l, 5),
				new Object[] { " F ", " FF", "   ", 'F', new ItemStack(BasicItems.vitallium_ingot) });
		// 98 Metal_Frame_Post
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.metal_frame_post, 5),
				new Object[] { "F F", "   ", "F F", 'F', new ItemStack(BasicItems.vitallium_ingot) });
		// 99 Metal_Frame_Straight
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.metal_frame_straight, 5),
				new Object[] { "F F", "F F", "F F", 'F', new ItemStack(BasicItems.vitallium_ingot) });
		// 100 Metal_Frame_T
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.metal_frame_t, 5),
				new Object[] { "FFF", " F ", " F ", 'F', new ItemStack(BasicItems.vitallium_ingot) });
		// 101 Metal_Frame_X
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.metal_frame_x, 5),
				new Object[] { "   ", "FFF", "   ", 'F', new ItemStack(BasicItems.vitallium_ingot) });
		// 102 Metal_Frame_Zero
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.metal_frame_zero, 5),
				new Object[] { " F ", " F ", " F ", 'F', new ItemStack(BasicItems.vitallium_ingot) });
		// 103 Metal_Ladder
		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.metal_ladder, 5),
				new Object[] { "F F", "FFF", "F F", 'F', new ItemStack(BasicItems.vitallium_ingot) });
		
		
		
		

	}

}
