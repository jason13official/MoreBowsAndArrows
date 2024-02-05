package net.jason13.morebowsandarrows;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.jason13.morebowsandarrows.registry.FabricEntityTypeRegistry;
import net.jason13.morebowsandarrows.registry.FabricItemProperties;
import net.jason13.morebowsandarrows.renderer.projectile.AmethystArrowRenderer;

public class FabricExampleModClient implements ClientModInitializer {
  @Override
  public void onInitializeClient() {
    FabricItemProperties.registerBowModels();
    registerArrowRenderers();
  }
  
  private void registerArrowRenderers() {
    EntityRendererRegistry.register(FabricEntityTypeRegistry.AMETHYST_ARROW, AmethystArrowRenderer::new);
  }
}
