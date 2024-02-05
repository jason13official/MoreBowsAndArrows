package net.jason13.morebowsandarrows.callback;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AnvilMenu;
import net.minecraft.world.item.ItemStack;
import oshi.util.tuples.Triplet;


/** Credited to Rick South (Serilum) */

public class FabricAnvilUpdateEvent {
  
  private FabricAnvilUpdateEvent() {}
  
  public static final Event<Anvil_Change> EVENT = EventFactory.createArrayBacked(Anvil_Change.class, callbacks -> (anvilmenu, left, right, output, itemName, baseCost, player) -> {
    for (Anvil_Change callback : callbacks) {
      Triplet<Integer, Integer, ItemStack> triple = callback.onAnvilChange(anvilmenu, left, right, output, itemName, baseCost, player);
      if (triple != null) {
        return triple;
      }
    }
    
    return null;
  });
  
  @FunctionalInterface
  public interface Anvil_Change {
    Triplet<Integer, Integer, ItemStack> onAnvilChange(AnvilMenu anvilmenu, ItemStack left, ItemStack right, ItemStack output, String itemName, int baseCost, Player player);
  }
}
