package com.space.extended;

import com.space.extended.basicblocks.BasicBlocks;
import com.space.extended.basicstairs.BasicStairs;
import com.space.extended.creativetab.ArmorTab;
import com.space.extended.creativetab.FurnitureTab;
import com.space.extended.creativetab.SignTab;
import com.space.extended.creativetab.SpaceTab;
import com.space.extended.creativetab.StairsTab;
import com.space.extended.items.BasicItems;
import com.space.extended.mob.EntityBeetle;
import com.space.extended.mob.EntityMobBeetle;
import com.space.extended.proxy.CommonProxy;
import com.space.extended.tileentity.TileEntityTresor;
import com.space.extended.world.BasicWorldgenerater;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = SpaceExtendedMain.MODID, version = SpaceExtendedMain.VERSION, certificateFingerprint = SpaceExtendedMain.FINGERPRINT)
public class SpaceExtendedMain {
	public static final String MODID = "spaceextended";
	public static final String VERSION = "${version}";
	public static final String Name = "SpaceExtended";
	public static final String FINGERPRINT = "2238d4a92d81ab407741a2fdb741cebddfeacba6";

	public static final int RESERVESGUIID = 1;
	public static final int TRESORGUIID = 2;

	@Instance(MODID)
	public static SpaceExtendedMain INSTANCE;

	@SidedProxy(serverSide = "com.space.extended.proxy.CommonProxy", clientSide = "com.space.extended.proxy.ClientProxy", modId = MODID)
	public static CommonProxy PROXY = new CommonProxy();

	public static CreativeTabs spaceTab;
	public static CreativeTabs stairsTab;
	public static CreativeTabs armorTab;
	public static CreativeTabs furnitureTab;
	public static CreativeTabs signTab;

	@SuppressWarnings("unused")
	private SpaceextendedEntity entity;

	private BasicBlocks blocks;
	private BasicItems items;
	private BasicStairs stairs;
	
	private SpaceextendedSoundEvents sounds;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		PROXY.preInit();

		spaceTab = new SpaceTab();
		stairsTab = new StairsTab();
		armorTab = new ArmorTab();
		furnitureTab = new FurnitureTab();
		signTab = new SignTab();
		blocks = new BasicBlocks();
		items = new BasicItems();
		stairs = new BasicStairs();
		sounds = new SpaceextendedSoundEvents();

		PROXY.registerRenderer();

		entity = new SpaceextendedEntity();

		EntityBeetle.createEntity(EntityMobBeetle.class, "beetle");
		
		MinecraftForge.EVENT_BUS.register(blocks);
		MinecraftForge.EVENT_BUS.register(items);
		MinecraftForge.EVENT_BUS.register(stairs);
		MinecraftForge.EVENT_BUS.register(sounds);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		PROXY.load();

		NetworkRegistry.INSTANCE.registerGuiHandler(INSTANCE, new GuiHandler());

		GameRegistry.registerTileEntity(TileEntityTresor.class, "TileEntityTresor");

		new BasicSmelting();

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
