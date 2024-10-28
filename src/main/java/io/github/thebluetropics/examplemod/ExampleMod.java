package io.github.thebluetropics.examplemod;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(ExampleMod.ID)
public class ExampleMod {
  public static final String ID = "examplemod";
  public static final Logger LOGGER = LoggerFactory.getLogger(ID);

  public ExampleMod(IEventBus modEventBus, ModContainer modContainer) {
    modEventBus.addListener(this::onCommonSetup);
  }

  public void onCommonSetup(final FMLCommonSetupEvent event) {
    ExampleMod.LOGGER.info("Hello, World! (Common)");
  }
}
