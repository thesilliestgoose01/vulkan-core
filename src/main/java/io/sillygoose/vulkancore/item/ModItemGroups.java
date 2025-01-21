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
                        entries.add(ModBlocks.POKEBALL_CRATE_BLOCK);
                        entries.add(ModBlocks.GREATBALL_CRATE_BLOCK);
                        entries.add(ModBlocks.ULTRABALL_CRATE_BLOCK);
                        entries.add(ModBlocks.LUXURYBALL_CRATE_BLOCK);
                        entries.add(ModBlocks.MASTERBALL_CRATE_BLOCK);
                        entries.add(ModBlocks.VOTE_CRATE_BLOCK);
                        entries.add(ModBlocks.VOTE_CRATE_BLOCK_TOP);
                        entries.add(ModBlocks.COSMIC_CRATE_BLOCK);
                        entries.add(ModBlocks.COSMIC_CRATE_BLOCK_TOP);
                        entries.add(ModBlocks.SHINY_CRATE_BLOCK);
                        entries.add(ModBlocks.SHINY_CRATE_BLOCK_TOP);
                    }).build());

    public static void registerItemGroups() {
        VulkanCore.LOGGER.info("/////////////// INITIALIZING VULKAN CORE ITEM GROUPS \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }
}
