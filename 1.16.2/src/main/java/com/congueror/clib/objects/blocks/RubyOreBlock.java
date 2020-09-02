package com.congueror.clib.objects.blocks;

import java.util.Random;

import net.minecraft.block.OreBlock;
import net.minecraft.util.math.MathHelper;

public class RubyOreBlock extends OreBlock
{

	public RubyOreBlock(Properties properties) 
	{
		super(properties);
	} 
	
	public int getExperience(Random random) 
	{
		return MathHelper.nextInt(random, 4, 15);
	}
}