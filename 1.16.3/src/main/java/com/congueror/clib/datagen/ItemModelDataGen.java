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
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/aluminum_ingot"));
		singleTexture(ItemInit.ALUMINUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/aluminum_nugget"));
		
		//Amethyst
		singleTexture(ItemInit.AMETHYST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/amethyst"));
		
		//Bronze
		singleTexture(ItemInit.BRONZE_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/bronze_blend"));
		singleTexture(ItemInit.BRONZE_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/bronze_ingot"));
		singleTexture(ItemInit.BRONZE_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/bronze_nugget"));
		
		//Coal Nugget
		singleTexture(ItemInit.COAL_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/coal_nugget"));
		
		//Copper
		singleTexture(ItemInit.COPPER_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/copper_ingot"));
		singleTexture(ItemInit.COPPER_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/copper_nugget"));
		
		//Electrum
		singleTexture(ItemInit.ELECTRUM_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/electrum_blend"));
		singleTexture(ItemInit.ELECTRUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/electrum_ingot"));
		singleTexture(ItemInit.ELECTRUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/electrum_nugget"));
		
		//Enderium
		singleTexture(ItemInit.ENDERIUM_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/enderium_blend"));
		singleTexture(ItemInit.ENDERIUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/enderium_ingot"));
		singleTexture(ItemInit.ENDERIUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/enderium_nugget"));
		
		//Invar
		singleTexture(ItemInit.INVAR_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/invar_blend"));
		singleTexture(ItemInit.INVAR_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/invar_ingot"));
		singleTexture(ItemInit.INVAR_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/invar_nugget"));
		
		//Lead
		singleTexture(ItemInit.LEAD_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/lead_ingot"));
		singleTexture(ItemInit.LEAD_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/lead_nugget"));
		
		//Lumium
		singleTexture(ItemInit.LUMIUM_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/lumium_blend"));
		singleTexture(ItemInit.LUMIUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/lumium_ingot"));
		singleTexture(ItemInit.LUMIUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/lumium_nugget"));
		
		//Nickel
		singleTexture(ItemInit.NICKEL_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/nickel_ingot"));
		singleTexture(ItemInit.NICKEL_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/nickel_nugget"));
		
		//Opal
		singleTexture(ItemInit.OPAL.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/opal"));
		
		//Platinum
		singleTexture(ItemInit.PLATINUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/platinum_ingot"));
		singleTexture(ItemInit.PLATINUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/platinum_nugget"));
		
		//Pyrotheum
		singleTexture(ItemInit.PYROTHEUM_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/pyrotheum_dust"));
		
		//Ruby
		singleTexture(ItemInit.RUBY.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/ruby"));
		
		//Sapphire
		singleTexture(ItemInit.SAPPHIRE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/sapphire"));
		
		//Signalum
		singleTexture(ItemInit.SIGNALUM_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/signalum_blend"));
		singleTexture(ItemInit.SIGNALUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/signalum_ingot"));
		singleTexture(ItemInit.SIGNALUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/signalum_nugget"));
		
		//Silver
		singleTexture(ItemInit.SILVER_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/silver_ingot"));
		singleTexture(ItemInit.SILVER_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/silver_nugget"));
		
		//Steel
		singleTexture(ItemInit.STEEL_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/steel_blend"));
		singleTexture(ItemInit.STEEL_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/steel_ingot"));
		singleTexture(ItemInit.STEEL_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/steel_nugget"));
		
		//Sulfur
		singleTexture(ItemInit.SULFUR_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/sulfur_dust"));
		
		//Tin
		singleTexture(ItemInit.TIN_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/tin_ingot"));
		singleTexture(ItemInit.TIN_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "items/tin_nugget"));
		
				//Titanium
				singleTexture(ItemInit.TITANIUM_SCRAP.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "items/titanium_scrap"));
				singleTexture(ItemInit.TITANIUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "items/titanium_ingot"));
				singleTexture(ItemInit.TITANIUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "items/titanium_nugget"));
		
				//Tungsten
				singleTexture(ItemInit.TUNGSTEN_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "items/tungsten_ingot"));
				singleTexture(ItemInit.TUNGSTEN_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "items/tungsten_nugget"));
		
				//Uranium
				singleTexture(ItemInit.URANIUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "items/uranium_ingot"));
				singleTexture(ItemInit.URANIUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "items/uranium_nugget"));
				
				//Cobalt
				singleTexture(ItemInit.COBALT_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "items/cobalt_ingot"));
				singleTexture(ItemInit.COBALT_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "items/cobalt_nugget"));
				
				//Zinc
				singleTexture(ItemInit.ZINC_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "items/zinc_ingot"));
				singleTexture(ItemInit.ZINC_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "items/zinc_nugget"));
				
		//Saltpetre
				singleTexture(ItemInit.SALTPETRE_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "items/saltpetre"));
	}

}
