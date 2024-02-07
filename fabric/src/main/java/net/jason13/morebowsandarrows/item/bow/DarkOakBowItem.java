package net.jason13.morebowsandarrows.item.bow;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DarkOakBowItem extends BowItem {
    
    public static final String defaultDisplayName = "[Dark Oak Bow]";
    public static final Item repairItem = Items.DARK_OAK_LOG;
    
    public DarkOakBowItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack itemStack, @Nullable Level level, List<Component> tooltip, @NotNull TooltipFlag tooltipFlag) {
        tooltip.add(Component.translatable("morebowsandarrows.text.dark_oak_bow_damage"));
        super.appendHoverText(itemStack, level, tooltip, tooltipFlag);
    }
    
    @Override
    public boolean isValidRepairItem(ItemStack pItemStack1, ItemStack pItemStack2) {
        return (pItemStack1.is(this)) && (pItemStack2.is(repairItem));
    }
}
