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
		singleTexture(ItemInit.ALUMINUM_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/aluminum_dust"));
		
		//Amethyst
		singleTexture(ItemInit.AMETHYST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/amethyst"));
		singleTexture(ItemInit.AMETHYST_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/amethyst_dust"));
		
		//Bronze
		singleTexture(ItemInit.BRONZE_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/bronze_blend"));
		singleTexture(ItemInit.BRONZE_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/bronze_ingot"));
		singleTexture(ItemInit.BRONZE_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/bronze_nugget"));
		singleTexture(ItemInit.BRONZE_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/bronze_dust"));
		
		//Coal Nugget
		singleTexture(ItemInit.COAL_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/coal_nugget"));
		
		//Copper
		singleTexture(ItemInit.COPPER_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/copper_ingot"));
		singleTexture(ItemInit.COPPER_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/copper_nugget"));
		singleTexture(ItemInit.COPPER_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/copper_dust"));
		
		//Electrum
		singleTexture(ItemInit.ELECTRUM_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/electrum_blend"));
		singleTexture(ItemInit.ELECTRUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/electrum_ingot"));
		singleTexture(ItemInit.ELECTRUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/electrum_nugget"));
		singleTexture(ItemInit.ELECTRUM_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/electrum_dust"));
		
		//Enderium
		singleTexture(ItemInit.ENDERIUM_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/enderium_blend"));
		singleTexture(ItemInit.ENDERIUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/enderium_ingot"));
		singleTexture(ItemInit.ENDERIUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/enderium_nugget"));
		singleTexture(ItemInit.ENDERIUM_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/enderium_dust"));
		
		//Invar
		singleTexture(ItemInit.INVAR_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/invar_blend"));
		singleTexture(ItemInit.INVAR_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/invar_ingot"));
		singleTexture(ItemInit.INVAR_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/invar_nugget"));
		singleTexture(ItemInit.INVAR_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/invar_dust"));
		
		//Lead
		singleTexture(ItemInit.LEAD_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/lead_ingot"));
		singleTexture(ItemInit.LEAD_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/lead_nugget"));
		singleTexture(ItemInit.LEAD_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/lead_dust"));
		
		//Lumium
		singleTexture(ItemInit.LUMIUM_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/lumium_blend"));
		singleTexture(ItemInit.LUMIUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/lumium_ingot"));
		singleTexture(ItemInit.LUMIUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/lumium_nugget"));
		singleTexture(ItemInit.LUMIUM_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/lumium_dust"));
		
		//Nickel
		singleTexture(ItemInit.NICKEL_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/nickel_ingot"));
		singleTexture(ItemInit.NICKEL_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/nickel_nugget"));
		singleTexture(ItemInit.NICKEL_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/nickel_dust"));
		
		//Opal
		singleTexture(ItemInit.OPAL.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/opal"));
		singleTexture(ItemInit.OPAL_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/opal_dust"));
		
		//Platinum
		singleTexture(ItemInit.PLATINUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/platinum_ingot"));
		singleTexture(ItemInit.PLATINUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/platinum_nugget"));
		singleTexture(ItemInit.PLATINUM_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/platinum_dust"));
		
		//Pyrotheum
		singleTexture(ItemInit.PYROTHEUM_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/pyrotheum_dust"));
		
		//Ruby
		singleTexture(ItemInit.RUBY.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/ruby"));
		singleTexture(ItemInit.RUBY_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/ruby_dust"));
		
		//Sapphire
		singleTexture(ItemInit.SAPPHIRE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/sapphire"));
		singleTexture(ItemInit.SAPPHIRE_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/sapphire_dust"));
		
		//Signalum
		singleTexture(ItemInit.SIGNALUM_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/signalum_blend"));
		singleTexture(ItemInit.SIGNALUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/signalum_ingot"));
		singleTexture(ItemInit.SIGNALUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/signalum_nugget"));
		singleTexture(ItemInit.SIGNALUM_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/signalum_dust"));
		
		//Silver
		singleTexture(ItemInit.SILVER_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/silver_ingot"));
		singleTexture(ItemInit.SILVER_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/silver_nugget"));
		singleTexture(ItemInit.SILVER_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/silver_dust"));
		
		//Steel
		singleTexture(ItemInit.STEEL_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/steel_blend"));
		singleTexture(ItemInit.STEEL_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/steel_ingot"));
		singleTexture(ItemInit.STEEL_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/steel_nugget"));
		singleTexture(ItemInit.STEEL_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/steel_dust"));
		
		//Sulfur
		singleTexture(ItemInit.SULFUR_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/sulfur_dust"));
		
		//Tin
		singleTexture(ItemInit.TIN_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/tin_ingot"));
		singleTexture(ItemInit.TIN_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/tin_nugget"));
		singleTexture(ItemInit.TIN_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/tin_dust"));
		
				//Titanium
				singleTexture(ItemInit.TITANIUM_SCRAP.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "item/titanium_scrap"));
				singleTexture(ItemInit.TITANIUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "item/titanium_ingot"));
				singleTexture(ItemInit.TITANIUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "item/titanium_nugget"));
				singleTexture(ItemInit.TITANIUM_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "item/titanium_dust"));
		
				//Tungsten
				singleTexture(ItemInit.TUNGSTEN_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "item/tungsten_ingot"));
				singleTexture(ItemInit.TUNGSTEN_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "item/tungsten_nugget"));
				singleTexture(ItemInit.TUNGSTEN_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "item/tungsten_dust"));
		
				//Uranium
				singleTexture(ItemInit.URANIUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "item/uranium_ingot"));
				singleTexture(ItemInit.URANIUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "item/uranium_nugget"));
				singleTexture(ItemInit.URANIUM_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "item/uranium_dust"));
				
				//Cobalt
				singleTexture(ItemInit.COBALT_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "item/cobalt_ingot"));
				singleTexture(ItemInit.COBALT_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "item/cobalt_nugget"));
				singleTexture(ItemInit.COBALT_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "item/cobalt_dust"));
				
				//Zinc
				singleTexture(ItemInit.ZINC_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "item/zinc_ingot"));
				singleTexture(ItemInit.ZINC_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "item/zinc_nugget"));
				singleTexture(ItemInit.ZINC_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "item/zinc_dust"));
				
		//Saltpetre
				singleTexture(ItemInit.SALTPETRE_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "item/saltpetre"));
				
				//Brass
				singleTexture(ItemInit.BRASS_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "item/brass_blend"));
				singleTexture(ItemInit.BRASS_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "item/brass_ingot"));
				singleTexture(ItemInit.BRASS_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "item/brass_nugget"));
				singleTexture(ItemInit.BRASS_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "item/brass_dust"));
				
				//Chromium
				singleTexture(ItemInit.CHROMIUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "item/chromium_ingot"));
				singleTexture(ItemInit.CHROMIUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "item/chromium_nugget"));
				singleTexture(ItemInit.CHROMIUM_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "item/chromium_dust"));
				
				//Thorium
				singleTexture(ItemInit.THORIUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "item/thorium_ingot"));
				singleTexture(ItemInit.THORIUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "item/thorium_nugget"));
				singleTexture(ItemInit.THORIUM_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(CLib.MOD_ID, "item/thorium_dust"));
				
				//Hammers
				singleTexture(ItemInit.IRON_HAMMER.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "item/iron_hammer"));
				singleTexture(ItemInit.DIAMOND_HAMMER.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "item/diamond_hammer"));
				singleTexture(ItemInit.NETHERITE_HAMMER.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "item/netherite_hammer"));
				
				//Vanilla Dusts
				singleTexture(ItemInit.COAL_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "item/coal_dust"));
				singleTexture(ItemInit.IRON_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "item/iron_dust"));
				singleTexture(ItemInit.GOLD_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "item/gold_dust"));
				singleTexture(ItemInit.LAPIS_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "item/lapis_dust"));
				singleTexture(ItemInit.QUARTZ_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "item/quartz_dust"));
				singleTexture(ItemInit.DIAMOND_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "item/diamond_dust"));
				singleTexture(ItemInit.EMERALD_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "item/emerald_dust"));
				singleTexture(ItemInit.NETHERITE_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(CLib.MOD_ID, "item/netherite_dust"));
				
		//Rubber
		singleTexture(ItemInit.RUBBER.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(CLib.MOD_ID, "item/rubber"));
		singleTexture(ItemInit.TREE_TAP.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/tree_tap"));
		
		//Hazmat
		singleTexture(ItemInit.HAZMAT_HELM.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(CLib.MOD_ID, "item/hazmat_helmet"));
		singleTexture(ItemInit.HAZMAT_CHEST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/hazmat_chestplate"));
		singleTexture(ItemInit.HAZMAT_LEGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(CLib.MOD_ID, "item/hazmat_leggings"));
		singleTexture(ItemInit.HAZMAT_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CLib.MOD_ID, "item/hazmat_boots"));
	}

}
