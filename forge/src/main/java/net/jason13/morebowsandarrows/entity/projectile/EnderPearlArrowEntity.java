//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.jason13.morebowsandarrows.entity.projectile;

import net.jason13.morebowsandarrows.entity.IAbstractModArrow;
import net.jason13.morebowsandarrows.registry.ForgeEntityTypeRegistry;
import net.jason13.morebowsandarrows.registry.ForgeItemRegistry;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.RelativeMovement;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import org.jetbrains.annotations.NotNull;

public class EnderPearlArrowEntity extends AbstractArrow implements IAbstractModArrow {

    public EnderPearlArrowEntity(EntityType ent, Level level) {
        super(ent, level);
        this.setBaseDamage(this.getBaseDamage() + 2.0);
    }

    public EnderPearlArrowEntity(Level level, LivingEntity liveEntity) {
        super((EntityType) ForgeEntityTypeRegistry.ENDER_PEARL_ARROW_ENTITY.get(), liveEntity, level);
        this.setBaseDamage(this.getBaseDamage() + 2.0);
    }

    public EnderPearlArrowEntity(Level level, double x, double y, double z) {
        super((EntityType) ForgeEntityTypeRegistry.ENDER_PEARL_ARROW_ENTITY.get(), x, y, z, level);
        this.setBaseDamage(this.getBaseDamage() + 2.0);
    }

    public void onHitEntity(@NotNull EntityHitResult hitResult) {
        checkArrowEntityDamage(this, hitResult);

        if (!this.level().isClientSide) {
            Entity owner = this.getOwner();
            Entity hitEntity = hitResult.getEntity();

            hitEntity.teleportTo((ServerLevel) owner.level, owner.xo, owner.yo, owner.zo, RelativeMovement.ROTATION, 1.0f, 1.0f);
        }

        super.onHitEntity(hitResult);
    }

    public void onHitBlock(@NotNull BlockHitResult hitResult) {

        if (!this.level().isClientSide && this.getOwner() != null) {
            Entity owner = this.getOwner();

            assert owner != null;
            owner.teleportTo((ServerLevel) owner.level, this.xo, this.yo, this.zo, RelativeMovement.ROTATION, owner.getYRot(), owner.getXRot());
        }

        this.remove(RemovalReason.DISCARDED);
        super.onHitBlock(hitResult);
    }

    protected @NotNull ItemStack getPickupItem() {
        return new ItemStack(ForgeItemRegistry.ENDER_PEARL_ARROW_ITEM.get());
    }
}
