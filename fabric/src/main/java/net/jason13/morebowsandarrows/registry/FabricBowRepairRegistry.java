package net.jason13.morebowsandarrows.registry;

import net.jason13.morebowsandarrows.CommonConstants;
import net.jason13.morebowsandarrows.item.bow.AmethystBowItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AnvilMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import oshi.util.tuples.Triplet;

public class FabricBowRepairRegistry {
  public static Triplet<Integer, Integer, ItemStack> onRepairEvent(AnvilMenu pAnvilMenu, ItemStack slotLeft, ItemStack slotRight, ItemStack slotOutput, String itemName, int baseCost, Player player) {
    
    System.out.println("CHECKPOINT ZERO REACHED");
    CommonConstants.LOG.info("CHECKPOINT ZERO REACHED");
    
    if ((player.experienceLevel >= 1 || player.isCreative())) {
      
      if (slotLeft.getDamageValue() == slotLeft.getItem().getDefaultInstance().getDamageValue()) {
        return null;
      }
      
      if (slotLeft.hasCustomHoverName()) {
        slotOutput.setHoverName(slotLeft.getHoverName());
      }
      
      final String defaultName = slotLeft.getItem().getDefaultInstance().getDisplayName().getString();
      
      System.out.println(defaultName);
      
      System.out.println("CHECKPOINT ONE REACHED");
      switch (defaultName) {
        case (AmethystBowItem.defaultDisplayName) -> {
          System.out.println("CHECKPOINT TWO REACHED");
          if (slotRight.getItem() == AmethystBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
      }
      
      return null;
    }
    return null;
  }
}
    
    //                  ItemStack slotOutput = new ItemStack(slotLeft.getItem());
    //
    //                  if (slotLeft.hasCustomHoverName()) {
    //                    slotOutput.setHoverName(slotLeft.getHoverName());
    //                  }
    //
    //                  String defaultName = slotLeft.getItem().getDefaultInstance().getDisplayName().getString();
    //
    //                  boolean flagged = false;
    //
    //                  // BEGINNING OF THE ALMIGHTY SWITCH STATEMENT (for repairing bows in an anvil)
    //
    //                  switch (defaultName) {
    //                    case (AmethystBowItem.defaultDisplayName) -> {
    //                      if (slotRight.getItem() == AmethystBowItem.repairItem) {
    //                        flagged = true;
    //                      }
    //                    }
    //                  }
    //
    //                  // END OF THE ALMIGHTY SWITCH STATEMENT (for repairing bows in an anvil)
    //
    //                  if (flagged && (player.experienceLevel >= 1 || player.isCreative())) {
    //                    // event.setOutput(slotOutput);
    //                    return new Triplet<Integer, Integer, ItemStack>(1, 1, slotOutput);
    //                  }
    //
    //                  if (slotLeft.getDamageValue() == slotLeft.getItem().getDefaultInstance().getDamageValue() || player.experienceLevel == 0) {
    //                    return null;
    //                  }
    //
    //                  return null;