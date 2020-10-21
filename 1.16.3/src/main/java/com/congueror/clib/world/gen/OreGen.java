package com.congueror.clib.world.gen;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import com.google.common.collect.Lists;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

public class OreGen {
	//Credits to BNO
	@SuppressWarnings("deprecation")
	public static void setupOreGenerator()
    {
        for (Map.Entry<RegistryKey<Biome>, Biome> biome : WorldGenRegistries.BIOME.getEntries()) {

            if (!biome.getValue().getCategory().equals(Biome.Category.NETHER) && !biome.getValue().getCategory().equals(Biome.Category.THEEND))
            {
            	addFeatureToBiome(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, OreGenFeatures.ORE_TIN);
            	addFeatureToBiome(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, OreGenFeatures.ORE_ALUMINUM);
            	addFeatureToBiome(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, OreGenFeatures.ORE_AMETHYST);
            	addFeatureToBiome(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, OreGenFeatures.ORE_COPPER);
            	addFeatureToBiome(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, OreGenFeatures.ORE_LEAD);
            	addFeatureToBiome(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, OreGenFeatures.ORE_NICKEL);
            	addFeatureToBiome(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, OreGenFeatures.ORE_OPAL);
            	addFeatureToBiome(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, OreGenFeatures.ORE_PLATINUM);
            	addFeatureToBiome(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, OreGenFeatures.ORE_SALTPRE);
            	addFeatureToBiome(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, OreGenFeatures.ORE_SAPPHIRE);
            	addFeatureToBiome(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, OreGenFeatures.ORE_SILVER);
            	addFeatureToBiome(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, OreGenFeatures.ORE_SULFUR);
            	addFeatureToBiome(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, OreGenFeatures.ORE_TUNGSTEN);
            	addFeatureToBiome(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, OreGenFeatures.ORE_URANIUM);
            	addFeatureToBiome(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, OreGenFeatures.ORE_ZINC);
            }
            
            if(biome.getValue().getCategory().equals(Biome.Category.NETHER)) 
            {
            	addFeatureToBiome(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, OreGenFeatures.ORE_NETHER_COBALT);
            	addFeatureToBiome(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, OreGenFeatures.ORE_NETHER_RUBY);
            	addFeatureToBiome(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, OreGenFeatures.ORE_NETHER_TITANIUM);
            }
        }
    }
	
	public static void addFeatureToBiome(Biome biome, GenerationStage.Decoration decoration,
			ConfiguredFeature<?, ?> configuredFeature) {
		List<List<Supplier<ConfiguredFeature<?, ?>>>> biomeFeatures = new ArrayList<>(
				biome.getGenerationSettings().getFeatures());
		while (biomeFeatures.size() <= decoration.ordinal()) {
			biomeFeatures.add(Lists.newArrayList());
		}
		List<Supplier<ConfiguredFeature<?, ?>>> features = new ArrayList<>(biomeFeatures.get(decoration.ordinal()));
		features.add(() -> configuredFeature);
		biomeFeatures.set(decoration.ordinal(), features);

		ObfuscationReflectionHelper.setPrivateValue(BiomeGenerationSettings.class, biome.getGenerationSettings(), biomeFeatures,
				"field_242484_f");
	}
}
