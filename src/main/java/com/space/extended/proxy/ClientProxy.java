package com.space.extended.proxy;

import com.space.extended.SpaceExtendedMain;
import com.space.extended.basicblocks.BasicBlocks;
import com.space.extended.basicstairs.BasicStairs;
import com.space.extended.entity.EntityGrenade;
import com.space.extended.entity.render.RenderBeetle;
import com.space.extended.items.BasicItems;
import com.space.extended.mob.EntityMobBeetle;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerModels() {

		// Blocks
		registerModel(BasicBlocks.vitallium, 0);
		registerModel(BasicBlocks.vitallium_ore, 0);
		registerModel(BasicBlocks.metalframeblock, 0);
		registerModel(BasicBlocks.klingonium, 0);
		registerModel(BasicBlocks.klingonit, 0);
		registerModel(BasicBlocks.klingosit, 0);
		registerModel(BasicBlocks.klingosita, 0);
		registerModel(BasicBlocks.klingositb, 0);
		registerModel(BasicBlocks.klingodur, 0);
		registerModel(BasicBlocks.klingonium_screw, 0);
		registerModel(BasicBlocks.klingonium0, 0);
		registerModel(BasicBlocks.klingonium1, 0);
		registerModel(BasicBlocks.klingonium2, 0);
		registerModel(BasicBlocks.klingonium3, 0);
		registerModel(BasicBlocks.klingonium_ore, 0);
		registerModel(BasicBlocks.constructor1, 0);
		registerModel(BasicBlocks.constructor2, 0);
		registerModel(BasicBlocks.constructor3, 0);
		registerModel(BasicBlocks.constructor4, 0);
		registerModel(BasicBlocks.constructor5, 0);
		registerModel(BasicBlocks.transport_box, 0);
		registerModel(BasicBlocks.transport_box1, 0);
		registerModel(BasicBlocks.strontenium, 0);
		registerModel(BasicBlocks.strontenium0, 0);
		registerModel(BasicBlocks.strontenium1, 0);
		registerModel(BasicBlocks.strontenium2, 0);
		registerModel(BasicBlocks.strontenium_ore, 0);
		registerModel(BasicBlocks.klingonium_wall0, 0);
		registerModel(BasicBlocks.klingonium_wall1, 0);
		registerModel(BasicBlocks.klingonium_wall2, 0);
		registerModel(BasicBlocks.klingonium_wall3, 0);
		registerModel(BasicBlocks.klingonium_wall4, 0);
		registerModel(BasicBlocks.klingonium_wall5, 0);
		registerModel(BasicBlocks.klingonium_wall6, 0);
		registerModel(BasicBlocks.klingonium_wall7, 0);
		registerModel(BasicBlocks.klingonium_wall8, 0);
		registerModel(BasicBlocks.perolit, 0);
		registerModel(BasicBlocks.perolit_ore, 0);
		registerModel(BasicBlocks.ironium_ore, 0);
		registerModel(BasicBlocks.pipes_connector, 0);
		registerModel(BasicBlocks.strontenita, 0);
		registerModel(BasicBlocks.strontenitb, 0);
		registerModel(BasicBlocks.strontenitc, 0);
		registerModel(BasicBlocks.strontenitd, 0);
		registerModel(BasicBlocks.strontenal, 0);
		registerModel(BasicBlocks.oxygen, 0);
		registerModel(BasicBlocks.perold, 0);
		registerModel(BasicBlocks.table, 0);
		registerModel(BasicBlocks.table1, 0);
		registerModel(BasicBlocks.couch_table, 0);
		registerModel(BasicBlocks.chair, 0);
		registerModel(BasicBlocks.single_arm_chair, 0);
		registerModel(BasicBlocks.single_stool, 0);
		registerModel(BasicBlocks.strontopal, 0);
		registerModel(BasicBlocks.strontopala, 0);
		registerModel(BasicBlocks.strontopalb, 0);
		registerModel(BasicBlocks.lux, 0);
		registerModel(BasicBlocks.ceiling_lamp, 0);
		registerModel(BasicBlocks.spot_lamp, 0);
		registerModel(BasicBlocks.kitchen_lamp, 0);
		registerModel(BasicBlocks.speedway, 0);
		registerModel(BasicBlocks.klingopar, 0);
		registerModel(BasicBlocks.tresor, 0);
		registerModel(BasicBlocks.strontecore, 0);
		registerModel(BasicBlocks.cyberit_Ore, 0);
		registerModel(BasicBlocks.vitallium_glass, 0);
		registerModel(BasicBlocks.vitallium_glass_pane, 0);
		registerModel(BasicBlocks.ironit_glass, 0);
		registerModel(BasicBlocks.ironit_glass_pane, 0);
		registerModel(BasicBlocks.strontenium_glass, 0);
		registerModel(BasicBlocks.strontenium_glass_pane, 0);
		registerModel(BasicBlocks.analyser, 0);
		registerModel(BasicBlocks.virtual_screen, 0);
		registerModel(BasicBlocks.block_space_quartz, 0);
		registerModel(BasicBlocks.block_space_quartza, 0);
		registerModel(BasicBlocks.block_space_quartz_mfblock, 0);
		registerModel(BasicBlocks.space_quartz_ore, 0);
		registerModel(BasicBlocks.solar_panel, 0);
		registerModel(BasicBlocks.satellite_antenna, 0);
		registerModel(BasicBlocks.stand_console, 0);
		registerModel(BasicBlocks.light_box, 0);
		registerModel(BasicBlocks.quartz_window, 0);
		registerModel(BasicBlocks.quartz_window_pane, 0);
		registerModel(BasicBlocks.block_engine, 0);
		registerModel(BasicBlocks.block_ribbed, 0);
		registerModel(BasicBlocks.block_cyberol, 0);
		registerModel(BasicBlocks.bollard_lamp, 0);
		registerModel(BasicBlocks.bollard_lamp_lit, 0);
		registerModel(BasicBlocks.metal_lamp, 0);
		registerModel(BasicBlocks.metal_lamp_lit, 0);
		registerModel(BasicBlocks.wall_lamp, 0);
		registerModel(BasicBlocks.wall_lamp_lit, 0);
		registerModel(BasicBlocks.cellar_lamp, 0);
		registerModel(BasicBlocks.cellar_lamp_lit, 0);
		registerModel(BasicBlocks.alarm_light, 0);
		registerModel(BasicBlocks.alarm_light_lit, 0);
		registerModel(BasicBlocks.pump, 0);
		registerModel(BasicBlocks.pump_lit, 0);
		registerModel(BasicBlocks.metal_diagonal, 0);
		registerModel(BasicBlocks.metal_frame_straight, 0);
		registerModel(BasicBlocks.metal_frame_l, 0);
		registerModel(BasicBlocks.metal_frame_t, 0);
		registerModel(BasicBlocks.metal_frame_x, 0);
		registerModel(BasicBlocks.metal_frame_post, 0);
		registerModel(BasicBlocks.metal_frame_zero, 0);
		registerModel(BasicBlocks.metal_frame_vert, 0);
		registerModel(BasicBlocks.vitallium_grid, 0);
		registerModel(BasicBlocks.metal_ladder, 0);
		registerModel(BasicBlocks.space_quartz_slab_half, 0);
		registerModel(BasicBlocks.space_quartz_slab_double, 0);
		registerModel(BasicBlocks.vitallium_slab_half, 0);
		registerModel(BasicBlocks.vitallium_slab_double, 0);
		registerModel(BasicBlocks.ironit_glass_slab_half, 0);
		registerModel(BasicBlocks.ironit_glass_slab_double, 0);
		registerModel(BasicBlocks.metal_frame_slab_half, 0);
		registerModel(BasicBlocks.metal_frame_slab_double, 0);
		registerModel(BasicBlocks.lever1, 0);
		registerModel(BasicBlocks.lever2, 0);
		registerModel(BasicBlocks.lever3, 0);
		registerModel(BasicBlocks.power_switch, 0);
		registerModel(BasicBlocks.bed1, 0);
		registerModel(BasicBlocks.wash_basin, 0);
		registerModel(BasicBlocks.cooker, 0);
		registerModel(BasicBlocks.metal_button, 0);
		registerModel(BasicBlocks.concrete_pp, 0);
		registerModel(BasicBlocks.klingonit_pp, 0);
		registerModel(BasicBlocks.klingonit1_pp, 0);
		registerModel(BasicBlocks.klingonit2_pp, 0);
		registerModel(BasicBlocks.metalframe_door, 0);
		registerModel(BasicBlocks.vitallium_door, 0);
		registerModel(BasicBlocks.ironit_door, 0);
		registerModel(BasicBlocks.glass_door, 0);
		registerModel(BasicBlocks.concrete_brown_door, 0);
		registerModel(BasicBlocks.secret_stone_door, 0);
		registerModel(BasicBlocks.vitallium_fence, 0);
		registerModel(BasicBlocks.vitallium_fence_gate, 0);
		registerModel(BasicBlocks.strontenium_fence, 0);
		registerModel(BasicBlocks.strontenium_fence_gate, 0);
		registerModel(BasicBlocks.greydur_gate, 0);
		registerModel(BasicBlocks.steel_door, 0);
		registerModel(BasicBlocks.chromium_door, 0);
		registerModel(BasicBlocks.wall_panel, 0);
		registerModel(BasicBlocks.wall_panel1, 0);
		registerModel(BasicBlocks.wall_panel2, 0);
		registerModel(BasicBlocks.wall_panel3, 0);
		registerModel(BasicBlocks.cupboard, 0);
		registerModel(BasicBlocks.cupboard1, 0);
		registerModel(BasicBlocks.cupboard2, 0);
		registerModel(BasicBlocks.cupboard3, 0);
		registerModel(BasicBlocks.cupboard4, 0);
		registerModel(BasicBlocks.cupboard_outer, 0);
		registerModel(BasicBlocks.cupboard_inner, 0);
		registerModel(BasicBlocks.cupboard_microwave, 0);
		registerModel(BasicBlocks.cupboard_lower, 0);
		registerModel(BasicBlocks.cupboard_lower1, 0);
		registerModel(BasicBlocks.cupboard_lower2, 0);
		registerModel(BasicBlocks.cupboard_lower3, 0);
		registerModel(BasicBlocks.cupboard_lower_outer, 0);
		registerModel(BasicBlocks.klingolight, 0);
		registerModel(BasicBlocks.notice_board, 0);
		registerModel(BasicBlocks.notice_board2, 0);
		registerModel(BasicBlocks.notice_board3, 0);
		registerModel(BasicBlocks.notice_board4, 0);
		registerModel(BasicBlocks.notice_board5, 0);
		registerModel(BasicBlocks.notice_board_level0, 0);
		registerModel(BasicBlocks.notice_board_level1, 0);
		registerModel(BasicBlocks.notice_board_level2, 0);
		registerModel(BasicBlocks.notice_board_level3, 0);
		registerModel(BasicBlocks.notice_board_level4, 0);
		registerModel(BasicBlocks.notice_board_level5, 0);
		registerModel(BasicBlocks.notice_sign, 0);
		registerModel(BasicBlocks.notice_sign1, 0);
		registerModel(BasicBlocks.notice_sign2, 0);
		registerModel(BasicBlocks.notice_sign3, 0);
		registerModel(BasicBlocks.notice_sign4, 0);
		registerModel(BasicBlocks.safety_board, 0);
		registerModel(BasicBlocks.safety_board1, 0);
		registerModel(BasicBlocks.safety_board2, 0);
		registerModel(BasicBlocks.safety_board3, 0);
		registerModel(BasicBlocks.safety_board4, 0);
		registerModel(BasicBlocks.safety_board5, 0);
		registerModel(BasicBlocks.safety_board6, 0);
		registerModel(BasicBlocks.music_rack, 0);
		registerModel(BasicBlocks.notebook, 0);
		registerModel(BasicBlocks.pyramid, 0);
		registerModel(BasicBlocks.hydraulic_bottom, 0);
		registerModel(BasicBlocks.hydraulic_top, 0);
		registerModel(BasicBlocks.hydraulic_middle, 0);
		registerModel(BasicBlocks.hydraulic_bottom_horizontal, 0);
		registerModel(BasicBlocks.hydraulic_middle_horizontal, 0);
		registerModel(BasicBlocks.gate_bottom_left, 0);
		registerModel(BasicBlocks.gate_middle_left, 0);
		registerModel(BasicBlocks.gate_top_left, 0);
		registerModel(BasicBlocks.gate_top_middle, 0);
		registerModel(BasicBlocks.gate_top_right, 0);
		registerModel(BasicBlocks.gate_middle_right, 0);
		registerModel(BasicBlocks.gate_bottom_right, 0);
		registerModel(BasicBlocks.slope_pipes_connector, 0);
		registerModel(BasicBlocks.power_station, 0);
		registerModel(BasicBlocks.greydur, 0);
		registerModel(BasicBlocks.klingodur_gate, 0);
		registerModel(BasicBlocks.hydraulic_door_left, 0);

		// Items
		registerModel(BasicItems.vitallium_ingot, 0);
		registerModel(BasicItems.klingonium_shard, 0);
		registerModel(BasicItems.strontenium_ingot, 0);
		registerModel(BasicItems.perolit_sphere, 0);
		registerModel(BasicItems.ironit_crystal, 0);
		registerModel(BasicItems.kit1, 0);
		registerModel(BasicItems.kit2, 0);
		registerModel(BasicItems.kit3, 0);
		registerModel(BasicItems.kit4, 0);
		registerModel(BasicItems.kit5, 0);
		registerModel(BasicItems.reserves, 0);
		registerModel(BasicItems.vitallium_door, 0);
		registerModel(BasicItems.strontenit_door, 0);
		registerModel(BasicItems.metalframe_door, 0);
		registerModel(BasicItems.ironit_door, 0);
		registerModel(BasicItems.glass_door, 0);
		registerModel(BasicItems.concrete_brown_door, 0);
		registerModel(BasicItems.secret_stone_door, 0);
		registerModel(BasicItems.bed1, 0);
		registerModel(BasicItems.cyberit_gem, 0);
		registerModel(BasicItems.cyberit_beetle, 0);
		registerModel(BasicItems.quartz_component, 0);

		registerModel(BasicItems.grenade, 0);
		registerModel(BasicItems.flamethrower, 0);

		registerModel(BasicItems.vitallium_helmet, 0);
		registerModel(BasicItems.vitallium_chestplate, 0);
		registerModel(BasicItems.vitallium_leggings, 0);
		registerModel(BasicItems.vitallium_boots, 0);
		
		registerModel(BasicItems.diving_suit_helmet, 0);
		registerModel(BasicItems.diving_suit_chestplate, 0);
		registerModel(BasicItems.diving_suit_leggings, 0);
		registerModel(BasicItems.diving_suit_boots, 0);
		

		// Stairs
		registerModel(BasicStairs.chairmonitorstairs, 0);
		registerModel(BasicStairs.drillmonitor, 0);
		registerModel(BasicStairs.pcdeskammo, 0);
		registerModel(BasicStairs.vitalliumstairs, 0);
		registerModel(BasicStairs.metalframestairs, 0);
		registerModel(BasicStairs.lamp_stairs, 0);
		registerModel(BasicStairs.strontenium_stairs, 0);
		registerModel(BasicStairs.strontenium_stairs1, 0);
		registerModel(BasicStairs.metal1_stairs, 0);
		registerModel(BasicStairs.officechair_stairs, 0);
		registerModel(BasicStairs.klingonium_stairs, 0);
		registerModel(BasicStairs.roof_stairs, 0);
		registerModel(BasicStairs.klingonium_pipes_stairs, 0);
		registerModel(BasicStairs.consoles_stairs, 0);
		registerModel(BasicStairs.pipes_stairs, 0);
		registerModel(BasicStairs.pipesa_stairs, 0);
		registerModel(BasicStairs.pipesc_stairs, 0);
		registerModel(BasicStairs.pipesb_stairs, 0);
		registerModel(BasicStairs.spaceship_control, 0);
		registerModel(BasicStairs.spaceman_seat, 0);
		registerModel(BasicStairs.laboratory_bench, 0);
		registerModel(BasicStairs.microscope, 0);
		registerModel(BasicStairs.block_space_quartzb, 0);
		registerModel(BasicStairs.block_space_quartzt, 0);
		registerModel(BasicStairs.block_space_quartzd, 0);
		registerModel(BasicStairs.block_space_quartzc, 0);
		registerModel(BasicStairs.space_quartz_stair, 0);
		registerModel(BasicStairs.space_quartz_metalframe, 0);
		registerModel(BasicStairs.carrel, 0);
		registerModel(BasicStairs.slope_pipes, 0);
		registerModel(BasicStairs.concrete_stairs, 0);
		registerModel(BasicStairs.arm_chair, 0);
		registerModel(BasicStairs.ironit_glass_stairs, 0);
		registerModel(BasicStairs.concrete1_stairs, 0);
	}

	@Override
	public void registerRenderer() {

		RenderingRegistry.registerEntityRenderingHandler(EntityGrenade.class, new IRenderFactory<EntityGrenade>() {
			@Override
			public Render<EntityGrenade> createRenderFor(RenderManager manager) {
				return new RenderSnowball<EntityGrenade>(manager, BasicItems.grenade,
						Minecraft.getMinecraft().getRenderItem());

			}
		});

		RenderingRegistry.registerEntityRenderingHandler(EntityMobBeetle.class, new IRenderFactory<EntityMobBeetle>() {
			@Override
			public Render<? super EntityMobBeetle> createRenderFor(RenderManager manager) {

				return new RenderBeetle(manager);
			}
		});
	}

	private void registerModel(Object obj, int meta) {

		Item item;
		if (obj instanceof Item) {
			item = (Item) obj;
		} else if (obj instanceof Block) {
			item = Item.getItemFromBlock((Block) obj);
		} else if (obj instanceof BlockStairs) {
			item = Item.getItemFromBlock((BlockStairs) obj);
		} else
			throw new IllegalArgumentException();

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(
				SpaceExtendedMain.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
