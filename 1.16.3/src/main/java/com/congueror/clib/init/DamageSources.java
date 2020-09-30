package com.congueror.clib.init;

import net.minecraft.util.DamageSource;

public class DamageSources extends DamageSource
{

	public DamageSources(String damageTypeIn) {
		super(damageTypeIn);
	}

	public static final DamageSource RADIATION = (new DamageSource("radiation")).setDamageBypassesArmor();
}
