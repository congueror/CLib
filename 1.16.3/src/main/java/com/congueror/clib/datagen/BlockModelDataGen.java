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
		basicBlockItem(BlockInit.ALUMINUM_BLOCK.get());
		basicBlockItem(BlockInit.ALUMINUM_ORE.get());
		
		//Amethyst
		basicBlockItem(BlockInit.AMETHYST_BLOCK.get());
		basicBlockItem(BlockInit.AMETHYST_ORE.get());
		
		//Bronze
		basicBlockItem(BlockInit.BRONZE_BLOCK.get());
		
		//Copper
		basicBlockItem(BlockInit.COPPER_BLOCK.get());
		basicBlockItem(BlockInit.COPPER_ORE.get());
		
		//Electrum
		basicBlockItem(BlockInit.ELECTRUM_BLOCK.get());
		
		//Enderium
		basicBlockItem(BlockInit.ENDERIUM_BLOCK.get());
		
		//Invar
		basicBlockItem(BlockInit.INVAR_BLOCK.get());
		
		//Lead
		basicBlockItem(BlockInit.LEAD_BLOCK.get());
		basicBlockItem(BlockInit.LEAD_ORE.get());
		
		//Lumium
		basicBlockItem(BlockInit.LUMIUM_BLOCK.get());
		
		//Nickel
		basicBlockItem(BlockInit.NICKEL_BLOCK.get());
		basicBlockItem(BlockInit.NICKEL_ORE.get());
		
		//Opal
		basicBlockItem(BlockInit.OPAL_BLOCK.get());
		basicBlockItem(BlockInit.OPAL_ORE.get());
		
		//Platinum
		basicBlockItem(BlockInit.PLATINUM_BLOCK.get());
		basicBlockItem(BlockInit.PLATINUM_ORE.get());
		
		//Ruby
		basicBlockItem(BlockInit.RUBY_BLOCK.get());
		basicBlockItem(BlockInit.RUBY_ORE.get());
		
		//Sapphire
		basicBlockItem(BlockInit.SAPPHIRE_BLOCK.get());
		basicBlockItem(BlockInit.SAPPHIRE_ORE.get());
		
		//Signalum
		basicBlockItem(BlockInit.SIGNALUM_BLOCK.get());
		
		//Silver
		basicBlockItem(BlockInit.SILVER_BLOCK.get());
		basicBlockItem(BlockInit.SILVER_ORE.get());
		
		//Steel
		basicBlockItem(BlockInit.STEEL_BLOCK.get());
		
		//Sulfur
		basicBlockItem(BlockInit.SULFUR_ORE.get());
		
		//Tin
		basicBlockItem(BlockInit.TIN_BLOCK.get());
		basicBlockItem(BlockInit.TIN_ORE.get());
		
		//Titanium
		basicBlockItem(BlockInit.TITANIUM_BLOCK.get());
		basicBlockItem(BlockInit.TITANIUM_ORE.get());
		
		//Tungsten
		basicBlockItem(BlockInit.TUNGSTEN_BLOCK.get());
		basicBlockItem(BlockInit.TUNGSTEN_ORE.get());
		
		//Uranium
		basicBlockItem(BlockInit.URANIUM_BLOCK.get());
		basicBlockItem(BlockInit.URANIUM_ORE.get());
		
		//Cobalt
		basicBlockItem(BlockInit.COBALT_BLOCK.get());
		basicBlockItem(BlockInit.COBALT_ORE.get());
		
		//Zinc
		basicBlockItem(BlockInit.ZINC_BLOCK.get());
		basicBlockItem(BlockInit.ZINC_ORE.get());
		
		//Saltpetre
		basicBlockItem(BlockInit.SALTPETRE_ORE.get());
	}
}
