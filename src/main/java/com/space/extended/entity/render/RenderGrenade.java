package com.space.extended.entity.render;

import com.space.extended.SpaceExtendedMain;
import com.space.extended.entity.EntityGrenade;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)

public class RenderGrenade extends Render<EntityGrenade> {

	public static final ResourceLocation RES = new ResourceLocation("spaceextended:textures/items/grenade.png");
	
	public RenderGrenade(RenderManager manager) {
		super(manager);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityGrenade entity) {

		return RES;
	}

}
