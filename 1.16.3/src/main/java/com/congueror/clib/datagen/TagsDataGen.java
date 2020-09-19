package com.congueror.clib.datagen;

import com.congueror.clib.CLib;
import com.congueror.clib.init.BlockInit;
import com.congueror.clib.init.ItemInit;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Items;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TagsDataGen {
	public static class ItemTagsDataGen extends ItemTagsProvider {

		public ItemTagsDataGen(DataGenerator generatorIn, BlockTagsProvider blockTagsProvider,
				ExistingFileHelper existingFileHelper) {
			super(generatorIn, blockTagsProvider, CLib.MOD_ID, existingFileHelper);
		}

		@Override
		protected void registerTags() {
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_PYROTHEUM);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_SULFUR);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.BLAZE_POWDER);
			
			getOrCreateBuilder(ModTags.Items.DUSTS_PYROTHEUM).add(ItemInit.PYROTHEUM_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_SULFUR).add(ItemInit.SULFUR_DUST.get());
			getOrCreateBuilder(ModTags.Items.BLAZE_POWDER).add(Items.BLAZE_POWDER);
			
			getOrCreateBuilder(ModTags.Items.GEMS).addTag(ModTags.Items.GEMS_AMETHYST);
			getOrCreateBuilder(ModTags.Items.GEMS).addTag(ModTags.Items.GEMS_OPAL);
			getOrCreateBuilder(ModTags.Items.GEMS).addTag(ModTags.Items.GEMS_RUBY);
			getOrCreateBuilder(ModTags.Items.GEMS).addTag(ModTags.Items.GEMS_SAPPHIRE);
			
			getOrCreateBuilder(ModTags.Items.GEMS_AMETHYST).add(ItemInit.AMETHYST.get());
			getOrCreateBuilder(ModTags.Items.GEMS_OPAL).add(ItemInit.OPAL.get());
			getOrCreateBuilder(ModTags.Items.GEMS_RUBY).add(ItemInit.RUBY.get());
			getOrCreateBuilder(ModTags.Items.GEMS_SAPPHIRE).add(ItemInit.SAPPHIRE.get());
			
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_ALUMINUM);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_BRONZE);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_COPPER);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_ELECTRUM);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_ENDERIUM);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_INVAR);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_LEAD);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_LUMIUM);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_NICKEL);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_PLATINUM);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_SIGNALUM);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_SILVER);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_STEEL);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_TIN);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_TITANIUM);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_TUNGSTEN);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_URANIUM);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_COBALT);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_ZINC);
			
			getOrCreateBuilder(ModTags.Items.INGOTS_ALUMINUM).add(ItemInit.ALUMINUM_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_BRONZE).add(ItemInit.BRONZE_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_COPPER).add(ItemInit.COPPER_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_ELECTRUM).add(ItemInit.ELECTRUM_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_ENDERIUM).add(ItemInit.ENDERIUM_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_INVAR).add(ItemInit.INVAR_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_LEAD).add(ItemInit.LEAD_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_LUMIUM).add(ItemInit.LUMIUM_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_NICKEL).add(ItemInit.NICKEL_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_PLATINUM).add(ItemInit.PLATINUM_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_SIGNALUM).add(ItemInit.SIGNALUM_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_SILVER).add(ItemInit.SILVER_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_STEEL).add(ItemInit.STEEL_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_TIN).add(ItemInit.TIN_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_TITANIUM).add(ItemInit.TITANIUM_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_TUNGSTEN).add(ItemInit.TUNGSTEN_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_URANIUM).add(ItemInit.URANIUM_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_COBALT).add(ItemInit.COBALT_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_ZINC).add(ItemInit.ZINC_INGOT.get());
			
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_ALUMINUM);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_BRONZE);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_COPPER);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_ELECTRUM);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_ENDERIUM);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_INVAR);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_LEAD);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_LUMIUM);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_NICKEL);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_PLATINUM);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_SIGNALUM);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_SILVER);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_STEEL);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_TIN);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_TITANIUM);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_TUNGSTEN);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_COAL);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_URANIUM);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_COBALT);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_ZINC);
			
			getOrCreateBuilder(ModTags.Items.NUGGETS_ALUMINUM).add(ItemInit.ALUMINUM_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_BRONZE).add(ItemInit.BRONZE_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_COPPER).add(ItemInit.COPPER_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_ELECTRUM).add(ItemInit.ELECTRUM_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_ENDERIUM).add(ItemInit.ENDERIUM_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_INVAR).add(ItemInit.INVAR_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_LEAD).add(ItemInit.LEAD_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_LUMIUM).add(ItemInit.LUMIUM_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_NICKEL).add(ItemInit.NICKEL_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_PLATINUM).add(ItemInit.PLATINUM_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_SIGNALUM).add(ItemInit.SIGNALUM_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_SILVER).add(ItemInit.SILVER_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_STEEL).add(ItemInit.STEEL_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_TIN).add(ItemInit.TIN_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_TITANIUM).add(ItemInit.TITANIUM_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_TUNGSTEN).add(ItemInit.TUNGSTEN_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_COAL).add(ItemInit.COAL_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_URANIUM).add(ItemInit.URANIUM_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_COBALT).add(ItemInit.COBALT_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_ZINC).add(ItemInit.ZINC_NUGGET.get());
			
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_ALUMINUM);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_AMETHYST);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_COPPER);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_LEAD);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_TIN);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_RUBY);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_SILVER);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_NICKEL);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_SULFUR);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_PLATINUM);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_TUNGSTEN);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_SAPPHIRE);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_OPAL);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_TITANIUM);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_URANIUM);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_COBALT);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_ZINC);

			getOrCreateBuilder(ModTags.Items.ORES_ALUMINUM).add(BlockInit.ALUMINUM_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_AMETHYST).add(BlockInit.AMETHYST_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_COPPER).add(BlockInit.COPPER_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_LEAD).add(BlockInit.LEAD_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_TIN).add(BlockInit.TIN_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_RUBY).add(BlockInit.RUBY_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_NICKEL).add(BlockInit.NICKEL_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_SILVER).add(BlockInit.SILVER_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_SULFUR).add(BlockInit.SULFUR_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_PLATINUM).add(BlockInit.PLATINUM_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_TUNGSTEN).add(BlockInit.TUNGSTEN_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_SAPPHIRE).add(BlockInit.SAPPHIRE_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_OPAL).add(BlockInit.OPAL_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_TITANIUM).add(BlockInit.TITANIUM_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_URANIUM).add(BlockInit.URANIUM_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_COBALT).add(BlockInit.COBALT_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_ZINC).add(BlockInit.ZINC_ORE.get().asItem());
			
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_ALUMINUM);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_AMETHYST);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_BRONZE);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_COPPER);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_ELECTRUM);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_ENDERIUM);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_INVAR);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_LEAD);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_LUMIUM);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_SIGNALUM);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_TIN);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_RUBY);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_SILVER);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_NICKEL);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_PLATINUM);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_TUNGSTEN);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_SAPPHIRE);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_OPAL);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_TITANIUM);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_STEEL);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_URANIUM);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_COBALT);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_ZINC);

			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_ALUMINUM).add(BlockInit.ALUMINUM_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_AMETHYST).add(BlockInit.AMETHYST_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_BRONZE).add(BlockInit.BRONZE_BLOCK.get().asItem().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_COPPER).add(BlockInit.COPPER_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_ELECTRUM).add(BlockInit.ELECTRUM_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_ENDERIUM).add(BlockInit.ENDERIUM_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_INVAR).add(BlockInit.INVAR_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_LEAD).add(BlockInit.LEAD_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_LUMIUM).add(BlockInit.LUMIUM_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_SIGNALUM).add(BlockInit.SIGNALUM_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_TIN).add(BlockInit.TIN_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_RUBY).add(BlockInit.RUBY_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_NICKEL).add(BlockInit.NICKEL_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_SILVER).add(BlockInit.SILVER_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_PLATINUM).add(BlockInit.PLATINUM_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_TUNGSTEN).add(BlockInit.TUNGSTEN_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_SAPPHIRE).add(BlockInit.SAPPHIRE_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_OPAL).add(BlockInit.OPAL_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_TITANIUM).add(BlockInit.TITANIUM_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_STEEL).add(BlockInit.STEEL_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_URANIUM).add(BlockInit.URANIUM_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_COBALT).add(BlockInit.COBALT_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_ZINC).add(BlockInit.ZINC_BLOCK.get().asItem());
		}
	}

	public static class BlockTagsDataGen extends BlockTagsProvider {

		public BlockTagsDataGen(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
			super(generatorIn, CLib.MOD_ID, existingFileHelper);
		}

		@Override
		protected void registerTags() {
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_ALUMINUM);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_AMETHYST);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_COPPER);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_LEAD);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_TIN);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_RUBY);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_SILVER);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_NICKEL);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_SULFUR);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_PLATINUM);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_TUNGSTEN);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_SAPPHIRE);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_OPAL);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_TITANIUM);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_URANIUM);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_COBALT);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_ZINC);

			getOrCreateBuilder(ModTags.Blocks.ORES_ALUMINUM).add(BlockInit.ALUMINUM_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_AMETHYST).add(BlockInit.AMETHYST_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_COPPER).add(BlockInit.COPPER_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_LEAD).add(BlockInit.LEAD_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_TIN).add(BlockInit.TIN_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_RUBY).add(BlockInit.RUBY_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_NICKEL).add(BlockInit.NICKEL_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_SILVER).add(BlockInit.SILVER_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_SULFUR).add(BlockInit.SULFUR_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_PLATINUM).add(BlockInit.PLATINUM_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_TUNGSTEN).add(BlockInit.TUNGSTEN_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_SAPPHIRE).add(BlockInit.SAPPHIRE_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_OPAL).add(BlockInit.OPAL_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_TITANIUM).add(BlockInit.TITANIUM_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_URANIUM).add(BlockInit.URANIUM_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_COBALT).add(BlockInit.COBALT_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_ZINC).add(BlockInit.ZINC_ORE.get());
			
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_ALUMINUM);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_AMETHYST);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_BRONZE);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_COPPER);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_ELECTRUM);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_ENDERIUM);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_INVAR);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_LEAD);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_LUMIUM);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_SIGNALUM);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_TIN);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_RUBY);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_SILVER);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_NICKEL);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_PLATINUM);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_TUNGSTEN);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_SAPPHIRE);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_OPAL);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_TITANIUM);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_STEEL);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_URANIUM);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_COBALT);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_ZINC);

			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_ALUMINUM).add(BlockInit.ALUMINUM_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_AMETHYST).add(BlockInit.AMETHYST_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_BRONZE).add(BlockInit.BRONZE_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_COPPER).add(BlockInit.COPPER_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_ELECTRUM).add(BlockInit.ELECTRUM_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_ENDERIUM).add(BlockInit.ENDERIUM_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_INVAR).add(BlockInit.INVAR_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_LEAD).add(BlockInit.LEAD_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_LUMIUM).add(BlockInit.LUMIUM_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_SIGNALUM).add(BlockInit.SIGNALUM_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_TIN).add(BlockInit.TIN_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_RUBY).add(BlockInit.RUBY_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_NICKEL).add(BlockInit.NICKEL_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_SILVER).add(BlockInit.SILVER_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_PLATINUM).add(BlockInit.PLATINUM_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_TUNGSTEN).add(BlockInit.TUNGSTEN_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_SAPPHIRE).add(BlockInit.SAPPHIRE_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_OPAL).add(BlockInit.OPAL_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_TITANIUM).add(BlockInit.TITANIUM_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_STEEL).add(BlockInit.STEEL_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_URANIUM).add(BlockInit.URANIUM_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_COBALT).add(BlockInit.COBALT_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_ZINC).add(BlockInit.ZINC_BLOCK.get());
		}
	}
}
