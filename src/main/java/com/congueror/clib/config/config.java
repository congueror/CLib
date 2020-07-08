package com.congueror.clib.config;

import java.io.File;
import com.congueror.clib.ConguerorLib;
import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class config 
{
	private static final ForgeConfigSpec.Builder server_builder = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec server_config;
	
	private static final ForgeConfigSpec.Builder client_builder = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec client_config;
	
	static 
	{
		server_config = server_builder.build();
		client_config = client_builder.build();

	}
	
	public static void loadConfig(ForgeConfigSpec config, String path) 
	{
		ConguerorLib.LOGGER.info("Loading Config: " + path);
		final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave().writingMode(WritingMode.REPLACE).build();
		ConguerorLib.LOGGER.info("Build Config: " + path);
		file.load();
		ConguerorLib.LOGGER.info("Loaded Config: " + path);
		config.setConfig(file);
	}
}
