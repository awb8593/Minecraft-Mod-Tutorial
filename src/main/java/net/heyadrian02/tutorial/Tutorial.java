package net.heyadrian02.tutorial;

import net.fabricmc.api.ModInitializer;

import net.heyadrian02.tutorial.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tutorial implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("tutorial");
	public static final String MOD_ID = "tutorial";
	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
	}
}