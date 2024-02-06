//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.jason13.morebowsandarrows.entity.projectile;

import net.jason13.morebowsandarrows.entity.IAbstractModArrow;
import net.jason13.morebowsandarrows.registry.FabricEntityTypeRegistry;
import net.jason13.morebowsandarrows.registry.FabricItemRegistry;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import org.jetbrains.annotations.NotNull;

public class PaperArrowEntity extends AbstractArrow implements IAbstractModArrow {

    public PaperArrowEntity(EntityType ent, Level level) {
        super(ent, level);
        this.setBaseDamage(this.getBaseDamage() + 0.0);
    }

    public PaperArrowEntity(Level level, LivingEntity liveEntity) {
        super((EntityType) FabricEntityTypeRegistry.PAPER_ARROW_ENTITY, liveEntity, level);
        this.setBaseDamage(this.getBaseDamage() + 0.0);
    }

    public PaperArrowEntity(Level level, double x, double y, double z) {
        super((EntityType) FabricEntityTypeRegistry.PAPER_ARROW_ENTITY, x, y, z, level);
        this.setBaseDamage(this.getBaseDamage() + 0.0);
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
        return new ItemStack(FabricItemRegistry.PAPER_ARROW_ITEM);
    }
}