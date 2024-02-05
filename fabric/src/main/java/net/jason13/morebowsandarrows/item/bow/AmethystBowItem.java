package net.jason13.morebowsandarrows.item.bow;

import net.jason13.morebowsandarrows.registry.FabricItemRegistry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AmethystBowItem extends BowItem {
    
    public static final String defaultDisplayName = "[Amethyst Bow]";
    public static final Item repairItem = Items.AMETHYST_SHARD;
    
    public AmethystBowItem(Properties pProperties) {
        super(pProperties);
    }

    public void appendHoverText(@NotNull ItemStack itemStack, @Nullable Level level, List<Component> tooltip, @NotNull TooltipFlag tooltipFlag) {
        tooltip.add(Component.translatable("morebowsandarrows.text.amethyst_bow_lore"));
        tooltip.add(Component.translatable("morebowsandarrows.text.amethyst_bow_damage"));
        super.appendHoverText(itemStack, level, tooltip, tooltipFlag);
    }
    
    @Override
    public boolean isValidRepairItem(ItemStack pItemStack1, ItemStack pItemStack2) {
        return (pItemStack1.is(FabricItemRegistry.AMETHYST_BOW)) && (pItemStack2.is(repairItem));
    }
}