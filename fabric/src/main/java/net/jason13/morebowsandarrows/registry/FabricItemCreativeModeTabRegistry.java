package net.jason13.morebowsandarrows.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jason13.morebowsandarrows.CommonConstants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;

public class FabricItemCreativeModeTabRegistry {
  
  public static void register() {
    CommonConstants.LOG.info("FabricItemGroupRegistry " + CommonConstants.MOD_ID);
    Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(CommonConstants.MOD_ID, "morebowsandarrows_tab"), MOREBOWSANDARROWS_TAB);
    registerCreativeTabEntries();
  }
  
  public static void addCrystalArrows(CreativeModeTab.Output output) {
    output.accept(FabricItemRegistry.AMETHYST_ARROW_ITEM);
  }
  public static void addCrystalBows(CreativeModeTab.Output output) {
    output.accept(FabricItemRegistry.AMETHYST_BOW);
  }
  
  public static final CreativeModeTab MOREBOWSANDARROWS_TAB = FabricItemGroup.builder()
    .title(Component.translatable("itemGroup.moreBowsAndArrows"))
    .icon(() -> new ItemStack(FabricItemRegistry.AMETHYST_ARROW_ITEM))
    .displayItems((params, output) -> {
      addCrystalBows(output);
      addCrystalArrows(output);
    })
    .build();
  
  public static void registerCreativeTabEntries() {
    ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(output -> {
      addCrystalBows(output);
      addCrystalArrows(output);
    });
  }
}
