package cn.shidux.chinesefoods.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent BEAN_JUICE = new FoodComponent.Builder()
            .hunger(3)
            .saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100),0.15f)
            .build();

    public static final FoodComponent FRIED_RING = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(0.25f)
            .build();

    public static final FoodComponent SALTED_VEGETABLE = new FoodComponent.Builder()
            .hunger(1)
            .saturationModifier(0.25f)
            .build();
}
