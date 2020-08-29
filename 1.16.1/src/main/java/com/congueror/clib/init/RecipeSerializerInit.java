package com.congueror.clib.init;

import com.congueror.clib.ConguerorLib;
import com.congueror.clib.recipes.AlloySmelterRecipe;
import com.congueror.clib.recipes.AlloySmelterSerializer;
import com.congueror.clib.recipes.IAlloySmelterRecipe;

import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RecipeSerializerInit 
{
	public static final IRecipeSerializer<AlloySmelterRecipe> ALLOY_SMELTER_RECIPE_SERIALIZER = new AlloySmelterSerializer();
	public static final IRecipeType<IAlloySmelterRecipe> ALLOY_SMELTER_TYPE = registerType(IAlloySmelterRecipe.RECIPE_TYPE_ID);
	
	public static final DeferredRegister<IRecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, ConguerorLib.MOD_ID);

	public static final RegistryObject<IRecipeSerializer<?>> ALLOY_SMELTER_SERIALIZER = RECIPE_SERIALIZERS.register("alloy_smelter", () -> ALLOY_SMELTER_RECIPE_SERIALIZER);
	
	private static class RegistryType<T extends IRecipe<?>> implements IRecipeType<T> {
		@Override
		public String toString() {
			return Registry.RECIPE_TYPE.getKey(this).toString();
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T extends IRecipeType> T registerType(ResourceLocation recipeTypeId) {
		return (T) Registry.register(Registry.RECIPE_TYPE, recipeTypeId, new RegistryType<>());
	}
}
