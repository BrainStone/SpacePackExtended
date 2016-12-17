package com.space.extended.basicblocks;

import com.space.extended.NameUtils;
import com.space.extended.SpaceExtendedMain;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BasicBlocks {

	public static Block vitallium;
	public static Block vitallium_ore;
	public static Block perolit;
	public static Block perolit_ore;
	public static Block metalframeblock;
	public static Block klingonit;
	public static Block klingodur;
	public static Block klingopar;
	public static Block klingonium_screw;
	public static Block klingonium;
	public static Block klingonium0;
	public static Block klingonium1;
	public static Block klingonium2;
	public static Block klingonium3;
	public static Block klingonium_wall0;
	public static Block klingonium_wall1;
	public static Block klingonium_wall2;
	public static Block klingonium_wall3;
	public static Block klingonium_wall4;
	public static Block klingonium_wall5;
	public static Block klingonium_wall6;
	public static Block klingonium_wall7;
	public static Block klingonium_wall8;
	public static Block klingonium_ore;
	public static Block constructor1;
	public static Block constructor2;
	public static Block constructor3;
	public static Block constructor4;
	public static Block constructor5;
	public static Block strontenium;
	public static Block strontenium_glass;
	public static Block strontenium_glass_pane;
	public static Block strontenium0;
	public static Block strontenium1;
	public static Block strontenium2;
	public static Block strontenium_ore;
	public static Block pipes_connector;
	public static Block strontenita;
	public static Block strontenitb;
	public static Block strontenitc;
	public static Block strontenitd;
	public static Block strontenal;
	public static Block strontopal;
	public static Block strontopala;
	public static Block strontopalb;
	public static Block oxygen;
	public static Block perola;
	public static Block perolb;
	public static Block perolc;
	public static Block perold;
	public static Block table;
	public static Block lux;
	public static Block ceiling_lamp;
	public static Block speedway;
	public static Block tresor;
	public static Block strontecore;
	public static Block block_space_quartz;
	public static Block block_space_quartza;
	public static Block block_space_quartz_mfblock;
	public static Block cyberit_Ore;
	public static Block vitallium_glass;
	public static Block vitallium_glass_pane;
	public static Block analyser;
	public static Block virtual_screen;
	public static Block space_quartz_ore;
	public static Block solar_panel;
	public static Block satellite_antenna;
	public static Block light_box;
	public static Block quartz_window;
	public static Block quartz_window_pane;
	public static Block block_engine;
	public static Block block_cyberol;
	public static Block metal_lamp;
	public static Block metal_lamp_lit;
	public static Block metal_frame_straight;
	public static Block metal_frame_l;
	public static Block metal_frame_t;
	public static Block metal_frame_x;
	public static Block metal_frame_post;
	public static Block metal_frame_zero;
	public static Block metal_ladder;
	
	public static Block half_vitallium_slab;
	public static Block double_vitallium_slab;
	
	
	
	public BasicBlocks() {
		init();
		register();

	}

	private void init() {
		vitallium = new BlockVitallium().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(vitallium, "vitallium");
		vitallium_ore = new BlockSpaceExtendedOre().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(vitallium_ore, "vitallium_ore");
		metalframeblock = new BlockMetalFrame().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(metalframeblock, "metalframeblock");
		klingodur = new BlockKlingodur().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(klingodur, "klingodur");
		klingonit = new BlockKlingonit().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(klingonit, "klingonit");
		klingonium_ore = new BlockSpaceExtendedOre().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(klingonium_ore, "klingonium_ore");
		constructor1 = new BlockConstructor().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(constructor1, "constructor1");
		constructor2 = new BlockConstructor().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(constructor2, "constructor2");
		constructor3 = new BlockConstructor().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(constructor3, "constructor3");
		constructor4 = new BlockConstructor().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(constructor4, "constructor4");
		constructor5 = new BlockConstructor().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(constructor5, "constructor5");
		strontenium = new BlockStrontenium().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(strontenium, "strontenium");
		strontenium0 = new BlockStrontenium0().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(strontenium0, "strontenium0");
		strontenium1 = new BlockStrontenium0().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(strontenium1, "strontenium1");
		strontenium2 = new BlockStrontenium0().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(strontenium2, "strontenium2");
		strontenium_ore = new BlockSpaceExtendedOre().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(strontenium_ore, "strontenium_ore");
		klingonium = new BlockKlingonium().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(klingonium, "klingonium");
		klingonium0 = new BlockKlingonium().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(klingonium0, "klingonium0");
		klingonium1 = new BlockKlingonium().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(klingonium1, "klingonium1");
		klingonium2 = new BlockKlingonium().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(klingonium2, "klingonium2");
		klingonium3 = new BlockKlingonium().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(klingonium3, "klingonium3");
		klingonium_wall0 = new BlockKlingonium_Wall().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(klingonium_wall0, "klingonium_wall0");
		klingonium_wall1 = new BlockKlingonium_Wall().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(klingonium_wall1, "klingonium_wall1");
		klingonium_wall2 = new BlockKlingonium_Wall().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(klingonium_wall2, "klingonium_wall2");
		klingonium_wall3 = new BlockKlingonium_Wall().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(klingonium_wall3, "klingonium_wall3");
		klingonium_wall4 = new BlockKlingonium_Wall().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(klingonium_wall4, "klingonium_wall4");
		klingonium_wall5 = new BlockKlingonium_Wall().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(klingonium_wall5, "klingonium_wall5");
		klingonium_wall6 = new BlockKlingonium_Wall().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(klingonium_wall6, "klingonium_wall6");
		klingonium_wall7 = new BlockKlingonium_Wall().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(klingonium_wall7, "klingonium_wall7");
		klingonium_wall8 = new BlockKlingonium_Wall().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(klingonium_wall8, "klingonium_wall8");
		klingonium_screw = new BlockKlingoniumScrew().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(klingonium_screw, "klingonium_screw");
		perolit = new BlockPerolit().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(perolit, "perolit");
		perolit_ore = new BlockSpaceExtendedOre().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(perolit_ore, "perolit_ore");
		pipes_connector = new BlockPipes_Connector().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(pipes_connector, "pipes_connector");
		strontenita = new BlockStrontenit().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(strontenita, "strontenita");
		strontenitb = new BlockStrontenit().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(strontenitb, "strontenitb");
		strontenitc = new BlockStrontenit().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(strontenitc, "strontenitc");
		strontenitd = new BlockStrontenit().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(strontenitd, "strontenitd");
		strontenal = new BlockStrontenal().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(strontenal, "strontenal");
		oxygen = new BlockOxygen().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(oxygen, "oxygen");
		perola = new BlockPerol().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(perola, "perola");
		perolb = new BlockPerol().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(perolb, "perolb");
		perolc = new BlockPerol().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(perolc, "perolc");
		perold = new BlockPerol().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(perold, "perold");
		table = new BlockTable().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(table, "table");
		strontopal = new BlockStrontopal().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(strontopal, "strontopal");
		strontopala = new BlockStrontopal().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(strontopala, "strontopala");
		strontopalb = new BlockStrontopal().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(strontopalb, "strontopalb");
		lux = new BlockLux().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(lux, "lux");
		ceiling_lamp = new BlockCeiling_Lamp().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(ceiling_lamp, "ceiling_lamp");
		speedway = new BlockSpeedWay().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(speedway, "speedway");
		klingopar = new BlockKlingoPar().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(klingopar, "klingopar");
		tresor = new BlockTresor().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(tresor, "tresor");
		strontecore = new BlockStronteCore().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(strontecore, "strontecore");
		strontenium_glass = new BlockStrontenium_Glass(Material.GLASS, false)
				.setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(strontenium_glass, "strontenium_glass");
		strontenium_glass_pane = new BlockStrontenium_Glass_Pane(Material.GLASS, false)
				.setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(strontenium_glass_pane, "strontenium_glass_pane");
		cyberit_Ore = new BlockSpaceExtendedOre().setLightLevel(0.7f).setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(cyberit_Ore, "cyberit_ore");
		analyser = new BlockAnalyser().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(analyser, "analyser");
		vitallium_glass = new BlockVitallium_Glass(Material.GLASS, false).setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(vitallium_glass, "vitallium_glass");
		vitallium_glass_pane = new BlockVitallium_Glass_Pane(Material.GLASS, false)
				.setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(vitallium_glass_pane, "vitallium_glass_pane");
		virtual_screen = new BlockVirtual_Screen(Material.GLASS, false).setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(virtual_screen, "virtual_screen");
		block_space_quartz = new Block_Space_Quartz().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(block_space_quartz, "block_space_quartz");
		block_space_quartza = new Block_Space_QuartzA().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(block_space_quartza, "block_space_quartza");
		block_space_quartz_mfblock = new Block_Space_Quartz_MFblock(null).setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(block_space_quartz_mfblock, "block_space_quartz_mfblock");
		space_quartz_ore = new BlockSpaceExtendedOre(Material.ROCK).setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(space_quartz_ore, "space_quartz_ore");
		solar_panel = new BlockSolar_Panel().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(solar_panel, "solar_panel");
		satellite_antenna = new BlockSatellite_Antenna().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(satellite_antenna, "satellite_antenna");
		light_box = new BlockLight_Box().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(light_box, "light_box");
		quartz_window = new BlockQuartz_Window(Material.GLASS, false).setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(quartz_window, "quartz_window");
		quartz_window_pane = new BlockQuartz_Window_Pane(Material.GLASS, false)
				.setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(quartz_window_pane, "quartz_window_pane");
		block_engine = new Block_Engine().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(block_engine, "block_engine");
		block_cyberol = new Block_Cyberol().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(block_cyberol, "block_cyberol");
		metal_lamp = new BlockMetalLamp(false).setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(metal_lamp, "metal_lamp");
		metal_lamp_lit = new BlockMetalLamp(true);
		NameUtils.setNames(metal_lamp_lit, "metal_lamp_lit");
		metal_frame_straight = new BlockMetal_Frame_Straight().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(metal_frame_straight, "metal_frame_straight");
		metal_frame_l = new BlockMetal_Frame_L().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(metal_frame_l, "metal_frame_l");
		metal_frame_t= new BlockMetal_Frame_T().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(metal_frame_t, "metal_frame_t");
		metal_frame_x= new BlockMetal_Frame_X().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(metal_frame_x, "metal_frame_x");
		metal_frame_post= new BlockMetal_Frame_Post().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(metal_frame_post, "metal_frame_post");
		metal_frame_zero= new BlockMetal_Frame_Zero().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(metal_frame_zero, "metal_frame_zero");
		metal_ladder= new BlockMetal_Ladder().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(metal_ladder, "metal_ladder");
		
		half_vitallium_slab= new BlockHalf_Vitallium_Slab().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(half_vitallium_slab, "half_vitallium_slab");
		double_vitallium_slab= new BlockDouble_Vitallium_Slab().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(double_vitallium_slab, "double_vitallium_slab");
		
		
		
		
		
	}

	private void register() {
		registerBlock(vitallium);
		registerBlock(vitallium_ore);
		registerBlock(metalframeblock);
		registerBlock(klingonium);
		registerBlock(klingodur);
		registerBlock(klingonit);
		registerBlock(klingonium0);
		registerBlock(klingonium1);
		registerBlock(klingonium2);
		registerBlock(klingonium3);
		registerBlock(klingonium_ore);
		registerBlock(constructor1);
		registerBlock(constructor2);
		registerBlock(constructor3);
		registerBlock(constructor4);
		registerBlock(constructor5);
		registerBlock(strontenium);
		registerBlock(strontenium0);
		registerBlock(strontenium1);
		registerBlock(strontenium2);
		registerBlock(strontenium_ore);
		registerBlock(klingonium_wall0);
		registerBlock(klingonium_wall1);
		registerBlock(klingonium_wall2);
		registerBlock(klingonium_wall3);
		registerBlock(klingonium_wall4);
		registerBlock(klingonium_wall5);
		registerBlock(klingonium_wall6);
		registerBlock(klingonium_wall7);
		registerBlock(klingonium_wall8);
		registerBlock(klingonium_screw);
		registerBlock(perolit);
		registerBlock(perolit_ore);
		registerBlock(pipes_connector);
		registerBlock(strontenita);
		registerBlock(strontenitb);
		registerBlock(strontenitc);
		registerBlock(strontenitd);
		registerBlock(strontenal);
		registerBlock(oxygen);
		registerBlock(perola);
		registerBlock(perolb);
		registerBlock(perolc);
		registerBlock(perold);
		registerBlock(table);
		registerBlock(strontopal);
		registerBlock(strontopala);
		registerBlock(strontopalb);
		registerBlock(lux);
		registerBlock(ceiling_lamp);
		registerBlock(speedway);
		registerBlock(klingopar);
		registerBlock(tresor);
		registerBlock(strontecore);
		registerBlock(cyberit_Ore);
		registerBlock(vitallium_glass);
		registerBlock(vitallium_glass_pane);
		registerBlock(strontenium_glass);
		registerBlock(strontenium_glass_pane);
		registerBlock(analyser);
		registerBlock(virtual_screen);
		registerBlock(block_space_quartz);
		registerBlock(block_space_quartza);
		registerBlock(block_space_quartz_mfblock);
		registerBlock(space_quartz_ore);
		registerBlock(solar_panel);
		registerBlock(satellite_antenna);
		registerBlock(light_box);
		registerBlock(quartz_window);
		registerBlock(quartz_window_pane);
		registerBlock(block_engine);
		registerBlock(block_cyberol);
		registerBlock(metal_lamp);
		registerBlock(metal_lamp_lit);
		registerBlock(metal_frame_straight);
		registerBlock(metal_frame_l);
		registerBlock(metal_frame_t);
		registerBlock(metal_frame_x);
		registerBlock(metal_frame_post);
		registerBlock(metal_frame_zero);
		registerBlock(metal_ladder);
		
		registerBlock(half_vitallium_slab);
		registerBlock(double_vitallium_slab);
	}

	private void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock itemblock = new ItemBlock(block);
		itemblock.setUnlocalizedName(block.getUnlocalizedName()).setRegistryName(block.getRegistryName());
		GameRegistry.register(itemblock);
	}

}
