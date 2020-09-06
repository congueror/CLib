package com.congueror.clib.datagen;

import java.util.function.Consumer;

import com.congueror.clib.init.BlockInit;
import com.congueror.clib.init.ItemInit;
import com.congueror.clib.util.ClibItemGroup;

import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;

@SuppressWarnings("unused")
public class RecipeDataGen extends RecipeProvider
{
	public RecipeDataGen(DataGenerator generatorIn) {
		super(generatorIn);
	}
	
	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> p_200404_0_) {
		ShapedRecipeBuilder.shapedRecipe(BlockInit.ALUMINUM_BLOCK.get(), 1)
        .patternLine("aaa")
        .patternLine("aaa")
        .patternLine("aaa")
        .key('a', ItemInit.ALUMINUM_INGOT.get())
        .addCriterion("aluminum_ingot", hasItem(ItemInit.ALUMINUM_INGOT.get()))
        .build(p_200404_0_);
		
//		CookingRecipeBuilder.blastingRecipe(BlockInit.ALUMINUM_ORE.get(), ItemInit.ALUMINUM_INGOT.get(), 0.7, 400)
//		.build(p_200404_0_);
		
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.ALUMINUM_INGOT.get(), 9)
		.addIngredient(BlockInit.ALUMINUM_BLOCK.get())
		.addCriterion("aluminum_block", hasItem(BlockInit.ALUMINUM_BLOCK.get()))
		.build(p_200404_0_);
		
//		CookingRecipeBuilder.smeltingRecipe(BlockInit.ALUMINUM_ORE.get(), ItemInit.ALUMINUM_INGOT.get(), (float)0.7, 200);
		
//		ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_INGOT.get(), 1)
//        .patternLine("aaa")
//        .patternLine("aaa")
//        .patternLine("aaa")
//        .key('a', ItemInit.ALUMINUM_NUGGET.get())
//        .addCriterion("aluminum_nugget", hasItem(ItemInit.ALUMINUM_NUGGET.get()))
//        .build(p_200404_0_);
	}
}
