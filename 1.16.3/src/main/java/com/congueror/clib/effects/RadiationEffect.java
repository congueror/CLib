package com.congueror.clib.effects;

import com.congueror.clib.init.DamageSources;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;

public class RadiationEffect extends Effect 
{

	public RadiationEffect(EffectType typeIn, int liquidColorIn) {
		super(typeIn, liquidColorIn);
	}
	
	@Override
	public void performEffect(LivingEntity entityLivingBaseIn, int amplifier) {
		entityLivingBaseIn.attackEntityFrom(DamageSources.RADIATION, 1.0F);
	}
	
	@Override
    public boolean isReady(int duration, int amplifier)
    {
        return true;
    }
}
