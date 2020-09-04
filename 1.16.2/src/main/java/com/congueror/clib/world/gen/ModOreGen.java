package com.congueror.clib.world.gen;

import java.util.stream.Collectors;

import com.congueror.clib.ConguerorLib;
import com.congueror.clib.init.BlockInit;
import com.google.common.collect.ImmutableList;
import java.util.function.Supplier;
import java.util.List;
import com.google.common.collect.Lists;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.biome.Biome;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ConguerorLib.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModOreGen
{
	public static ConfiguredFeature<?, ?> ORE_ALUMINUM = configuredFeature("ore_aluminum", Feature.ORE.withConfiguration(new OreFeatureConfig
			(OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.ALUMINUM_ORE.get().getDefaultState(), 8)).func_242733_d(25).func_242728_a().func_242731_b(2));
	
	public static ConfiguredFeature<?, ?> ORE_RUBY = configuredFeature("ore_ruby", Feature.ORE.withConfiguration(new OreFeatureConfig
			(OreFeatureConfig.FillerBlockType.field_241883_b, BlockInit.RUBY_ORE.get().getDefaultState(), 8)).func_242733_d(25).func_242728_a().func_242731_b(2));
	
	@SuppressWarnings("deprecation")
	public static void addFeatures() {
        for (final Biome biome : WorldGenRegistries.field_243657_i) {
            if (biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND && biome.getCategory() != Biome.Category.NONE) {
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ModOreGen.ORE_ALUMINUM);
                
            }
            if (biome.getCategory() == Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND && biome.getCategory() != Biome.Category.NONE) {
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ModOreGen.ORE_RUBY);
            }
        }
    }

	public static ConfiguredFeature<?, ?> configuredFeature(final String registryName, final ConfiguredFeature<?, ?> configuredFeature) {
        Registry.register(WorldGenRegistries.field_243653_e, new ResourceLocation("clib", registryName), configuredFeature);
        return configuredFeature;
    }
    
	public static void addFeatureToBiome(Biome biome, GenerationStage.Decoration feature, ConfiguredFeature<?, ?> configuredFeature) {
        ConvertImmutableFeatures(biome);
        List<List<Supplier<ConfiguredFeature<?, ?>>>> biomeFeatures = biome.func_242440_e().field_242484_f;
        while (biomeFeatures.size() <= feature.ordinal()) {
            biomeFeatures.add(Lists.newArrayList());
        }
        biomeFeatures.get(feature.ordinal()).add(() -> configuredFeature);

    }
    
    private static void ConvertImmutableFeatures(final Biome biome) {
        if (biome.func_242440_e().field_242484_f instanceof ImmutableList) {
            biome.func_242440_e().field_242484_f = biome.func_242440_e().field_242484_f.stream().map(Lists::newArrayList).collect(Collectors.toList());
        }
    }
}
