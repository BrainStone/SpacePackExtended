package com.space.extended;

import com.space.extended.basicblocks.BasicBlocks;
import com.space.extended.basicstairs.BasicStairs;

import com.space.extended.entity.render.RenderBeetle;
import com.space.extended.items.BasicItems;
import com.space.extended.mob.EntityBeetle;
import com.space.extended.mob.EntityMobBeetle;
import com.space.extended.proxy.CommonProxy;
import com.space.extended.spaceTab.SpaceTab;
import com.space.extended.tileentity.TileEntityTresor;
import com.space.extended.world.BasicWorldgenerater;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = SpaceExtendedMain.MODID, version = SpaceExtendedMain.VERSION)
public class SpaceExtendedMain {

	public static final String MODID = "spaceextended";
	public static final String VERSION = "MCvers.1.10  beta 0.1";
	public static final String Name = "SpaceExtended";

	public static final int RESERVESGUIID = 1;
	public static final int TRESORGUIID = 2;

	@Instance(MODID)
	public static SpaceExtendedMain INSTANCE = new SpaceExtendedMain();

	@SidedProxy(serverSide = "com.space.extended.proxy.CommonProxy", clientSide = "com.space.extended.proxy.ClientProxy", modId = MODID)
	public static CommonProxy PROXY = new CommonProxy();

	public static CreativeTabs tab;
	public static CreativeTabs tab1;
	public static CreativeTabs tab2;

	private SpaceextendedEntity entity;

	private BasicBlocks blocks;
	private BasicItems items;
	private BasicStairs stairs;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		PROXY.preInit();

		tab = new SpaceTab();
		tab1 = new StairsTab();
		tab2 = new ArmorTab();
		blocks = new BasicBlocks();
		items = new BasicItems();
		stairs = new BasicStairs();

		PROXY.registerRenderer();

		
		entity = new SpaceextendedEntity();

		EntityBeetle.createEntity(EntityMobBeetle.class, "Beetle");

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		PROXY.load();

		NetworkRegistry.INSTANCE.registerGuiHandler(INSTANCE, new GuiHandler());

		GameRegistry.registerTileEntity(TileEntityTresor.class, "TileEntityTresor");

		new BasicSmelting();
		new BasicCrafting();

		GameRegistry.registerWorldGenerator(new BasicWorldgenerater(), 0);

		MinecraftForge.EVENT_BUS.register(new Events());

		GameRegistry.registerFuelHandler(new SpaceextendedFuelHandler());

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		PROXY.postInit();

		PROXY.registerModels();

	}

}