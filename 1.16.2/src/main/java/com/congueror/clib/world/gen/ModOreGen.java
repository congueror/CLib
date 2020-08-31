package com.congueror.clib.world.gen;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import com.congueror.clib.config.ClibConfig;
import com.congueror.clib.init.BlockInit;
import com.google.common.collect.Lists;

import net.minecraft.block.Block;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

@SuppressWarnings("unused")
public class ModOreGen 
{
//Vein Size, Chance, Min, Max, Vein Count

	/*public static void initOres() {
		if(ClibConfig.alum_gen.get()) {
		Registry.register(WorldGenRegistries.field_243653_e, BlockInit.ALUMINUM_ORE.get().getRegistryName(),Feature.ORE.withConfiguration
				(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.ALUMINUM_ORE.get().getDefaultState(), 4)).withPlacement(Placement.field_242907_l.configure
				(new TopSolidRangeConfig(ClibConfig.alum_chance.get(), ClibConfig.alum_min.get(), ClibConfig.alum_max.get()))).func_242728_a().func_242731_b(10));
		}
	}
	@SuppressWarnings("deprecation")
	public static void setupOres() {
		for (Map.Entry<RegistryKey<Biome>, Biome> biome : WorldGenRegistries.field_243657_i.getEntries()) {
			//Overworld
			if (!biome.getValue().getCategory().equals(Biome.Category.NETHER)
					&& !biome.getValue().getCategory().equals(Biome.Category.THEEND)) {
				
				
				
				addFeatureToBiome(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES,
						WorldGenRegistries.field_243653_e.getOrDefault(BlockInit.ALUMINUM_ORE.get().getRegistryName()));
			}
			//Nether
			/*if (biome.getValue().getCategory().equals(Biome.Category.NETHER)
					&& ClibConfig.ruby_gen.get()) {
				
				
				addFeatureToBiome(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES,
						WorldGenRegistries.field_243653_e
								.getOrDefault(BlockInit.RUBY_ORE.get().getRegistryName()));

			}*/
		/*}
	}

	public static void addFeatureToBiome(Biome biome, GenerationStage.Decoration decoration,
			ConfiguredFeature<?, ?> configuredFeature) {
		List<List<Supplier<ConfiguredFeature<?, ?>>>> biomeFeatures = new ArrayList<>(
				biome.func_242440_e().func_242498_c());
		while (biomeFeatures.size() <= decoration.ordinal()) {
			biomeFeatures.add(Lists.newArrayList());
		}
		List<Supplier<ConfiguredFeature<?, ?>>> features = new ArrayList<>(biomeFeatures.get(decoration.ordinal()));
		features.add(() -> configuredFeature);
		biomeFeatures.set(decoration.ordinal(), features);

		ObfuscationReflectionHelper.setPrivateValue(BiomeGenerationSettings.class, biome.func_242440_e(), biomeFeatures,
				"field_242484_f");
	}*/
}
