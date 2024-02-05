package net.jason13.morebowsandarrows.registry;

import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.jason13.morebowsandarrows.entity.projectile.AmethystArrowEntity;
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
    
    DISPENSER_OBJECT_MAP.put(ForgeItemRegistry.AMETHYST_ARROW_ITEM.get(), new AbstractProjectileDispenseBehavior() {
      public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
        AmethystArrowEntity arrow = new AmethystArrowEntity(level, pos.x(), pos.y(), pos.z());
        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        return arrow;
      }
    });
    
    DispenserBlock.DISPENSER_REGISTRY.putAll(syncronizedDispenserMap);
  }
}
