package com.congueror.clib.blocks;

import java.util.Random;

import com.congueror.clib.init.BlockInit;

import net.minecraft.block.OreBlock;
import net.minecraft.util.math.MathHelper;

public class ModOreBlock extends OreBlock
{

	public ModOreBlock(Properties properties) 
	{
		super(properties);
	} 
	
	public int getExperience(Random random) 
	{
		if(this == BlockInit.RUBY_ORE.get()) {
			return MathHelper.nextInt(random, 5, 10);
		}else if(this == BlockInit.SALTPETRE_ORE.get()) {
			return MathHelper.nextInt(random, 1, 3);
		}else if(this == BlockInit.SULFUR_ORE.get()) {
			return MathHelper.nextInt(random, 1, 3);
		}else if(this == BlockInit.AMETHYST_ORE.get()) {
			return MathHelper.nextInt(random, 2, 7);
		}else if(this == BlockInit.OPAL_ORE.get()) {
			return MathHelper.nextInt(random, 4, 12);
		}else {
			return this == BlockInit.SAPPHIRE_ORE.get() ? MathHelper.nextInt(random, 1, 6) : 0;
		}
	}
}
