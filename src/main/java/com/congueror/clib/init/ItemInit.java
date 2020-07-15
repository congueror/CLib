package com.congueror.clib.init;

import com.congueror.clib.ClibItemGroup;
import com.congueror.clib.ConguerorLib;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit 
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ConguerorLib.MOD_ID);
    
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> COAL_NUGGET = ITEMS.register("coal_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> STEEL_BLEND = ITEMS.register("steel_blend", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
}
