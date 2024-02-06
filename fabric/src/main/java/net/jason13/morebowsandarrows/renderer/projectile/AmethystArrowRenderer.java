package net.jason13.morebowsandarrows.renderer.projectile;

import net.jason13.morebowsandarrows.entity.projectile.AmethystArrowEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class AmethystArrowRenderer extends ArrowRenderer<AmethystArrowEntity> {
  public AmethystArrowRenderer(EntityRendererProvider.Context context) {
    super(context);
  }
  
  public ResourceLocation getTextureLocation(AmethystArrowEntity entity) {
    return new ResourceLocation("morebowsandarrows", "textures/entities/projectiles/arrows/amethyst_arrow.png");
  }
}