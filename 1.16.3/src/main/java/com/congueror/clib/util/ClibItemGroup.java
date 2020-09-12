package com.congueror.clib.util;

import com.congueror.clib.CLib;
import com.congueror.clib.init.BlockInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ClibItemGroup extends ItemGroup
{
	public static final ClibItemGroup instance = new ClibItemGroup(ItemGroup.GROUPS.length, "clibtab");
	private ClibItemGroup(int index, String label) 
	{
		super(index, label);
		this.setBackgroundImageName("clib_item_search.png");
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
		return 88;
	}
	
	@Override
	public ResourceLocation getTabsImage() {
		return new ResourceLocation(CLib.MOD_ID, "textures/gui/clib_tabs.png");
	}
}