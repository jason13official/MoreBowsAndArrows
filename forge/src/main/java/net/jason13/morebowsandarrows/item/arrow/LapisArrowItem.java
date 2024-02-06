//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.jason13.morebowsandarrows.item.arrow;

import net.jason13.morebowsandarrows.entity.projectile.LapisArrowEntity;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.AbstractArrow.Pickup;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LapisArrowItem extends ArrowItem {
    public LapisArrowItem(Properties properties) {
        super(properties);
    }

    public void appendHoverText(@NotNull ItemStack itemStack, @Nullable Level level, List<Component> tooltip, @NotNull TooltipFlag tooltipFlag) {
        tooltip.add(Component.translatable("morebowsandarrows.text.lapis_arrow_lore"));
        tooltip.add(Component.translatable("morebowsandarrows.text.lapis_arrow_damage"));
        super.appendHoverText(itemStack, level, tooltip, tooltipFlag);
    }

    public @NotNull AbstractArrow createArrow(@NotNull Level level, @NotNull ItemStack arrowItem, @NotNull LivingEntity liveEntity) {
        if (true) {
            return new LapisArrowEntity(level, liveEntity);
        } else {
            Arrow arrow = new Arrow(level, liveEntity);
            if (liveEntity instanceof Player && ((Player)liveEntity).getAbilities().instabuild) {
                arrow.pickup = Pickup.CREATIVE_ONLY;
            }

            return arrow;
        }
    }
}
