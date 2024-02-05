package net.jason13.morebowsandarrows;

import net.jason13.monolib.methods.BlockMethods;
import net.jason13.morebowsandarrows.registry.*;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CommonConstants.MOD_ID)
public class ForgeExampleMod {
    
    public static boolean debuggingEnabled = false;
    
    public ForgeExampleMod() {
    
        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.
    
        // Use Forge to bootstrap the Common mod.
        CommonConstants.LOG.info("Hello Forge world!");
        CommonClass.init();
        
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        
        bus.addListener(this::clientSetup);
        bus.addListener(this::commonSetup);
        
        ForgeItemRegistry.register(bus);
        ForgeEntityTypeRegistry.register(bus);
        ForgeCreativeModeTabRegistry.register(bus);
        
        bus.addListener(ForgeCreativeModeTabRegistry::addToCombatTab);
        
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    public void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(ForgeItemProperties::addCustomItemProperties);
    }
    
    public void commonSetup(FMLCommonSetupEvent event) {
        ForgeDispenserBehaviorRegistry.registerArrowsAsProjectiles();
    }
    
    @SubscribeEvent
    public void onAnvilUpdate(AnvilUpdateEvent event) {
        ForgeBowRepairRegistry.register(event);
    }
    
    @SubscribeEvent
    public void onStartTick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.START) {
            for (ServerPlayer player : event.getServer().getPlayerList().getPlayers()) {
    
                boolean leftHandCommand = BlockMethods.compareBlockToItemStack(Blocks.COMMAND_BLOCK, player.getOffhandItem());
                boolean rightHandCommand = BlockMethods.compareBlockToItemStack(Blocks.COMMAND_BLOCK, player.getMainHandItem());
    
                if (!debuggingEnabled && leftHandCommand && rightHandCommand) {
                    player.sendSystemMessage(Component.literal("Ticking!"));
                    debuggingEnabled = true;
                }
            }
        }
    }
}