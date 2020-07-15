package com.congueror.clib.init;

import com.congueror.clib.ConguerorLib;
import com.congueror.clib.blocks.AluminumBlock;
import com.congueror.clib.blocks.CopperBlock;
import com.congueror.clib.blocks.SteelBlock;
import com.congueror.clib.blocks.TinBlock;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit 
{
    
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ConguerorLib.MOD_ID);
    
    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore", ()-> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2f, 1.2f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1).setRequiresTool()));
    public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", () -> new TinBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(1).setRequiresTool()));
    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", () -> new SteelBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(4.5f, 12f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(1).setRequiresTool()));
    public static final RegistryObject<Block> ALUMINUM_ORE = BLOCKS.register("aluminum_ore", () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.8f, 4f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    public static final RegistryObject<Block> ALUMINUM_BLOCK = BLOCKS.register("aluminum_block", () -> new AluminumBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1).setRequiresTool()));
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", () -> new CopperBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(1.5f, 1.5f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(1).setRequiresTool()));
}
