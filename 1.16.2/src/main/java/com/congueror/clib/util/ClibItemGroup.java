package com.congueror.clib.util;

import com.congueror.clib.init.BlockInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ClibItemGroup extends ItemGroup
{
	public static final ClibItemGroup instance = new ClibItemGroup(ItemGroup.GROUPS.length, "clibtab");
	private ClibItemGroup(int index, String label) 
	{
		super(index, label);
	}
	
	@Override
	public ItemStack createIcon() 
	{
		return new ItemStack(BlockInit.TIN_ORE.get());
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}
	
	@Override
	public int getSearchbarWidth() {
		return 79;
	}
}