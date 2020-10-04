package com.congueror.clib.datagen;

import com.congueror.clib.CLib;
import com.congueror.clib.init.ItemInit;

import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModelDataGen extends ItemModelProvider{

	public ItemModelDataGen(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
		super(generator, CLib.MOD_ID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		//Aluminum
		singleTexture(ItemInit.ALUMINUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/aluminum_ingot"));
		singleTexture(ItemInit.ALUMINUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/aluminum_nugget"));
		
		//Amethyst
		singleTexture(ItemInit.AMETHYST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/amethyst"));
		
		//Bronze
		singleTexture(ItemInit.BRONZE_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/bronze_blend"));
		singleTexture(ItemInit.BRONZE_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/bronze_ingot"));
		singleTexture(ItemInit.BRONZE_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/bronze_nugget"));
		
		//Coal Nugget
		singleTexture(ItemInit.COAL_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/coal_nugget"));
		
		//Copper
		singleTexture(ItemInit.COPPER_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/copper_ingot"));
		singleTexture(ItemInit.COPPER_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/copper_nugget"));
		
		//Electrum
		singleTexture(ItemInit.ELECTRUM_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/electrum_blend"));
		singleTexture(ItemInit.ELECTRUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/electrum_ingot"));
		singleTexture(ItemInit.ELECTRUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/electrum_nugget"));
		
		//Enderium
		singleTexture(ItemInit.ENDERIUM_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/enderium_blend"));
		singleTexture(ItemInit.ENDERIUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/enderium_ingot"));
		singleTexture(ItemInit.ENDERIUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/enderium_nugget"));
		
		//Invar
		singleTexture(ItemInit.INVAR_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/invar_blend"));
		singleTexture(ItemInit.INVAR_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/invar_ingot"));
		singleTexture(ItemInit.INVAR_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/invar_nugget"));
		
		//Lead
		singleTexture(ItemInit.LEAD_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/lead_ingot"));
		singleTexture(ItemInit.LEAD_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/lead_nugget"));
		
		//Lumium
		singleTexture(ItemInit.LUMIUM_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/lumium_blend"));
		singleTexture(ItemInit.LUMIUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/lumium_ingot"));
		singleTexture(ItemInit.LUMIUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/lumium_nugget"));
		
		//Nickel
		singleTexture(ItemInit.NICKEL_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/nickel_ingot"));
		singleTexture(ItemInit.NICKEL_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/nickel_nugget"));
		
		//Opal
		singleTexture(ItemInit.OPAL.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/opal"));
		
		//Platinum
		singleTexture(ItemInit.PLATINUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/platinum_ingot"));
		singleTexture(ItemInit.PLATINUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/platinum_nugget"));
		
		//Pyrotheum
		singleTexture(ItemInit.PYROTHEUM_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/pyrotheum_dust"));
		
		//Ruby
		singleTexture(ItemInit.RUBY.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/ruby"));
		
		//Sapphire
		singleTexture(ItemInit.SAPPHIRE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/sapphire"));
		
		//Signalum
		singleTexture(ItemInit.SIGNALUM_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/signalum_blend"));
		singleTexture(ItemInit.SIGNALUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/signalum_ingot"));
		singleTexture(ItemInit.SIGNALUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/signalum_nugget"));
		
		//Silver
		singleTexture(ItemInit.SILVER_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/silver_ingot"));
		singleTexture(ItemInit.SILVER_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/silver_nugget"));
		
		//Steel
		singleTexture(ItemInit.STEEL_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/steel_blend"));
		singleTexture(ItemInit.STEEL_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/steel_ingot"));
		singleTexture(ItemInit.STEEL_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/steel_nugget"));
		
		//Sulfur
		singleTexture(ItemInit.SULFUR_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/sulfur_dust"));
		
		//Tin
		singleTexture(ItemInit.TIN_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/tin_ingot"));
		singleTexture(ItemInit.TIN_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/tin_nugget"));
		
				//Titanium
				singleTexture(ItemInit.TITANIUM_SCRAP.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "item/titanium_scrap"));
				singleTexture(ItemInit.TITANIUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "item/titanium_ingot"));
				singleTexture(ItemInit.TITANIUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "item/titanium_nugget"));
		
				//Tungsten
				singleTexture(ItemInit.TUNGSTEN_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "item/tungsten_ingot"));
				singleTexture(ItemInit.TUNGSTEN_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "item/tungsten_nugget"));
		
				//Uranium
				singleTexture(ItemInit.URANIUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "item/uranium_ingot"));
				singleTexture(ItemInit.URANIUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "item/uranium_nugget"));
				
				//Cobalt
				singleTexture(ItemInit.COBALT_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "item/cobalt_ingot"));
				singleTexture(ItemInit.COBALT_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "item/cobalt_nugget"));
				
				//Zinc
				singleTexture(ItemInit.ZINC_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "item/zinc_ingot"));
				singleTexture(ItemInit.ZINC_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "item/zinc_nugget"));
				
		//Saltpetre
				singleTexture(ItemInit.SALTPETRE_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "item/saltpetre"));
				
		//Rubber
		singleTexture(ItemInit.RUBBER.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(CLib.MOD_ID, "item/rubber"));
		singleTexture(ItemInit.TREE_TAP.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/tree_tap"));
	}

}
