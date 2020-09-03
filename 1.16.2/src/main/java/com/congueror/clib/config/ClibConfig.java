package com.congueror.clib.config;

import com.congueror.clib.ConguerorLib;
import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLPaths;

public class ClibConfig 
{   
    public static ForgeConfigSpec clientSpec;
    public static ForgeConfigSpec serverSpec;
    
    public static ForgeConfigSpec.BooleanValue tin_gen;
    public static ForgeConfigSpec.IntValue tin_chance;
    public static ForgeConfigSpec.IntValue tin_veinsize;
    public static ForgeConfigSpec.IntValue tin_max;
    
    public static ForgeConfigSpec.BooleanValue aluminum_gen;
    public static ForgeConfigSpec.IntValue aluminum_chance;
    public static ForgeConfigSpec.IntValue aluminum_veinsize;
    public static ForgeConfigSpec.IntValue aluminum_max;
    
    public static ForgeConfigSpec.BooleanValue copper_gen;
    public static ForgeConfigSpec.IntValue copper_chance;
    public static ForgeConfigSpec.IntValue copper_veinsize;
    public static ForgeConfigSpec.IntValue copper_max;
    
    public static ForgeConfigSpec.BooleanValue ruby_gen;
    public static ForgeConfigSpec.IntValue ruby_chance;
    public static ForgeConfigSpec.IntValue ruby_veinsize;
    public static ForgeConfigSpec.IntValue ruby_max;
    
    public static ForgeConfigSpec.BooleanValue lead_gen;
    public static ForgeConfigSpec.IntValue lead_chance;
    public static ForgeConfigSpec.IntValue lead_veinsize;
    public static ForgeConfigSpec.IntValue lead_max;
    
    public static final String ORES = "Ores";
    
    public static void init() {
    	//Client config
    	ForgeConfigSpec.Builder clientBuilder = new ForgeConfigSpec.Builder();
    	clientSpec = clientBuilder.build();
		ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, clientSpec);
		
		//Server config
		ForgeConfigSpec.Builder serverBuilder = new ForgeConfigSpec.Builder();
		serverBuilder.push(ORES);
		
		tin_gen = serverBuilder.comment("Generate this ore?").translation("config.clib.tin_gen").define("tin_gen", true);
		tin_chance = serverBuilder.comment("Attempts to spawn per chunk").translation("config.clib.tin_gen").defineInRange("tin_chance", 20, 1, 100);
		tin_max = serverBuilder.comment("Maximum height ore can spawn").translation("config.clib.tin_gen").defineInRange("tin_max", 60, 1, 255);
		tin_veinsize = serverBuilder.comment("Size of spawned veins").translation("config.clib.tin_gen").defineInRange("tin_veinsize", 8, 1, 20);
		
		aluminum_gen = serverBuilder.comment("Generate this ore?").translation("config.clib.aluminum_gen").define("aluminum_gen", true);
		aluminum_chance = serverBuilder.comment("Attempts to spawn per chunk").translation("config.clib.aluminum_gen").defineInRange("aluminum_chance", 15, 1, 100);
		aluminum_max = serverBuilder.comment("Maximum height ore can spawn").translation("config.clib.aluminum_gen").defineInRange("aluminum_max", 60, 1, 255);
		aluminum_veinsize = serverBuilder.comment("Size of spawned veins").translation("config.clib.aluminum_gen").defineInRange("aluminum_veinsize", 8, 1, 20);
		
		copper_gen = serverBuilder.comment("Generate this ore?").translation("config.clib.copper_gen").define("copper_gen", true);
		copper_chance = serverBuilder.comment("Attempts to spawn per chunk").translation("config.clib.copper_gen").defineInRange("copper_chance", 20, 1, 100);
		copper_max = serverBuilder.comment("Maximum height ore can spawn").translation("config.clib.copper_gen").defineInRange("copper_max", 60, 1, 255);
		copper_veinsize = serverBuilder.comment("Size of spawned veins").translation("config.clib.copper_gen").defineInRange("copper_veinsize", 8, 1, 20);
		
		ruby_gen = serverBuilder.comment("Generate this ore?").translation("config.clib.ruby_gen").define("ruby_gen", true);
		ruby_chance = serverBuilder.comment("Attempts to spawn per chunk").translation("config.clib.ruby_gen").defineInRange("ruby_chance", 4, 1, 100);
		ruby_max = serverBuilder.comment("Maximum height ore can spawn").translation("config.clib.ruby_gen").defineInRange("ruby_max", 18, 1, 255);
		ruby_veinsize = serverBuilder.comment("Size of spawned veins").translation("config.clib.ruby_gen").defineInRange("ruby_veinsize", 3, 1, 20);
		
		lead_gen = serverBuilder.comment("Generate this ore?").translation("config.clib.lead_gen").define("lead_gen", true);
		lead_chance = serverBuilder.comment("Attempts to spawn per chunk").translation("config.clib.lead_gen").defineInRange("lead_chance", 12, 1, 100);
		lead_max = serverBuilder.comment("Maximum height ore can spawn").translation("config.clib.lead_gen").defineInRange("lead_max", 60, 1, 255);
		lead_veinsize = serverBuilder.comment("Size of spawned veins").translation("config.clib.lead_gen").defineInRange("lead_veinsize", 8, 1, 20);
		
		serverBuilder.pop();
		serverSpec = serverBuilder.build();
		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, serverSpec);
    }
    
    public static void load(){
		CommentedFileConfig clientConfig = CommentedFileConfig.builder(FMLPaths.CONFIGDIR.get().resolve(ConguerorLib.MOD_ID + "-client.toml")).sync().autosave().writingMode(WritingMode.REPLACE).build();
		clientConfig.load();
		clientSpec.setConfig(clientConfig);

		CommentedFileConfig serverConfig = CommentedFileConfig.builder(FMLPaths.CONFIGDIR.get().resolve(ConguerorLib.MOD_ID + "-server.toml")).sync().autosave().writingMode(WritingMode.REPLACE).build();
		serverConfig.load();
		serverSpec.setConfig(serverConfig);
	}
}
