//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.jason13.morebowsandarrows.registry;

import net.jason13.morebowsandarrows.CommonConstants;
import net.jason13.morebowsandarrows.renderer.projectile.AmethystArrowRenderer;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = CommonConstants.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ForgeRendererRegistry {

    @SubscribeEvent
    public static void registerArrowRenders(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer((EntityType) ForgeEntityTypeRegistry.AMETHYST_ARROW_ENTITY.get(), AmethystArrowRenderer::new);
    }
}
