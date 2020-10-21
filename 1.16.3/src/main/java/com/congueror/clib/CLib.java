package com.congueror.clib;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.congueror.clib.init.BlockInit;
import com.congueror.clib.init.ContainerTypes;
import com.congueror.clib.init.EffectInit;
import com.congueror.clib.init.ItemInit;
import com.congueror.clib.init.TileEntityTypes;
import com.congueror.clib.util.ClibItemGroup;
import com.congueror.clib.util.Strippables;
import com.congueror.clib.world.gen.OreGenFeatures;
import com.congueror.clib.world.gen.TreeGenFeatures;
import com.congueror.clib.world.gen.OreGen;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

@Mod("clib")
@Mod.EventBusSubscriber(modid = "clib", bus = Mod.EventBusSubscriber.Bus.MOD)
public class CLib
{
    public static final Logger LOGGER;
    public static final String MOD_ID = "clib";
    public static CLib instance;
    
    public CLib() {
    	
        //ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ClibConfig.spec);
        
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::doClientStuff);
        modEventBus.addListener(this::loadComplete);
        
        CLib.instance = this;
        ItemInit.ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        TileEntityTypes.TILE_ENTITY_TYPES.register(modEventBus);
        ContainerTypes.CONTAINER_TYPES.register(modEventBus);
        EffectInit.POTIONS.register(modEventBus);
        
        
        
        MinecraftForge.EVENT_BUS.register(this);
        
        MinecraftForge.EVENT_BUS.register(TreeGenFeatures.class);
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
    public void commonSetup(final FMLCommonSetupEvent event) {
    	//ModOreGen.addFeatures();
    	
    	OreGenFeatures.initModFeatures();
        OreGen.setupOreGenerator();
    	
    	TreeGenFeatures.configs.RUBBER_TREE_CONFIG.forcePlacement = false;
    }
    
    @SuppressWarnings("resource")
	private void doClientStuff(final FMLClientSetupEvent event) {
    	LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
    	
    	RenderTypeLookup.setRenderLayer(BlockInit.RUBBER_SAPLING.get(), RenderType.getCutout());
    }
    
    @SubscribeEvent
    public void loadComplete(final FMLLoadCompleteEvent event) {
    	Strippables.strippableLogs();
    }
    
    public static String find(String name)
	{
		return CLib.MOD_ID + ":" + name;
	}
    
    static {
        LOGGER = LogManager.getLogger();
    }
    
    public static ResourceLocation location(String path)
    {
        return new ResourceLocation(MOD_ID, path);
    }
}
