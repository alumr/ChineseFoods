package cn.shidux.chinesefoods.item;

import cn.shidux.chinesefoods.ChineseFoods;
import cn.shidux.chinesefoods.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BEAN_JUICE = registerItem("bean_juice", new Item(new FabricItemSettings()
            .food(ModFoodComponents.BEAN_JUICE)));

    public static final Item FRIED_RING = registerItem("fired_ring", new Item(new FabricItemSettings()
            .food(ModFoodComponents.FRIED_RING)));

    public static final Item SALTED_VEGETABLE = registerItem("salted_vegetable", new Item(new FabricItemSettings()
            .food(ModFoodComponents.SALTED_VEGETABLE)));

    public static final Item MUNG_BEANS = registerItem("mung_beans", new Item(new FabricItemSettings()));

    public static final Item MUNGBEAN_SEEDS = registerItem("mungbean_seeds",
            new AliasedBlockItem(ModBlocks.MUNGBEAN_CROP, new FabricItemSettings()));

    public static final Item RUTABAGA = registerItem("rutabaga", new Item(new FabricItemSettings()));

    public static final Item RUTABAGA_SEEDS = registerItem("rutabaga_seeds",
            new AliasedBlockItem(ModBlocks.RUTABAGA_CROP, new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(MUNG_BEANS);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ChineseFoods.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ChineseFoods.LOGGER.info("Registering Mod Items for" + ChineseFoods.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
