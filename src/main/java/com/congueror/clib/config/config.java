package com.congueror.clib.config;

import com.congueror.clib.ConguerorLib;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.config.ModConfig;

@EventBusSubscriber(modid = ConguerorLib.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class Config 
{
    public static final String CATEGORY_GENERAL = "General";
    public static final String CATEGORY_OREGEN = "Ore Generation";
    public static final String SUBCATEGORY_TIN = "Tin Ore";
    public static final String SUBCATEGORY_ALUMINUM = "Aluminum Ore";
    
    public static ForgeConfigSpec SERVER_CONFIG;
    public static ForgeConfigSpec CLIENT_CONFIG;
    
    public static ForgeConfigSpec.IntValue tin_chance;
    public static ForgeConfigSpec.IntValue tin_min;
    public static ForgeConfigSpec.IntValue tin_max;
    public static ForgeConfigSpec.IntValue alum_chance;
    public static ForgeConfigSpec.IntValue alum_min;
    public static ForgeConfigSpec.IntValue alum_max;

    static {

        ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();
        ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();

        CLIENT_BUILDER.comment("General settings").push(CATEGORY_GENERAL); 
        CLIENT_BUILDER.pop();
        
        SERVER_BUILDER.comment("Ore Generation settings").push(CATEGORY_OREGEN);

        setupTinOreConfig(SERVER_BUILDER, CLIENT_BUILDER);
        setupAlumOreConfig(SERVER_BUILDER, CLIENT_BUILDER);


        SERVER_BUILDER.pop();


        SERVER_CONFIG = SERVER_BUILDER.build();
        CLIENT_CONFIG = CLIENT_BUILDER.build();
    }

    private static void setupTinOreConfig(ForgeConfigSpec.Builder SERVER_BUILDER, ForgeConfigSpec.Builder CLIENT_BUILDER) {
        SERVER_BUILDER.comment("Tin Ore settings").push(SUBCATEGORY_TIN);

        tin_chance = SERVER_BUILDER
        		.comment("Maximum number of ore veins per chunk (set 0 to disable spawns) [deafult=15]")
        		.translation("config.tin_chancecomment")
                .defineInRange("config.tin_chance", 15, 0, Integer.MAX_VALUE);
        tin_min = SERVER_BUILDER
        		.comment("Minimum y value the ore can generate at (must always be lower than maximum value) [default=5]")
        		.translation("config.tin_mincomment")
                .defineInRange("config.tin_min", 5, 0, 256);
        tin_max = SERVER_BUILDER
        		.comment("Maximum y value the ore can generate at (must always be higher than minimum value) [default=60]")
        		.translation("config.tin_maxcomment")
                .defineInRange("config.tin_max", 60, 0, 256);

        SERVER_BUILDER.pop();
    }
    
    private static void setupAlumOreConfig(ForgeConfigSpec.Builder SERVER_BUILDER, ForgeConfigSpec.Builder CLIENT_BUILDER) {
        SERVER_BUILDER.comment("Aluminum Ore settings").push(SUBCATEGORY_ALUMINUM);
        alum_chance = SERVER_BUILDER
        		.comment("Maximum number of ore veins per chunk (set 0 to disable spawns) [default=15]")
        		.translation("config.alum_chancecomment")
                .defineInRange("config.alum_chance", 15, 0, Integer.MAX_VALUE);
        alum_min = SERVER_BUILDER
        		.comment("Minimum y value the ore can generate at (must always be lower than maximum value) [default=5]")
        		.translation("config.alum_mincomment")
                .defineInRange("config.alum_min", 5, 0, 256);
        alum_max = SERVER_BUILDER
        		.comment("Maximum y value the ore can generate at (must always be higher than minimum value) [default=60]")
        		.translation("config.alum_maxcomment")
                .defineInRange("config.alum_max", 60, 0, 256);

        SERVER_BUILDER.pop();
    }

    @SubscribeEvent
    public static void onLoad(final ModConfig.Loading configEvent) {

    }

    @SubscribeEvent
    public static void onReload(final ModConfig.Reloading configEvent) 
    {
    	
    }    
}
