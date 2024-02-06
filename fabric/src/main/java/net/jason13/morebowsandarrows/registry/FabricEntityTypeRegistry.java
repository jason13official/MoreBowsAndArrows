package net.jason13.morebowsandarrows.registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.jason13.morebowsandarrows.CommonConstants;
import net.jason13.morebowsandarrows.entity.projectile.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class FabricEntityTypeRegistry {
  
  public static final EntityType<AmethystArrowEntity> AMETHYST_ARROW_ENTITY = Registry.register(BuiltInRegistries.ENTITY_TYPE,
    new ResourceLocation(CommonConstants.MOD_ID, "amethyst_arrow"),
    FabricEntityTypeBuilder.<AmethystArrowEntity>create(MobCategory.MISC, AmethystArrowEntity::new)
      .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
  public static final EntityType<BambooArrowEntity> BAMBOO_ARROW_ENTITY = Registry.register(BuiltInRegistries.ENTITY_TYPE,
    new ResourceLocation(CommonConstants.MOD_ID, "bamboo_arrow"),
    FabricEntityTypeBuilder.<BambooArrowEntity>create(MobCategory.MISC, BambooArrowEntity::new)
      .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
  public static final EntityType<BlazeRodArrowEntity> BLAZE_ROD_ARROW_ENTITY = Registry.register(BuiltInRegistries.ENTITY_TYPE,
    new ResourceLocation(CommonConstants.MOD_ID, "blaze_arrow"),
    FabricEntityTypeBuilder.<BlazeRodArrowEntity>create(MobCategory.MISC, BlazeRodArrowEntity::new)
      .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
  public static final EntityType<BoneArrowEntity> BONE_ARROW_ENTITY = Registry.register(BuiltInRegistries.ENTITY_TYPE,
    new ResourceLocation(CommonConstants.MOD_ID, "bone_arrow"),
    FabricEntityTypeBuilder.<BoneArrowEntity>create(MobCategory.MISC, BoneArrowEntity::new)
      .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
  public static final EntityType<CactusArrowEntity> CACTUS_ARROW_ENTITY = Registry.register(BuiltInRegistries.ENTITY_TYPE,
    new ResourceLocation(CommonConstants.MOD_ID, "cactus_arrow"),
    FabricEntityTypeBuilder.<CactusArrowEntity>create(MobCategory.MISC, CactusArrowEntity::new)
      .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
  public static final EntityType<CoalArrowEntity> COAL_ARROW_ENTITY = Registry.register(BuiltInRegistries.ENTITY_TYPE,
    new ResourceLocation(CommonConstants.MOD_ID, "coal_arrow"),
    FabricEntityTypeBuilder.<CoalArrowEntity>create(MobCategory.MISC, CoalArrowEntity::new)
      .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
  public static final EntityType<CopperArrowEntity> COPPER_ARROW_ENTITY = Registry.register(BuiltInRegistries.ENTITY_TYPE,
    new ResourceLocation(CommonConstants.MOD_ID, "copper_arrow"),
    FabricEntityTypeBuilder.<CopperArrowEntity>create(MobCategory.MISC, CopperArrowEntity::new)
      .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
  public static final EntityType<DiamondArrowEntity> DIAMOND_ARROW_ENTITY = Registry.register(BuiltInRegistries.ENTITY_TYPE,
    new ResourceLocation(CommonConstants.MOD_ID, "diamond_arrow"),
    FabricEntityTypeBuilder.<DiamondArrowEntity>create(MobCategory.MISC, DiamondArrowEntity::new)
      .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
  public static final EntityType<EmeraldArrowEntity> EMERALD_ARROW_ENTITY = Registry.register(BuiltInRegistries.ENTITY_TYPE,
    new ResourceLocation(CommonConstants.MOD_ID, "emerald_arrow"),
    FabricEntityTypeBuilder.<EmeraldArrowEntity>create(MobCategory.MISC, EmeraldArrowEntity::new)
      .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
  public static final EntityType<EnderPearlArrowEntity> ENDER_PEARL_ARROW_ENTITY = Registry.register(BuiltInRegistries.ENTITY_TYPE,
    new ResourceLocation(CommonConstants.MOD_ID, "ender_pearl_arrow"),
    FabricEntityTypeBuilder.<EnderPearlArrowEntity>create(MobCategory.MISC, EnderPearlArrowEntity::new)
      .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
  public static final EntityType<FlintAndSteelArrowEntity> FLINT_AND_STEEL_ARROW_ENTITY = Registry.register(BuiltInRegistries.ENTITY_TYPE,
    new ResourceLocation(CommonConstants.MOD_ID, "flint_and_steel_arrow"),
    FabricEntityTypeBuilder.<FlintAndSteelArrowEntity>create(MobCategory.MISC, FlintAndSteelArrowEntity::new)
      .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
  public static final EntityType<FlintArrowEntity> FLINT_ARROW_ENTITY = Registry.register(BuiltInRegistries.ENTITY_TYPE,
    new ResourceLocation(CommonConstants.MOD_ID, "flint_arrow"),
    FabricEntityTypeBuilder.<FlintArrowEntity>create(MobCategory.MISC, FlintArrowEntity::new)
      .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
  public static final EntityType<GoldArrowEntity> GOLD_ARROW_ENTITY = Registry.register(BuiltInRegistries.ENTITY_TYPE,
    new ResourceLocation(CommonConstants.MOD_ID, "gold_arrow"),
    FabricEntityTypeBuilder.<GoldArrowEntity>create(MobCategory.MISC, GoldArrowEntity::new)
      .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
  public static final EntityType<IronArrowEntity> IRON_ARROW_ENTITY = Registry.register(BuiltInRegistries.ENTITY_TYPE,
    new ResourceLocation(CommonConstants.MOD_ID, "iron_arrow"),
    FabricEntityTypeBuilder.<IronArrowEntity>create(MobCategory.MISC, IronArrowEntity::new)
      .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
  public static final EntityType<LapisArrowEntity> LAPIS_ARROW_ENTITY = Registry.register(BuiltInRegistries.ENTITY_TYPE,
    new ResourceLocation(CommonConstants.MOD_ID, "lapis_arrow"),
    FabricEntityTypeBuilder.<LapisArrowEntity>create(MobCategory.MISC, LapisArrowEntity::new)
      .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
  public static final EntityType<MossArrowEntity> MOSS_ARROW_ENTITY = Registry.register(BuiltInRegistries.ENTITY_TYPE,
    new ResourceLocation(CommonConstants.MOD_ID, "moss_arrow"),
    FabricEntityTypeBuilder.<MossArrowEntity>create(MobCategory.MISC, MossArrowEntity::new)
      .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
  public static final EntityType<NetheriteArrowEntity> NETHERITE_ARROW_ENTITY = Registry.register(BuiltInRegistries.ENTITY_TYPE,
    new ResourceLocation(CommonConstants.MOD_ID, "netherite_arrow"),
    FabricEntityTypeBuilder.<NetheriteArrowEntity>create(MobCategory.MISC, NetheriteArrowEntity::new)
      .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
  public static final EntityType<ObsidianArrowEntity> OBSIDIAN_ARROW_ENTITY = Registry.register(BuiltInRegistries.ENTITY_TYPE,
    new ResourceLocation(CommonConstants.MOD_ID, "obsidian_arrow"),
    FabricEntityTypeBuilder.<ObsidianArrowEntity>create(MobCategory.MISC, ObsidianArrowEntity::new)
      .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
  public static final EntityType<PaperArrowEntity> PAPER_ARROW_ENTITY = Registry.register(BuiltInRegistries.ENTITY_TYPE,
    new ResourceLocation(CommonConstants.MOD_ID, "paper_arrow"),
    FabricEntityTypeBuilder.<PaperArrowEntity>create(MobCategory.MISC, PaperArrowEntity::new)
      .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
  public static final EntityType<TNTArrowEntity> TNT_ARROW_ENTITY = Registry.register(BuiltInRegistries.ENTITY_TYPE,
    new ResourceLocation(CommonConstants.MOD_ID, "tnt_arrow"),
    FabricEntityTypeBuilder.<TNTArrowEntity>create(MobCategory.MISC, TNTArrowEntity::new)
      .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
  
  public static void register() {
    CommonConstants.LOG.info("FabricEntityTypeRegistry " + CommonConstants.MOD_ID);
  }
}
