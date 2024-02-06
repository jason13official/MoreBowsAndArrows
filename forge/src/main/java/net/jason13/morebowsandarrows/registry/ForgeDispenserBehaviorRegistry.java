package net.jason13.morebowsandarrows.registry;

import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.jason13.morebowsandarrows.entity.projectile.*;
import net.minecraft.core.Position;
import net.minecraft.core.dispenser.AbstractProjectileDispenseBehavior;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DispenserBlock;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class ForgeDispenserBehaviorRegistry {
  public static Object2ObjectMap<Item, AbstractProjectileDispenseBehavior> DISPENSER_OBJECT_MAP = new Object2ObjectOpenHashMap();
  
  public static void registerArrowsAsProjectiles() {
    Map<Item, AbstractProjectileDispenseBehavior> syncronizedDispenserMap = Object2ObjectMaps.synchronize(DISPENSER_OBJECT_MAP);
    
    DISPENSER_OBJECT_MAP.put(ForgeItemRegistry.FLINT_AND_STEEL_ARROW_ITEM.get(), new AbstractProjectileDispenseBehavior() {
      public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
        FlintAndSteelArrowEntity arrow = new FlintAndSteelArrowEntity(level, pos.x(), pos.y(), pos.z());
        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        return arrow;
      }
    });
    DISPENSER_OBJECT_MAP.put(ForgeItemRegistry.ENDER_PEARL_ARROW_ITEM.get(), new AbstractProjectileDispenseBehavior() {
      public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
        EnderPearlArrowEntity arrow = new EnderPearlArrowEntity(level, pos.x(), pos.y(), pos.z());
        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        return arrow;
      }
    });
    DISPENSER_OBJECT_MAP.put(ForgeItemRegistry.TNT_ARROW_ITEM.get(), new AbstractProjectileDispenseBehavior() {
      public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
        TNTArrowEntity arrow = new TNTArrowEntity(level, pos.x(), pos.y(), pos.z());
        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        return arrow;
      }
    });
    DISPENSER_OBJECT_MAP.put(ForgeItemRegistry.PAPER_ARROW_ITEM.get(), new AbstractProjectileDispenseBehavior() {
      public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
        PaperArrowEntity arrow = new PaperArrowEntity(level, pos.x(), pos.y(), pos.z());
        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        return arrow;
      }
    });
    DISPENSER_OBJECT_MAP.put(ForgeItemRegistry.MOSS_ARROW_ITEM.get(), new AbstractProjectileDispenseBehavior() {
      public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
        MossArrowEntity arrow = new MossArrowEntity(level, pos.x(), pos.y(), pos.z());
        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        return arrow;
      }
    });
    
    DISPENSER_OBJECT_MAP.put(ForgeItemRegistry.AMETHYST_ARROW_ITEM.get(), new AbstractProjectileDispenseBehavior() {
      public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
        AmethystArrowEntity arrow = new AmethystArrowEntity(level, pos.x(), pos.y(), pos.z());
        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        return arrow;
      }
    });
    DISPENSER_OBJECT_MAP.put(ForgeItemRegistry.BAMBOO_ARROW_ITEM.get(), new AbstractProjectileDispenseBehavior() {
      public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
        BambooArrowEntity arrow = new BambooArrowEntity(level, pos.x(), pos.y(), pos.z());
        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        return arrow;
      }
    });
    DISPENSER_OBJECT_MAP.put(ForgeItemRegistry.BLAZE_ROD_ARROW_ITEM.get(), new AbstractProjectileDispenseBehavior() {
      public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
        BlazeRodArrowEntity arrow = new BlazeRodArrowEntity(level, pos.x(), pos.y(), pos.z());
        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        return arrow;
      }
    });
    DISPENSER_OBJECT_MAP.put(ForgeItemRegistry.BONE_ARROW_ITEM.get(), new AbstractProjectileDispenseBehavior() {
      public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
        BoneArrowEntity arrow = new BoneArrowEntity(level, pos.x(), pos.y(), pos.z());
        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        return arrow;
      }
    });
    DISPENSER_OBJECT_MAP.put(ForgeItemRegistry.CACTUS_ARROW_ITEM.get(), new AbstractProjectileDispenseBehavior() {
      public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
        CactusArrowEntity arrow = new CactusArrowEntity(level, pos.x(), pos.y(), pos.z());
        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        return arrow;
      }
    });
    DISPENSER_OBJECT_MAP.put(ForgeItemRegistry.COAL_ARROW_ITEM.get(), new AbstractProjectileDispenseBehavior() {
      public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
        CoalArrowEntity arrow = new CoalArrowEntity(level, pos.x(), pos.y(), pos.z());
        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        return arrow;
      }
    });
    DISPENSER_OBJECT_MAP.put(ForgeItemRegistry.EMERALD_ARROW_ITEM.get(), new AbstractProjectileDispenseBehavior() {
      public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
        EmeraldArrowEntity arrow = new EmeraldArrowEntity(level, pos.x(), pos.y(), pos.z());
        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        return arrow;
      }
    });
    DISPENSER_OBJECT_MAP.put(ForgeItemRegistry.LAPIS_ARROW_ITEM.get(), new AbstractProjectileDispenseBehavior() {
      public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
        LapisArrowEntity arrow = new LapisArrowEntity(level, pos.x(), pos.y(), pos.z());
        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        return arrow;
      }
    });
    DISPENSER_OBJECT_MAP.put(ForgeItemRegistry.OBSIDIAN_ARROW_ITEM.get(), new AbstractProjectileDispenseBehavior() {
      public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
        ObsidianArrowEntity arrow = new ObsidianArrowEntity(level, pos.x(), pos.y(), pos.z());
        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        return arrow;
      }
    });
    DISPENSER_OBJECT_MAP.put(ForgeItemRegistry.FLINT_ARROW_ITEM.get(), new AbstractProjectileDispenseBehavior() {
      public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
        FlintArrowEntity arrow = new FlintArrowEntity(level, pos.x(), pos.y(), pos.z());
        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        return arrow;
      }
    });
    
    DISPENSER_OBJECT_MAP.put(ForgeItemRegistry.IRON_ARROW_ITEM.get(), new AbstractProjectileDispenseBehavior() {
      public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
        IronArrowEntity arrow = new IronArrowEntity(level, pos.x(), pos.y(), pos.z());
        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        return arrow;
      }
    });
    DISPENSER_OBJECT_MAP.put(ForgeItemRegistry.COPPER_ARROW_ITEM.get(), new AbstractProjectileDispenseBehavior() {
      public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
        CopperArrowEntity arrow = new CopperArrowEntity(level, pos.x(), pos.y(), pos.z());
        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        return arrow;
      }
    });
    DISPENSER_OBJECT_MAP.put(ForgeItemRegistry.GOLD_ARROW_ITEM.get(), new AbstractProjectileDispenseBehavior() {
      public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
        GoldArrowEntity arrow = new GoldArrowEntity(level, pos.x(), pos.y(), pos.z());
        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        return arrow;
      }
    });
    DISPENSER_OBJECT_MAP.put(ForgeItemRegistry.DIAMOND_ARROW_ITEM.get(), new AbstractProjectileDispenseBehavior() {
      public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
        DiamondArrowEntity arrow = new DiamondArrowEntity(level, pos.x(), pos.y(), pos.z());
        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        return arrow;
      }
    });
    DISPENSER_OBJECT_MAP.put(ForgeItemRegistry.NETHERITE_ARROW_ITEM.get(), new AbstractProjectileDispenseBehavior() {
      public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
        NetheriteArrowEntity arrow = new NetheriteArrowEntity(level, pos.x(), pos.y(), pos.z());
        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        return arrow;
      }
    });
    
    DispenserBlock.DISPENSER_REGISTRY.putAll(syncronizedDispenserMap);
  }
}
