package cn.shidux.chinesefoods.item;

import cn.shidux.chinesefoods.ChineseFoods;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CHINESE_FOODS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ChineseFoods.MOD_ID, "chinesefoods"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.chinesefoods"))
                    .icon(() -> new ItemStack(ModItems.BEAN_JUICE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BEAN_JUICE);
                        entries.add(ModItems.FRIED_RING);
                        entries.add(ModItems.SALTED_VEGETABLE);

                        entries.add(ModItems.MUNG_BEANS);
                        entries.add(ModItems.RUTABAGA);

                        entries.add(ModItems.MUNGBEAN_SEEDS);
                        entries.add(ModItems.RUTABAGA_SEEDS);
                    }).build());
    public static void registerItemGroups() {
        ChineseFoods.LOGGER.info("Registering Item Groups for " + ChineseFoods.MOD_ID);
    }
}
