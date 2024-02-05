package net.jason13.morebowsandarrows.entity;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;

import java.util.concurrent.ThreadLocalRandom;

import static net.minecraft.world.level.levelgen.feature.Feature.isDirt;

public interface IAbstractModArrow {
  int NETHERITE_BOW_DAMAGE = 6;
  int DIAMOND_BOW_DAMAGE = 5;
  int OBSIDIAN_BOW_DAMAGE = 4;
  int BLAZE_BOW_DAMAGE = 3;
  int EMERALD_BOW_DAMAGE = 3;
  
  int AMETHYST_BOW_DAMAGE = 2;
  int BONE_BOW_DAMAGE = 2;
  int COAL_BOW_DAMAGE = 2;
  int COPPER_BOW_DAMAGE = 2;
  int IRON_BOW_DAMAGE = 2;
  int LAPIS_BOW_DAMAGE = 2;
  int GOLD_BOW_DAMAGE = 1;
  
  int MOSS_BOW_DAMAGE = 0;
  int PAPER_BOW_DAMAGE = 0;
  
  int WOODEN_BOW_DAMAGE = 2;
  
//  Item[] woodenBowItems = {
//    GlobalRegistry.ACACIA_BOW.get(), GlobalRegistry.STRIPPED_ACACIA_BOW.get(),
//    GlobalRegistry.BAMBOO_BOW.get(), GlobalRegistry.STRIPPED_BAMBOO_BOW.get(),
//    GlobalRegistry.BIRCH_BOW.get(), GlobalRegistry.STRIPPED_BIRCH_BOW.get(),
//    GlobalRegistry.CHERRY_BOW.get(), GlobalRegistry.STRIPPED_CHERRY_BOW.get(),
//    GlobalRegistry.CRIMSON_STEM_BOW.get(), GlobalRegistry.CRIMSON_STEM_BOW.get(),
//    GlobalRegistry.DARK_OAK_BOW.get(), GlobalRegistry.STRIPPED_DARK_OAK_BOW.get(),
//    GlobalRegistry.JUNGLE_BOW.get(), GlobalRegistry.STRIPPED_JUNGLE_BOW.get(),
//    GlobalRegistry.MANGROVE_BOW.get(), GlobalRegistry.STRIPPED_MANGROVE_BOW.get(),
//    GlobalRegistry.OAK_BOW.get(), GlobalRegistry.STRIPPED_OAK_BOW.get(),
//    GlobalRegistry.SPRUCE_BOW.get(), GlobalRegistry.STRIPPED_SPRUCE_BOW.get(),
//    GlobalRegistry.WARPED_STEM_BOW.get(), GlobalRegistry.STRIPPED_WARPED_STEM_BOW.get(),
//  };
  
