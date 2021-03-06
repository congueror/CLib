package com.congueror.clib.items;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class CoalNuggetItem extends Item
{
	
	public CoalNuggetItem(Properties properties) {
		super(properties);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new TranslationTextComponent("tooltip.coalnugget").mergeStyle(TextFormatting.GRAY));
	}
	
	@Override
	public int getBurnTime(ItemStack itemStack) {
		return 178;
	}
}
