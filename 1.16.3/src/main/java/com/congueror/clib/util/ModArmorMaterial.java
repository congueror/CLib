package com.congueror.clib.util;

import java.util.function.Supplier;

import com.congueror.clib.CLib;
import com.congueror.clib.init.ItemInit;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum ModArmorMaterial implements IArmorMaterial
{
	//Name,
	//MaxDamageFactor(Leather = 5, Iron = 15, Diamond = 33, Netherite = 37),
	//Armor Amount(Leather = {1,2,3,1}, Iron = {2,5,6,2}, Diamond = {3,6,8,3}),
	//Enchantibility(Leather = 15, Iron = 9, Diamond = 10, Netherite = 15),
	//Sound,
	//Toughness,
	//Knockback Resistance 
	HAZMAT(CLib.MOD_ID + ":hazmat", 2, new int[] {1, 1, 1, 1}, 0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f, 0.0f, () -> {
		return Ingredient.fromItems(ItemInit.RUBBER.get());
	}),
	;
	
	private static int[] MAX_DAMAGE_ARRAY = new int[] {16, 16, 16, 16};
	private final String name;
	private final int maxDamageFactor;
	private final int[] damageReductionAmountArray;
	private final int enchantibility;
	private final SoundEvent soundEvent;
	private final float toughness;
	private final float knockbackResistance;
	private final LazyValue<Ingredient> repairMaterial;
	
	private ModArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn, int enchantiblityIn, SoundEvent soundEventIn, float toughnessIn, float knockbackResistance, Supplier<Ingredient> repairMaterialIn) {
		this.name = nameIn;
		this.maxDamageFactor = maxDamageFactorIn;
		this.damageReductionAmountArray = damageReductionAmountIn;
		this.enchantibility = enchantiblityIn;
		this.soundEvent = soundEventIn;
		this.toughness = toughnessIn;
		this.knockbackResistance = knockbackResistance;
		this.repairMaterial = new LazyValue<>(repairMaterialIn);
	}

	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
	}
	
	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		return this.damageReductionAmountArray[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() {
		return this.enchantibility;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return this.repairMaterial.getValue();
	}
	
	@Override
	public SoundEvent getSoundEvent() {
		return this.soundEvent;
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public String getName() {
		return this.name;
	}


	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}
}
