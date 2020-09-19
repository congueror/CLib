package com.congueror.clib.world.gen;

import java.util.stream.Collectors;

import com.congueror.clib.CLib;
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

@Mod.EventBusSubscriber(modid = CLib.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModOreGen
{
	//Veinsize, Maxheight, AttemptPerChunk
	public static ConfiguredFeature<?, ?> ORE_TIN;
	public static ConfiguredFeature<?, ?> ORE_ALUMINUM;
	public static ConfiguredFeature<?, ?> ORE_COPPER;
	public static ConfiguredFeature<?, ?> ORE_LEAD;
	public static ConfiguredFeature<?, ?> ORE_SILVER;
	public static ConfiguredFeature<?, ?> ORE_NICKEL;
	public static ConfiguredFeature<?, ?> ORE_SULFUR;
	public static ConfiguredFeature<?, ?> ORE_PLATINUM;
	public static ConfiguredFeature<?, ?> ORE_TUNGSTEN;
	public static ConfiguredFeature<?, ?> ORE_RUBY;
	public static ConfiguredFeature<?, ?> ORE_AMETHYST;
	public static ConfiguredFeature<?, ?> ORE_SAPPHIRE;
	public static ConfiguredFeature<?, ?> ORE_OPAL;
	public static ConfiguredFeature<?, ?> ORE_TITANIUM;
	public static ConfiguredFeature<?, ?> ORE_URANIUM;
	public static ConfiguredFeature<?, ?> ORE_COBALT;
	public static ConfiguredFeature<?, ?> ORE_ZINC;

	@SuppressWarnings("deprecation")
	public static void addFeatures() {
		ModOreGen.ORE_TIN = configuredFeature("ore_tin", Feature.ORE.withConfiguration(new OreFeatureConfig
				(OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.TIN_ORE.get().getDefaultState(), 8)).func_242733_d(60).func_242728_a().func_242731_b(5));
		
		ModOreGen.ORE_ALUMINUM = configuredFeature("ore_aluminum", Feature.ORE.withConfiguration(new OreFeatureConfig
				(OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.ALUMINUM_ORE.get().getDefaultState(), 8)).func_242733_d(25).func_242728_a().func_242731_b(4));
		
		ModOreGen.ORE_COPPER = configuredFeature("ore_copper", Feature.ORE.withConfiguration(new OreFeatureConfig
				(OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.COPPER_ORE.get().getDefaultState(), 8)).func_242733_d(60).func_242728_a().func_242731_b(5));
		
		ModOreGen.ORE_LEAD = configuredFeature("ore_lead", Feature.ORE.withConfiguration(new OreFeatureConfig
				(OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.LEAD_ORE.get().getDefaultState(), 8)).func_242733_d(20).func_242728_a().func_242731_b(4));
		
		ModOreGen.ORE_SILVER = configuredFeature("ore_silver", Feature.ORE.withConfiguration(new OreFeatureConfig
				(OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.SILVER_ORE.get().getDefaultState(), 8)).func_242733_d(16).func_242728_a().func_242731_b(3));
		
		ModOreGen.ORE_NICKEL = configuredFeature("ore_nickel", Feature.ORE.withConfiguration(new OreFeatureConfig
				(OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.NICKEL_ORE.get().getDefaultState(), 8)).func_242733_d(20).func_242728_a().func_242731_b(4));
		
		ModOreGen.ORE_SULFUR = configuredFeature("ore_sulfur", Feature.ORE.withConfiguration(new OreFeatureConfig
				(OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.SULFUR_ORE.get().getDefaultState(), 8)).func_242733_d(100).func_242728_a().func_242731_b(6));
		
		ModOreGen.ORE_PLATINUM = configuredFeature("ore_platinum", Feature.ORE.withConfiguration(new OreFeatureConfig
				(OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.PLATINUM_ORE.get().getDefaultState(), 8)).func_242733_d(8).func_242728_a().func_242731_b(1));
		
		ModOreGen.ORE_TUNGSTEN = configuredFeature("ore_tungsten", Feature.ORE.withConfiguration(new OreFeatureConfig
				(OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.TUNGSTEN_ORE.get().getDefaultState(), 8)).func_242733_d(16).func_242728_a().func_242731_b(2));
		
		ModOreGen.ORE_RUBY = configuredFeature("ore_ruby", Feature.ORE.withConfiguration(new OreFeatureConfig
				(OreFeatureConfig.FillerBlockType.field_241883_b, BlockInit.RUBY_ORE.get().getDefaultState(), 8)).func_242733_d(18).func_242728_a().func_242731_b(1));
		
		ModOreGen.ORE_AMETHYST = configuredFeature("ore_amethyst", Feature.ORE.withConfiguration(new OreFeatureConfig
				(OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.AMETHYST_ORE.get().getDefaultState(), 8)).func_242733_d(16).func_242728_a().func_242731_b(1));
		
		ModOreGen.ORE_SAPPHIRE = configuredFeature("ore_sapphire", Feature.ORE.withConfiguration(new OreFeatureConfig
				(OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.SAPPHIRE_ORE.get().getDefaultState(), 8)).func_242733_d(16).func_242728_a().func_242731_b(1));
		
		ModOreGen.ORE_OPAL = configuredFeature("ore_opal", Feature.ORE.withConfiguration(new OreFeatureConfig
				(OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.OPAL_ORE.get().getDefaultState(), 8)).func_242733_d(9).func_242728_a().func_242731_b(1));
		
		ModOreGen.ORE_TITANIUM = configuredFeature("ore_titanium", Feature.ORE.withConfiguration(new OreFeatureConfig
				(OreFeatureConfig.FillerBlockType.field_241883_b, BlockInit.TITANIUM_ORE.get().getDefaultState(), 8)).func_242733_d(7).func_242728_a().func_242731_b(1));
		
		ModOreGen.ORE_URANIUM = configuredFeature("ore_uranium", Feature.ORE.withConfiguration(new OreFeatureConfig
				(OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.TITANIUM_ORE.get().getDefaultState(), 8)).func_242733_d(16).func_242728_a().func_242731_b(1));
		
		ModOreGen.ORE_COBALT = configuredFeature("ore_cobalt", Feature.ORE.withConfiguration(new OreFeatureConfig
				(OreFeatureConfig.FillerBlockType.field_241883_b, BlockInit.TITANIUM_ORE.get().getDefaultState(), 8)).func_242733_d(10).func_242728_a().func_242731_b(2));
		
		ModOreGen.ORE_ZINC = configuredFeature("ore_zinc", Feature.ORE.withConfiguration(new OreFeatureConfig
				(OreFeatureConfig.FillerBlockType.field_241882_a, BlockInit.TITANIUM_ORE.get().getDefaultState(), 8)).func_242733_d(40).func_242728_a().func_242731_b(4));
	
        for (final Biome biome : WorldGenRegistries.field_243657_i) {
            if (biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND && biome.getCategory() != Biome.Category.NONE) {
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ModOreGen.ORE_TIN);
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ModOreGen.ORE_ALUMINUM);
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ModOreGen.ORE_COPPER);
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ModOreGen.ORE_LEAD);
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ModOreGen.ORE_SILVER);
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ModOreGen.ORE_NICKEL);
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ModOreGen.ORE_SULFUR);
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ModOreGen.ORE_PLATINUM);
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ModOreGen.ORE_TUNGSTEN);
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ModOreGen.ORE_AMETHYST);
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ModOreGen.ORE_SAPPHIRE);
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ModOreGen.ORE_OPAL);
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ModOreGen.ORE_URANIUM);
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ModOreGen.ORE_ZINC);
            }
            if (biome.getCategory() == Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND && biome.getCategory() != Biome.Category.NONE) {
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ModOreGen.ORE_RUBY);
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ModOreGen.ORE_TITANIUM);
                addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ModOreGen.ORE_COBALT);
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
