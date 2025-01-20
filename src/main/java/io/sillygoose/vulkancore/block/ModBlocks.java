package io.sillygoose.vulkancore.block;

import io.sillygoose.vulkancore.VulkanCore;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block NULL_BLOCK = registerBlock("null_block",
            new Block(AbstractBlock.Settings.copy(Blocks.TNT).slipperiness(25.0f).sounds(BlockSoundGroup.ANVIL).nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(VulkanCore.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(VulkanCore.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        VulkanCore.LOGGER.info("/////////////// INITIALIZING VULKAN CORE BLOCKS \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ModBlocks.NULL_BLOCK);
        });
    }
}
