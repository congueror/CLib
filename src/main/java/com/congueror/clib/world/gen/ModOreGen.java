package com.congueror.clib.world.gen;

import com.congueror.clib.config.OreGenConfig;
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
					.configure(new CountRangeConfig(OreGenConfig.tin_chance.get(), OreGenConfig.tin_min.get(), 0, OreGenConfig.tin_max.get()))));
			biome.addFeature(Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.ALUMINUM_ORE.get().getDefaultState(), 8)).withPlacement(Placement.COUNT_RANGE
					.configure(new CountRangeConfig(OreGenConfig.alum_chance.get(), OreGenConfig.alum_min.get(), 0, OreGenConfig.alum_max.get()))));
		}
	}
	public static void generate() 
	{
		setupOreGeneration();
	}
}
