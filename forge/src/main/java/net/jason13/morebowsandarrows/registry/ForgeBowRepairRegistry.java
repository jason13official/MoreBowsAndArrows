package net.jason13.morebowsandarrows.registry;

import net.jason13.morebowsandarrows.item.bow.AmethystBowItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.AnvilUpdateEvent;

public class ForgeBowRepairRegistry {
  public static void register(AnvilUpdateEvent event) {
    
    event.setCost(1);
    event.setMaterialCost(1);
    
    Player player = event.getPlayer();
    
    ItemStack slotLeft = event.getLeft();
    ItemStack slotRight = event.getRight();
    ItemStack slotOutput = new ItemStack(slotLeft.getItem());
    
    if (slotLeft.hasCustomHoverName()) {
      slotOutput.setHoverName(slotLeft.getHoverName());
    }
    
    String defaultName = slotLeft.getItem().getDefaultInstance().getDisplayName().getString();
    
    boolean flagged = false;
    
    // BEGINNING OF THE ALMIGHTY SWITCH STATEMENT (for repairing bows in an anvil)
    
    switch (defaultName) {
      case (AmethystBowItem.defaultDisplayName) -> {
        if (slotRight.getItem() == AmethystBowItem.repairItem) {
          flagged = true;
        }
      }
    }
    
    // END OF THE ALMIGHTY SWITCH STATEMENT (for repairing bows in an anvil)
    
    if (flagged && (player.experienceLevel >= 1 || player.isCreative())) {
      event.setOutput(slotOutput);
    }
    
    if (slotLeft.getDamageValue() == slotLeft.getItem().getDefaultInstance().getDamageValue() || player.experienceLevel == 0) {
      event.setOutput(new ItemStack(Items.AIR));
    }
    
  }
}
