package com.congueror.clib.world.gen;

import com.congueror.clib.config.Config;
import com.congueror.clib.init.BlockInit;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class ModOreGen 
{
	public static void setupOreGeneration()
	{
		for(Biome biome : ForgeRegistries.BIOMES) 
		{ 
			biome.addFeature(Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.TIN_ORE.get().getDefaultState(), 10)).withPlacement(Placement.COUNT_RANGE
					.configure(new CountRangeConfig(Config.tin_chance.get(), Config.tin_min.get(), 0, Config.tin_max.get()))));
			biome.addFeature(Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.ALUMINUM_ORE.get().getDefaultState(), 8)).withPlacement(Placement.COUNT_RANGE
					.configure(new CountRangeConfig(Config.alum_chance.get(), Config.alum_min.get(), 0, Config.alum_max.get()))));
		}
	}
	public static void generate() 
	{
		setupOreGeneration();
	}
}
