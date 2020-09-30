package com.congueror.clib.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TreeTapItem extends Item
{
	public TreeTapItem(Properties properties) {
		super(properties);
	}

	@Override
	public ItemStack getContainerItem(ItemStack stack) {
	    return stack.copy();
	}
	
	
	@Override
	public boolean hasContainerItem(ItemStack stack) {
	    return true;
	}
}
