package cn.shidux.chinesefoods.datagen;

import cn.shidux.chinesefoods.block.ModBlocks;
import cn.shidux.chinesefoods.block.custom.MungBeanCropBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;


public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCrop(ModBlocks.MUNGBEAN_CROP, MungBeanCropBlock.AGE, 0, 1, 2, 3, 4, 5);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
