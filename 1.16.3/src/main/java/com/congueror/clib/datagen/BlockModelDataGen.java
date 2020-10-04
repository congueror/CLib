package com.congueror.clib.datagen;

import com.congueror.clib.CLib;
import com.congueror.clib.init.BlockInit;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockModelDataGen extends BlockStateProvider 
{

	public BlockModelDataGen(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
		super(generator, CLib.MOD_ID, existingFileHelper);
	}
	
	public String name(Block block) {
        return block.getRegistryName().getPath();
    }
	
	public void basicBlockItem(Block block) {
	    simpleBlockItem(block, models().getExistingFile(new ResourceLocation(CLib.MOD_ID, name(block))));
	}

	@Override
	protected void registerStatesAndModels() {
		//Aluminum
		simpleBlock(BlockInit.ALUMINUM_ORE.get());
		simpleBlock(BlockInit.ALUMINUM_BLOCK.get());
		basicBlockItem(BlockInit.ALUMINUM_BLOCK.get());
		basicBlockItem(BlockInit.ALUMINUM_ORE.get());
		
		//Amethyst
		simpleBlock(BlockInit.AMETHYST_ORE.get());
		simpleBlock(BlockInit.AMETHYST_BLOCK.get());
		basicBlockItem(BlockInit.AMETHYST_BLOCK.get());
		basicBlockItem(BlockInit.AMETHYST_ORE.get());
		
		//Bronze
		simpleBlock(BlockInit.BRONZE_BLOCK.get());
		basicBlockItem(BlockInit.BRONZE_BLOCK.get());
		
		//Copper
		simpleBlock(BlockInit.COPPER_ORE.get());
		simpleBlock(BlockInit.COPPER_BLOCK.get());
		basicBlockItem(BlockInit.COPPER_BLOCK.get());
		basicBlockItem(BlockInit.COPPER_ORE.get());
		
		//Electrum
		simpleBlock(BlockInit.ELECTRUM_BLOCK.get());
		basicBlockItem(BlockInit.ELECTRUM_BLOCK.get());
		
		//Enderium
		simpleBlock(BlockInit.ENDERIUM_BLOCK.get());
		basicBlockItem(BlockInit.ENDERIUM_BLOCK.get());
		
		//Invar
		simpleBlock(BlockInit.INVAR_BLOCK.get());
		basicBlockItem(BlockInit.INVAR_BLOCK.get());
		
		//Lead
		simpleBlock(BlockInit.LEAD_ORE.get());
		simpleBlock(BlockInit.LEAD_BLOCK.get());
		basicBlockItem(BlockInit.LEAD_BLOCK.get());
		basicBlockItem(BlockInit.LEAD_ORE.get());
		
		//Lumium
		simpleBlock(BlockInit.LUMIUM_BLOCK.get());
		basicBlockItem(BlockInit.LUMIUM_BLOCK.get());
		
		//Nickel
		simpleBlock(BlockInit.NICKEL_ORE.get());
		simpleBlock(BlockInit.NICKEL_BLOCK.get());
		basicBlockItem(BlockInit.NICKEL_BLOCK.get());
		basicBlockItem(BlockInit.NICKEL_ORE.get());
		
		//Opal
		simpleBlock(BlockInit.OPAL_ORE.get());
		simpleBlock(BlockInit.OPAL_BLOCK.get());
		basicBlockItem(BlockInit.OPAL_BLOCK.get());
		basicBlockItem(BlockInit.OPAL_ORE.get());
		
		//Platinum
		simpleBlock(BlockInit.PLATINUM_ORE.get());
		simpleBlock(BlockInit.PLATINUM_BLOCK.get());
		basicBlockItem(BlockInit.PLATINUM_BLOCK.get());
		basicBlockItem(BlockInit.PLATINUM_ORE.get());
		
		//Ruby
		simpleBlock(BlockInit.RUBY_ORE.get());
		simpleBlock(BlockInit.RUBY_BLOCK.get());
		basicBlockItem(BlockInit.RUBY_BLOCK.get());
		basicBlockItem(BlockInit.RUBY_ORE.get());
		
		//Sapphire
		simpleBlock(BlockInit.SAPPHIRE_ORE.get());
		simpleBlock(BlockInit.SAPPHIRE_BLOCK.get());
		basicBlockItem(BlockInit.SAPPHIRE_BLOCK.get());
		basicBlockItem(BlockInit.SAPPHIRE_ORE.get());
		
		//Signalum
		simpleBlock(BlockInit.SIGNALUM_BLOCK.get());
		basicBlockItem(BlockInit.SIGNALUM_BLOCK.get());
		
		//Silver
		simpleBlock(BlockInit.SILVER_ORE.get());
		simpleBlock(BlockInit.SILVER_BLOCK.get());
		basicBlockItem(BlockInit.SILVER_BLOCK.get());
		basicBlockItem(BlockInit.SILVER_ORE.get());
		
		//Steel
		simpleBlock(BlockInit.STEEL_BLOCK.get());
		basicBlockItem(BlockInit.STEEL_BLOCK.get());
		
		//Sulfur
		simpleBlock(BlockInit.SULFUR_ORE.get());
		basicBlockItem(BlockInit.SULFUR_ORE.get());
		
		//Tin
		simpleBlock(BlockInit.TIN_ORE.get());
		simpleBlock(BlockInit.TIN_BLOCK.get());
		basicBlockItem(BlockInit.TIN_BLOCK.get());
		basicBlockItem(BlockInit.TIN_ORE.get());
		
		//Titanium
		simpleBlock(BlockInit.TITANIUM_BLOCK.get());
		basicBlockItem(BlockInit.TITANIUM_BLOCK.get());
		basicBlockItem(BlockInit.TITANIUM_ORE.get());
		
		//Tungsten
		simpleBlock(BlockInit.TUNGSTEN_ORE.get());
		simpleBlock(BlockInit.TUNGSTEN_BLOCK.get());
		basicBlockItem(BlockInit.TUNGSTEN_BLOCK.get());
		basicBlockItem(BlockInit.TUNGSTEN_ORE.get());
		
		//Uranium
		simpleBlock(BlockInit.URANIUM_ORE.get());
		simpleBlock(BlockInit.URANIUM_BLOCK.get());
		basicBlockItem(BlockInit.URANIUM_BLOCK.get());
		basicBlockItem(BlockInit.URANIUM_ORE.get());
		
		//Cobalt
		simpleBlock(BlockInit.COBALT_ORE.get());
		simpleBlock(BlockInit.COBALT_BLOCK.get());
		basicBlockItem(BlockInit.COBALT_BLOCK.get());
		basicBlockItem(BlockInit.COBALT_ORE.get());
		
		//Zinc
		simpleBlock(BlockInit.ZINC_ORE.get());
		simpleBlock(BlockInit.ZINC_BLOCK.get());
		basicBlockItem(BlockInit.ZINC_BLOCK.get());
		basicBlockItem(BlockInit.ZINC_ORE.get());
		
		//Saltpetre
		simpleBlock(BlockInit.SALTPETRE_ORE.get());
		basicBlockItem(BlockInit.SALTPETRE_ORE.get());
		
		//Rubber
		simpleBlock(BlockInit.RUBBER_PLANKS.get());
		basicBlockItem(BlockInit.RUBBER_LOG.get());
		basicBlockItem(BlockInit.RUBBER_WOOD.get());
		basicBlockItem(BlockInit.RUBBER_STRIPPED_LOG.get());
		basicBlockItem(BlockInit.RUBBER_STRIPPED_WOOD.get());
		basicBlockItem(BlockInit.RUBBER_PLANKS.get());
		basicBlockItem(BlockInit.RUBBER_LEAVES.get());
		basicBlockItem(BlockInit.RUBBER_SAPLING.get());
	}
}
