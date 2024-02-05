package net.jason13.morebowsandarrows.registry;

import net.jason13.morebowsandarrows.CommonConstants;
import net.jason13.morebowsandarrows.item.arrow.AmethystArrowItem;
import net.jason13.morebowsandarrows.item.bow.AmethystBowItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class FabricItemRegistry {
  
  public static final Item AMETHYST_BOW = registerItem("amethyst_bow", new AmethystBowItem(new Item.Properties().durability(400)));
  public static final Item AMETHYST_ARROW_ITEM = registerItem("amethyst_arrow", new AmethystArrowItem(new Item.Properties()));
  
  private static Item registerItem(String name, Item item) {
    return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CommonConstants.MOD_ID, name), item);
  }
  public static void register() {
    CommonConstants.LOG.info("FabricItemRegistry " + CommonConstants.MOD_ID);
  }
}
