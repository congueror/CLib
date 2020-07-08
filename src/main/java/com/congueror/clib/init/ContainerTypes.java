package com.congueror.clib.init;

import com.congueror.clib.ConguerorLib;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unused")
public class ContainerTypes {
	
	public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = DeferredRegister.create(ForgeRegistries.CONTAINERS, ConguerorLib.MOD_ID);

	//public static final RegistryObject<ContainerType<SmelteryContainer>> SMELTERY_CONTAINER = CONTAINER_TYPES.register("smeltery_container", () -> IForgeContainerType.create(SmelteryContainer::new));
}
