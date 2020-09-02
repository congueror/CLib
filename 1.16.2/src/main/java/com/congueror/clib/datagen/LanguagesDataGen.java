package com.congueror.clib.datagen;

import com.congueror.clib.ConguerorLib;

import net.minecraftforge.common.data.LanguageProvider;

public class LanguagesDataGen extends LanguageProvider
{
    public LanguagesDataGen(net.minecraft.data.DataGenerator gen, String locale)
    {
        super(gen, ConguerorLib.MOD_ID, locale);
    }

    @Override
    protected void addTranslations()
    {
        add("item.clib.tin_ingot", "Tin Ingot");
        add("item.clib.tin_nugget", "Tin Nugget");
        add("item.clib.steel_ingot", "Steel Ingot");
        add("item.clib.steel_nugget", "Steel Nugget");
        add("item.clib.aluminum_ingot", "Aluminum Ingot");
        add("item.clib.aluminum_nugget", "Aluminum Nugget");
        add("item.clib.coal_nugget", "Coal Nugget");
        add("item.clib.steel_blend", "Steel Blend");
        add("item.clib.copper_ingot", "Copper Ingot");
        add("item.clib.copper_nugget", "Copper Nugget");
        add("item.clib.ruby", "Ruby");
        add("item.clib.lead_ingot", "Lead Ingot");
        add("item.clib.lead_nugget", "Lead Nugget");
        add("item.clib.silver_ingot", "Silver Ingot");
        add("item.clib.silver_nugget", "Silver Nugget");
        add("item.clib.lumium_ingot", "Lumium Ingot");
        add("item.clib.lumium_blend", "Lumium Blend");
        add("item.clib.lumium_nugget", "Lumium Nugget");
        add("item.clib.nickel_ingot", "Nickel Ingot");
        add("item.clib.nickel_nugget", "Nickel Nugget");
        add("item.clib.electrum_ingot", "Electrum Ingot");
        add("item.clib.electrum_blend", "Electrum Blend");
        add("item.clib.electrum_nugget", "Electrum Nugget");
        add("item.clib.pyrotheum_dust", "Pyrotheum Dust");
        add("item.clib.sulfur_dust", "Sulfur Dust");
        add("item.clib.platinum_ingot", "Platinum Ingot");
        add("item.clib.platinum_nugget", "Platinum Nugget");
        
        add("block.clib.tin_ore", "Tin Ore");
        add("block.clib.tin_block", "Block of Tin");
        add("block.clib.steel_block", "Block of Steel");
        add("block.clib.aluminum_ore", "Aluminum Ore");   
        add("block.clib.aluminum_block", "Block of Aluminum");
        add("block.clib.copper_ore", "Copper Ore");
        add("block.clib.copper_block", "Block of Copper");
        add("block.clib.ruby_ore", "Nether Ruby Ore");
    	add("block.clib.ruby_block", "Block of Ruby");
    	add("block.clib.lead_ore", "Lead Ore");
    	add("block.clib.lead_block", "Block of Lead");
    	add("block.clib.silver_ore", "Silver Ore");
    	add("block.clib.silver_block", "Block of Silver");
    	add("block.clib.nickel_ore", "Nickel Ore");
    	add("block.clib.nickel_block", "Block of Nickel");
    	add("block.clib.lumium_block", "Block of Lumium");
    	add("block.clib.invar_block", "Block of Invar");
    	add("block.clib.electrum_block", "Block of Electrum");
    	add("block.clib.sulfur_ore", "Sulfur Ore");
    	add("block.clib.platinum_ore", "Platinum Ore");
    	add("block.clib.platinum_block", "Block of Platinum");
        
        add("itemGroup.clibtab", "Congueror's Ores");
    }
    
    @Override
    public String getName()
    {
        return "Congueror's Lib Languages";
    }
}