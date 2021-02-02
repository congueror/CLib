package com.congueror.clib.datagen;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.congueror.clib.CLib;
import com.congueror.clib.init.BlockInit;
import com.congueror.clib.init.ItemInit;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IDataProvider;
import net.minecraft.data.LootTableProvider;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.loot.ItemLootEntry;
import net.minecraft.loot.LootParameterSet;
import net.minecraft.loot.LootParameterSets;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTableManager;
import net.minecraft.loot.RandomValueRange;
import net.minecraft.loot.ValidationTracker;
import net.minecraft.loot.functions.ApplyBonus;
import net.minecraft.loot.functions.SetCount;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

public class LootTableDataGen extends LootTableProvider implements IDataProvider
{
	private static final float[] DEFAULT_SAPLING_DROP_RATES = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
	
	public LootTableDataGen(DataGenerator dataGeneratorIn) {
		super(dataGeneratorIn);
	}
	
	private final List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> tables = ImmutableList.of(
            Pair.of(BlockTables::new, LootParameterSets.BLOCK)
    );
	
	@Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables()
    {
        return tables;
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker)
    {
        map.forEach((p_218436_2_, p_218436_3_) -> {
            LootTableManager.validateLootTable(validationtracker, p_218436_2_, p_218436_3_);
        });
    }
    
    public static class BlockTables extends BlockLootTables
    {
        @Override
        protected void addTables()
        {
            this.registerDropSelfLootTable(BlockInit.ALUMINUM_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.ALUMINUM_ORE.get());
            this.registerDropSelfLootTable(BlockInit.AMETHYST_BLOCK.get());
            
            this.registerLootTable(BlockInit.AMETHYST_ORE.get(), (gem) -> {
                return droppingItemWithFortune(gem, ItemInit.AMETHYST.get());
             });
            
            this.registerDropSelfLootTable(BlockInit.BRONZE_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.COBALT_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.COBALT_ORE.get());
            this.registerDropSelfLootTable(BlockInit.COPPER_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.COPPER_ORE.get());
            this.registerDropSelfLootTable(BlockInit.ELECTRUM_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.ENDERIUM_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.INVAR_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.LEAD_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.LEAD_ORE.get());
            this.registerDropSelfLootTable(BlockInit.LUMIUM_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.NICKEL_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.NICKEL_ORE.get());
            this.registerDropSelfLootTable(BlockInit.OPAL_BLOCK.get());
            
            this.registerLootTable(BlockInit.OPAL_ORE.get(), (gem) -> {
                return droppingItemWithFortune(gem, ItemInit.OPAL.get());
             });
            
            this.registerDropSelfLootTable(BlockInit.PLATINUM_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.PLATINUM_ORE.get());
            this.registerDropSelfLootTable(BlockInit.RUBY_BLOCK.get());
            this.registerLootTable(BlockInit.RUBY_ORE.get(), (gem) -> {
                return droppingItemWithFortune(gem, ItemInit.RUBY.get());
             });
            
            this.registerLootTable(BlockInit.SALTPETRE_ORE.get(), (ore) -> {
                return droppingWithSilkTouch(ore, withExplosionDecay(ore, ItemLootEntry.builder(ItemInit.SALTPETRE_DUST.get()).acceptFunction(SetCount.builder(RandomValueRange.of(5.0F, 6.0F))).acceptFunction(ApplyBonus.uniformBonusCount(Enchantments.FORTUNE))));
             });
            
            this.registerDropSelfLootTable(BlockInit.SAPPHIRE_BLOCK.get());
            
            this.registerLootTable(BlockInit.SAPPHIRE_ORE.get(), (gem) -> {
                return droppingItemWithFortune(gem, ItemInit.SAPPHIRE.get());
             });
            
            this.registerDropSelfLootTable(BlockInit.SIGNALUM_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.SILVER_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.SILVER_ORE.get());
            this.registerDropSelfLootTable(BlockInit.STEEL_BLOCK.get());
            
            this.registerLootTable(BlockInit.SULFUR_ORE.get(), (ore) -> {
                return droppingWithSilkTouch(ore, withExplosionDecay(ore, ItemLootEntry.builder(ItemInit.SULFUR_DUST.get()).acceptFunction(SetCount.builder(RandomValueRange.of(5.0F, 6.0F))).acceptFunction(ApplyBonus.uniformBonusCount(Enchantments.FORTUNE))));
             });
            
            this.registerDropSelfLootTable(BlockInit.TIN_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.TIN_ORE.get());
            this.registerDropSelfLootTable(BlockInit.TITANIUM_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.TITANIUM_ORE.get());
            this.registerDropSelfLootTable(BlockInit.TUNGSTEN_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.TUNGSTEN_ORE.get());
            this.registerDropSelfLootTable(BlockInit.URANIUM_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.URANIUM_ORE.get());
            this.registerDropSelfLootTable(BlockInit.ZINC_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.ZINC_ORE.get());
            
            this.registerDropSelfLootTable(BlockInit.BRASS_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.CHROMIUM_ORE.get());
            this.registerDropSelfLootTable(BlockInit.CHROMIUM_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.THORIUM_ORE.get());
            
            this.registerDropSelfLootTable(BlockInit.RUBBER_LOG.get());
            this.registerDropSelfLootTable(BlockInit.RUBBER_WOOD.get());
            this.registerDropSelfLootTable(BlockInit.RUBBER_STRIPPED_LOG.get());
            this.registerDropSelfLootTable(BlockInit.RUBBER_STRIPPED_WOOD.get());
            this.registerDropSelfLootTable(BlockInit.RUBBER_PLANKS.get());
            this.registerLootTable(BlockInit.RUBBER_LEAVES.get(), (leaves) -> {
                return droppingWithChancesAndSticks(leaves, BlockInit.RUBBER_SAPLING.get(), DEFAULT_SAPLING_DROP_RATES);
             });
            this.registerDropSelfLootTable(BlockInit.RUBBER_SAPLING.get());
        }

        @Override
        protected Iterable<Block> getKnownBlocks()
        {
            return ForgeRegistries.BLOCKS.getValues().stream()
                    .filter(b -> b.getRegistryName().getNamespace().equals(CLib.MOD_ID))
                    .collect(Collectors.toList());
        }
    }
}
