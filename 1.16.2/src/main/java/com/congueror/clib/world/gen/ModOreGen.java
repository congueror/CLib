package com.congueror.clib.world.gen;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.congueror.clib.ConguerorLib;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = ConguerorLib.MOD_ID, bus = Bus.MOD)
public class ModOreGen 
{
	@SuppressWarnings("deprecation")
	public static void addFeatures() {
        for (Biome biome : WorldGenRegistries.field_243657_i) {
            if (biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND && biome.getCategory() != Biome.Category.NONE) {
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ConfiguredOreGenFeatures.ORE_ALUMINUM);
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ConfiguredOreGenFeatures.ORE_TIN);
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ConfiguredOreGenFeatures.ORE_COPPER);
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ConfiguredOreGenFeatures.ORE_LEAD);
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ConfiguredOreGenFeatures.ORE_SILVER);
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ConfiguredOreGenFeatures.ORE_NICKEL);
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ConfiguredOreGenFeatures.ORE_SULFUR);
            }
            
            if(biome.getCategory() == Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND && biome.getCategory() != Biome.Category.NONE) {
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ConfiguredOreGenFeatures.ORE_RUBY);
            }
        }
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
}
