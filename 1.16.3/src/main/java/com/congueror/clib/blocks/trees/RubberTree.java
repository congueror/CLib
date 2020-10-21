package com.congueror.clib.blocks.trees;

import java.util.Random;

import com.congueror.clib.world.gen.TreeGenFeatures;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class RubberTree extends Tree
{
	@Override
	protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean largeHive) {
		return TreeGenFeatures.RUBBER_TREE;
	}
}
