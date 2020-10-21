package com.congueror.clib.util;

import com.congueror.clib.CLib;
import com.congueror.clib.init.BlockInit;
import com.google.common.collect.Maps;

import net.minecraft.block.Block;
import net.minecraft.item.AxeItem;

public class Strippables {
	//Credits to BYG
	public static void strippableBlock(Block log, Block strippable) {
        AxeItem.BLOCK_STRIPPING_MAP = Maps.newHashMap(AxeItem.BLOCK_STRIPPING_MAP);
        AxeItem.BLOCK_STRIPPING_MAP.put(log, strippable);
    }
	
	public static void strippableLogs() {
        CLib.LOGGER.debug("CLib: Adding strippable Blocks...");

        strippableBlock(BlockInit.RUBBER_LOG.get(), BlockInit.RUBBER_STRIPPED_LOG.get());
        
        CLib.LOGGER.debug("CLib: Added strippable Blocks...");
	}
}
