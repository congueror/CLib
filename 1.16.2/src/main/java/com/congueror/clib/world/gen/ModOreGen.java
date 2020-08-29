package com.congueror.clib.world.gen;

import java.util.Map;

import com.congueror.clib.config.ClibConfig;
import com.congueror.clib.init.BlockInit;

import net.minecraft.block.Block;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import static com.congueror.clib.world.gen.CLibWorldGen.addFeatureToBiome;

public class ModOreGen 
{
	public static void initOres(){
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
}
