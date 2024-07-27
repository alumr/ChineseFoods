package cn.shidux.chinesefoods;

import cn.shidux.chinesefoods.block.ModBlocks;
import cn.shidux.chinesefoods.item.ModItemGroups;
import cn.shidux.chinesefoods.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChineseFoods implements ModInitializer {
	public static final String MOD_ID  = "chinesefoods";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}