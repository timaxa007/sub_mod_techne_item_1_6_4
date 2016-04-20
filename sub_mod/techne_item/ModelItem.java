package sub_mod.techne_item;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelItem extends ModelBase {

	ModelRenderer item;

	public ModelItem() {
		textureWidth = 32;
		textureHeight = 32;

		item = new ModelRenderer(this, 0, 0);
		item.addBox(0F, 0F, -1F, 14, 14, 2);
		item.setRotationPoint(-7F, 8F, 0F);
		item.setTextureSize(32, 32);
		item.mirror = true;
		setRotation(item, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		render(f5);
	}

	public void render() {
		render(0.0625F);
	}

	public void render(float f5) {
		item.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
