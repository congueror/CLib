package com.congueror.clib.datagen;

import com.congueror.clib.CLib;
import com.congueror.clib.datagen.TagsDataGen.ItemTagsDataGen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = CLib.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators 
{
	@SubscribeEvent
    public static void gatherData(GatherDataEvent event) 
	{
		CLib.LOGGER.debug("Starting Server Data Generators");
        DataGenerator generator = event.getGenerator();
        
        if (event.includeServer()) 
        {
        	TagsDataGen.BlockTagsDataGen blockTagsProvider = new TagsDataGen.BlockTagsDataGen(event.getGenerator(), event.getExistingFileHelper());
        	generator.addProvider(new RecipeDataGen(generator));
            //generator.addProvider(new LootTablesDataGen(generator));
            generator.addProvider(new TagsDataGen.BlockTagsDataGen(generator, event.getExistingFileHelper()));
            generator.addProvider(new ItemTagsDataGen(generator, blockTagsProvider, event.getExistingFileHelper()));
        }
        if (event.includeClient()) 
        {
        	CLib.LOGGER.debug("Starting Client Data Generators");
        	generator.addProvider(new ItemModelDataGen(generator, CLib.MOD_ID, event.getExistingFileHelper()));
            generator.addProvider(new BlockModelDataGen(generator, CLib.MOD_ID, event.getExistingFileHelper()));
        }
    }
}
