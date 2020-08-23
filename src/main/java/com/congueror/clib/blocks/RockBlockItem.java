package com.congueror.clib.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.util.math.MathHelper;

public class RockBlockItem extends Block
{

	public RockBlockItem(Properties properties) 
	{
		super(properties);
	}
	
	@SuppressWarnings("unused")
	private int getExperience(Random random) 
	{
		return MathHelper.nextInt(random, 2, 10);
	}
}
