package com.congueror.clib.world.gen;

import com.congueror.clib.CLib;
import com.congueror.clib.init.BlockInit;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;

public class OreGenFeatures {
	//Credits to BNO
	public static String modID = CLib.MOD_ID;

	// Vein size, min height, ignore, max height, chance
	public static ConfiguredFeature<?, ?> ORE_TIN = Feature.ORE
			.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
					BlockInit.TIN_ORE.get().getDefaultState(), 8))
			.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(0, 0, 64))).square()
			.func_242731_b(25);
	
	public static ConfiguredFeature<?, ?> ORE_ALUMINUM = Feature.ORE
			.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
					BlockInit.ALUMINUM_ORE.get().getDefaultState(), 8))
			.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(0, 0, 64))).square()
			.func_242731_b(18);
	
	public static ConfiguredFeature<?, ?> ORE_COPPER = Feature.ORE
			.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
					BlockInit.COPPER_ORE.get().getDefaultState(), 8))
			.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(0, 0, 64))).square()
			.func_242731_b(20);
	
	public static ConfiguredFeature<?, ?> ORE_LEAD = Feature.ORE
			.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
					BlockInit.LEAD_ORE.get().getDefaultState(), 8))
			.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(0, 0, 32))).square()
			.func_242731_b(4);
	
	public static ConfiguredFeature<?, ?> ORE_SILVER = Feature.ORE
			.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
					BlockInit.SILVER_ORE.get().getDefaultState(), 8))
			.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(0, 0, 16))).square()
			.func_242731_b(3);
	
	public static ConfiguredFeature<?, ?> ORE_NICKEL = Feature.ORE
			.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
					BlockInit.NICKEL_ORE.get().getDefaultState(), 8))
			.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(0, 0, 32))).square()
			.func_242731_b(4);
	
	public static ConfiguredFeature<?, ?> ORE_SULFUR = Feature.ORE
			.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
					BlockInit.SULFUR_ORE.get().getDefaultState(), 8))
			.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(0, 0, 100))).square()
			.func_242731_b(2);
	
	public static ConfiguredFeature<?, ?> ORE_PLATINUM = Feature.ORE
			.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
					BlockInit.PLATINUM_ORE.get().getDefaultState(), 8))
			.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(0, 0, 8))).square()
			.func_242731_b(1);
	
	public static ConfiguredFeature<?, ?> ORE_TUNGSTEN = Feature.ORE
			.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
					BlockInit.TUNGSTEN_ORE.get().getDefaultState(), 8))
			.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(0, 0, 16))).square()
			.func_242731_b(2);
	
	public static ConfiguredFeature<?, ?> ORE_NETHER_RUBY = Feature.ORE
			.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,
					BlockInit.RUBY_ORE.get().getDefaultState(), 3))
			.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(0, 0, 18))).square()
			.func_242731_b(1);
	
	public static ConfiguredFeature<?, ?> ORE_AMETHYST = Feature.ORE
			.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
					BlockInit.AMETHYST_ORE.get().getDefaultState(), 8))
			.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(0, 0, 16))).square()
			.func_242731_b(1);
	
	public static ConfiguredFeature<?, ?> ORE_SAPPHIRE = Feature.ORE
			.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
					BlockInit.SAPPHIRE_ORE.get().getDefaultState(), 8))
			.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(0, 0, 16))).square()
			.func_242731_b(2);
	
	public static ConfiguredFeature<?, ?> ORE_OPAL = Feature.ORE
			.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
					BlockInit.OPAL_ORE.get().getDefaultState(), 8))
			.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(0, 0, 9))).square()
			.func_242731_b(1);
	
	public static ConfiguredFeature<?, ?> ORE_NETHER_TITANIUM = Feature.ORE
			.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,
					BlockInit.TITANIUM_ORE.get().getDefaultState(), 8))
			.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(0, 0, 7))).square()
			.func_242731_b(1);
	
	public static ConfiguredFeature<?, ?> ORE_URANIUM = Feature.ORE
			.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
					BlockInit.URANIUM_ORE.get().getDefaultState(), 8))
			.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(0, 0, 16))).square()
			.func_242731_b(1);
	
	public static ConfiguredFeature<?, ?> ORE_NETHER_COBALT = Feature.ORE
			.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,
					BlockInit.COBALT_ORE.get().getDefaultState(), 8))
			.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(0, 0, 8))).square()
			.func_242731_b(2);
	
	public static ConfiguredFeature<?, ?> ORE_ZINC = Feature.ORE
			.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
					BlockInit.ZINC_ORE.get().getDefaultState(), 8))
			.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(0, 0, 32))).square()
			.func_242731_b(8);

	public static ConfiguredFeature<?, ?> ORE_SALTPRE = Feature.ORE
			.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
					BlockInit.SALTPETRE_ORE.get().getDefaultState(), 8))
			.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(0, 0, 100))).square()
			.func_242731_b(6);
	
	public static ConfiguredFeature<?, ?> ORE_CHROMIUM = Feature.ORE
			.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
					BlockInit.CHROMIUM_ORE.get().getDefaultState(), 8))
			.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(0, 0, 22))).square()
			.func_242731_b(6);
	
	public static ConfiguredFeature<?, ?> ORE_THORIUM = Feature.ORE
			.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
					BlockInit.SALTPETRE_ORE.get().getDefaultState(), 8))
			.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(0, 0, 8))).square()
			.func_242731_b(1);

	public static void initModFeatures() {
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_tin"), ORE_TIN);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_aluminum"), ORE_ALUMINUM);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_amethyst"), ORE_AMETHYST);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_copper"), ORE_COPPER);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_lead"), ORE_LEAD);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_nether_cobalt"), ORE_NETHER_COBALT);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_nether_ruby"), ORE_NETHER_RUBY);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_nether_titanium"), ORE_NETHER_TITANIUM);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_nickel"), ORE_NICKEL);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_opal"), ORE_OPAL);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_platinum"), ORE_PLATINUM);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_saltpetre"), ORE_SALTPRE);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_sapphire"), ORE_SAPPHIRE);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_silver"), ORE_SILVER);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_sulfur"), ORE_SULFUR);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_tungsten"), ORE_TUNGSTEN);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_uranium"), ORE_URANIUM);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_zinc"), ORE_ZINC);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_chromium"), ORE_CHROMIUM);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_thorium"), ORE_THORIUM);
	}
}
