package com.space.extended.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelBeetle extends ModelBase {
	// fields
	ModelRenderer Head;
	ModelRenderer Legleft1;
	ModelRenderer Legleft2;
	ModelRenderer Legleft3;
	ModelRenderer Legright1;
	ModelRenderer Legright2;
	ModelRenderer Legright3;
	ModelRenderer Neck1;
	ModelRenderer Body1Top;
	ModelRenderer Body2;
	ModelRenderer Tail1;
	ModelRenderer RearEnd2;
	ModelRenderer Tail2;
	ModelRenderer Tail3;
	ModelRenderer Tail4;
	ModelRenderer RearEnd1;
	ModelRenderer Neck2;
	ModelRenderer Body1;

	public ModelBeetle() {
		textureWidth = 128;
		textureHeight = 64;

		Head = new ModelRenderer(this, 32, 20);
		Head.addBox(-2F, -2F, -4F, 4, 3, 5);
		Head.setRotationPoint(0F, 16F, -6F);
		Head.setTextureSize(128, 64);
		Head.mirror = true;
		setRotation(Head, 0F, 0F, 0F);

		Legleft1 = new ModelRenderer(this, 18, 0);
		Legleft1.addBox(-1F, -1F, -1F, 16, 2, 2);
		Legleft1.setRotationPoint(4F, 16F, -1F);
		Legleft1.setTextureSize(128, 64);
		Legleft1.mirror = true;
		setRotation(Legleft1, 0F, 0.5759587F, 0.1919862F);

		Legleft2 = new ModelRenderer(this, 18, 0);
		Legleft2.addBox(-1F, -1F, -1F, 16, 2, 2);
		Legleft2.setRotationPoint(4F, 16F, 3F);
		Legleft2.setTextureSize(128, 64);
		Legleft2.mirror = true;
		setRotation(Legleft2, 0F, -0.2792527F, 0.1919862F);

		Legleft3 = new ModelRenderer(this, 18, 0);
		Legleft3.addBox(-1F, -1F, -1F, 16, 2, 2);
		Legleft3.setRotationPoint(4F, 16F, 7F);
		Legleft3.setTextureSize(128, 64);
		Legleft3.mirror = true;
		setRotation(Legleft3, 0F, -0.5759587F, 0.1919862F);

		Legright1 = new ModelRenderer(this, 18, 0);
		Legright1.addBox(-15F, -1F, -1F, 16, 2, 2);
		Legright1.setRotationPoint(-4F, 16F, -1F);
		Legright1.setTextureSize(128, 64);
		Legright1.mirror = true;
		setRotation(Legright1, 0F, -0.5759587F, -0.1919862F);

		Legright2 = new ModelRenderer(this, 18, 0);
		Legright2.addBox(-15F, -1F, -1F, 16, 2, 2);
		Legright2.setRotationPoint(-4F, 16F, 3F);
		Legright2.setTextureSize(128, 64);
		Legright2.mirror = true;
		setRotation(Legright2, 0F, 0.2792527F, -0.1919862F);

		Legright3 = new ModelRenderer(this, 18, 0);
		Legright3.addBox(-15F, -1F, -1F, 16, 2, 2);
		Legright3.setRotationPoint(-4F, 16F, 7F);
		Legright3.setTextureSize(128, 64);
		Legright3.mirror = true;
		setRotation(Legright3, 0F, 0.5759587F, -0.1919862F);

		Neck1 = new ModelRenderer(this, 32, 4);
		Neck1.addBox(-4F, -4F, -8F, 8, 7, 1);
		Neck1.setRotationPoint(0F, 15F, 4F);
		Neck1.setTextureSize(128, 64);
		Neck1.mirror = true;
		setRotation(Neck1, 0F, 0F, 0F);

		Body1Top = new ModelRenderer(this, 0, 34);
		Body1Top.addBox(-5F, -4F, -6F, 6, 1, 10);
		Body1Top.setRotationPoint(2F, 15F, 3F);
		Body1Top.setTextureSize(128, 64);
		Body1Top.mirror = true;
		setRotation(Body1Top, 0F, 0F, 0F);

		Body2 = new ModelRenderer(this, 0, 25);
		Body2.addBox(-5F, -4F, -6F, 8, 5, 3);
		Body2.setRotationPoint(1F, 17F, 15F);
		Body2.setTextureSize(128, 64);
		Body2.mirror = true;
		setRotation(Body2, 0F, 0F, 0F);

		Tail1 = new ModelRenderer(this, 0, 18);
		Tail1.addBox(-5F, -4F, -6F, 6, 4, 2);
		Tail1.setRotationPoint(2F, 17F, 18F);
		Tail1.setTextureSize(128, 64);
		Tail1.mirror = true;
		setRotation(Tail1, 0F, 0F, 0F);

		RearEnd2 = new ModelRenderer(this, 1, 0);
		RearEnd2.addBox(-0.5F, -1F, -1F, 1, 1, 4);
		RearEnd2.setRotationPoint(-1F, 10.5F, 22.10667F);
		RearEnd2.setTextureSize(128, 64);
		RearEnd2.mirror = true;
		setRotation(RearEnd2, 0.7733151F, -0.6543436F, 0F);

		Tail2 = new ModelRenderer(this, 0, 6);
		Tail2.addBox(-5F, -4F, -6F, 4, 3, 2);
		Tail2.setRotationPoint(3F, 17F, 20F);
		Tail2.setTextureSize(128, 64);
		Tail2.mirror = true;
		setRotation(Tail2, 0F, 0F, 0F);

		Tail3 = new ModelRenderer(this, 15, 12);
		Tail3.addBox(-1F, -1F, -1F, 2, 2, 4);
		Tail3.setRotationPoint(0F, 14F, 16F);
		Tail3.setTextureSize(128, 64);
		Tail3.mirror = true;
		setRotation(Tail3, 0.2974289F, 0F, 0F);

		Tail4 = new ModelRenderer(this, 1, 12);
		Tail4.addBox(-1F, -1F, -1F, 1, 2, 4);
		Tail4.setRotationPoint(0.5F, 12.69333F, 19.10667F);
		Tail4.setTextureSize(128, 64);
		Tail4.mirror = true;
		setRotation(Tail4, 0.7733151F, 0F, 0F);

		RearEnd1 = new ModelRenderer(this, 1, 0);
		RearEnd1.addBox(-0.5F, -1F, -1F, 1, 1, 4);
		RearEnd1.setRotationPoint(1F, 10.5F, 22.10667F);
		RearEnd1.setTextureSize(128, 64);
		RearEnd1.mirror = true;
		setRotation(RearEnd1, 0.7681514F, 0.6520605F, 0.0194155F);

		Neck2 = new ModelRenderer(this, 32, 13);
		Neck2.addBox(-4F, -4F, -8F, 6, 5, 1);
		Neck2.setRotationPoint(1F, 17F, 3F);
		Neck2.setTextureSize(128, 64);
		Neck2.mirror = true;
		setRotation(Neck2, 0F, 0F, 0F);

		Body1 = new ModelRenderer(this, 0, 46);
		Body1.addBox(-5F, -4F, -6F, 10, 6, 12);
		Body1.setRotationPoint(0F, 16F, 3F);
		Body1.setTextureSize(128, 64);
		Body1.mirror = true;
		setRotation(Body1, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scale) {

		setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
		Head.render(scale);
		Legleft1.render(scale);
		Legleft2.render(scale);
		Legleft3.render(scale);
		Legright1.render(scale);
		Legright2.render(scale);
		Legright3.render(scale);
		Neck1.render(scale);
		Body1Top.render(scale);
		Body2.render(scale);
		Tail1.render(scale);
		RearEnd2.render(scale);
		Tail2.render(scale);
		Tail3.render(scale);
		Tail4.render(scale);
		RearEnd1.render(scale);
		Neck2.render(scale);
		Body1.render(scale);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scaleFactor, Entity entityIn) {
		Head.rotateAngleY = netHeadYaw * 0.017453292F;
		Head.rotateAngleX = headPitch * 0.017453292F;
		float f = ((float) Math.PI / 4F);
		Legleft1.rotateAngleZ = ((float) Math.PI / 4F);
		Legleft2.rotateAngleZ = 0.58119464F;
		Legleft3.rotateAngleZ = ((float) Math.PI / 4F);
		Legright1.rotateAngleZ = -((float) Math.PI / 4F);
		Legright2.rotateAngleZ = -0.58119464F;
		Legright3.rotateAngleZ = -((float) Math.PI / 4F);
		float f1 = -0.0F;
		float f2 = 0.3926991F;
		Legleft1.rotateAngleY = ((float) Math.PI / 4F);
		Legleft2.rotateAngleY = -0.3926991F;
		Legleft3.rotateAngleY = -((float) Math.PI / 4F);
		Legright1.rotateAngleY = -((float) Math.PI / 4F);
		Legright2.rotateAngleY = 0.3926991F;
		Legright3.rotateAngleY = ((float) Math.PI / 4F);
		float f3 = -(MathHelper.cos((limbSwing * 0.6662F * 2.0F) + 0.0F) * 0.4F) * limbSwingAmount;
		float f4 = -(MathHelper.cos((limbSwing * 0.6662F * 2.0F) + (float) Math.PI) * 0.4F) * limbSwingAmount;
		float f5 = -(MathHelper.cos((limbSwing * 0.6662F * 2.0F) + ((float) Math.PI / 2F)) * 0.4F) * limbSwingAmount;
		float f6 = -(MathHelper.cos((limbSwing * 0.6662F * 2.0F) + (((float) Math.PI * 3F) / 2F)) * 0.4F)
				* limbSwingAmount;
		float f7 = Math.abs(MathHelper.sin((limbSwing * 0.6662F) + 0.0F) * 0.4F) * limbSwingAmount;
		float f8 = Math.abs(MathHelper.sin((limbSwing * 0.6662F) + (float) Math.PI) * 0.4F) * limbSwingAmount;
		float f9 = Math.abs(MathHelper.sin((limbSwing * 0.6662F) + ((float) Math.PI / 2F)) * 0.4F) * limbSwingAmount;
		float f10 = Math.abs(MathHelper.sin((limbSwing * 0.6662F) + (((float) Math.PI * 3F) / 2F)) * 0.4F)
				* limbSwingAmount;
		Legleft1.rotateAngleY += -f6;
		Legleft2.rotateAngleY += -f4;
		Legleft3.rotateAngleY += -f3;
		Legright1.rotateAngleY += f6;
		Legright2.rotateAngleY += f4;
		Legright3.rotateAngleY += f3;
		Legleft1.rotateAngleZ += -f10;
		Legleft2.rotateAngleZ += -f8;
		Legleft3.rotateAngleZ += -f7;
		Legright1.rotateAngleZ += f10;
		Legright2.rotateAngleZ += f8;
		Legright3.rotateAngleZ += f7;
	}

}
