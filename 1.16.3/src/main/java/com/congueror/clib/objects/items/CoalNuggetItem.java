package com.congueror.clib.objects.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CoalNuggetItem extends Item
{
	
	public CoalNuggetItem(Properties properties) {
		super(properties);
	}

	@Override
	public int getBurnTime(ItemStack itemStack) {
		return 178;
	}
}
