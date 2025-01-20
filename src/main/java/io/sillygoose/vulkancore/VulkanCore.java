package io.sillygoose.vulkancore;

import io.sillygoose.vulkancore.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VulkanCore implements ModInitializer {
	public static final String MOD_ID = "vulkan-core";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("/////////////// INITIALIZING VULKAN CORE \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		ModItems.registerModItems();
	}
}