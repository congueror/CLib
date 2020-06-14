package com.congueror.clib.init;

import com.congueror.clib.ClibItemGroup;
import com.congueror.clib.ConguerorLib;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ConguerorLib.MOD_ID, bus = Bus.MOD)
@ObjectHolder(ConguerorLib.MOD_ID)
public class BlockInit 
{
	public static final Block tin_ore = null;
	public static final Block tin_block = null;
	public static final Block steel_block = null;
	public static final Block aluminum_ore = null;
	public static final Block aluminum_block = null;
	public static final Block alloy_smelter = null;

	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) 
	{	
		//HarvestLvl: 0(Wood) 1(Stone) 2(Iron) 3(Diamond)
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2f, 1.2f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("tin_ore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("tin_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("steel_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 1.5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("aluminum_ore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("aluminum_block"));
	}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) 
	{	
		event.getRegistry().register(new BlockItem(tin_ore, new Item.Properties().group(ClibItemGroup.instance)).setRegistryName("tin_ore"));
		event.getRegistry().register(new BlockItem(tin_block, new Item.Properties().group(ClibItemGroup.instance)).setRegistryName("tin_block"));
		event.getRegistry().register(new BlockItem(steel_block, new Item.Properties().group(ClibItemGroup.instance)).setRegistryName("steel_block"));
		event.getRegistry().register(new BlockItem(aluminum_ore, new Item.Properties().group(ClibItemGroup.instance)).setRegistryName("aluminum_ore"));
		event.getRegistry().register(new BlockItem(aluminum_block, new Item.Properties().group(ClibItemGroup.instance)).setRegistryName("aluminum_block"));
	}
}
