package com.space.extended.basicstairs;

import com.space.extended.SpaceExtendedMain;
import com.space.extended.NameUtils;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BasicStairs {

	public static BlockStairs chairmonitorstairs;
	public static BlockStairs drillmonitor;
	public static BlockStairs pcdeskammo;
	public static BlockStairs vitalliumstairs;
	public static BlockStairs metalframestairs;
	public static BlockStairs lamp_stairs;
	public static BlockStairs strontenium_stairs;
	public static BlockStairs strontenium_stairs1;
	public static BlockStairs metal1_stairs;
	public static BlockStairs officechair_stairs;
	public static BlockStairs roof_stairs;
	public static BlockStairs klingonium_stairs;
	public static BlockStairs klingonium_pipes_stairs;
	public static BlockStairs consoles_stairs;
	public static BlockStairs pipes_stairs;
	public static BlockStairs pipesa_stairs;
	public static BlockStairs pipesb_stairs;
	public static BlockStairs pipesc_stairs;
	public static BlockStairs spaceship_control;
	public static BlockStairs spaceman_seat;
	public static BlockStairs laboratory_bench;
	public static BlockStairs microscope;
	public static BlockStairs block_space_quartzb;
	public static BlockStairs block_space_quartzt;
	public static BlockStairs block_space_quartzd; 
	public static BlockStairs block_space_quartzc;
	public static BlockStairs space_quartz_stair;
	public static BlockStairs space_quartz_metalframe;
	

	public BasicStairs() {
		init();
		register();
	}

	private void init() {
		chairmonitorstairs = (BlockStairs) new BlockStairsChairMonitorStairs().setCreativeTab(SpaceExtendedMain.tab1);
		NameUtils.setNames(chairmonitorstairs, "chairmonitorstairs");
		drillmonitor = (BlockStairs) new BlockStairsDrillMonitor().setCreativeTab(SpaceExtendedMain.tab1);
		NameUtils.setNames(drillmonitor, "drillmonitor");
		pcdeskammo = (BlockStairs) new BlockStairsPcDeskAmmo().setCreativeTab(SpaceExtendedMain.tab1);
		NameUtils.setNames(pcdeskammo, "pcdeskammo");
		vitalliumstairs = (BlockStairs) new BlockStairsVitalliumStairs().setCreativeTab(SpaceExtendedMain.tab);
		NameUtils.setNames(vitalliumstairs, "vitalliumstairs");
		metalframestairs = (BlockStairs) new BlockStairsMetalFrameStairs().setCreativeTab(SpaceExtendedMain.tab);
		NameUtils.setNames(metalframestairs, "metalframestairs");
		lamp_stairs = (BlockStairs) new BlockStairsLamp_Stairs().setCreativeTab(SpaceExtendedMain.tab1);
		NameUtils.setNames(lamp_stairs, "lamp_stairs");
		strontenium_stairs = (BlockStairs) new BlockStrontenium_Stairs().setCreativeTab(SpaceExtendedMain.tab1);
		NameUtils.setNames(strontenium_stairs, "strontenium_stairs");
		strontenium_stairs1 = (BlockStairs) new BlockStrontenium_Stairs1().setCreativeTab(SpaceExtendedMain.tab1);
		NameUtils.setNames(strontenium_stairs1, "strontenium_stairs1");
		metal1_stairs = (BlockStairs) new BlockMetal1_Stairs().setCreativeTab(SpaceExtendedMain.tab1);
		NameUtils.setNames(metal1_stairs, "metal1_stairs");
		officechair_stairs = (BlockStairs) new BlockOfficeChair_Stairs().setCreativeTab(SpaceExtendedMain.tab1);
		NameUtils.setNames(officechair_stairs, "officechair_stairs");
		klingonium_stairs = (BlockStairs) new BlockKlingonium_Stairs().setCreativeTab(SpaceExtendedMain.tab);
		NameUtils.setNames(klingonium_stairs, "klingonium_stairs");
		roof_stairs = (BlockStairs) new BlockRoof_Stairs().setCreativeTab(SpaceExtendedMain.tab);
		NameUtils.setNames(roof_stairs, "roof_stairs");
		klingonium_pipes_stairs = (BlockStairs) new BlockKlingonium_Pipes_Stairs()
				.setCreativeTab(SpaceExtendedMain.tab1);
		NameUtils.setNames(klingonium_pipes_stairs, "klingonium_pipes_stairs");
		consoles_stairs = (BlockStairs) new BlockConsoles_Stairs().setCreativeTab(SpaceExtendedMain.tab1);
		NameUtils.setNames(consoles_stairs, "consoles_stairs");
		pipes_stairs = (BlockStairs) new BlockPipes_Stairs().setCreativeTab(SpaceExtendedMain.tab1);
		NameUtils.setNames(pipes_stairs, "pipes_stairs");
		pipesa_stairs = (BlockStairs) new BlockPipesA_Stairs().setCreativeTab(SpaceExtendedMain.tab1);
		NameUtils.setNames(pipesa_stairs, "pipesa_stairs");
		pipesc_stairs = (BlockStairs) new BlockPipesC_Stairs().setCreativeTab(SpaceExtendedMain.tab1);
		NameUtils.setNames(pipesc_stairs, "pipesc_stairs");
		pipesb_stairs = (BlockStairs) new BlockPipesB_Stairs().setCreativeTab(SpaceExtendedMain.tab1);
		NameUtils.setNames(pipesb_stairs, "pipesb_stairs");
		spaceship_control = (BlockStairs) new BlockSpaceship_Control().setCreativeTab(SpaceExtendedMain.tab1);
		NameUtils.setNames(spaceship_control, "spaceship_control");
		spaceman_seat = (BlockStairs) new BlockSpaceMan_Seat().setCreativeTab(SpaceExtendedMain.tab1);
		NameUtils.setNames(spaceman_seat, "spaceman_seat");
		laboratory_bench = (BlockStairs) new BlockLaboratory_Bench().setCreativeTab(SpaceExtendedMain.tab1);
		NameUtils.setNames(laboratory_bench, "laboratory_bench");
		microscope = (BlockStairs) new BlockMicroscope().setCreativeTab(SpaceExtendedMain.tab1);
		NameUtils.setNames(microscope, "microscope");
		block_space_quartzb = (BlockStairs) new Block_Space_QuartzB().setCreativeTab(SpaceExtendedMain.tab1);
		NameUtils.setNames(block_space_quartzb, "block_space_quartzb");
		block_space_quartzt = (BlockStairs) new Block_Space_QuartzT().setCreativeTab(SpaceExtendedMain.tab1);
		NameUtils.setNames(block_space_quartzt, "block_space_quartzt");
		block_space_quartzd = (BlockStairs) new Block_Space_QuartzD().setCreativeTab(SpaceExtendedMain.tab1);
		NameUtils.setNames(block_space_quartzd, "block_space_quartzd");
		block_space_quartzc = (BlockStairs) new Block_Space_QuartzC().setCreativeTab(SpaceExtendedMain.tab1);
		NameUtils.setNames(block_space_quartzc, "block_space_quartzc");
		space_quartz_stair = (BlockStairs) new Block_Space_Quartz_Stair().setCreativeTab(SpaceExtendedMain.tab);
		NameUtils.setNames(space_quartz_stair, "space_quartz_stair");
		space_quartz_metalframe = (BlockStairs) new Block_Space_Quartz_MetalFrame().setCreativeTab(SpaceExtendedMain.tab);
		NameUtils.setNames(space_quartz_metalframe, "space_quartz_metalframe");
		

	}

	private void register() {
		this.registerBlockStairs(chairmonitorstairs);
		this.registerBlockStairs(drillmonitor);
		this.registerBlockStairs(pcdeskammo);
		this.registerBlockStairs(vitalliumstairs);
		this.registerBlockStairs(metalframestairs);
		this.registerBlockStairs(lamp_stairs);
		this.registerBlockStairs(strontenium_stairs);
		this.registerBlockStairs(strontenium_stairs1);
		this.registerBlockStairs(metal1_stairs);
		this.registerBlockStairs(officechair_stairs);
		this.registerBlockStairs(klingonium_stairs);
		this.registerBlockStairs(roof_stairs);
		this.registerBlockStairs(klingonium_pipes_stairs);
		this.registerBlockStairs(consoles_stairs);
		this.registerBlockStairs(pipes_stairs);
		this.registerBlockStairs(pipesa_stairs);
		this.registerBlockStairs(pipesc_stairs);
		this.registerBlockStairs(pipesb_stairs);
		this.registerBlockStairs(spaceship_control);
		this.registerBlockStairs(spaceman_seat);
		this.registerBlockStairs(laboratory_bench);
		this.registerBlockStairs(microscope);
		this.registerBlockStairs(block_space_quartzb);
		this.registerBlockStairs(block_space_quartzt);
		this.registerBlockStairs(block_space_quartzd);
		this.registerBlockStairs(block_space_quartzc);
		this.registerBlockStairs(space_quartz_stair);
		this.registerBlockStairs(space_quartz_metalframe);
		
	}

	private void registerBlockStairs(BlockStairs blockstairs) {
		GameRegistry.register(blockstairs);
		GameRegistry.register(new ItemBlock(blockstairs).setUnlocalizedName(blockstairs.getUnlocalizedName())
				.setRegistryName(blockstairs.getRegistryName()));

	}
}
