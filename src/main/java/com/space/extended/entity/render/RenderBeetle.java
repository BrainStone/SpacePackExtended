package com.space.extended.entity.render;

import com.space.extended.model.ModelBeetle;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)

public class RenderBeetle extends RenderLiving {

	public RenderBeetle(RenderManager renderManagerIn) {

		super(renderManagerIn, new ModelBeetle(), 0);

	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {

		return new ResourceLocation("spaceextended", "textures/entity/Beetle.png");
	}

}