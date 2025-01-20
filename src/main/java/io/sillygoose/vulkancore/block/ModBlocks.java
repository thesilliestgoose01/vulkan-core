package io.sillygoose.vulkancore.block;

import io.sillygoose.vulkancore.VulkanCore;
import io.sillygoose.vulkancore.block.custom.CrateBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block NULL_BLOCK = registerBlock("null_block",
            new Block(AbstractBlock.Settings.copy(Blocks.TNT).slipperiness(100.0f).sounds(BlockSoundGroup.ANVIL).nonOpaque()));

    public static final Block POKEBALL_CRATE_BLOCK = registerBlock("pokeball_crate_block",
            new CrateBlock(AbstractBlock.Settings.create().nonOpaque()));

    public static final Block GREATBALL_CRATE_BLOCK = registerBlock("greatball_crate_block",
            new CrateBlock(AbstractBlock.Settings.create().nonOpaque()));

    public static final Block ULTRABALL_CRATE_BLOCK = registerBlock("ultraball_crate_block",
            new CrateBlock(AbstractBlock.Settings.create().nonOpaque()));

    public static final Block LUXURYBALL_CRATE_BLOCK = registerBlock("luxuryball_crate_block",
            new CrateBlock(AbstractBlock.Settings.create().nonOpaque()));

    public static final Block MASTERBALL_CRATE_BLOCK = registerBlock("masterball_crate_block",
            new CrateBlock(AbstractBlock.Settings.create().nonOpaque()));

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
    }
}
