package com.congueror.clib.init;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;

public class CLibFoods {
	public static final Food LEAD_DUST = new Food.Builder().hunger(0).saturation(0.0F).effect(() -> new EffectInstance(EffectInit.LEAD_POISONING.get(), 400, 0), 1.0f).setAlwaysEdible().fastToEat().build();
	public static final Food URANIUM_DUST = new Food.Builder().hunger(0).saturation(0.0F).setAlwaysEdible().fastToEat().build();
}
