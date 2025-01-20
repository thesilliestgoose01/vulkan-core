package io.sillygoose.vulkancore.item;

import io.sillygoose.vulkancore.VulkanCore;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item NULL_ITEM = registerItem("null_item", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(VulkanCore.MOD_ID, name), item);
    }

    public static void registerModItems() {
        VulkanCore.LOGGER.info("/////////////// INITIALIZING VULKAN CORE ITEM \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(NULL_ITEM);
        });
    }
}
