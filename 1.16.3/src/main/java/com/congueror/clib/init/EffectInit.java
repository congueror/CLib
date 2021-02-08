package com.congueror.clib.init;

import com.congueror.clib.CLib;
import com.congueror.clib.effects.DamagingEffect;
import com.congueror.clib.effects.RadiationEffect;

import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EffectInit 
{
	public static final DeferredRegister<Effect> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, CLib.MOD_ID);
	
	public static RegistryObject<Effect> RADIATION = POTIONS.register("radiation", ()-> new RadiationEffect(EffectType.HARMFUL, 900));
	public static RegistryObject<Effect> LEAD_POISONING = POTIONS.register("lead_poisoning", ()-> new DamagingEffect(EffectType.HARMFUL, 6062));
}
