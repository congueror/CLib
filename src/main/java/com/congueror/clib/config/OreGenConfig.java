package com.congueror.clib.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OreGenConfig 
{
	public static ForgeConfigSpec.IntValue tin_chance;
	public static ForgeConfigSpec.IntValue tin_min;
	public static ForgeConfigSpec.IntValue tin_max;
	
	public static ForgeConfigSpec.IntValue alum_chance;
	public static ForgeConfigSpec.IntValue alum_min;
	public static ForgeConfigSpec.IntValue alum_max;
	
	public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client) 
	{
		server.comment("Oregen Config");
		
		
		//Default, Min, Max
		
		//Tin
		tin_chance = server
				.comment("Maximum number of ore veins per chunk (set 0 to disable spawns)")
				.defineInRange("oregen.tin_chance", 15, 0, 100000);
		
		tin_min = server
				.comment("Minimum y value the ore can generate at (must always be lower than maximum value)")
				.defineInRange("oregen.tin_min", 5, 1, 256);
		
		tin_max = server
				.comment("Maximum y value the ore can generate at (must always be higher than minimum value)")
				.defineInRange("oregen.tin_max", 60, 1, 256);
		
		//Aluminum
		alum_chance = server
				.comment("Maximum number of ore veins per chunk (set 0 to disable spawns)")
				.defineInRange("oregen.alum_chance", 15, 0, 100000);
		
		alum_min = server
				.comment("Minimum y value the ore can generate at (must always be lower than maximum value)")
				.defineInRange("oregen.alum_min", 5, 1, 256);
		
		alum_max = server
				.comment("Maximum y value the ore can generate at (must always be higher than minimum value)")
				.defineInRange("oregen.alum_max", 60, 1, 256);
		
	}
}
