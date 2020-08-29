package com.congueror.clib.world.gen;

import com.congueror.clib.config.ClibConfig;
import com.congueror.clib.init.BlockInit;
import com.congueror.clib.util.helpers.WorldHelper;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.registries.ForgeRegistries;

public class ModOreGen 
{
	public static void setupOreGeneration()
	{
		for(Biome biome : ForgeRegistries.BIOMES) 
		{ 
			biome.addFeature(Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.TIN_ORE.get().getDefaultState(), 8)).withPlacement(Placement.COUNT_RANGE
					.configure(new CountRangeConfig(ClibConfig.tin_chance.get(), ClibConfig.tin_min.get(), 0, ClibConfig.tin_max.get()))));
			biome.addFeature(Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.ALUMINUM_ORE.get().getDefaultState(), 4)).withPlacement(Placement.COUNT_RANGE
					.configure(new CountRangeConfig(ClibConfig.alum_chance.get(), ClibConfig.alum_min.get(), 0, ClibConfig.alum_max.get()))));
			biome.addFeature(Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.COPPER_ORE.get().getDefaultState(), 8)).withPlacement(Placement.COUNT_RANGE
					.configure(new CountRangeConfig(ClibConfig.copper_chance.get(), ClibConfig.copper_min.get(), 0, ClibConfig.copper_max.get()))));
			
			if(WorldHelper.biomeHasType(biome, BiomeDictionary.Type.NETHER)) {
				biome.addFeature(Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.RUBY_ORE.get().getDefaultState(), 3)).withPlacement(Placement.COUNT_RANGE
						.configure(new CountRangeConfig(ClibConfig.ruby_chance.get(), ClibConfig.ruby_min.get(), 0, ClibConfig.ruby_max.get()))));
			}
		}
	}
	public static void generate() 
	{
		setupOreGeneration();
	}
}
