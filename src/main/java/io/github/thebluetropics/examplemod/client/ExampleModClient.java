package io.github.thebluetropics.examplemod.client;

import io.github.thebluetropics.examplemod.ExampleMod;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = ExampleMod.ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ExampleModClient {
  @SubscribeEvent
  public static void onClientSetup(final FMLClientSetupEvent event) {
    ExampleMod.LOGGER.info("Hello, World! (Client)");
  }
}
