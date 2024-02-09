package net.jason13.morebowsandarrows;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.jason13.monolib.methods.BlockMethods;
import net.jason13.morebowsandarrows.callback.FabricAnvilUpdateEvent;
import net.jason13.morebowsandarrows.entity.projectile.*;
import net.jason13.morebowsandarrows.mixin.FabricAnvilMenuMixin;
import net.jason13.morebowsandarrows.registry.FabricBowRepairRegistry;
import net.jason13.morebowsandarrows.registry.FabricEntityTypeRegistry;
import net.jason13.morebowsandarrows.registry.FabricItemCreativeModeTabRegistry;
import net.jason13.morebowsandarrows.registry.FabricItemRegistry;
import net.minecraft.core.Position;
import net.minecraft.core.Registry;
import net.minecraft.core.dispenser.AbstractProjectileDispenseBehavior;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.inventory.AnvilMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DispenserBlock;
import org.jetbrains.annotations.NotNull;

public class FabricExampleMod implements ModInitializer {
    
    public static boolean debuggingEnabled = false;
    
    @Override
    public void onInitialize() {
        
        // This method is invoked by the Fabric mod loader when it is ready
        // to load your mod. You can access Fabric and Common code in this
        // project.

        // Use Fabric to bootstrap the Common mod.
        CommonConstants.LOG.info("Hello Fabric world!");
        CommonClass.init();
        
        FabricItemRegistry.register();
        FabricItemCreativeModeTabRegistry.register();
        FabricEntityTypeRegistry.initializeOld();
        
        registerDispenserProjectileBehaviors();
        
        registerAnvilRepairBehaviors();
        
        ServerTickEvents.START_SERVER_TICK.register(new PlayerTickHandler());
        
    }
    
    private static void registerDispenserProjectileBehaviors() {
        
        DispenserBlock.registerBehavior(FabricItemRegistry.AMETHYST_ARROW_ITEM, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                AmethystArrowEntity arrow = new AmethystArrowEntity(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(FabricItemRegistry.BAMBOO_ARROW_ITEM, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                BambooArrowEntity arrow = new BambooArrowEntity(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(FabricItemRegistry.BLAZE_ROD_ARROW_ITEM, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                BlazeRodArrowEntity arrow = new BlazeRodArrowEntity(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(FabricItemRegistry.BONE_ARROW_ITEM, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                BoneArrowEntity arrow = new BoneArrowEntity(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(FabricItemRegistry.CACTUS_ARROW_ITEM, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                CactusArrowEntity arrow = new CactusArrowEntity(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(FabricItemRegistry.COAL_ARROW_ITEM, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                CoalArrowEntity arrow = new CoalArrowEntity(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(FabricItemRegistry.COPPER_ARROW_ITEM, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                CopperArrowEntity arrow = new CopperArrowEntity(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(FabricItemRegistry.DIAMOND_ARROW_ITEM, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                DiamondArrowEntity arrow = new DiamondArrowEntity(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(FabricItemRegistry.EMERALD_ARROW_ITEM, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                EmeraldArrowEntity arrow = new EmeraldArrowEntity(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(FabricItemRegistry.ENDER_PEARL_ARROW_ITEM, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                EnderPearlArrowEntity arrow = new EnderPearlArrowEntity(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(FabricItemRegistry.FLINT_AND_STEEL_ARROW_ITEM, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                FlintAndSteelArrowEntity arrow = new FlintAndSteelArrowEntity(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(FabricItemRegistry.FLINT_ARROW_ITEM, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                FlintArrowEntity arrow = new FlintArrowEntity(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(FabricItemRegistry.GOLD_ARROW_ITEM, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                GoldArrowEntity arrow = new GoldArrowEntity(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(FabricItemRegistry.IRON_ARROW_ITEM, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                IronArrowEntity arrow = new IronArrowEntity(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(FabricItemRegistry.LAPIS_ARROW_ITEM, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                LapisArrowEntity arrow = new LapisArrowEntity(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(FabricItemRegistry.MOSS_ARROW_ITEM, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                MossArrowEntity arrow = new MossArrowEntity(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(FabricItemRegistry.NETHERITE_ARROW_ITEM, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                NetheriteArrowEntity arrow = new NetheriteArrowEntity(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(FabricItemRegistry.OBSIDIAN_ARROW_ITEM, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                ObsidianArrowEntity arrow = new ObsidianArrowEntity(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(FabricItemRegistry.PAPER_ARROW_ITEM, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                PaperArrowEntity arrow = new PaperArrowEntity(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(FabricItemRegistry.TNT_ARROW_ITEM, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
                TNTArrowEntity arrow = new TNTArrowEntity(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
    }
    
    private static void registerAnvilRepairBehaviors() {
        FabricAnvilUpdateEvent.EVENT.register((AnvilMenu anvilmenu, ItemStack left, ItemStack right, ItemStack output, String itemName, int baseCost, Player player) -> FabricBowRepairRegistry.onRepairEvent(anvilmenu, left, right, output, itemName, 1, player));
    }
    
    public static class PlayerTickHandler implements ServerTickEvents.StartTick {
        @Override
        public void onStartTick(MinecraftServer server) {
            for (ServerPlayer player : server.getPlayerList().getPlayers()) {
                
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
