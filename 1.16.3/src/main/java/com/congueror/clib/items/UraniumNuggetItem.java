package com.congueror.clib.items;

import java.util.List;

import com.congueror.clib.init.EffectInit;
import com.congueror.clib.init.ItemInit;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class UraniumNuggetItem extends Item {
	
	public UraniumNuggetItem(Properties properties) {
		super(properties);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new TranslationTextComponent("tooltip.uraniumdamage").mergeStyle(TextFormatting.GRAY));
	}
	
	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		LivingEntity living = (LivingEntity) entityIn;
		if (entityIn instanceof PlayerEntity && !(((PlayerEntity) entityIn).getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() == ItemInit.HAZMAT_HELM.get()) && !(((PlayerEntity) entityIn).getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() == ItemInit.HAZMAT_CHEST.get()) && !(((PlayerEntity) entityIn).getItemStackFromSlot(EquipmentSlotType.LEGS).getItem() == ItemInit.HAZMAT_LEGS.get()) && !(((PlayerEntity) entityIn).getItemStackFromSlot(EquipmentSlotType.FEET).getItem() == ItemInit.HAZMAT_BOOTS.get()) && !((PlayerEntity) entityIn).isCreative() && worldIn.getGameTime() % 30 == 0 && !worldIn.isRemote) {
			tryRadiationTick(stack, entityIn, living);
			playSound(living, living.getPosition(), SoundEvents.ENTITY_GENERIC_BURN);
		}
	}
	
	private void tryRadiationTick(ItemStack stack, Entity entityIn, LivingEntity living) 
	{
	    if (!living.isPotionActive(EffectInit.RADIATION.get())) 
	    {
	      living.addPotionEffect(new EffectInstance(EffectInit.RADIATION.get(), 9, 3));
	    }
	}
	
	
	public static void playSound(Entity entityIn, BlockPos position, SoundEvent soundIn) {
	    if (entityIn != null) 
	    {
	      entityIn.playSound(soundIn, 1.0F, 4.0F);
	    }
	}
}
