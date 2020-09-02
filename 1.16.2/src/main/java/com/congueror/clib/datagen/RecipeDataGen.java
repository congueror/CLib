package com.congueror.clib.datagen;

import java.util.function.Consumer;

import com.congueror.clib.init.BlockInit;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Items;

public class RecipeDataGen extends RecipeProvider
{
	public RecipeDataGen(DataGenerator generatorIn) {
		super(generatorIn);
	}
	
	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> p_200404_0_) {
		ShapedRecipeBuilder.shapedRecipe(BlockInit.ALUMINUM_BLOCK.get(), 1)//
        .patternLine("aaa")
        .patternLine("aaa")
        .patternLine("aaa")
        .key('a', Items.IRON_INGOT)
        .addCriterion("iron", hasItem(Items.IRON_INGOT))
        .build(p_200404_0_);
	}
}
