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
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.CandleBlock;
import net.minecraft.world.level.block.CandleCakeBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import org.jetbrains.annotations.NotNull;

public class FlintAndSteelArrowEntity extends AbstractArrow implements IAbstractModArrow {

    public FlintAndSteelArrowEntity(EntityType ent, Level level) {
        super(ent, level);
        this.setBaseDamage(this.getBaseDamage() + 2.0);
    }

    public FlintAndSteelArrowEntity(Level level, LivingEntity liveEntity) {
        super((EntityType) FabricEntityTypeRegistry.FLINT_AND_STEEL_ARROW_ENTITY, liveEntity, level);
        this.setBaseDamage(this.getBaseDamage() + 2.0);
    }

    public FlintAndSteelArrowEntity(Level level, double x, double y, double z) {
        super((EntityType) FabricEntityTypeRegistry.FLINT_AND_STEEL_ARROW_ENTITY, x, y, z, level);
        this.setBaseDamage(this.getBaseDamage() + 2.0);
    }

    public void onHitEntity(@NotNull EntityHitResult hitResult) {
        checkArrowEntityDamage(this, hitResult);
        hitResult.getEntity().setSecondsOnFire(2);
        super.onHitEntity(hitResult);
    }

    public void onHitBlock(@NotNull BlockHitResult hitResult) {
        BlockPos pos = hitResult.getBlockPos();
        BlockState state = this.level.getBlockState(pos);

        if (!CampfireBlock.canLight(state) && !CandleBlock.canLight(state) && !CandleCakeBlock.canLight(state)) {
            if (!this.level.isClientSide) {
                Entity entity = this.getOwner();
                if (!(entity instanceof Mob)) { // might break lol
                    BlockPos blockpos2 = hitResult.getBlockPos().relative(hitResult.getDirection());
                    if (this.level.isEmptyBlock(blockpos2)) {
                        this.level.setBlockAndUpdate(blockpos2, BaseFireBlock.getState(this.level, blockpos2));
                    }
                }
            }
        } else {
            level.setBlock(pos, state.setValue(BlockStateProperties.LIT, Boolean.valueOf(true)), 11);
        }

        this.remove(RemovalReason.DISCARDED);
        super.onHitBlock(hitResult);
    }

    protected @NotNull ItemStack getPickupItem() {
        return new ItemStack(FabricItemRegistry.FLINT_AND_STEEL_ARROW_ITEM);
    }
}
