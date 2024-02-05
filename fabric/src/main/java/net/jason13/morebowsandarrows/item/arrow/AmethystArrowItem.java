package net.jason13.morebowsandarrows.item.arrow;

import net.jason13.morebowsandarrows.entity.projectile.AmethystArrowEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class AmethystArrowItem extends ArrowItem {
  public AmethystArrowItem(Properties properties) {
    super(properties);
  }
  
  @Override
  public AbstractArrow createArrow(Level level, ItemStack itemStack, LivingEntity livingEntity) {
    return new AmethystArrowEntity(level, livingEntity);
  }
}
