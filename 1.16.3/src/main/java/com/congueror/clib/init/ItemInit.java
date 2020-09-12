package com.congueror.clib.init;

import com.congueror.clib.CLib;
import com.congueror.clib.objects.items.CoalNuggetItem;
import com.congueror.clib.util.ClibItemGroup;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit 
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CLib.MOD_ID);
    
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> STEEL_BLEND = ITEMS.register("steel_blend", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> COAL_NUGGET = ITEMS.register("coal_nugget", ()-> new CoalNuggetItem(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> LUMIUM_INGOT = ITEMS.register("lumium_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> LUMIUM_NUGGET = ITEMS.register("lumium_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> LUMIUM_BLEND = ITEMS.register("lumium_blend", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> INVAR_INGOT = ITEMS.register("invar_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> INVAR_NUGGET = ITEMS.register("invar_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> INVAR_BLEND = ITEMS.register("invar_blend", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> ELECTRUM_INGOT = ITEMS.register("electrum_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> ELECTRUM_NUGGET = ITEMS.register("electrum_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> ELECTRUM_BLEND = ITEMS.register("electrum_blend", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> PYROTHEUM_DUST = ITEMS.register("pyrotheum_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> SULFUR_DUST = ITEMS.register("sulfur_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> ENDERIUM_INGOT = ITEMS.register("enderium_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> ENDERIUM_NUGGET = ITEMS.register("enderium_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> ENDERIUM_BLEND = ITEMS.register("enderium_blend", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> SIGNALUM_INGOT = ITEMS.register("signalum_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> SIGNALUM_NUGGET = ITEMS.register("signalum_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> SIGNALUM_BLEND = ITEMS.register("signalum_blend", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> TUNGSTEN_NUGGET = ITEMS.register("tungsten_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> BRONZE_BLEND = ITEMS.register("bronze_blend", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> OPAL = ITEMS.register("opal", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> TITANIUM_SCRAP = ITEMS.register("titanium_scrap", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
}
