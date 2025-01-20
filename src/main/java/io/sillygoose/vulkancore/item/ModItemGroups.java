package io.sillygoose.vulkancore.item;

import io.sillygoose.vulkancore.VulkanCore;
import io.sillygoose.vulkancore.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup VULKAN_CORE_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(VulkanCore.MOD_ID, "vulkan_core_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.NULL_ITEM))
                    .displayName(Text.translatable("itemgroup.vulkan-core.vulkan_core_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.NULL_ITEM);
                        entries.add(ModBlocks.NULL_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        VulkanCore.LOGGER.info("/////////////// INITIALIZING VULKAN CORE ITEM GROUPS \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }
}
