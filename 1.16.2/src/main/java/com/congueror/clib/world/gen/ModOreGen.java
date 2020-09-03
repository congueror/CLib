package com.congueror.clib.world.gen;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.congueror.clib.ConguerorLib;
import com.congueror.clib.config.ClibConfig;
import com.congueror.clib.init.BlockInit;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import net.minecraft.block.BlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = ConguerorLib.MOD_ID, bus = Bus.MOD)
public class ModOreGen 
{
	//Vein Size?, Max Height, Chance?
		public static ConfiguredFeature<?, ?> ORE_ALUMINUM = configuredFeature(Feature.ORE, OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.ALUMINUM_ORE.get()
				.getDefaultState(), ClibConfig.aluminum_veinsize.get(), ClibConfig.aluminum_max.get(), ClibConfig.aluminum_chance.get());
		
		public static ConfiguredFeature<?, ?> ORE_TIN = configuredFeature(Feature.ORE, OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.TIN_ORE.get()
				.getDefaultState(), 20, 32, 2);
		
		public static ConfiguredFeature<?, ?> ORE_COPPER = configuredFeature(Feature.ORE, OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.COPPER_ORE.get()
				.getDefaultState(), 20, 32, 2);
		
		public static ConfiguredFeature<?, ?> ORE_LEAD = configuredFeature(Feature.ORE, OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.LEAD_ORE.get()
				.getDefaultState(), 20, 32, 2);
		
		public static ConfiguredFeature<?, ?> ORE_RUBY = configuredFeature(Feature.ORE, OreFeatureConfig.FillerBlockType.field_241883_b, BlockInit.RUBY_ORE.get()
				.getDefaultState(), 20, 32, 2);
		
		public static ConfiguredFeature<?, ?> ORE_SILVER = configuredFeature(Feature.ORE, OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.SILVER_ORE.get()
				.getDefaultState(), 20, 32, 2);
		
		public static ConfiguredFeature<?, ?> ORE_NICKEL = configuredFeature(Feature.ORE, OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.NICKEL_ORE.get()
				.getDefaultState(), 20, 32, 2);
		
		public static ConfiguredFeature<?, ?> ORE_SULFUR = configuredFeature(Feature.ORE, OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.SULFUR_ORE.get()
				.getDefaultState(), 20, 32, 2);
		
		public static ConfiguredFeature<?, ?> ORE_TUNGSTEN = configuredFeature(Feature.ORE, OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.TUNGSTEN_ORE.get()
				.getDefaultState(), 20, 32, 2);
	
	public static void addFeatures() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            if (ClibConfig.aluminum_gen.get() && isOverworld(biome)) {
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ModOreGen.ORE_ALUMINUM);  
            }
            if (ClibConfig.tin_gen.get() && isOverworld(biome)) {
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ModOreGen.ORE_TIN);
            }
            if (ClibConfig.copper_gen.get() && isOverworld(biome)) {
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ModOreGen.ORE_COPPER);
            }
            if (ClibConfig.aluminum_gen.get() && isOverworld(biome)) {
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ModOreGen.ORE_LEAD);
            }
            if (isOverworld(biome)) {
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ModOreGen.ORE_SILVER);
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ModOreGen.ORE_NICKEL);
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ModOreGen.ORE_SULFUR);
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ModOreGen.ORE_TUNGSTEN);
            }
            
            
            if(ClibConfig.ruby_gen.get() && biome.getCategory() == Biome.Category.NETHER) {
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ModOreGen.ORE_RUBY);
            }
        }
    }

	public static ConfiguredFeature<?, ?> newConfiguredFeature(String registryName, ConfiguredFeature<?, ?> configuredFeature) {
        Registry.register(WorldGenRegistries.field_243653_e, new ResourceLocation(ConguerorLib.MOD_ID, registryName), configuredFeature);
        return configuredFeature;
    }
	
	private static ConfiguredFeature<?, ?> configuredFeature(Feature<OreFeatureConfig> feature, RuleTest canOverwrite, BlockState ore, int veinSize, int maxHeight, int attemptsPerChunk){
		//MCP note: use whatever iron ore uses in the vanilla Features class
		return feature.withConfiguration(new OreFeatureConfig(canOverwrite, ore, veinSize)).func_242733_d(maxHeight).func_242728_a().func_242731_b(attemptsPerChunk);
	}
	
    //Use these to add our features to vanilla's biomes.
    public static void addFeatureToBiome(Biome biome, GenerationStage.Decoration feature, ConfiguredFeature<?, ?> configuredFeature) {
        ConvertImmutableFeatures(biome);
        List<List<Supplier<ConfiguredFeature<?, ?>>>> biomeFeatures = biome.func_242440_e().field_242484_f;
        while (biomeFeatures.size() <= feature.ordinal()) {
            biomeFeatures.add(Lists.newArrayList());
        }
        biomeFeatures.get(feature.ordinal()).add(() -> configuredFeature);

    }

    private static void ConvertImmutableFeatures(Biome biome) {
        if (biome.func_242440_e().field_242484_f instanceof ImmutableList) {
            biome.func_242440_e().field_242484_f = biome.func_242440_e().field_242484_f.stream().map(Lists::newArrayList).collect(Collectors.toList());
        }
    }
    
    private static boolean isOverworld(Biome b){
		return b.getCategory() != Biome.Category.NETHER && b.getCategory() != Biome.Category.THEEND && b.getCategory() != Biome.Category.NONE;
	}
}
