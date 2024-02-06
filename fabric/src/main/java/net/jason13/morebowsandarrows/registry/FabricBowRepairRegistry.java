package net.jason13.morebowsandarrows.registry;

import net.jason13.morebowsandarrows.CommonConstants;
import net.jason13.morebowsandarrows.item.bow.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AnvilMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import oshi.util.tuples.Triplet;

public class FabricBowRepairRegistry {
  public static Triplet<Integer, Integer, ItemStack> onRepairEvent(AnvilMenu pAnvilMenu, ItemStack slotLeft, ItemStack slotRight, ItemStack slotOutput, String itemName, int baseCost, Player player) {
    
    if ((player.experienceLevel >= 1 || player.isCreative())) {
      
      if (slotLeft.getDamageValue() == slotLeft.getItem().getDefaultInstance().getDamageValue()) {
        return null;
      }
      
      if (slotLeft.hasCustomHoverName()) {
        slotOutput.setHoverName(slotLeft.getHoverName());
      }
      
      final String defaultName = slotLeft.getItem().getDefaultInstance().getDisplayName().getString();
      
      System.out.println(defaultName);
      
      
      // switch (defaultName) {
      //   case (AmethystBowItem.defaultDisplayName) -> {
      //     if (slotRight.getItem() == AmethystBowItem.repairItem) {
      //       return new Triplet<>(baseCost, baseCost, slotOutput);
      //     }
      //   }
      // }
      switch (defaultName) {
        case AcaciaBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == AcaciaBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case AmethystBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == AmethystBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case BambooBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == BambooBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case BirchBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == BirchBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case BlazeBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == BlazeBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case BoneBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == BoneBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case CherryBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == CherryBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case CoalBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == CoalBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case CopperBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == CopperBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case CrimsonStemBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == CrimsonStemBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case DarkOakBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == DarkOakBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case DiamondBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == DiamondBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case EmeraldBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == EmeraldBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case GoldBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == GoldBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case IronBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == IronBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case JungleBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == JungleBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case LapisBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == LapisBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case MangroveBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == MangroveBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case MossBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == MossBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case NetheriteBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == NetheriteBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case OakBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == OakBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case ObsidianBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == ObsidianBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case PaperBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == PaperBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case SpruceBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == SpruceBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case StrippedAcaciaBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == StrippedAcaciaBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case StrippedBambooBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == StrippedBambooBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case StrippedBirchBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == StrippedBirchBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case StrippedCherryBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == StrippedCherryBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case StrippedCrimsonStemBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == StrippedCrimsonStemBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case StrippedDarkOakBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == StrippedDarkOakBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case StrippedJungleBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == StrippedJungleBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case StrippedMangroveBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == StrippedMangroveBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case StrippedOakBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == StrippedOakBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case StrippedSpruceBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == StrippedSpruceBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case StrippedWarpedStemBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == StrippedWarpedStemBowItem.repairItem) {
            return new Triplet<>(baseCost, baseCost, slotOutput);
          }
        }
        case WarpedStemBowItem.defaultDisplayName -> {
          if (slotRight.getItem() == WarpedStemBowItem.repairItem) {
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
    //                        return new Triplet<>(baseCost, baseCost, slotOutput);
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