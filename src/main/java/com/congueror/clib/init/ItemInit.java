package com.congueror.clib.init;

import com.congueror.clib.ClibItemGroup;
import com.congueror.clib.ConguerorLib;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ConguerorLib.MOD_ID, bus = Bus.MOD)
@ObjectHolder(ConguerorLib.MOD_ID)
public class ItemInit 
{
	public static final Item tin_ingot = null;
	public static final Item tin_nugget = null;
	public static final Item steel_ingot = null;
	public static final Item steel_nugget = null;
	public static final Item aluminum_ingot = null;
	public static final Item aluminum_nugget = null;
	public static final Item coal_nugget = null;
	public static final Item steel_blend = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) 
	{
		event.getRegistry().register(new Item(new Item.Properties().group(ClibItemGroup.instance)).setRegistryName("tin_ingot"));
		event.getRegistry().register(new Item(new Item.Properties().group(ClibItemGroup.instance)).setRegistryName("tin_nugget"));
		event.getRegistry().register(new Item(new Item.Properties().group(ClibItemGroup.instance)).setRegistryName("steel_ingot"));
		event.getRegistry().register(new Item(new Item.Properties().group(ClibItemGroup.instance)).setRegistryName("steel_nugget"));
		event.getRegistry().register(new Item(new Item.Properties().group(ClibItemGroup.instance)).setRegistryName("aluminum_ingot"));
		event.getRegistry().register(new Item(new Item.Properties().group(ClibItemGroup.instance)).setRegistryName("aluminum_nugget"));
		event.getRegistry().register(new Item(new Item.Properties().group(ClibItemGroup.instance)).setRegistryName("coal_nugget"));
		event.getRegistry().register(new Item(new Item.Properties().group(ClibItemGroup.instance)).setRegistryName("steel_blend"));
	}
}
