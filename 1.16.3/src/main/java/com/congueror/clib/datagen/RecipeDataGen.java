package com.congueror.clib.datagen;

import java.util.function.Consumer;

import com.congueror.clib.CLib;
import com.congueror.clib.init.BlockInit;
import com.congueror.clib.init.ItemInit;
import com.congueror.clib.util.ClibItemGroup;

import net.minecraft.block.Blocks;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ForgeItemTagsProvider;

@SuppressWarnings("unused")
public class RecipeDataGen extends RecipeProvider
{
	public RecipeDataGen(DataGenerator generatorIn) {
		super(generatorIn);
	}
	
	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> recipe) 
	{
		//Aluminum
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.ALUMINUM_BLOCK.get(), 1)
        .patternLine("aaa")
        .patternLine("aaa")
        .patternLine("aaa")
        .key('a', ItemInit.ALUMINUM_INGOT.get())
        .addCriterion("aluminum_ingot", hasItem(ItemInit.ALUMINUM_INGOT.get()))
        .build(recipe);
	
		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.ALUMINUM_INGOT.get(), 9)
		.addIngredient(BlockInit.ALUMINUM_BLOCK.get())
		.addCriterion("aluminum_block", hasItem(BlockInit.ALUMINUM_BLOCK.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "aluminum_ingot_block"));
		
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.ALUMINUM_NUGGET.get(), 9)
		.addIngredient(ItemInit.AMETHYST.get())
		.addCriterion("aluminum_ingot", hasItem(ItemInit.ALUMINUM_INGOT.get()))
		.build(recipe);
			
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.ALUMINUM_NUGGET.get())
		.addCriterion("aluminum_nugget", hasItem(ItemInit.ALUMINUM_NUGGET.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "aluminum_ingot_nuggets"));
		
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.ALUMINUM_ORE.get()), ItemInit.ALUMINUM_INGOT.get(), 0.7f, 400)
		.addCriterion("aluminum_ore", hasItem(BlockInit.ALUMINUM_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "aluminum_ingot_blasting"));
		
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.ALUMINUM_ORE.get()), ItemInit.ALUMINUM_INGOT.get(), 0.7f, 200)
		.addCriterion("aluminum_ore", hasItem(BlockInit.ALUMINUM_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "aluminum_ingot_smelting"));
		
		
		
		
		//Amethyst
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.AMETHYST_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.AMETHYST.get())
		.addCriterion("amethyst", hasItem(ItemInit.AMETHYST.get()))
		.build(recipe);

		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.AMETHYST.get(), 9)
		.addIngredient(BlockInit.AMETHYST_BLOCK.get())
		.addCriterion("amethyst_block", hasItem(BlockInit.AMETHYST_BLOCK.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "amethyst_gem_block"));
	
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.AMETHYST_ORE.get()), ItemInit.AMETHYST.get(), 0.7f, 400)
		.addCriterion("amethyst_ore", hasItem(BlockInit.AMETHYST_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "amethyst_blasting"));
	
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.AMETHYST_ORE.get()), ItemInit.AMETHYST.get(), 0.7f, 200)
		.addCriterion("amethyst_ore", hasItem(BlockInit.AMETHYST_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "amethyst_smelting"));
		
		
		
		//Bronze
		//blend
		ShapedRecipeBuilder.shapedRecipe(ItemInit.BRONZE_BLEND.get(), 2)
		.patternLine("ct ")
		.patternLine("t  ")
		.patternLine("   ")
		.key('t', ModTags.Items.INGOTS_TIN)
		.key('c', ModTags.Items.INGOTS_COPPER)
		.addCriterion("copper_ingot", hasItem(ItemInit.COPPER_INGOT.get()))
		.build(recipe);
		
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.BRONZE_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.BRONZE_INGOT.get())
		.addCriterion("bronze_ingot", hasItem(ItemInit.BRONZE_INGOT.get()))
		.build(recipe);

		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.BRONZE_INGOT.get(), 9)
		.addIngredient(BlockInit.BRONZE_BLOCK.get())
		.addCriterion("bronze_block", hasItem(BlockInit.BRONZE_BLOCK.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "bronze_ingot_block"));
		
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.BRONZE_NUGGET.get(), 9)
		.addIngredient(ItemInit.BRONZE_INGOT.get())
		.addCriterion("bronze_ingot", hasItem(ItemInit.BRONZE_INGOT.get()))
		.build(recipe);
					
		//ingot_nuggets
        ShapedRecipeBuilder.shapedRecipe(ItemInit.BRONZE_INGOT.get(), 1)
        .patternLine("aaa")
        .patternLine("aaa")
        .patternLine("aaa")
        .key('a', ItemInit.BRONZE_NUGGET.get())
        .addCriterion("bronze_nugget", hasItem(ItemInit.BRONZE_NUGGET.get()))
        .build(recipe, new ResourceLocation(CLib.MOD_ID, "bronze_ingot_nuggets"));
			
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemInit.BRONZE_BLEND.get()), ItemInit.BRONZE_INGOT.get(), 1.7f, 400)
		.addCriterion("bronze_blend", hasItem(ItemInit.BRONZE_BLEND.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "bronze_ingot_blasting"));
			
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.BRONZE_BLEND.get()), ItemInit.BRONZE_INGOT.get(), 1.7f, 500)
		.addCriterion("bronze_blend", hasItem(ItemInit.BRONZE_BLEND.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "bronze_ingot_smelting"));
		
		
		
		//Coal Nugget
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.COAL_NUGGET.get(), 9)
		.addIngredient(Items.COAL)
		.addCriterion("coal", hasItem(Items.COAL))
		.build(recipe);
							
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(Items.COAL, 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.COAL_NUGGET.get())
		.addCriterion("coal", hasItem(Items.COAL))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "coal_nuggets"));
		
		
		
		//Copper
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.COPPER_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.COPPER_INGOT.get())
		.addCriterion("copper_ingot", hasItem(ItemInit.COPPER_INGOT.get()))
		.build(recipe);
			
		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.COPPER_INGOT.get(), 9)
		.addIngredient(BlockInit.COPPER_BLOCK.get())
		.addCriterion("copper_block", hasItem(BlockInit.COPPER_BLOCK.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "copper_ingot_block"));
				
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.COPPER_NUGGET.get(), 9)
		.addIngredient(ItemInit.AMETHYST.get())
		.addCriterion("copper_ingot", hasItem(ItemInit.COPPER_INGOT.get()))
		.build(recipe);
					
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.COPPER_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.COPPER_NUGGET.get())
		.addCriterion("copper_nugget", hasItem(ItemInit.COPPER_NUGGET.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "copper_ingot_nuggets"));
				
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.COPPER_ORE.get()), ItemInit.COPPER_INGOT.get(), 0.7f, 400)
		.addCriterion("copper_ore", hasItem(BlockInit.COPPER_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "copper_ingot_blasting"));
				
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.COPPER_ORE.get()), ItemInit.COPPER_INGOT.get(), 0.7f, 200)
		.addCriterion("copper_ore", hasItem(BlockInit.COPPER_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "copper_ingot_smelting"));
		
		
		
		//Electrum
		//blend
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ELECTRUM_BLEND.get(), 2)
		.patternLine(" g ")
		.patternLine("s  ")
		.patternLine("   ")
		.key('g', Tags.Items.INGOTS_GOLD)
		.key('s', ModTags.Items.INGOTS_SILVER)
		.addCriterion("silver_ingot", hasItem(ItemInit.SILVER_INGOT.get()))
		.build(recipe);
				
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.ELECTRUM_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.ELECTRUM_INGOT.get())
		.addCriterion("electrum_ingot", hasItem(ItemInit.ELECTRUM_INGOT.get()))
		.build(recipe);

		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.ELECTRUM_INGOT.get(), 9)
		.addIngredient(BlockInit.ELECTRUM_BLOCK.get())
		.addCriterion("electrum_block", hasItem(BlockInit.ELECTRUM_BLOCK.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "electrum_ingot_block"));
			
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.ELECTRUM_NUGGET.get(), 9)
		.addIngredient(ItemInit.ELECTRUM_INGOT.get())
		.addCriterion("electrum_ingot", hasItem(ItemInit.ELECTRUM_INGOT.get()))
		.build(recipe);
							
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ELECTRUM_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.ELECTRUM_NUGGET.get())
		.addCriterion("electrum_nugget", hasItem(ItemInit.ELECTRUM_NUGGET.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "electrum_ingot_nuggets"));
					
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemInit.ELECTRUM_BLEND.get()), ItemInit.ELECTRUM_INGOT.get(), 1.7f, 400)
		.addCriterion("electrum_blend", hasItem(ItemInit.ELECTRUM_BLEND.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "electrum_ingot_blasting"));
					
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.ELECTRUM_BLEND.get()), ItemInit.ELECTRUM_INGOT.get(), 1.7f, 500)
		.addCriterion("electrum_blend", hasItem(ItemInit.ELECTRUM_BLEND.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "electrum_ingot_smelting"));
		
		
		
		//Enderium
		//blend
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ENDERIUM_BLEND.get(), 1)
		.patternLine("tt ")
		.patternLine("ps ")
		.patternLine("   ")
		.key('t', ModTags.Items.INGOTS_TIN)
		.key('s', ModTags.Items.INGOTS_SILVER)
		.key('p', ModTags.Items.INGOTS_PLATINUM)
		.addCriterion("platinum_ingot", hasItem(ItemInit.PLATINUM_INGOT.get()))
		.build(recipe);
						
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.ENDERIUM_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.ENDERIUM_INGOT.get())
		.addCriterion("enderium_ingot", hasItem(ItemInit.ENDERIUM_INGOT.get()))
		.build(recipe);

		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.ENDERIUM_INGOT.get(), 9)
		.addIngredient(BlockInit.ENDERIUM_BLOCK.get())
		.addCriterion("enderium_block", hasItem(BlockInit.ENDERIUM_BLOCK.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "enderium_ingot_block"));
					
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.ENDERIUM_NUGGET.get(), 9)
		.addIngredient(ItemInit.ENDERIUM_INGOT.get())
		.addCriterion("enderium_ingot", hasItem(ItemInit.ENDERIUM_INGOT.get()))
		.build(recipe);
									
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ENDERIUM_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.ENDERIUM_NUGGET.get())
		.addCriterion("enderium_nugget", hasItem(ItemInit.ENDERIUM_NUGGET.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "enderium_ingot_nuggets"));
							
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemInit.ENDERIUM_BLEND.get()), ItemInit.ENDERIUM_INGOT.get(), 1.7f, 400)
		.addCriterion("enderium_blend", hasItem(ItemInit.ENDERIUM_BLEND.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "enderium_ingot_blasting"));
							
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.ENDERIUM_BLEND.get()), ItemInit.ENDERIUM_INGOT.get(), 1.7f, 500)
		.addCriterion("enderium_blend", hasItem(ItemInit.ENDERIUM_BLEND.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "enderium_ingot_smelting"));
		
		
		
		//Invar
		//blend
		ShapedRecipeBuilder.shapedRecipe(ItemInit.INVAR_BLEND.get(), 2)
		.patternLine("ni ")
		.patternLine("i  ")
		.patternLine("   ")
		.key('i', Tags.Items.INGOTS_IRON)
		.key('n', ModTags.Items.INGOTS_NICKEL)
		.addCriterion("platinum_ingot", hasItem(ItemInit.PLATINUM_INGOT.get()))
		.build(recipe);
								
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.INVAR_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.INVAR_INGOT.get())
		.addCriterion("invar_ingot", hasItem(ItemInit.INVAR_INGOT.get()))
		.build(recipe);

		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.INVAR_INGOT.get(), 9)
		.addIngredient(BlockInit.INVAR_BLOCK.get())
		.addCriterion("invar_block", hasItem(BlockInit.INVAR_BLOCK.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "invar_ingot_block"));
							
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.INVAR_NUGGET.get(), 9)
		.addIngredient(ItemInit.INVAR_INGOT.get())
		.addCriterion("invar_ingot", hasItem(ItemInit.INVAR_INGOT.get()))
		.build(recipe);
											
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.INVAR_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.INVAR_NUGGET.get())
		.addCriterion("invar_nugget", hasItem(ItemInit.INVAR_NUGGET.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "invar_ingot_nuggets"));
									
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemInit.INVAR_BLEND.get()), ItemInit.INVAR_INGOT.get(), 1.7f, 400)
		.addCriterion("invar_blend", hasItem(ItemInit.INVAR_BLEND.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "invar_ingot_blasting"));
									
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.INVAR_BLEND.get()), ItemInit.INVAR_INGOT.get(), 1.7f, 500)
		.addCriterion("invar_blend", hasItem(ItemInit.INVAR_BLEND.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "invar_ingot_smelting"));
		
		
		
		//Lead
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.LEAD_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.LEAD_INGOT.get())
		.addCriterion("lead_ingot", hasItem(ItemInit.LEAD_INGOT.get()))
		.build(recipe);
			
		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.LEAD_INGOT.get(), 9)
		.addIngredient(BlockInit.LEAD_BLOCK.get())
		.addCriterion("lead_block", hasItem(BlockInit.LEAD_BLOCK.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "lead_ingot_block"));
				
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.LEAD_NUGGET.get(), 9)
		.addIngredient(ItemInit.AMETHYST.get())
		.addCriterion("lead_ingot", hasItem(ItemInit.LEAD_INGOT.get()))
		.build(recipe);
					
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.LEAD_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.LEAD_NUGGET.get())
		.addCriterion("lead_nugget", hasItem(ItemInit.LEAD_NUGGET.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "lead_ingot_nuggets"));
				
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.LEAD_ORE.get()), ItemInit.LEAD_INGOT.get(), 0.7f, 400)
		.addCriterion("lead_ore", hasItem(BlockInit.LEAD_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "lead_ingot_blasting"));
				
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.LEAD_ORE.get()), ItemInit.LEAD_INGOT.get(), 0.7f, 200)
		.addCriterion("lead_ore", hasItem(BlockInit.LEAD_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "lead_ingot_smelting"));
		
		
		
		//Lumium
		//blend
		ShapedRecipeBuilder.shapedRecipe(ItemInit.LUMIUM_BLEND.get(), 2)
		.patternLine("st ")
		.patternLine("g  ")
		.patternLine("   ")
		.key('t', ModTags.Items.INGOTS_TIN)
		.key('s', ModTags.Items.INGOTS_SILVER)
		.key('g', Tags.Items.DUSTS_GLOWSTONE)
		.addCriterion("glowstone_dust", hasItem(Items.GLOWSTONE_DUST))
		.build(recipe);
										
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.LUMIUM_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.LUMIUM_INGOT.get())
		.addCriterion("lumium_ingot", hasItem(ItemInit.LUMIUM_INGOT.get()))
		.build(recipe);

		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.LUMIUM_INGOT.get(), 9)
		.addIngredient(BlockInit.LUMIUM_BLOCK.get())
		.addCriterion("lumium_block", hasItem(BlockInit.LUMIUM_BLOCK.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "lumium_ingot_block"));
									
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.LUMIUM_NUGGET.get(), 9)
		.addIngredient(ItemInit.LUMIUM_INGOT.get())
		.addCriterion("lumium_ingot", hasItem(ItemInit.LUMIUM_INGOT.get()))
		.build(recipe);
													
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.LUMIUM_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.LUMIUM_NUGGET.get())
		.addCriterion("lumium_nugget", hasItem(ItemInit.LUMIUM_NUGGET.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "lumium_ingot_nuggets"));
											
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemInit.LUMIUM_BLEND.get()), ItemInit.LUMIUM_INGOT.get(), 1.7f, 400)
		.addCriterion("lumium_blend", hasItem(ItemInit.LUMIUM_BLEND.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "lumium_ingot_blasting"));
											
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.LUMIUM_BLEND.get()), ItemInit.LUMIUM_INGOT.get(), 1.7f, 500)
		.addCriterion("lumium_blend", hasItem(ItemInit.LUMIUM_BLEND.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "lumium_ingot_smelting"));
		
		
		
		//Nickel
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.NICKEL_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.NICKEL_INGOT.get())
		.addCriterion("nickel_ingot", hasItem(ItemInit.NICKEL_INGOT.get()))
		.build(recipe);
					
		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.NICKEL_INGOT.get(), 9)
		.addIngredient(BlockInit.NICKEL_BLOCK.get())
		.addCriterion("nickel_block", hasItem(BlockInit.NICKEL_BLOCK.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "nickel_ingot_block"));
						
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.NICKEL_NUGGET.get(), 9)
		.addIngredient(ItemInit.AMETHYST.get())
		.addCriterion("nickel_ingot", hasItem(ItemInit.NICKEL_INGOT.get()))
		.build(recipe);
							
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.NICKEL_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.NICKEL_NUGGET.get())
		.addCriterion("nickel_nugget", hasItem(ItemInit.NICKEL_NUGGET.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "nickel_ingot_nuggets"));
						
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.NICKEL_ORE.get()), ItemInit.NICKEL_INGOT.get(), 0.7f, 400)
		.addCriterion("nickel_ore", hasItem(BlockInit.NICKEL_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "nickel_ingot_blasting"));
						
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.NICKEL_ORE.get()), ItemInit.NICKEL_INGOT.get(), 0.7f, 200)
		.addCriterion("nickel_ore", hasItem(BlockInit.NICKEL_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "nickel_ingot_smelting"));
		
		
		
		//Opal
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.OPAL_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.OPAL.get())
		.addCriterion("opal", hasItem(ItemInit.OPAL.get()))
		.build(recipe);

		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.OPAL.get(), 9)
		.addIngredient(BlockInit.OPAL_BLOCK.get())
		.addCriterion("opal_block", hasItem(BlockInit.OPAL_BLOCK.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "opal_gem_block"));
			
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.OPAL_ORE.get()), ItemInit.OPAL.get(), 0.7f, 400)
		.addCriterion("opal_ore", hasItem(BlockInit.OPAL_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "opal_blasting"));
			
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.OPAL_ORE.get()), ItemInit.OPAL.get(), 0.7f, 200)
		.addCriterion("opal_ore", hasItem(BlockInit.OPAL_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "opal_smelting"));
		
		
		
		//Platinum
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.PLATINUM_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.PLATINUM_INGOT.get())
		.addCriterion("platinum_ingot", hasItem(ItemInit.PLATINUM_INGOT.get()))
		.build(recipe);
							
		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.PLATINUM_INGOT.get(), 9)
		.addIngredient(BlockInit.PLATINUM_BLOCK.get())
		.addCriterion("platinum_block", hasItem(BlockInit.PLATINUM_BLOCK.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "platinum_ingot_block"));
								
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.PLATINUM_NUGGET.get(), 9)
		.addIngredient(ItemInit.AMETHYST.get())
		.addCriterion("platinum_ingot", hasItem(ItemInit.PLATINUM_INGOT.get()))
		.build(recipe);
									
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.PLATINUM_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.PLATINUM_NUGGET.get())
		.addCriterion("platinum_nugget", hasItem(ItemInit.PLATINUM_NUGGET.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "platinum_ingot_nuggets"));
								
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.PLATINUM_ORE.get()), ItemInit.PLATINUM_INGOT.get(), 0.7f, 400)
		.addCriterion("platinum_ore", hasItem(BlockInit.PLATINUM_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "platinum_ingot_blasting"));
								
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.PLATINUM_ORE.get()), ItemInit.PLATINUM_INGOT.get(), 0.7f, 200)
		.addCriterion("platinum_ore", hasItem(BlockInit.PLATINUM_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "platinum_ingot_smelting"));
		
		
		
		//Pyrotheum
		ShapedRecipeBuilder.shapedRecipe(ItemInit.PYROTHEUM_DUST.get(), 1)
		.patternLine("bb ")
		.patternLine("rs ")
		.patternLine("   ")
		.key('b', ModTags.Items.BLAZE_POWDER)
		.key('r', Tags.Items.DUSTS_REDSTONE)
		.key('s', ModTags.Items.DUSTS_SULFUR)
		.addCriterion("blaze_powder", hasItem(Items.BLAZE_POWDER))
		.build(recipe);
		
		
		
		//Ruby
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.RUBY_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.RUBY.get())
		.addCriterion("ruby", hasItem(ItemInit.RUBY.get()))
		.build(recipe);

		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.RUBY.get(), 9)
		.addIngredient(BlockInit.RUBY_BLOCK.get())
		.addCriterion("ruby_block", hasItem(BlockInit.RUBY_BLOCK.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "ruby_gem_block"));
					
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.RUBY_ORE.get()), ItemInit.RUBY.get(), 0.7f, 400)
		.addCriterion("ruby_ore", hasItem(BlockInit.RUBY_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "ruby_blasting"));
					
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.RUBY_ORE.get()), ItemInit.RUBY.get(), 0.7f, 200)
		.addCriterion("ruby_ore", hasItem(BlockInit.RUBY_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "ruby_smelting"));
		
		
		
		//Sapphire
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.SAPPHIRE_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.SAPPHIRE.get())
		.addCriterion("sapphire", hasItem(ItemInit.SAPPHIRE.get()))
		.build(recipe);

		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.SAPPHIRE.get(), 9)
		.addIngredient(BlockInit.SAPPHIRE_BLOCK.get())
		.addCriterion("sapphire_block", hasItem(BlockInit.SAPPHIRE_BLOCK.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "sapphire_gem_block"));
							
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.SAPPHIRE_ORE.get()), ItemInit.SAPPHIRE.get(), 0.7f, 400)
		.addCriterion("sapphire_ore", hasItem(BlockInit.SAPPHIRE_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "sapphire_blasting"));
							
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.SAPPHIRE_ORE.get()), ItemInit.SAPPHIRE.get(), 0.7f, 200)
		.addCriterion("sapphire_ore", hasItem(BlockInit.SAPPHIRE_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "sapphire_smelting"));
		
		
		
		//Signalum
		//blend
		ShapedRecipeBuilder.shapedRecipe(ItemInit.SIGNALUM_BLEND.get(), 2)
		.patternLine("csc")
		.patternLine("rcr")
		.patternLine("rrr")
		.key('c', ModTags.Items.INGOTS_COPPER)
		.key('s', ModTags.Items.INGOTS_SILVER)
		.key('r', Tags.Items.DUSTS_REDSTONE)
		.addCriterion("copper_ingot", hasItem(ItemInit.COPPER_INGOT.get()))
		.build(recipe);
										
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.SIGNALUM_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.SIGNALUM_INGOT.get())
		.addCriterion("signalum_ingot", hasItem(ItemInit.SIGNALUM_INGOT.get()))
		.build(recipe);

		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.SIGNALUM_INGOT.get(), 9)
		.addIngredient(BlockInit.SIGNALUM_BLOCK.get())
		.addCriterion("signalum_block", hasItem(BlockInit.SIGNALUM_BLOCK.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "signalum_ingot_block"));
							
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.SIGNALUM_NUGGET.get(), 9)
		.addIngredient(ItemInit.SIGNALUM_INGOT.get())
		.addCriterion("signalum_ingot", hasItem(ItemInit.SIGNALUM_INGOT.get()))
		.build(recipe);
													
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.SIGNALUM_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.SIGNALUM_NUGGET.get())
		.addCriterion("signalum_nugget", hasItem(ItemInit.SIGNALUM_NUGGET.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "signalum_ingot_nuggets"));
											
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemInit.SIGNALUM_BLEND.get()), ItemInit.SIGNALUM_INGOT.get(), 1.7f, 400)
		.addCriterion("signalum_blend", hasItem(ItemInit.SIGNALUM_BLEND.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "signalum_ingot_blasting"));
											
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.SIGNALUM_BLEND.get()), ItemInit.SIGNALUM_INGOT.get(), 1.7f, 500)
		.addCriterion("signalum_blend", hasItem(ItemInit.SIGNALUM_BLEND.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "signalum_ingot_smelting"));
		
		
		
		//Silver
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.SILVER_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.SILVER_INGOT.get())
		.addCriterion("silver_ingot", hasItem(ItemInit.SILVER_INGOT.get()))
		.build(recipe);
									
		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.SILVER_INGOT.get(), 9)
		.addIngredient(BlockInit.SILVER_BLOCK.get())
		.addCriterion("silver_block", hasItem(BlockInit.SILVER_BLOCK.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "silver_ingot_block"));
									
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.SILVER_NUGGET.get(), 9)
		.addIngredient(ItemInit.AMETHYST.get())
		.addCriterion("silver_ingot", hasItem(ItemInit.SILVER_INGOT.get()))
		.build(recipe);
											
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.SILVER_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.SILVER_NUGGET.get())
		.addCriterion("silver_nugget", hasItem(ItemInit.SILVER_NUGGET.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "silver_ingot_nuggets"));
										
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.SILVER_ORE.get()), ItemInit.SILVER_INGOT.get(), 0.7f, 400)
		.addCriterion("silver_ore", hasItem(BlockInit.SILVER_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "silver_ingot_blasting"));
										
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.SILVER_ORE.get()), ItemInit.SILVER_INGOT.get(), 0.7f, 200)
		.addCriterion("silver_ore", hasItem(BlockInit.SILVER_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "silver_ingot_smelting"));
		
		
		
		//Steel
		//blend
		ShapedRecipeBuilder.shapedRecipe(ItemInit.STEEL_BLEND.get(), 2)
		.patternLine("ci ")
		.patternLine("i  ")
		.patternLine("   ")
		.key('i', Tags.Items.INGOTS_IRON)
		.key('c', Items.COAL)
		.addCriterion("iron_ingot", hasItem(Tags.Items.INGOTS_IRON))
		.build(recipe);
												
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.STEEL_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.STEEL_INGOT.get())
		.addCriterion("steel_ingot", hasItem(ItemInit.STEEL_INGOT.get()))
		.build(recipe);

		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.STEEL_INGOT.get(), 9)
		.addIngredient(BlockInit.STEEL_BLOCK.get())
		.addCriterion("steel_block", hasItem(BlockInit.STEEL_BLOCK.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "steel_ingot_block"));
											
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.STEEL_NUGGET.get(), 9)
		.addIngredient(ItemInit.STEEL_INGOT.get())
		.addCriterion("steel_ingot", hasItem(ItemInit.STEEL_INGOT.get()))
		.build(recipe);
															
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.STEEL_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.STEEL_NUGGET.get())
		.addCriterion("steel_nugget", hasItem(ItemInit.STEEL_NUGGET.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "steel_ingot_nuggets"));
													
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemInit.STEEL_BLEND.get()), ItemInit.STEEL_INGOT.get(), 1.7f, 400)
		.addCriterion("steel_blend", hasItem(ItemInit.STEEL_BLEND.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "steel_ingot_blasting"));
													
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.STEEL_BLEND.get()), ItemInit.STEEL_INGOT.get(), 1.7f, 500)
		.addCriterion("steel_blend", hasItem(ItemInit.STEEL_BLEND.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "steel_ingot_smelting"));
		
		
		
		//Sulfur
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.SULFUR_ORE.get()), ItemInit.SULFUR_DUST.get(), 0.7f, 400)
		.addCriterion("sulfur_ore", hasItem(BlockInit.SULFUR_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "sulfur_dust_blasting"));
															
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.SULFUR_ORE.get()), ItemInit.SULFUR_DUST.get(), 0.7f, 200)
		.addCriterion("sulfur_ore", hasItem(BlockInit.SULFUR_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "sulfur_dust_smelting"));
		
		
		
		//Tin
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.TIN_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.TIN_INGOT.get())
		.addCriterion("tin_ingot", hasItem(ItemInit.TIN_INGOT.get()))
		.build(recipe);
									
		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.TIN_INGOT.get(), 9)
		.addIngredient(BlockInit.TIN_BLOCK.get())
		.addCriterion("tin_block", hasItem(BlockInit.TIN_BLOCK.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "tin_ingot_block"));
										
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.TIN_NUGGET.get(), 9)
		.addIngredient(ItemInit.AMETHYST.get())
		.addCriterion("tin_ingot", hasItem(ItemInit.TIN_INGOT.get()))
		.build(recipe);
											
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.TIN_NUGGET.get())
		.addCriterion("tin_nugget", hasItem(ItemInit.TIN_NUGGET.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "tin_ingot_nuggets"));
										
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.TIN_ORE.get()), ItemInit.TIN_INGOT.get(), 0.7f, 400)
		.addCriterion("tin_ore", hasItem(BlockInit.TIN_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "tin_ingot_blasting"));
										
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.TIN_ORE.get()), ItemInit.TIN_INGOT.get(), 0.7f, 200)
		.addCriterion("tin_ore", hasItem(BlockInit.TIN_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "tin_ingot_smelting"));
		
		
		
		//Titanium
		//ingot
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TITANIUM_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.TITANIUM_SCRAP.get())
		.addCriterion("titanium_scrap", hasItem(ItemInit.TITANIUM_SCRAP.get()))
		.build(recipe);
				
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.TITANIUM_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.TITANIUM_INGOT.get())
		.addCriterion("titanium_ingot", hasItem(ItemInit.TITANIUM_INGOT.get()))
		.build(recipe);
											
		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.TITANIUM_INGOT.get(), 9)
		.addIngredient(BlockInit.TITANIUM_BLOCK.get())
		.addCriterion("titanium_block", hasItem(BlockInit.TITANIUM_BLOCK.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "titanium_ingot_block"));
												
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.TITANIUM_NUGGET.get(), 9)
		.addIngredient(ItemInit.AMETHYST.get())
		.addCriterion("titanium_ingot", hasItem(ItemInit.TITANIUM_INGOT.get()))
		.build(recipe);
													
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TITANIUM_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.TITANIUM_NUGGET.get())
		.addCriterion("titanium_nugget", hasItem(ItemInit.TITANIUM_NUGGET.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "titanium_ingot_nuggets"));
												
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.TITANIUM_ORE.get()), ItemInit.TITANIUM_SCRAP.get(), 6.9f, 800)
		.addCriterion("titanium_ore", hasItem(BlockInit.TITANIUM_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "titanium_ingot_blasting"));
												
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.TITANIUM_ORE.get()), ItemInit.TITANIUM_SCRAP.get(), 6.9f, 700)
		.addCriterion("titanium_ore", hasItem(BlockInit.TITANIUM_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "titanium_ingot_smelting"));
		
		
		
		//Tungsten
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.TUNGSTEN_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.TUNGSTEN_INGOT.get())
		.addCriterion("tungsten_ingot", hasItem(ItemInit.TUNGSTEN_INGOT.get()))
		.build(recipe);
											
		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.TUNGSTEN_INGOT.get(), 9)
		.addIngredient(BlockInit.TUNGSTEN_BLOCK.get())
		.addCriterion("tungsten_block", hasItem(BlockInit.TUNGSTEN_BLOCK.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "tungsten_ingot_block"));
												
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.TUNGSTEN_NUGGET.get(), 9)
		.addIngredient(ItemInit.AMETHYST.get())
		.addCriterion("tungsten_ingot", hasItem(ItemInit.TUNGSTEN_INGOT.get()))
		.build(recipe);
													
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TUNGSTEN_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.TUNGSTEN_NUGGET.get())
		.addCriterion("tungsten_nugget", hasItem(ItemInit.TUNGSTEN_NUGGET.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "tungsten_ingot_nuggets"));
												
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.TUNGSTEN_ORE.get()), ItemInit.TUNGSTEN_INGOT.get(), 0.7f, 400)
		.addCriterion("tungsten_ore", hasItem(BlockInit.TUNGSTEN_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "tungsten_ingot_blasting"));
												
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.TUNGSTEN_ORE.get()), ItemInit.TUNGSTEN_INGOT.get(), 0.7f, 200)
		.addCriterion("tungsten_ore", hasItem(BlockInit.TUNGSTEN_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "tungsten_ingot_smelting"));
		
		
		
		//Uranium
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.URANIUM_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.URANIUM_INGOT.get())
		.addCriterion("uranium_ingot", hasItem(ItemInit.URANIUM_INGOT.get()))
		.build(recipe);
		
		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.URANIUM_INGOT.get(), 9)
		.addIngredient(BlockInit.URANIUM_BLOCK.get())
		.addCriterion("uranium_block", hasItem(BlockInit.URANIUM_BLOCK.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "uranium_ingot_block"));
		
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.URANIUM_NUGGET.get(), 9)
		.addIngredient(ItemInit.AMETHYST.get())
		.addCriterion("uranium_ingot", hasItem(ItemInit.URANIUM_INGOT.get()))
		.build(recipe);
		
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.URANIUM_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.URANIUM_NUGGET.get())
		.addCriterion("uranium_nugget", hasItem(ItemInit.URANIUM_NUGGET.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "uranium_ingot_nuggets"));
		
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.URANIUM_ORE.get()), ItemInit.URANIUM_INGOT.get(), 0.7f, 400)
		.addCriterion("uranium_ore", hasItem(BlockInit.URANIUM_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "uranium_ingot_blasting"));
		
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.URANIUM_ORE.get()), ItemInit.URANIUM_INGOT.get(), 0.7f, 200)
		.addCriterion("uranium_ore", hasItem(BlockInit.URANIUM_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "uranium_ingot_smelting"));
		
		
		
		//Cobalt
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.COBALT_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.COBALT_INGOT.get())
		.addCriterion("cobalt_ingot", hasItem(ItemInit.COBALT_INGOT.get()))
		.build(recipe);		
		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.COBALT_INGOT.get(), 9)
		.addIngredient(BlockInit.COBALT_BLOCK.get())
		.addCriterion("cobalt_block", hasItem(BlockInit.COBALT_BLOCK.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "cobalt_ingot_block"));
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.COBALT_NUGGET.get(), 9)
		.addIngredient(ItemInit.AMETHYST.get())
		.addCriterion("cobalt_ingot", hasItem(ItemInit.COBALT_INGOT.get()))
		.build(recipe);
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.COBALT_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.COBALT_NUGGET.get())
		.addCriterion("cobalt_nugget", hasItem(ItemInit.COBALT_NUGGET.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "cobalt_ingot_nuggets"));
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.COBALT_ORE.get()), ItemInit.COBALT_INGOT.get(), 0.7f, 400)
		.addCriterion("cobalt_ore", hasItem(BlockInit.COBALT_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "cobalt_ingot_blasting"));	
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.COBALT_ORE.get()), ItemInit.COBALT_INGOT.get(), 0.7f, 200)
		.addCriterion("cobalt_ore", hasItem(BlockInit.COBALT_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "cobalt_ingot_smelting"));
		
		
		
		//Zinc
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.ZINC_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.ZINC_INGOT.get())
		.addCriterion("zinc_ingot", hasItem(ItemInit.ZINC_INGOT.get()))
		.build(recipe);		
		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.ZINC_INGOT.get(), 9)
		.addIngredient(BlockInit.ZINC_BLOCK.get())
		.addCriterion("zinc_block", hasItem(BlockInit.ZINC_BLOCK.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "zinc_ingot_block"));
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.ZINC_NUGGET.get(), 9)
		.addIngredient(ItemInit.AMETHYST.get())
		.addCriterion("zinc_ingot", hasItem(ItemInit.ZINC_INGOT.get()))
		.build(recipe);
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ZINC_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.ZINC_NUGGET.get())
		.addCriterion("zinc_nugget", hasItem(ItemInit.ZINC_NUGGET.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "zinc_ingot_nuggets"));
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.ZINC_ORE.get()), ItemInit.ZINC_INGOT.get(), 0.7f, 400)
		.addCriterion("zinc_ore", hasItem(BlockInit.ZINC_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "zinc_ingot_blasting"));	
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.ZINC_ORE.get()), ItemInit.ZINC_INGOT.get(), 0.7f, 200)
		.addCriterion("zinc_ore", hasItem(BlockInit.ZINC_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "zinc_ingot_smelting"));
		
		//Saltpetre
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.SALTPETRE_ORE.get()), ItemInit.SALTPETRE_DUST.get(), 0.7f, 400)
		.addCriterion("saltpetre_ore", hasItem(BlockInit.SALTPETRE_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "saltpetre_dust_blasting"));
																	
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.SALTPETRE_ORE.get()), ItemInit.SALTPETRE_DUST.get(), 0.7f, 200)
		.addCriterion("saltpetre_ore", hasItem(BlockInit.SALTPETRE_ORE.get()))
		.build(recipe, new ResourceLocation(CLib.MOD_ID, "saltpetre_dust_smelting"));
				
		//gunpowder
		ShapelessRecipeBuilder.shapelessRecipe(Items.GUNPOWDER, 4)
		.addIngredient(ItemTags.COALS)
		.addIngredient(ItemTags.COALS)
		.addIngredient(ModTags.Items.DUSTS_SULFUR)
		.addIngredient(ModTags.Items.DUSTS_SALTPETRE)
		.addCriterion("saltpetre_dust", hasItem(ItemInit.SALTPETRE_DUST.get()))
		.build(recipe);
				
		//Rubber
		//rubber_planks
		ShapelessRecipeBuilder.shapelessRecipe(BlockInit.RUBBER_PLANKS.get(), 4)
		.addIngredient(ModTags.Items.RUBBER_LOGS)
		.addCriterion("rubber_log", hasItem(ModTags.Items.RUBBER_LOGS))
		.build(recipe);
		
		//rubber_wood
		ShapedRecipeBuilder.shapedRecipe(BlockInit.RUBBER_WOOD.get(), 3)
		.patternLine("aa ")
		.patternLine("aa ")
		.patternLine("   ")
		.key('a', BlockInit.RUBBER_LOG.get())
		.addCriterion("rubber_log", hasItem(BlockInit.RUBBER_LOG.get()))
		.build(recipe);
		
		//stripped_rubber_wood
		ShapedRecipeBuilder.shapedRecipe(BlockInit.RUBBER_STRIPPED_WOOD.get(), 3)
		.patternLine("aa ")
		.patternLine("aa ")
		.patternLine("   ")
		.key('a', BlockInit.RUBBER_STRIPPED_LOG.get())
		.addCriterion("stripped_rubber_log", hasItem(BlockInit.RUBBER_STRIPPED_LOG.get()))
		.build(recipe);
		
		//rubber
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.RUBBER.get(), 1)
		.addIngredient(ModTags.Items.RUBBER_LOGS)
		.addIngredient(ModTags.Items.RUBBER_LOGS)
		.addIngredient(ModTags.Items.RUBBER_LOGS)
		.addIngredient(ItemInit.TREE_TAP.get())
		.addCriterion("rubber_log", hasItem(ModTags.Items.RUBBER_LOGS))
		.build(recipe);
		
		//treetap
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TREE_TAP.get(), 1)
		.patternLine(" a ")
		.patternLine("aaa")
		.patternLine("a  ")
		.key('a', ItemTags.PLANKS)
		.addCriterion("planks", hasItem(ItemTags.PLANKS))
		.build(recipe);
		
		//Hazmat Suit
		ShapedRecipeBuilder.shapedRecipe(ItemInit.HAZMAT_CHEST.get(), 1)
		.patternLine("a a")
		.patternLine("aoa")
		.patternLine("aoa")
		.key('a', ModTags.Items.RUBBER)
		.key('o', Tags.Items.DYES_YELLOW)
		.addCriterion("rubber", hasItem(ModTags.Items.RUBBER))
		.build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.HAZMAT_LEGS.get(), 1)
		.patternLine("aoa")
		.patternLine("a a")
		.patternLine("a a")
		.key('a', ModTags.Items.RUBBER)
		.key('o', Tags.Items.DYES_YELLOW)
		.addCriterion("rubber", hasItem(ModTags.Items.RUBBER))
		.build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.HAZMAT_HELM.get(), 1)
		.patternLine(" o ")
		.patternLine("aga")
		.patternLine("aba")
		.key('a', ModTags.Items.RUBBER)
		.key('o', Tags.Items.DYES_YELLOW)
		.key('g', Tags.Items.GLASS)
		.key('b', Blocks.IRON_BARS)
		.addCriterion("rubber", hasItem(ModTags.Items.RUBBER))
		.build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.HAZMAT_BOOTS.get(), 1)
		.patternLine("a a")
		.patternLine("a a")
		.patternLine("awa")
		.key('a', ModTags.Items.RUBBER)
		.key('w', ItemTags.WOOL)
		.addCriterion("rubber", hasItem(ModTags.Items.RUBBER))
		.build(recipe);
	}
}
