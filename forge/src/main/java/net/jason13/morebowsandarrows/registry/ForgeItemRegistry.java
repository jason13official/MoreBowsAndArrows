package net.jason13.morebowsandarrows.registry;

import net.jason13.morebowsandarrows.CommonConstants;
import net.jason13.morebowsandarrows.item.arrow.AmethystArrowItem;
import net.jason13.morebowsandarrows.item.bow.AmethystBowItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ForgeItemRegistry {
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CommonConstants.MOD_ID);
  public static void register(IEventBus bus) { ITEMS.register(bus); }
  
  public static final RegistryObject<Item> AMETHYST_BOW = ITEMS.register("amethyst_bow", () -> new AmethystBowItem(new Item.Properties().durability(400)));
  
  public static final RegistryObject<Item> AMETHYST_ARROW_ITEM = ITEMS.register("amethyst_arrow", () -> { return new AmethystArrowItem(new Item.Properties()); });
}
