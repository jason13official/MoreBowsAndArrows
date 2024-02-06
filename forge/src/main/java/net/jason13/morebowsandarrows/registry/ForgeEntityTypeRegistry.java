package net.jason13.morebowsandarrows.registry;

import net.jason13.morebowsandarrows.CommonConstants;
import net.jason13.morebowsandarrows.entity.projectile.*;
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
  
  // public static final RegistryObject<EntityType<Entity>> AMETHYST_ARROW_ENTITY = ENTITY_TYPES.register("amethyst_arrow",
  //   () -> EntityType.Builder.of(AmethystArrowEntity::new, MobCategory.MISC)
  //     .sized(0.5F, 0.5F)
  //     .clientTrackingRange(4)
  //     .updateInterval(20)
  //     .build((new ResourceLocation("morebowsandarrows", "textures/entities/projectiles/arrows") ).toString())
  // );
  /* ENTITY REGISTRATION: ARROWS */
  public static final RegistryObject<EntityType<Entity>> FLINT_AND_STEEL_ARROW_ENTITY = ENTITY_TYPES.register("flint_and_steel_arrow",
    () -> EntityType.Builder.of(FlintAndSteelArrowEntity::new, MobCategory.MISC)
      .sized(0.5F, 0.5F)
      .clientTrackingRange(4)
      .updateInterval(20)
      .build((new ResourceLocation("morebowsandarrows", "textures/entities/projectiles/arrows") ).toString())
  );
  public static final RegistryObject<EntityType<Entity>> ENDER_PEARL_ARROW_ENTITY = ENTITY_TYPES.register("ender_pearl_arrow",
    () -> EntityType.Builder.of(EnderPearlArrowEntity::new, MobCategory.MISC)
      .sized(0.5F, 0.5F)
      .clientTrackingRange(4)
      .updateInterval(20)
      .build((new ResourceLocation("morebowsandarrows", "textures/entities/projectiles/arrows") ).toString())
  );
  public static final RegistryObject<EntityType<Entity>> TNT_ARROW_ENTITY = ENTITY_TYPES.register("tnt_arrow",
    () -> EntityType.Builder.of(TNTArrowEntity::new, MobCategory.MISC)
      .sized(0.5F, 0.5F)
      .clientTrackingRange(4)
      .updateInterval(20)
      .build((new ResourceLocation("morebowsandarrows", "textures/entities/projectiles/arrows") ).toString())
  );
  public static final RegistryObject<EntityType<Entity>> PAPER_ARROW_ENTITY = ENTITY_TYPES.register("paper_arrow",
    () -> EntityType.Builder.of(PaperArrowEntity::new, MobCategory.MISC)
      .sized(0.5F, 0.5F)
      .clientTrackingRange(4)
      .updateInterval(20)
      .build((new ResourceLocation("morebowsandarrows", "textures/entities/projectiles/arrows") ).toString())
  );
  public static final RegistryObject<EntityType<Entity>> MOSS_ARROW_ENTITY = ENTITY_TYPES.register("moss_arrow",
    () -> EntityType.Builder.of(MossArrowEntity::new, MobCategory.MISC)
      .sized(0.5F, 0.5F)
      .clientTrackingRange(4)
      .updateInterval(20)
      .build((new ResourceLocation("morebowsandarrows", "textures/entities/projectiles/arrows") ).toString())
  );
  
  public static final RegistryObject<EntityType<Entity>> AMETHYST_ARROW_ENTITY = ENTITY_TYPES.register("amethyst_arrow",
    () -> EntityType.Builder.of(AmethystArrowEntity::new, MobCategory.MISC)
      .sized(0.5F, 0.5F)
      .clientTrackingRange(4)
      .updateInterval(20)
      .build((new ResourceLocation("morebowsandarrows", "textures/entities/projectiles/arrows") ).toString())
  );
  public static final RegistryObject<EntityType<Entity>> BAMBOO_ARROW_ENTITY = ENTITY_TYPES.register("bamboo_arrow",
    () -> EntityType.Builder.of(BambooArrowEntity::new, MobCategory.MISC)
      .sized(0.5F, 0.5F)
      .clientTrackingRange(4)
      .updateInterval(20)
      .build((new ResourceLocation("morebowsandarrows", "textures/entities/projectiles/arrows") ).toString())
  );
  public static final RegistryObject<EntityType<Entity>> BLAZE_ROD_ARROW_ENTITY = ENTITY_TYPES.register("blaze_rod_arrow",
    () -> EntityType.Builder.of(BlazeRodArrowEntity::new, MobCategory.MISC)
      .sized(0.5F, 0.5F)
      .clientTrackingRange(4)
      .updateInterval(20)
      .build((new ResourceLocation("morebowsandarrows", "textures/entities/projectiles/arrows") ).toString())
  );
  public static final RegistryObject<EntityType<Entity>> BONE_ARROW_ENTITY = ENTITY_TYPES.register("bone_arrow",
    () -> EntityType.Builder.of(BoneArrowEntity::new, MobCategory.MISC)
      .sized(0.5F, 0.5F)
      .clientTrackingRange(4)
      .updateInterval(20)
      .build((new ResourceLocation("morebowsandarrows", "textures/entities/projectiles/arrows") ).toString())
  );
  public static final RegistryObject<EntityType<Entity>> CACTUS_ARROW_ENTITY = ENTITY_TYPES.register("cactus_arrow",
    () -> EntityType.Builder.of(CactusArrowEntity::new, MobCategory.MISC)
      .sized(0.5F, 0.5F)
      .clientTrackingRange(4)
      .updateInterval(20)
      .build((new ResourceLocation("morebowsandarrows", "textures/entities/projectiles/arrows") ).toString())
  );
  public static final RegistryObject<EntityType<Entity>> COAL_ARROW_ENTITY = ENTITY_TYPES.register("coal_arrow",
    () -> EntityType.Builder.of(CoalArrowEntity::new, MobCategory.MISC)
      .sized(0.5F, 0.5F)
      .clientTrackingRange(4)
      .updateInterval(20)
      .build((new ResourceLocation("morebowsandarrows", "textures/entities/projectiles/arrows") ).toString())
  );
  public static final RegistryObject<EntityType<Entity>> EMERALD_ARROW_ENTITY = ENTITY_TYPES.register("emerald_arrow",
    () -> EntityType.Builder.of(EmeraldArrowEntity::new, MobCategory.MISC)
      .sized(0.5F, 0.5F)
      .clientTrackingRange(4)
      .updateInterval(20)
      .build((new ResourceLocation("morebowsandarrows", "textures/entities/projectiles/arrows") ).toString())
  );
  public static final RegistryObject<EntityType<Entity>> LAPIS_ARROW_ENTITY = ENTITY_TYPES.register("lapis_arrow",
    () -> EntityType.Builder.of(LapisArrowEntity::new, MobCategory.MISC)
      .sized(0.5F, 0.5F)
      .clientTrackingRange(4)
      .updateInterval(20)
      .build((new ResourceLocation("morebowsandarrows", "textures/entities/projectiles/arrows") ).toString())
  );
  public static final RegistryObject<EntityType<Entity>> OBSIDIAN_ARROW_ENTITY = ENTITY_TYPES.register("obsidian_arrow",
    () -> EntityType.Builder.of(ObsidianArrowEntity::new, MobCategory.MISC)
      .sized(0.5F, 0.5F)
      .clientTrackingRange(4)
      .updateInterval(20)
      .build((new ResourceLocation("morebowsandarrows", "textures/entities/projectiles/arrows") ).toString())
  );
  public static final RegistryObject<EntityType<Entity>> FLINT_ARROW_ENTITY = ENTITY_TYPES.register("flint_arrow",
    () -> EntityType.Builder.of(FlintArrowEntity::new, MobCategory.MISC)
      .sized(0.5F, 0.5F)
      .clientTrackingRange(4)
      .updateInterval(20)
      .build((new ResourceLocation("morebowsandarrows", "textures/entities/projectiles/arrows") ).toString())
  );
  
  public static final RegistryObject<EntityType<Entity>> IRON_ARROW_ENTITY = ENTITY_TYPES.register("iron_arrow",
    () -> EntityType.Builder.of(IronArrowEntity::new, MobCategory.MISC)
      .sized(0.5F, 0.5F)
      .clientTrackingRange(4)
      .updateInterval(20)
      .build((new ResourceLocation("morebowsandarrows", "textures/entities/projectiles/arrows") ).toString())
  );
  public static final RegistryObject<EntityType<Entity>> COPPER_ARROW_ENTITY = ENTITY_TYPES.register("copper_arrow",
    () -> EntityType.Builder.of(CopperArrowEntity::new, MobCategory.MISC)
      .sized(0.5F, 0.5F)
      .clientTrackingRange(4)
      .updateInterval(20)
      .build((new ResourceLocation("morebowsandarrows", "textures/entities/projectiles/arrows") ).toString())
  );
  public static final RegistryObject<EntityType<Entity>> GOLD_ARROW_ENTITY = ENTITY_TYPES.register("gold_arrow",
    () -> EntityType.Builder.of(GoldArrowEntity::new, MobCategory.MISC)
      .sized(0.5F, 0.5F)
      .clientTrackingRange(4)
      .updateInterval(20)
      .build((new ResourceLocation("morebowsandarrows", "textures/entities/projectiles/arrows") ).toString())
  );
  public static final RegistryObject<EntityType<Entity>> DIAMOND_ARROW_ENTITY = ENTITY_TYPES.register("diamond_arrow",
    () -> EntityType.Builder.of(DiamondArrowEntity::new, MobCategory.MISC)
      .sized(0.5F, 0.5F)
      .clientTrackingRange(4)
      .updateInterval(20)
      .build((new ResourceLocation("morebowsandarrows", "textures/entities/projectiles/arrows") ).toString())
  );
  public static final RegistryObject<EntityType<Entity>> NETHERITE_ARROW_ENTITY = ENTITY_TYPES.register("netherite_arrow",
    () -> EntityType.Builder.of(NetheriteArrowEntity::new, MobCategory.MISC)
      .sized(0.5F, 0.5F)
      .clientTrackingRange(4)
      .updateInterval(20)
      .build((new ResourceLocation("morebowsandarrows", "textures/entities/projectiles/arrows") ).toString())
  );
}
