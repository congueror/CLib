package com.congueror.clib.items;

import java.util.List;

import com.congueror.clib.init.DamageSources;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class UraniumDustItem extends Item
{

	public UraniumDustItem(Properties properties) {
		super(properties);
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new TranslationTextComponent("tooltip.uraniumdust").mergeStyle(TextFormatting.GRAY));
	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
		entityLiving.attackEntityFrom(DamageSources.URANIUM_EAT, 5000);
		return super.onItemUseFinish(stack, worldIn, entityLiving);
	}
}