  default void checkArrowBlockDamage(AbstractArrow arrow, BlockHitResult hitResult) {
//    // operate server-side
//    if (!arrow.level.isClientSide) {
//
//      // arrow has an owner
//      if (arrow.getOwner() != null) {
//        for (ItemStack stack : arrow.getOwner().getHandSlots()) {
//          if (this.getClass() == BambooArrowEntity.class && stack.is(GlobalRegistry.BAMBOO_BOW.get())) {
//            if (Blocks.BAMBOO.defaultBlockState().canSurvive(arrow.level, hitResult.getBlockPos())) {
//              if (isDirt(arrow.level.getBlockState(hitResult.getBlockPos()))) {
//                arrow.level.setBlock(hitResult.getBlockPos(), Blocks.PODZOL.defaultBlockState(), 2);
//                arrow.level.setBlock(hitResult.getBlockPos().above(), Blocks.BAMBOO.defaultBlockState(), 2);
//                arrow.discard();
//              } else if (arrow.level.getBlockState(hitResult.getBlockPos()).is(Blocks.BAMBOO)) {
//                arrow.level.setBlock(hitResult.getBlockPos().above(), Blocks.BAMBOO.defaultBlockState(), 2);
//                arrow.discard();
//              }
//            }
//          }
//        }
//      }
//      // arrow does not have an owner
//      else if (arrow.getOwner() == null) {
//      }
//    }
  }
  
  
  default void checkArrowEntityDamage(AbstractArrow arrow, EntityHitResult hitResult) {
//    // operating on the server and likely fired from an Entity
//    if (!arrow.level.isClientSide && arrow.getOwner() != null) {
//      for (ItemStack stack : arrow.getOwner().getHandSlots()) {
//
//        for (int i = 0; i < woodenBowItems.length; i++) {
//          hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), WOODEN_BOW_DAMAGE);
//        }
//
//        if (stack.is(GlobalRegistry.AMETHYST_BOW.get())) {
//          if (this.getClass() != AmethystArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), AMETHYST_BOW_DAMAGE);
//          } else {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), AMETHYST_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(GlobalRegistry.BAMBOO_BOW.get())) {
//          if (this.getClass() != BambooArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), WOODEN_BOW_DAMAGE);
//          } else {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), WOODEN_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(GlobalRegistry.BLAZE_BOW.get())) {
//          if (this.getClass() != BlazeRodArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), BLAZE_BOW_DAMAGE);
//          } else {
//            hitResult.getEntity().setSecondsOnFire(2);
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), BLAZE_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(GlobalRegistry.BONE_BOW.get())) {
//          if (this.getClass() != BoneArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), BONE_BOW_DAMAGE);
//          } else {
//            LivingEntity pLiving = (LivingEntity) hitResult.getEntity();
//            MobEffectInstance mobeffectinstance = new MobEffectInstance(MobEffects.WITHER, 100, 0);
//            pLiving.addEffect(mobeffectinstance, (Entity)((BoneArrowEntity) this).getEffectSource());
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), BONE_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(GlobalRegistry.COAL_BOW.get())) {
//          if (this.getClass() != CoalArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), COAL_BOW_DAMAGE);
//          } else {
//            hitResult.getEntity().setSecondsOnFire(2);
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), COAL_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(GlobalRegistry.COPPER_BOW.get())) {
//          if (this.getClass() != CopperArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), COPPER_BOW_DAMAGE);
//          } else {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), COPPER_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(GlobalRegistry.DIAMOND_BOW.get())) {
//          if (this.getClass() != DiamondArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), DIAMOND_BOW_DAMAGE);
//          } else {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), DIAMOND_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(GlobalRegistry.EMERALD_BOW.get())) {
//          if (this.getClass() != EmeraldArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), EMERALD_BOW_DAMAGE);
//          } else {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), EMERALD_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(GlobalRegistry.GOLD_BOW.get())) {
//          if (this.getClass() != GoldArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), GOLD_BOW_DAMAGE);
//          } else {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), GOLD_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(GlobalRegistry.IRON_BOW.get())) {
//          if (this.getClass() != IronArrowEntity.class && this.getClass() == FlintArrowEntity.class) {
//            hitResult.getEntity().setSecondsOnFire(2);
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), IRON_BOW_DAMAGE);
//          } else if (this.getClass() != IronArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), IRON_BOW_DAMAGE);
//          } else {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), IRON_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(GlobalRegistry.LAPIS_BOW.get())) {
//          if (this.getClass() != LapisArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), LAPIS_BOW_DAMAGE);
//          } else {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), LAPIS_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(GlobalRegistry.PAPER_BOW.get())) {
//          if (this.getClass() != PaperArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), PAPER_BOW_DAMAGE);
//          } else {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), PAPER_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(GlobalRegistry.MOSS_BOW.get())) {
//          if (this.getClass() != MossArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), MOSS_BOW_DAMAGE);
//          } else {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), MOSS_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(GlobalRegistry.NETHERITE_BOW.get())) {
//          if (this.getClass() != NetheriteArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), NETHERITE_BOW_DAMAGE);
//          } else {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), NETHERITE_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(GlobalRegistry.OBSIDIAN_BOW.get())) {
//          if (this.getClass() != ObsidianArrowEntity.class) {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), OBSIDIAN_BOW_DAMAGE);
//          } else {
//            hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), OBSIDIAN_BOW_DAMAGE * 2);
//          }
//        }
//        if (stack.is(GlobalRegistry.PAPER_BOW.get()) || stack.is(GlobalRegistry.MOSS_BOW.get())) {
//          if (this.getClass() == PaperArrowEntity.class || this.getClass() == MossArrowEntity.class) {
//
//            Entity hitEntity = hitResult.getEntity();
//            int a = ThreadLocalRandom.current().nextInt(1, 8 + 1);
//            switch (a) {
//              case 1 -> {
//                // set entity on fire
//                hitEntity.setSecondsOnFire(2);
//                arrow.discard();
//              }
//              case 2 -> {
//                // teleport entity to player
//                hitEntity.teleportTo(arrow.getOwner().xo, arrow.getOwner().yo, arrow.getOwner().zo);
//                arrow.discard();
//              }
//              case 3 -> {
//                // teleport player to entity
//                arrow.getOwner().teleportTo(hitEntity.xo, hitEntity.yo, hitEntity.zo);
//                arrow.discard();
//              }
//              case 4 -> {
//                // teleport entity up 10 blocks
//                hitEntity.teleportTo(hitEntity.xo, hitEntity.yo + 10, hitEntity.zo);
//                arrow.discard();
//              }
//              case 5 -> {
//                // strike entity with lightning
//                LightningBolt lightningBoltEntity = new LightningBolt(EntityType.LIGHTNING_BOLT, arrow.level);
//                lightningBoltEntity.setPos(hitResult.getLocation());
//                lightningBoltEntity.setVisualOnly(false);
//                lightningBoltEntity.setDamage(10.0F);
//                lightningBoltEntity.setCause((ServerPlayer) arrow.getOwner());
//                arrow.level.addFreshEntity(lightningBoltEntity);
//                arrow.discard();
//              }
//              case 6 -> {
//                // create explosion at entity
//                arrow.level.explode(hitEntity, hitEntity.xo, hitEntity.yo + 1, hitEntity.zo, 1.0f, true, Level.ExplosionInteraction.MOB);
//                arrow.discard();
//              }
//              case 7 -> {
//                // spawn chickens at entity
//                for (int i = 0; i < 4; i++) {
//                  Chicken spawnableChicken = new Chicken(EntityType.CHICKEN, arrow.level);
//                  spawnableChicken.setPos(hitEntity.getEyePosition());
//                  arrow.level.addFreshEntity(spawnableChicken);
//                }
//                arrow.discard();
//              }
//              case 8 -> {
//                // spawn zombies at entity
//                for (int i = 0; i < 3; i++) {
//                  Zombie spawnableZombie = new Zombie(EntityType.ZOMBIE, arrow.level);
//                  spawnableZombie.setPos(hitEntity.getEyePosition());
//                  arrow.level.addFreshEntity(spawnableZombie);
//                }
//                arrow.discard();
//              }
//            }
//          }
//          hitResult.getEntity().hurt(arrow.damageSources().arrow(arrow, arrow.getOwner()), PAPER_BOW_DAMAGE);
//
//        }
//      }
//    }
//    // operating on the server and likely fired from a dispenser
//    else if (!arrow.level.isClientSide && arrow.getOwner() == null) {
//
//      Entity hitEntity = hitResult.getEntity();
//      // PAPER ARROW OR MOSS ARROW FIRED FROM DISPENSER
//      if (this.getClass() == PaperArrowEntity.class || this.getClass() == MossArrowEntity.class) {
//        int a = ThreadLocalRandom.current().nextInt(1, 8 + 1);
//        switch (a) {
//          case 1 -> {
//            hitEntity.setSecondsOnFire(2);
//            arrow.discard();
//          }
//          case 2 -> {
//            hitEntity.teleportTo(hitEntity.xo, hitEntity.yo, hitEntity.zo);
//            arrow.discard();
//          }
//          case 3 -> {
//            hitEntity.setDeltaMovement(0, 2, 0);
//            arrow.discard();
//          }
//          case 4 -> {
//            hitEntity.teleportTo(hitEntity.xo, hitEntity.yo + 10, hitEntity.zo);
//            arrow.discard();
//          }
//          case 5 -> {
//            LightningBolt lightningBoltEntity = new LightningBolt(EntityType.LIGHTNING_BOLT, arrow.level);
//            lightningBoltEntity.setPos(hitResult.getLocation());
//            lightningBoltEntity.setVisualOnly(false);
//            lightningBoltEntity.setDamage(10.0F);
//            lightningBoltEntity.setCause(null);
//            arrow.level.addFreshEntity(lightningBoltEntity);
//            arrow.discard();
//          }
//          case 6 -> {
//            arrow.level.explode(hitEntity, hitEntity.xo, hitEntity.yo + 1, hitEntity.zo, 1.0f, true, Level.ExplosionInteraction.MOB);
//            arrow.discard();
//          }
//          case 7 -> {
//            for (int i = 0; i < 7; i++) {
//              arrow.level.addFreshEntity(new Chicken(EntityType.CHICKEN, arrow.level));
//            }
//            arrow.discard();
//          }
//          case 8 -> {
//            for (int i = 0; i < 3; i++) {
//              arrow.level.addFreshEntity(new Zombie(EntityType.ZOMBIE, arrow.level));
//            }
//            arrow.discard();
//          }
//        }
//      }
//    }
  }
}
