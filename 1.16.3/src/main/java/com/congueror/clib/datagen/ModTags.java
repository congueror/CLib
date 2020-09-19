package com.congueror.clib.datagen;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags.IOptionalNamedTag;

public class ModTags 
{
	public static void init ()
    {
        Blocks.init();
        Items.init();
    }
	
	public static class Items 
	{
		private static void init(){}
		
		public static final IOptionalNamedTag<Item> DUSTS = tag("dusts");
			public static final IOptionalNamedTag<Item> BLAZE_POWDER = tag("dusts/blaze_powder");
			public static final IOptionalNamedTag<Item> DUSTS_PYROTHEUM = tag("dusts/pyrotheum");
			public static final IOptionalNamedTag<Item> DUSTS_SULFUR = tag("dusts/sulfur");
		public static final IOptionalNamedTag<Item> GEMS = tag("gems");
			public static final IOptionalNamedTag<Item> GEMS_AMETHYST = tag("gems/amethyst");
			public static final IOptionalNamedTag<Item> GEMS_OPAL = tag("gems/opal");
			public static final IOptionalNamedTag<Item> GEMS_RUBY = tag("gems/ruby");
			public static final IOptionalNamedTag<Item> GEMS_SAPPHIRE = tag("gems/sapphire");
		public static final IOptionalNamedTag<Item> INGOTS = tag("ingots");
			public static final IOptionalNamedTag<Item> INGOTS_ALUMINUM = tag("ingots/aluminum");
			public static final IOptionalNamedTag<Item> INGOTS_BRONZE = tag("ingots/bronze");
			public static final IOptionalNamedTag<Item> INGOTS_COPPER = tag("ingots/copper");
			public static final IOptionalNamedTag<Item> INGOTS_ELECTRUM = tag("ingots/electrum");
			public static final IOptionalNamedTag<Item> INGOTS_ENDERIUM = tag("ingots/enderium");
			public static final IOptionalNamedTag<Item> INGOTS_INVAR = tag("ingots/invar");
			public static final IOptionalNamedTag<Item> INGOTS_LEAD = tag("ingots/lead");
			public static final IOptionalNamedTag<Item> INGOTS_LUMIUM = tag("ingots/lumium");
			public static final IOptionalNamedTag<Item> INGOTS_NICKEL = tag("ingots/nickel");
			public static final IOptionalNamedTag<Item> INGOTS_PLATINUM = tag("ingots/platinum");
			public static final IOptionalNamedTag<Item> INGOTS_SIGNALUM = tag("ingots/signalum");
			public static final IOptionalNamedTag<Item> INGOTS_SILVER = tag("ingots/silver");
			public static final IOptionalNamedTag<Item> INGOTS_STEEL = tag("ingots/steel");
			public static final IOptionalNamedTag<Item> INGOTS_TIN = tag("ingots/tin");
			public static final IOptionalNamedTag<Item> INGOTS_TITANIUM = tag("ingots/titanium");
			public static final IOptionalNamedTag<Item> INGOTS_TUNGSTEN = tag("ingots/tungsten");
			public static final IOptionalNamedTag<Item> INGOTS_URANIUM = tag("ingots/uranium");
			public static final IOptionalNamedTag<Item> INGOTS_COBALT = tag("ingots/cobalt");
			public static final IOptionalNamedTag<Item> INGOTS_ZINC = tag("ingots/zinc");
		public static final IOptionalNamedTag<Item> NUGGETS = tag("nuggets");
			public static final IOptionalNamedTag<Item> NUGGETS_ALUMINUM = tag("nuggets/aluminum");
			public static final IOptionalNamedTag<Item> NUGGETS_BRONZE = tag("nuggets/bronze");
			public static final IOptionalNamedTag<Item> NUGGETS_COPPER = tag("nuggets/copper");
			public static final IOptionalNamedTag<Item> NUGGETS_ELECTRUM = tag("nuggets/electrum");
			public static final IOptionalNamedTag<Item> NUGGETS_ENDERIUM = tag("nuggets/enderium");
			public static final IOptionalNamedTag<Item> NUGGETS_INVAR = tag("nuggets/invar");
			public static final IOptionalNamedTag<Item> NUGGETS_LEAD = tag("nuggets/lead");
			public static final IOptionalNamedTag<Item> NUGGETS_LUMIUM = tag("nuggets/lumium");
			public static final IOptionalNamedTag<Item> NUGGETS_NICKEL = tag("nuggets/nickel");
			public static final IOptionalNamedTag<Item> NUGGETS_PLATINUM = tag("nuggets/platinum");
			public static final IOptionalNamedTag<Item> NUGGETS_SIGNALUM = tag("nuggets/signalum");
			public static final IOptionalNamedTag<Item> NUGGETS_SILVER = tag("nuggets/silver");
			public static final IOptionalNamedTag<Item> NUGGETS_STEEL = tag("nuggets/steel");
			public static final IOptionalNamedTag<Item> NUGGETS_TIN = tag("nuggets/tin");
			public static final IOptionalNamedTag<Item> NUGGETS_TITANIUM = tag("nuggets/titanium");
			public static final IOptionalNamedTag<Item> NUGGETS_TUNGSTEN = tag("nuggets/tungsten");
			public static final IOptionalNamedTag<Item> NUGGETS_COAL = tag("nuggets/coal");
			public static final IOptionalNamedTag<Item> NUGGETS_URANIUM = tag("nuggets/uranium");
			public static final IOptionalNamedTag<Item> NUGGETS_COBALT = tag("nuggets/cobalt");
			public static final IOptionalNamedTag<Item> NUGGETS_ZINC = tag("nuggets/zinc");
		public static final IOptionalNamedTag<Item> ORES = tag("ores");
			public static final IOptionalNamedTag<Item> ORES_ALUMINUM = tag("ores/aluminum");
			public static final IOptionalNamedTag<Item> ORES_AMETHYST = tag("ores/amethyst");
			public static final IOptionalNamedTag<Item> ORES_BRONZE = tag("ores/bronze");
			public static final IOptionalNamedTag<Item> ORES_COPPER = tag("ores/copper");
			public static final IOptionalNamedTag<Item> ORES_ELECTRUM = tag("ores/electrum");
			public static final IOptionalNamedTag<Item> ORES_ENDERIUM = tag("ores/enderium");
			public static final IOptionalNamedTag<Item> ORES_INVAR = tag("ores/invar");
			public static final IOptionalNamedTag<Item> ORES_LEAD = tag("ores/lead");
			public static final IOptionalNamedTag<Item> ORES_LUMIUM = tag("ores/lumium");
			public static final IOptionalNamedTag<Item> ORES_NICKEL = tag("ores/nickel");
			public static final IOptionalNamedTag<Item> ORES_OPAL = tag("ores/opal");
			public static final IOptionalNamedTag<Item> ORES_PLATINUM = tag("ores/platinum");
			public static final IOptionalNamedTag<Item> ORES_RUBY = tag("ores/ruby");
			public static final IOptionalNamedTag<Item> ORES_SAPPHIRE = tag("ores/sapphire");
			public static final IOptionalNamedTag<Item> ORES_SIGNALUM = tag("ores/signalum");
			public static final IOptionalNamedTag<Item> ORES_SILVER = tag("ores/silver");
			public static final IOptionalNamedTag<Item> ORES_STEEL = tag("ores/steel");
			public static final IOptionalNamedTag<Item> ORES_SULFUR = tag("ores/sulfur");
			public static final IOptionalNamedTag<Item> ORES_TIN = tag("ores/tin");
			public static final IOptionalNamedTag<Item> ORES_TITANIUM = tag("ores/titanium");
			public static final IOptionalNamedTag<Item> ORES_TUNGSTEN = tag("ores/tungsten");
			public static final IOptionalNamedTag<Item> ORES_URANIUM = tag("ores/uranium");
			public static final IOptionalNamedTag<Item> ORES_COBALT = tag("ores/cobalt");
			public static final IOptionalNamedTag<Item> ORES_ZINC = tag("ores/zinc");
		public static final IOptionalNamedTag<Item> STORAGE_BLOCKS = tag("storage_blocks");
			public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_ALUMINUM = tag("storage_blocks/aluminum");
			public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_AMETHYST = tag("storage_blocks/amethyst");
			public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_BRONZE = tag("storage_blocks/bronze");
			public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_COPPER = tag("storage_blocks/copper");
			public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_ELECTRUM = tag("storage_blocks/electrum");
			public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_ENDERIUM = tag("storage_blocks/enderium");
			public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_INVAR = tag("storage_blocks/invar");
			public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_LEAD = tag("storage_blocks/lead");
			public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_LUMIUM = tag("storage_blocks/lumium");
			public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_NICKEL = tag("storage_blocks/nickel");
			public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_OPAL = tag("storage_blocks/opal");
			public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_PLATINUM = tag("storage_blocks/platinum");
			public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_RUBY = tag("storage_blocks/ruby");
			public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_SAPPHIRE = tag("storage_blocks/sapphire");
			public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_SIGNALUM = tag("storage_blocks/signalum");
			public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_SILVER = tag("storage_blocks/silver");
			public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_STEEL = tag("storage_blocks/steel");
			public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_TIN = tag("storage_blocks/tin");
			public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_TITANIUM = tag("storage_blocks/titanium");
			public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_TUNGSTEN = tag("storage_blocks/tungsten");
			public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_URANIUM = tag("storage_blocks/uranium");
			public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_COBALT = tag("storage_blocks/cobalt");
			public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_ZINC = tag("storage_blocks/zinc");
		
