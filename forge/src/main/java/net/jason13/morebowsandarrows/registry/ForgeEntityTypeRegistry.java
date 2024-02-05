package net.jason13.morebowsandarrows.registry;

import net.jason13.morebowsandarrows.CommonConstants;
import net.jason13.morebowsandarrows.entity.projectile.AmethystArrowEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ForgeEntityTypeRegistry {
  public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CommonConstants.MOD_ID);
  public static void register(IEventBus bus) { ENTITY_TYPES.register(bus); }
  
  public static final RegistryObject<EntityType<Entity>> AMETHYST_ARROW_ENTITY = ENTITY_TYPES.register("amethyst_arrow",
    () -> EntityType.Builder.of(AmethystArrowEntity::new, MobCategory.MISC)
      .sized(0.5F, 0.5F)
      .clientTrackingRange(4)
      .updateInterval(20)
      .build((new ResourceLocation("morebowsandarrows", "textures/entities/projectiles/arrows") ).toString())
  );
}
