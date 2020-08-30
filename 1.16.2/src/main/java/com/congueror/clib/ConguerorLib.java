package com.congueror.clib;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.congueror.clib.config.ClibConfig;
import com.congueror.clib.init.BlockInit;
import com.congueror.clib.init.ContainerTypes;
import com.congueror.clib.init.ItemInit;
import com.congueror.clib.init.TileEntityTypes;
import com.congueror.clib.util.ClibItemGroup;
import com.congueror.clib.world.gen.ModOreGen;

@Mod("clib")
@Mod.EventBusSubscriber(modid = ConguerorLib.MOD_ID, bus = Bus.MOD)
public class ConguerorLib
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID= "clib";
    public static ConguerorLib instance;

    public ConguerorLib() 
    {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ClibConfig.spec);
    	
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	modEventBus.addListener(this::commonSetup);
    	modEventBus.addListener(this::clientRegistries);
    	modEventBus.addListener(this::doClientStuff);
        instance=this;
        
        ItemInit.ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        TileEntityTypes.TILE_ENTITY_TYPES.register(modEventBus);
        ContainerTypes.CONTAINER_TYPES.register(modEventBus);
        //RecipeSerializerInit.RECIPE_SERIALIZERS.register(modEventBus);
        
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) 
    {
        final IForgeRegistry<Item> registry = event.getRegistry();
        
        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> 
        {
            final Item.Properties properties = new Item.Properties().group(ClibItemGroup.instance);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });
        
		LOGGER.debug("Registered BlockItems!");
     }
    
    @SubscribeEvent
    public void commonSetup(final FMLCommonSetupEvent event)
    {
    	
    }
    
    private void clientRegistries(final FMLClientSetupEvent event) 
    {
    	
    }
    
    @SuppressWarnings("resource")
	private void doClientStuff(final FMLClientSetupEvent event) 
    {
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) 
    {
    	
    }
    
    @SubscribeEvent
    public void loadComplete(FMLLoadCompleteEvent event) 
    {  
    	ModOreGen.setupOres();
    	ModOreGen.initOres();
    }
}
