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

public class ModOreGen2 
{
	public static void initOres()
	{
        if (ClibConfig.alum_gen.get()) {
            registerConfiguredOre(ClibConfig.alum_chance.get(), 4, ClibConfig.alum_min.get(), ClibConfig.alum_max.get(), BlockInit.ALUMINUM_ORE.get());
        }
	}
	
	public static void setupOres(){
        if (ClibConfig.alum_gen.get()) {
            addOreToGenerate(BlockInit.ALUMINUM_ORE.get());
        }
	}
	
	
	
	private static void registerConfiguredOre(int veinCount, int veinSize, int minY, int maxY, Block ore){
        if(ore.getRegistryName() != null)
         Registry.register(WorldGenRegistries.field_243653_e, ore.getRegistryName(), Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, ore.getDefaultState(), veinSize)).withPlacement(Placement.field_242907_l.configure(new TopSolidRangeConfig(minY, minY, maxY))).func_242728_a().func_242731_b(veinCount));
    }

    @SuppressWarnings("deprecation")
	private static void addOreToGenerate(Block ore){
        for(Map.Entry<RegistryKey<Biome>, Biome> biome : WorldGenRegistries.field_243657_i.getEntries()) {
            if(!biome.getValue().getCategory().equals(Biome.Category.NETHER) && !biome.getValue().getCategory().equals(Biome.Category.THEEND)) {
                addFeatureToBiome(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, WorldGenRegistries.field_243653_e.getOrDefault(ore.getRegistryName()));
            }
        }
    }
    
    public static void addFeatureToBiome(Biome biome, GenerationStage.Decoration decoration, ConfiguredFeature<?, ?> configuredFeature) {
        List<List<Supplier<ConfiguredFeature<?, ?>>>> biomeFeatures = new ArrayList<>(biome.func_242440_e().func_242498_c());
        while (biomeFeatures.size() <= decoration.ordinal()) {
            biomeFeatures.add(Lists.newArrayList());
        }
        List<Supplier<ConfiguredFeature<?, ?>>> features = new ArrayList<>(biomeFeatures.get(decoration.ordinal()));
        features.add(() -> configuredFeature);
        biomeFeatures.set(decoration.ordinal(), features);

        ObfuscationReflectionHelper.setPrivateValue(BiomeGenerationSettings.class, biome.func_242440_e(), biomeFeatures, "field_242484_f");
    }
}
