package com.congueror.clib.world.gen;

import com.congueror.clib.ConguerorLib;
import com.congueror.clib.init.BlockInit;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class ConfiguredOreGenFeatures 
{
	//Vein Size?, Max Height, Chance?
	public static ConfiguredFeature<?, ?> ORE_ALUMINUM = newConfiguredFeature("ore_aluminum", Feature.ORE.withConfiguration
			(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.ALUMINUM_ORE.get().getDefaultState(), 8)).func_242733_d(25).func_242728_a().func_242731_b(2));
	
	public static ConfiguredFeature<?, ?> ORE_TIN = newConfiguredFeature("ore_tin", Feature.ORE.withConfiguration
			(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.TIN_ORE.get().getDefaultState(), 8)).func_242733_d(25).func_242728_a().func_242731_b(2));
	
	public static ConfiguredFeature<?, ?> ORE_COPPER = newConfiguredFeature("ore_copper", Feature.ORE.withConfiguration
			(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.COPPER_ORE.get().getDefaultState(), 8)).func_242733_d(25).func_242728_a().func_242731_b(2));
	
	public static ConfiguredFeature<?, ?> ORE_LEAD = newConfiguredFeature("ore_lead", Feature.ORE.withConfiguration
			(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.LEAD_ORE.get().getDefaultState(), 8)).func_242733_d(25).func_242728_a().func_242731_b(2));
	
	public static ConfiguredFeature<?, ?> ORE_RUBY = newConfiguredFeature("ore_ruby", Feature.ORE.withConfiguration
			(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241883_b, BlockInit.RUBY_ORE.get().getDefaultState(), 8)).func_242733_d(25).func_242728_a().func_242731_b(2));
	
	public static ConfiguredFeature<?, ?> ORE_SILVER = newConfiguredFeature("ore_silver", Feature.ORE.withConfiguration
			(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.SILVER_ORE.get().getDefaultState(), 8)).func_242733_d(25).func_242728_a().func_242731_b(2));
	
	public static ConfiguredFeature<?, ?> ORE_NICKEL = newConfiguredFeature("ore_nickel", Feature.ORE.withConfiguration
			(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.NICKEL_ORE.get().getDefaultState(), 8)).func_242733_d(25).func_242728_a().func_242731_b(2));
	
	public static ConfiguredFeature<?, ?> ORE_SULFUR = newConfiguredFeature("ore_sulfur", Feature.ORE.withConfiguration
			(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.SULFUR_ORE.get().getDefaultState(), 8)).func_242733_d(25).func_242728_a().func_242731_b(2));

    public static ConfiguredFeature<?, ?> newConfiguredFeature(String registryName, ConfiguredFeature<?, ?> configuredFeature) {
        Registry.register(WorldGenRegistries.field_243653_e, new ResourceLocation(ConguerorLib.MOD_ID, registryName), configuredFeature);
        return configuredFeature;
    }
}
