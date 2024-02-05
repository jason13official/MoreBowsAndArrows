package net.jason13.morebowsandarrows.registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.jason13.morebowsandarrows.CommonConstants;
import net.jason13.morebowsandarrows.entity.projectile.AmethystArrowEntity;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class FabricEntityTypeRegistry {
  public static final EntityType<AmethystArrowEntity> AMETHYST_ARROW = Registry.register(BuiltInRegistries.ENTITY_TYPE,
    new ResourceLocation(CommonConstants.MOD_ID, "amethyst_arrow"),
    FabricEntityTypeBuilder.<AmethystArrowEntity>create(MobCategory.MISC, AmethystArrowEntity::new)
      .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
  
  public static void register() {
    CommonConstants.LOG.info("FabricEntityTypeRegistry " + CommonConstants.MOD_ID);
  }
}
