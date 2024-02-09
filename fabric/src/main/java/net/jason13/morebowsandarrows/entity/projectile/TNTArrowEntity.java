//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.jason13.morebowsandarrows.entity.projectile;

import net.jason13.morebowsandarrows.entity.IAbstractModArrow;
import net.jason13.morebowsandarrows.registry.FabricEntityTypeRegistry;
import net.jason13.morebowsandarrows.registry.FabricItemRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import org.jetbrains.annotations.NotNull;

public class TNTArrowEntity extends AbstractArrow implements IAbstractModArrow {

    public TNTArrowEntity(EntityType ent, Level level) {
        super(ent, level);
        this.setBaseDamage(this.getBaseDamage() + 5.0);
    }

    public TNTArrowEntity(Level level, LivingEntity liveEntity) {
        super(FabricEntityTypeRegistry.TNT_ARROW_ENTITY, liveEntity, level);
        this.setBaseDamage(this.getBaseDamage() + 5.0);
    }

    public TNTArrowEntity(Level level, double x, double y, double z) {
        super(FabricEntityTypeRegistry.TNT_ARROW_ENTITY, x, y, z, level);
        this.setBaseDamage(this.getBaseDamage() + 5.0);
    }

    public void onHitEntity(@NotNull EntityHitResult hitResult) {
        checkArrowEntityDamage(this, hitResult);

        if (!this.level.isClientSide) {
            Entity hit = hitResult.getEntity();
            level.explode(hit, hit.xo, hit.yo+1, hit.zo, 1.0f, true, Level.ExplosionInteraction.MOB);
        }
        super.onHitEntity(hitResult);
    }

    public void onHitBlock(@NotNull BlockHitResult hitResult) {

        if (!this.level.isClientSide) {
            BlockPos hit = hitResult.getBlockPos();
            level.explode(this, hit.getX(), hit.getY()+1, hit.getZ(), 2.0f, true, Level.ExplosionInteraction.BLOCK);
        }
        this.remove(RemovalReason.DISCARDED);
        super.onHitBlock(hitResult);
    }

    protected @NotNull ItemStack getPickupItem() {
        return new ItemStack(FabricItemRegistry.TNT_ARROW_ITEM);
    }
}
