package com.congueror.clib.init;

import com.congueror.clib.ConguerorLib;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypes 
{
	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, ConguerorLib.MOD_ID);
	
	//public static final RegistryObject<TileEntityType<SmelteryTileEntity>> SMELTERY = TILE_ENTITY_TYPES.register("smeltery", () -> TileEntityType.Builder.create(SmelteryTileEntity::new, BlockInitNew.SMELTERY.get()).build(null));
}
