package com.congueror.clib.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.config.ModConfig;

public class ClibConfig 
{
    public static final String CATEGORY_GENERAL = "General";
    public static final String CATEGORY_OREGEN = "Ore Generation";
    
    public static final String SUBCATEGORY_TIN = "Tin Ore";
    public static final String SUBCATEGORY_ALUMINUM = "Aluminum Ore";
    public static final String SUBCATEGORY_COPPER = "Copper Ore";
    public static final String SUBCATEGORY_RUBY = "Ruby Ore";
    
    public static ForgeConfigSpec spec;
    
    public static ForgeConfigSpec.IntValue tin_chance;
    public static ForgeConfigSpec.IntValue tin_min;
    public static ForgeConfigSpec.IntValue tin_max;
    
    public static ForgeConfigSpec.IntValue alum_chance;
    public static ForgeConfigSpec.IntValue alum_min;
    public static ForgeConfigSpec.IntValue alum_max;
    
    public static ForgeConfigSpec.IntValue copper_chance;
    public static ForgeConfigSpec.IntValue copper_min;
    public static ForgeConfigSpec.IntValue copper_max;
    
    public static ForgeConfigSpec.IntValue ruby_chance;
    public static ForgeConfigSpec.IntValue ruby_min;
    public static ForgeConfigSpec.IntValue ruby_max;
    
    static {
        ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
        
        BUILDER.comment("General Config").push(CATEGORY_GENERAL);
        BUILDER.pop();
        
        BUILDER.comment("Ore Generation Settings").push(CATEGORY_OREGEN);
        
        	BUILDER.comment("Aluminum Settings").push(SUBCATEGORY_ALUMINUM);
        		alum_chance = BUILDER
        				.comment("Maximum number of ore veins per chunk (set 0 to disable spawns) [deafult=15]")
        				.translation("alum_chance_comment")
        				.defineInRange("alum_chance", 20, 0, 50);
        		alum_min = BUILDER
        				.comment("Minimum y value the ore can generate at (must always be lower than maximum value) [default=5]")
        				.translation("alum_min_comment")
        				.defineInRange("alum_min", 0, 0, 255);
        		alum_max = BUILDER
        				.comment("Maximum y value the ore can generate at (must always be higher than minimum value) [default=60]")
        				.translation("alum_max_comment")
        				.defineInRange("alum_max", 60, 0, 255);
        	BUILDER.pop();
        	
        	BUILDER.comment("Tin Settings").push(SUBCATEGORY_TIN);
        		tin_chance = BUILDER
        				.comment("Maximum number of ore veins per chunk (set 0 to disable spawns) [deafult=15]")
        				.translation("tin_chance_comment")
        				.defineInRange("tin_chance", 15, 0, 50);
        		tin_min = BUILDER
        				.comment("Minimum y value the ore can generate at (must always be lower than maximum value) [default=5]")
        				.translation("tin_min_comment")
        				.defineInRange("tin_min", 0, 0, 255);
        		tin_max = BUILDER
        				.comment("Maximum y value the ore can generate at (must always be higher than minimum value) [default=60]")
        				.translation("tin_max_comment")
        				.defineInRange("tin_max", 60, 0, 255);
        	BUILDER.pop();
        	
        	BUILDER.comment("Aluminum Settings").push(SUBCATEGORY_ALUMINUM);
    		copper_chance = BUILDER
    				.comment("Maximum number of ore veins per chunk (set 0 to disable spawns) [deafult=15]")
    				.translation("copper_chance_comment")
    				.defineInRange("copper_chance", 15, 0, 50);
    		copper_min = BUILDER
    				.comment("Minimum y value the ore can generate at (must always be lower than maximum value) [default=5]")
    				.translation("copper_min_comment")
    				.defineInRange("copper_min", 0, 0, 255);
    		copper_max = BUILDER
    				.comment("Maximum y value the ore can generate at (must always be higher than minimum value) [default=60]")
    				.translation("copper_max_comment")
    				.defineInRange("copper_max", 60, 0, 255);
    		BUILDER.pop();
    		
    		BUILDER.comment("Ruby Settings").push(SUBCATEGORY_RUBY);
    		ruby_chance = BUILDER
    				.comment("Maximum number of ore veins per chunk (set 0 to disable spawns) [deafult=15]")
    				.translation("ruby_chance_comment")
    				.defineInRange("ruby_chance", 3, 0, 50);
    		ruby_min = BUILDER
    				.comment("Minimum y value the ore can generate at (must always be lower than maximum value) [default=5]")
    				.translation("ruby_min_comment")
    				.defineInRange("ruby_min", 8, 0, 255);
    		ruby_max = BUILDER
    				.comment("Maximum y value the ore can generate at (must always be higher than minimum value) [default=60]")
    				.translation("ruby_max_comment")
    				.defineInRange("ruby_max", 20, 0, 255);
    		BUILDER.pop();
        BUILDER.pop();
        
        spec = BUILDER.build();
    }
    
    @SubscribeEvent
    public static void onLoad(final ModConfig.Loading configEvent) {

    }

    @SubscribeEvent
    public static void onReload(final ModConfig.Reloading configEvent) {
    }
}
