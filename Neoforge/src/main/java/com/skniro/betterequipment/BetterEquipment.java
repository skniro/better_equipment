package com.skniro.betterequipment;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(BetterEquipment.MODID)
public class BetterEquipment {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "betterequipment";


    public BetterEquipment(IEventBus modEventBus) {
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }



    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {


        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
