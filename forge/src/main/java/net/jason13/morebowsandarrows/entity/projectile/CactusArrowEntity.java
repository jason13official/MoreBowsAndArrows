//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.jason13.morebowsandarrows.entity.projectile;

import net.jason13.morebowsandarrows.entity.IAbstractModArrow;
import net.jason13.morebowsandarrows.registry.ForgeEntityTypeRegistry;
import net.jason13.morebowsandarrows.registry.ForgeItemRegistry;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import org.jetbrains.annotations.NotNull;

public class CactusArrowEntity extends AbstractArrow implements IAbstractModArrow {

    public CactusArrowEntity(EntityType ent, Level level) {
        super(ent, level);
        this.setBaseDamage(this.getBaseDamage() + 2.0);
    }

    public CactusArrowEntity(Level level, LivingEntity liveEntity) {
        super((EntityType) ForgeEntityTypeRegistry.CACTUS_ARROW_ENTITY.get(), liveEntity, level);
        this.setBaseDamage(this.getBaseDamage() + 2.0);
    }

    public CactusArrowEntity(Level level, double x, double y, double z) {
        super((EntityType) ForgeEntityTypeRegistry.CACTUS_ARROW_ENTITY.get(), x, y, z, level);
        this.setBaseDamage(this.getBaseDamage() + 2.0);
    }

    public void onHitEntity(@NotNull EntityHitResult hitResult) {
        checkArrowEntityDamage(this, hitResult);
        super.onHitEntity(hitResult);
    }

    public void onHitBlock(@NotNull BlockHitResult hitResult) {
        checkArrowBlockDamage(this, hitResult);
        super.onHitBlock(hitResult);
    }

    protected @NotNull ItemStack getPickupItem() {
        return new ItemStack(ForgeItemRegistry.CACTUS_ARROW_ITEM.get());
    }
}