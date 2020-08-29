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
        
        add("block.clib.tin_ore", "Tin Ore");
        add("block.clib.tin_block", "Block of Tin");
        add("block.clib.steel_block", "Block of Steel");
        add("block.clib.aluminum_ore", "Aluminum Ore");   
        add("block.clib.aluminum_block", "Block of Aluminum");
        add("block.clib.copper_ore", "Copper Ore");
        add("block.clib.copper_block", "Block of Copper");
        
        add("itemGroup.clibtab", "Congueror's Ores");
    }
    
    @Override
    public String getName()
    {
        return "Congueror's Lib Languages";
    }
}