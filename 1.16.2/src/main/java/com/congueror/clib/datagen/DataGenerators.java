package com.congueror.clib.datagen;

import com.congueror.clib.ConguerorLib;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = ConguerorLib.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators 
{
	@SubscribeEvent
    public static void gatherData(GatherDataEvent event) 
	{
		ConguerorLib.LOGGER.debug("Starting Server Data Generators");
        DataGenerator generator = event.getGenerator();
        
        if (event.includeServer()) 
        {
        	//generator.addProvider(new RecipesDataGen(generator));
            //generator.addProvider(new LootTablesDataGen(generator));
            //generator.addProvider(new BlockTagsDataGen(generator));
            //generator.addProvider(new ItemTagsDataGen(generator));
        }
        if (event.includeClient()) 
        {
        	ConguerorLib.LOGGER.debug("Starting Client Data Generators");
        	//generator.addProvider(new BlockStatesDataGen(generator, ConguerorTools.MOD_ID, event.getExistingFileHelper()));
            //generator.addProvider(new ItemModelsDataGen(generator, ConguerorTools.MOD_ID, event.getExistingFileHelper()));
            generator.addProvider(new LanguagesDataGen(generator, ConguerorLib.MOD_ID));
        }
    }
}
