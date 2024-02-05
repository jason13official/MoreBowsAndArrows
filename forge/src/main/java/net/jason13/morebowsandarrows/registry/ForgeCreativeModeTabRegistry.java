package net.jason13.morebowsandarrows.registry;

import net.jason13.morebowsandarrows.CommonConstants;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ForgeCreativeModeTabRegistry {
  public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), CommonConstants.MOD_ID);
  public static void register(IEventBus bus) {
    CREATIVE_MODE_TAB.register(bus);
  }
  
  public static void addCrystalArrows(CreativeModeTab.Output output) {
    output.accept(ForgeItemRegistry.AMETHYST_ARROW_ITEM.get());
  }
  public static void addCrystalBows(CreativeModeTab.Output output) {
    output.accept(ForgeItemRegistry.AMETHYST_BOW.get());
  }
  
  public static RegistryObject<CreativeModeTab> MOREBOWSANDARROWS_TAB = CREATIVE_MODE_TAB.register("morebowsandarrows_tab", () -> {
    return CreativeModeTab.builder()
      .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
      .title(Component.translatable("itemGroup.moreBowsAndArrows"))
      .icon(() -> new ItemStack(Items.BOW))
      .displayItems(((itemDisplayParameters, output) -> {
        
        output.accept(Items.BOW);
        output.accept(Items.ARROW);
        
        addCrystalArrows(output);
        addCrystalBows(output);
      }))
      .build();
  });
  
  @SubscribeEvent
  public static void addToCombatTab(BuildCreativeModeTabContentsEvent output) {
    if (output.getTabKey().equals(CreativeModeTabs.COMBAT)) {
      addCrystalArrows(output);
      addCrystalBows(output);
    }
  }
}
