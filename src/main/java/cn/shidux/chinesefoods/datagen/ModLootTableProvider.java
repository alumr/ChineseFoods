package cn.shidux.chinesefoods.datagen;

import cn.shidux.chinesefoods.block.ModBlocks;
import cn.shidux.chinesefoods.block.custom.MungBeanCropBlock;
import cn.shidux.chinesefoods.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.MUNGBEAN_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(MungBeanCropBlock.AGE, 5));
        addDrop(ModBlocks.MUNGBEAN_CROP, cropDrops(ModBlocks.MUNGBEAN_CROP,ModItems.MUNG_BEANS , ModItems.MUNGBEAN_SEEDS, builder));
    }
}
