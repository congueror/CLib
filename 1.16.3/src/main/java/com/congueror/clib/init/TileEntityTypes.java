package com.congueror.clib.init;

import com.congueror.clib.CLib;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypes 
{
	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, CLib.MOD_ID);
	
	//public static final RegistryObject<TileEntityType<AlloySmelterTileEntity>> ALLOY_SMELTER_TILE_ENTITY = TILE_ENTITY_TYPES.register("alloy_smelter", () -> TileEntityType.Builder.create(AlloySmelterTileEntity::new, BlockInit.ALLOY_SMELTER.get()).build(null));
}
