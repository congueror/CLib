package com.congueror.clib.items;

import com.congueror.clib.init.EffectInit;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class UraniumIngotItem extends Item {
	
	public UraniumIngotItem(Properties properties) {
		super(properties);
	}

	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		LivingEntity living = (LivingEntity) entityIn;
		tryRadiationTick(stack, entityIn, living);
		if (entityIn instanceof PlayerEntity && !((PlayerEntity) entityIn).isCreative() && worldIn.getGameTime() % 20 == 0 && !worldIn.isRemote) {
			playSound(living, living.getPosition(), SoundEvents.ENTITY_GENERIC_BURN);
		}
	}
	
	private void tryRadiationTick(ItemStack stack, Entity entityIn, LivingEntity living) 
	{
	    if (!living.isPotionActive(EffectInit.RADIATION.get())) 
	    {
	      living.addPotionEffect(new EffectInstance(EffectInit.RADIATION.get(), 200, 3));
	    }
	}
	
	
	public static void playSound(Entity entityIn, BlockPos position, SoundEvent soundIn) {
	    if (entityIn != null) 
	    {
	      entityIn.playSound(soundIn, 1.0F, 4.0F);
	    }
	}
}
