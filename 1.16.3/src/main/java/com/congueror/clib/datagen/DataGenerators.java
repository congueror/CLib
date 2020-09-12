package com.congueror.clib.datagen;

import com.congueror.clib.CLib;

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
        	generator.addProvider(new RecipeDataGen(generator));
            //generator.addProvider(new LootTablesDataGen(generator));
            //generator.addProvider(new BlockTagsDataGen(generator));
            //generator.addProvider(new ItemTagsDataGen(generator));
        }
        if (event.includeClient()) 
        {
        	CLib.LOGGER.debug("Starting Client Data Generators");
        	//generator.addProvider(new BlockModelsDataGen(generator, CLib.MOD_ID, event.getExistingFileHelper()));
            generator.addProvider(new ItemModelDataGen(generator, CLib.MOD_ID, event.getExistingFileHelper()));
            //generator.addProvider(new LanguagesDataGen(generator, ConguerorLib.MOD_ID));
        }
    }
}
