package cn.shidux.chinesefoods.block;

import cn.shidux.chinesefoods.ChineseFoods;
import cn.shidux.chinesefoods.block.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block MUNGBEAN_CROP = Registry.register(Registries.BLOCK,
            new Identifier(ChineseFoods.MOD_ID, "mungbean_crop"),
            new MungBeanCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ChineseFoods.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ChineseFoods.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        ChineseFoods.LOGGER.info("Registering Mod Blocks for" + ChineseFoods.MOD_ID);
    }
}
