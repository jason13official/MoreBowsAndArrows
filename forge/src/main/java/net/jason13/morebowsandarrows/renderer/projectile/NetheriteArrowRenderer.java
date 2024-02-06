//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.jason13.morebowsandarrows.renderer.projectile;

import net.jason13.morebowsandarrows.entity.projectile.NetheriteArrowEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class NetheriteArrowRenderer extends ArrowRenderer<NetheriteArrowEntity> {
    public NetheriteArrowRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    public ResourceLocation getTextureLocation(NetheriteArrowEntity entity) {
        return new ResourceLocation("morebowsandarrows", "textures/entities/projectiles/arrows/netherite_arrow.png");
    }
}