		private static IOptionalNamedTag<Item> tag(String name)
        {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }
	}
	public static class Blocks 
	{
		private static void init(){}
			
		public static final IOptionalNamedTag<Block> ORES = tag("ores");
			public static final IOptionalNamedTag<Block> ORES_ALUMINUM = tag("ores/aluminum");
			public static final IOptionalNamedTag<Block> ORES_AMETHYST = tag("ores/amethyst");
			public static final IOptionalNamedTag<Block> ORES_BRONZE = tag("ores/bronze");
			public static final IOptionalNamedTag<Block> ORES_COPPER = tag("ores/copper");
			public static final IOptionalNamedTag<Block> ORES_ELECTRUM = tag("ores/electrum");
			public static final IOptionalNamedTag<Block> ORES_ENDERIUM = tag("ores/enderium");
			public static final IOptionalNamedTag<Block> ORES_INVAR = tag("ores/invar");
			public static final IOptionalNamedTag<Block> ORES_LEAD = tag("ores/lead");
			public static final IOptionalNamedTag<Block> ORES_LUMIUM = tag("ores/lumium");
			public static final IOptionalNamedTag<Block> ORES_NICKEL = tag("ores/nickel");
			public static final IOptionalNamedTag<Block> ORES_OPAL = tag("ores/opal");
			public static final IOptionalNamedTag<Block> ORES_PLATINUM = tag("ores/platinum");
			public static final IOptionalNamedTag<Block> ORES_RUBY = tag("ores/ruby");
			public static final IOptionalNamedTag<Block> ORES_SAPPHIRE = tag("ores/sapphire");
			public static final IOptionalNamedTag<Block> ORES_SIGNALUM = tag("ores/signalum");
			public static final IOptionalNamedTag<Block> ORES_SILVER = tag("ores/silver");
			public static final IOptionalNamedTag<Block> ORES_STEEL = tag("ores/steel");
			public static final IOptionalNamedTag<Block> ORES_SULFUR = tag("ores/sulfur");
			public static final IOptionalNamedTag<Block> ORES_TIN = tag("ores/tin");
			public static final IOptionalNamedTag<Block> ORES_TITANIUM = tag("ores/titanium");
			public static final IOptionalNamedTag<Block> ORES_TUNGSTEN = tag("ores/tungsten");
			public static final IOptionalNamedTag<Block> ORES_URANIUM = tag("ores/uranium");
			public static final IOptionalNamedTag<Block> ORES_COBALT = tag("ores/cobalt");
			public static final IOptionalNamedTag<Block> ORES_ZINC = tag("ores/zinc");
		public static final IOptionalNamedTag<Block> STORAGE_BLOCKS = tag("storage_blocks");
			public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_ALUMINUM = tag("storage_blocks/aluminum");
			public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_AMETHYST = tag("storage_blocks/amethyst");
			public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_BRONZE = tag("storage_blocks/bronze");
			public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_COPPER = tag("storage_blocks/copper");
			public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_ELECTRUM = tag("storage_blocks/electrum");
			public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_ENDERIUM = tag("storage_blocks/enderium");
			public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_INVAR = tag("storage_blocks/invar");
			public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_LEAD = tag("storage_blocks/lead");
			public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_LUMIUM = tag("storage_blocks/lumium");
			public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_NICKEL = tag("storage_blocks/nickel");
			public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_OPAL = tag("storage_blocks/opal");
			public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_PLATINUM = tag("storage_blocks/platinum");
			public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_RUBY = tag("storage_blocks/ruby");
			public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_SAPPHIRE = tag("storage_blocks/sapphire");
			public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_SIGNALUM = tag("storage_blocks/signalum");
			public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_SILVER = tag("storage_blocks/silver");
			public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_STEEL = tag("storage_blocks/steel");
			public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_TIN = tag("storage_blocks/tin");
			public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_TITANIUM = tag("storage_blocks/titanium");
			public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_TUNGSTEN = tag("storage_blocks/tungsten");
			public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_URANIUM = tag("storage_blocks/uranium");
			public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_COBALT = tag("storage_blocks/cobalt");
			public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_ZINC = tag("storage_blocks/zinc");
			
		private static IOptionalNamedTag<Block> tag(String name)
	    {
			return BlockTags.createOptional(new ResourceLocation("forge", name));
	    }
	}
}	
