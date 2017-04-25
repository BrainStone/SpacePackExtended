package com.space.extended.basicstairs;

import com.space.extended.NameUtils;
import com.space.extended.SpaceExtendedMain;

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
	public static BlockStairs space_quartz_stair;
	public static BlockStairs block_space_quartzb;
	public static BlockStairs block_space_quartzt;
	public static BlockStairs block_space_quartzd;
	public static BlockStairs block_space_quartzc;
	public static BlockStairs space_quartz_metalframe;
	public static BlockStairs carrel;
	public static BlockStairs slope_pipes;
	public static BlockStairs concrete_stairs;
	public static BlockStairs arm_chair;
	public static BlockStairs ironit_glass_stairs;

	public BasicStairs() {
		init();
		register();
	}

	private void init() {
		chairmonitorstairs = (BlockStairs) new BlockStairsChairMonitorStairs()
				.setCreativeTab(SpaceExtendedMain.stairsTab);
		NameUtils.setNames(chairmonitorstairs, "chairmonitorstairs");
		drillmonitor = (BlockStairs) new BlockStairsDrillMonitor().setCreativeTab(SpaceExtendedMain.stairsTab);
		NameUtils.setNames(drillmonitor, "drillmonitor");
		pcdeskammo = (BlockStairs) new BlockStairsPcDeskAmmo().setCreativeTab(SpaceExtendedMain.stairsTab);
		NameUtils.setNames(pcdeskammo, "pcdeskammo");
		vitalliumstairs = (BlockStairs) new BlockStairsVitalliumStairs().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(vitalliumstairs, "vitalliumstairs");
		metalframestairs = (BlockStairs) new BlockStairsMetalFrameStairs().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(metalframestairs, "metalframestairs");
		lamp_stairs = (BlockStairs) new BlockStairsLampStairs().setCreativeTab(SpaceExtendedMain.stairsTab);
		NameUtils.setNames(lamp_stairs, "lamp_stairs");
		strontenium_stairs = (BlockStairs) new BlockStronteniumStairs().setCreativeTab(SpaceExtendedMain.stairsTab);
		NameUtils.setNames(strontenium_stairs, "strontenium_stairs");
		strontenium_stairs1 = (BlockStairs) new BlockStronteniumStairs().setCreativeTab(SpaceExtendedMain.stairsTab);
		NameUtils.setNames(strontenium_stairs1, "strontenium_stairs1");
		metal1_stairs = (BlockStairs) new BlockMetal1Stairs().setCreativeTab(SpaceExtendedMain.stairsTab);
		NameUtils.setNames(metal1_stairs, "metal1_stairs");
		officechair_stairs = (BlockStairs) new BlockOfficeChairStairs().setCreativeTab(SpaceExtendedMain.stairsTab);
		NameUtils.setNames(officechair_stairs, "officechair_stairs");
		klingonium_stairs = (BlockStairs) new BlockKlingoniumStairs().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(klingonium_stairs, "klingonium_stairs");
		roof_stairs = (BlockStairs) new BlockRoofStairs().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(roof_stairs, "roof_stairs");
		klingonium_pipes_stairs = (BlockStairs) new BlockKlingoniumPipesStairs()
				.setCreativeTab(SpaceExtendedMain.stairsTab);
		NameUtils.setNames(klingonium_pipes_stairs, "klingonium_pipes_stairs");
		consoles_stairs = (BlockStairs) new BlockConsolesStairs().setCreativeTab(SpaceExtendedMain.stairsTab);
		NameUtils.setNames(consoles_stairs, "consoles_stairs");
		pipes_stairs = (BlockStairs) new BlockPipesStairs().setCreativeTab(SpaceExtendedMain.stairsTab);
		NameUtils.setNames(pipes_stairs, "pipes_stairs");
		pipesa_stairs = (BlockStairs) new BlockPipesStairs().setCreativeTab(SpaceExtendedMain.stairsTab);
		NameUtils.setNames(pipesa_stairs, "pipesa_stairs");
		pipesc_stairs = (BlockStairs) new BlockPipesStairs().setCreativeTab(SpaceExtendedMain.stairsTab);
		NameUtils.setNames(pipesc_stairs, "pipesc_stairs");
		pipesb_stairs = (BlockStairs) new BlockPipesStairs().setCreativeTab(SpaceExtendedMain.stairsTab);
		NameUtils.setNames(pipesb_stairs, "pipesb_stairs");
		spaceship_control = (BlockStairs) new BlockSpaceshipControl().setCreativeTab(SpaceExtendedMain.stairsTab);
		NameUtils.setNames(spaceship_control, "spaceship_control");
		spaceman_seat = (BlockStairs) new BlockSpaceManSeat().setCreativeTab(SpaceExtendedMain.stairsTab);
		NameUtils.setNames(spaceman_seat, "spaceman_seat");
		laboratory_bench = (BlockStairs) new BlockLaboratoryBench().setCreativeTab(SpaceExtendedMain.stairsTab);
		NameUtils.setNames(laboratory_bench, "laboratory_bench");
		microscope = (BlockStairs) new BlockMicroscope().setCreativeTab(SpaceExtendedMain.stairsTab);
		NameUtils.setNames(microscope, "microscope");
		space_quartz_stair = (BlockStairs) new BlockSpaceQuartzStair().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(space_quartz_stair, "space_quartz_stair");
		block_space_quartzb = (BlockStairs) new BlockSpaceQuartzStair().setCreativeTab(SpaceExtendedMain.stairsTab);
		NameUtils.setNames(block_space_quartzb, "block_space_quartzb");
		block_space_quartzt = (BlockStairs) new BlockSpaceQuartzStair().setCreativeTab(SpaceExtendedMain.stairsTab);
		NameUtils.setNames(block_space_quartzt, "block_space_quartzt");
		block_space_quartzd = (BlockStairs) new BlockSpaceQuartzStair().setCreativeTab(SpaceExtendedMain.stairsTab);
		NameUtils.setNames(block_space_quartzd, "block_space_quartzd");
		block_space_quartzc = (BlockStairs) new BlockSpaceQuartzStair().setCreativeTab(SpaceExtendedMain.stairsTab);
		NameUtils.setNames(block_space_quartzc, "block_space_quartzc");
		space_quartz_metalframe = (BlockStairs) new BlockSpaceQuartzMetalFrame()
				.setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(space_quartz_metalframe, "space_quartz_metalframe");
		carrel = (BlockStairs) new BlockCarrel().setCreativeTab(SpaceExtendedMain.stairsTab);
		NameUtils.setNames(carrel, "carrel");
		slope_pipes = (BlockStairs) new BlockSlopePipes().setCreativeTab(SpaceExtendedMain.stairsTab);
		NameUtils.setNames(slope_pipes, "slope_pipes");
		concrete_stairs = (BlockStairs) new BlockConcreteStairs().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(concrete_stairs, "concrete_stairs");
		arm_chair = (BlockStairs) new BlockArmChair().setCreativeTab(SpaceExtendedMain.furnitureTab);
		NameUtils.setNames(arm_chair, "arm_chair");
		ironit_glass_stairs = (BlockStairs) new BlockIronitGlassStairs().setCreativeTab(SpaceExtendedMain.spaceTab);
		NameUtils.setNames(ironit_glass_stairs, "ironit_glass_stairs");
		
		

	}

	private void register() {
		registerBlockStairs(chairmonitorstairs);
		registerBlockStairs(drillmonitor);
		registerBlockStairs(pcdeskammo);
		registerBlockStairs(vitalliumstairs);
		registerBlockStairs(metalframestairs);
		registerBlockStairs(lamp_stairs);
		registerBlockStairs(strontenium_stairs);
		registerBlockStairs(strontenium_stairs1);
		registerBlockStairs(metal1_stairs);
		registerBlockStairs(officechair_stairs);
		registerBlockStairs(klingonium_stairs);
		registerBlockStairs(roof_stairs);
		registerBlockStairs(klingonium_pipes_stairs);
		registerBlockStairs(consoles_stairs);
		registerBlockStairs(pipes_stairs);
		registerBlockStairs(pipesa_stairs);
		registerBlockStairs(pipesc_stairs);
		registerBlockStairs(pipesb_stairs);
		registerBlockStairs(spaceship_control);
		registerBlockStairs(spaceman_seat);
		registerBlockStairs(laboratory_bench);
		registerBlockStairs(microscope);
		registerBlockStairs(block_space_quartzb);
		registerBlockStairs(block_space_quartzt);
		registerBlockStairs(block_space_quartzd);
		registerBlockStairs(block_space_quartzc);
		registerBlockStairs(space_quartz_stair);
		registerBlockStairs(space_quartz_metalframe);
		registerBlockStairs(carrel);
		registerBlockStairs(slope_pipes);
		registerBlockStairs(concrete_stairs);
		registerBlockStairs(arm_chair);
		registerBlockStairs(ironit_glass_stairs);
		
	}

	private void registerBlockStairs(BlockStairs blockstairs) {
		GameRegistry.register(blockstairs);
		GameRegistry.register(new ItemBlock(blockstairs).setUnlocalizedName(blockstairs.getUnlocalizedName())
				.setRegistryName(blockstairs.getRegistryName()));
	}
}
