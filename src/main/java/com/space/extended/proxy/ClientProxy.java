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
		registerModel(BasicBlocks.pipes_connector, 0);
		registerModel(BasicBlocks.strontenita, 0);
		registerModel(BasicBlocks.strontenitb, 0);
		registerModel(BasicBlocks.strontenitc, 0);
		registerModel(BasicBlocks.strontenitd, 0);
		registerModel(BasicBlocks.strontenal, 0);
		registerModel(BasicBlocks.oxygen, 0);
		registerModel(BasicBlocks.perola, 0);
		registerModel(BasicBlocks.perolb, 0);
		registerModel(BasicBlocks.perolc, 0);
		registerModel(BasicBlocks.perold, 0);
		registerModel(BasicBlocks.table, 0);
		registerModel(BasicBlocks.strontopal, 0);
		registerModel(BasicBlocks.strontopala, 0);
		registerModel(BasicBlocks.strontopalb, 0);
		registerModel(BasicBlocks.lux, 0);
		registerModel(BasicBlocks.ceiling_lamp, 0);
		registerModel(BasicBlocks.speedway, 0);
		registerModel(BasicBlocks.klingopar, 0);
		registerModel(BasicBlocks.tresor, 0);
		registerModel(BasicBlocks.strontecore, 0);
		registerModel(BasicBlocks.cyberit_Ore, 0);
		registerModel(BasicBlocks.vitallium_glass, 0);
		registerModel(BasicBlocks.vitallium_glass_pane, 0);
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
		registerModel(BasicBlocks.light_box, 0);
		registerModel(BasicBlocks.quartz_window, 0);
		registerModel(BasicBlocks.quartz_window_pane, 0);
		registerModel(BasicBlocks.block_engine, 0);
		registerModel(BasicBlocks.block_cyberol, 0);
		registerModel(BasicBlocks.metal_lamp, 0);
		registerModel(BasicBlocks.lit_metal_lamp, 0);

		// Items
		registerModel(BasicItems.vitallium_ingot, 0);
		registerModel(BasicItems.klingonium_shard, 0);
		registerModel(BasicItems.strontenium_ingot, 0);
		registerModel(BasicItems.perolit_sphere, 0);
		registerModel(BasicItems.kit1, 0);
		registerModel(BasicItems.kit2, 0);
		registerModel(BasicItems.kit3, 0);
		registerModel(BasicItems.kit4, 0);
		registerModel(BasicItems.kit5, 0);
		registerModel(BasicItems.reserves, 0);
		registerModel(BasicItems.cyberit_gem, 0);
		registerModel(BasicItems.cyberit_beetle, 0);
		registerModel(BasicItems.quartz_component, 0);

		registerModel(BasicItems.grenade, 0);
		registerModel(BasicItems.flamethrower, 0);

		registerModel(BasicItems.vitallium_helmet, 0);
		registerModel(BasicItems.vitallium_chestplate, 0);
		registerModel(BasicItems.vitallium_leggings, 0);
		registerModel(BasicItems.vitallium_boots, 0);

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
