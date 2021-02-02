package com.congueror.clib.world.gen;

import com.congueror.clib.CLib;
import com.congueror.clib.init.BlockInit;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureSpread;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.TwoLayerFeature;
import net.minecraft.world.gen.foliageplacer.FancyFoliagePlacer;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class TreeGenFeatures {
	public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> RUBBER_TREE = Feature.TREE.withConfiguration(configs.RUBBER_TREE_CONFIG);

	public static final ConfiguredFeature<?, ?> PLACABLE_RUBBER_TREE = createConfiguredFeature("rubber_tree",
			TreeGenFeatures.RUBBER_TREE.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
					.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.01F, 1))));
	
	@SubscribeEvent
	public static void addTrees(BiomeLoadingEvent event)
	{
		BiomeGenerationSettingsBuilder builder = event.getGeneration();

		if (event.getName().toString().startsWith("minecraft:"))
		{
			if (doesBiomeMatch(event.getName(), Biomes.FOREST)) {
				builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, PLACABLE_RUBBER_TREE);
			}
		}
	}
	
	private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> createConfiguredFeature(String nameIn, ConfiguredFeature<FC, ?> featureIn)
	{
		return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, CLib.find(nameIn), featureIn);
	}
	
	public static boolean doesBiomeMatch(ResourceLocation biomeNameIn, RegistryKey<Biome> biomeIn)
	{
		return biomeNameIn.getPath().matches(biomeIn.getLocation().getPath());
	}


	public static class configs {
		public static final BaseTreeFeatureConfig RUBBER_TREE_CONFIG = (new BaseTreeFeatureConfig.Builder(
				new SimpleBlockStateProvider(BlockInit.RUBBER_LOG.get().getDefaultState()),
				new SimpleBlockStateProvider(BlockInit.RUBBER_LEAVES.get().getDefaultState()),
				new FancyFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0), 3),
				new StraightTrunkPlacer(4, 2, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build();
	}
}