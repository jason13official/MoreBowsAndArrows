package net.jason13.morebowsandarrows.registry;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class FabricItemProperties {
  public static void registerBowModels() {
    registerBow(FabricItemRegistry.AMETHYST_BOW);
  }
  
  private static void registerBow(Item bow) {
    ItemProperties.register(bow, new ResourceLocation("pull"), (stack, world, entity, seed) -> {
      if (entity == null) {
        return 0.0f;
      }
      if (entity.getUseItem() != stack) {
        return 0.0f;
      }
      return (float)(stack.getUseDuration() - entity.getUseItemRemainingTicks()) / 20.0f;
    });
    ItemProperties.register(bow, new ResourceLocation("pulling"),
      (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getUseItem() == stack ? 1.0f : 0.0f);
    
  }
}
