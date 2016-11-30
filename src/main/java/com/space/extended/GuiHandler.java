package com.space.extended;

import com.space.extended.gui.ContainerReserves;
import com.space.extended.gui.ContainerTresor;
import com.space.extended.gui.GuiReserves;
import com.space.extended.gui.GuiTresor;
import com.space.extended.gui.InventoryReserves;
import com.space.extended.tileentity.TileEntityTresor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch (ID) {

		case SpaceExtendedMain.RESERVESGUIID:
			return new ContainerReserves(player.inventory, new InventoryReserves(player.inventory.getCurrentItem()),
					player);
		case SpaceExtendedMain.TRESORGUIID:
			return new ContainerTresor(player.inventory, (TileEntityTresor) world.getTileEntity(new BlockPos(x, y, z)));
		default:
			return null;
		}

	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch (ID) {

		case SpaceExtendedMain.RESERVESGUIID:
			return new GuiReserves(new InventoryReserves(player.inventory.getCurrentItem()));
		case SpaceExtendedMain.TRESORGUIID:
			return new GuiTresor(new ContainerTresor(player.inventory,
					(TileEntityTresor) world.getTileEntity(new BlockPos(x, y, z))));
		default:
			return null;
		}

	}

}