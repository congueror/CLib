package com.congueror.clib.config;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.common.ForgeConfigSpec;

public class ClibConfig
{
    public static final String CATEGORY_GENERAL = "General";
    public static final String CATEGORY_OREGEN = "Ore Generation";
    public static final String SUBCATEGORY_TIN = "Tin Ore";
    public static final String SUBCATEGORY_ALUMINUM = "Aluminum Ore";
    public static final String SUBCATEGORY_COPPER = "Copper Ore";
    public static final String SUBCATEGORY_RUBY = "Ruby Ore";
    public static final String SUBCATEGORY_LEAD = "Lead Ore";
    public static ForgeConfigSpec spec;
    public static ForgeConfigSpec.BooleanValue tin_gen;
    public static ForgeConfigSpec.IntValue tin_chance;
    public static ForgeConfigSpec.IntValue tin_min;
    public static ForgeConfigSpec.IntValue tin_max;
    public static ForgeConfigSpec.BooleanValue alum_gen;
    public static ForgeConfigSpec.IntValue alum_chance;
    public static ForgeConfigSpec.IntValue alum_min;
    public static ForgeConfigSpec.IntValue alum_max;
    public static ForgeConfigSpec.BooleanValue copper_gen;
    public static ForgeConfigSpec.IntValue copper_chance;
    public static ForgeConfigSpec.IntValue copper_min;
    public static ForgeConfigSpec.IntValue copper_max;
    public static ForgeConfigSpec.BooleanValue ruby_gen;
    public static ForgeConfigSpec.IntValue ruby_chance;
    public static ForgeConfigSpec.IntValue ruby_min;
    public static ForgeConfigSpec.IntValue ruby_max;
    public static ForgeConfigSpec.BooleanValue lead_gen;
    public static ForgeConfigSpec.IntValue lead_chance;
    public static ForgeConfigSpec.IntValue lead_min;
    public static ForgeConfigSpec.IntValue lead_max;
    
    @SubscribeEvent
    public static void onLoad(final ModConfig.Loading configEvent) {
    }
    
    @SubscribeEvent
    public static void onReload(final ModConfig.Reloading configEvent) {
    }
    
    static {
        final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
        BUILDER.comment("General Config").push("General");
        BUILDER.pop();
        BUILDER.comment("Ore Generation Settings").push("Ore Generation");
        BUILDER.comment("Aluminum Settings").push("Aluminum Ore");
        ClibConfig.alum_gen = BUILDER.comment("Set to false to disable spawns [default=true]").translation("clib.config.alum.generate").define("alum_gen", true);
        ClibConfig.alum_chance = BUILDER.comment("Maximum number of ore veins per chunk (set 0 to disable spawns) [deafult=15]").translation("clib.config.alum.chance").defineInRange("alum_chance", 20, 0, 50);
        ClibConfig.alum_min = BUILDER.comment("Minimum y value the ore can generate at (must always be lower than maximum value) [default=5]").translation("clib.config.alum.min").defineInRange("alum_min", 0, 0, 255);
        ClibConfig.alum_max = BUILDER.comment("Maximum y value the ore can generate at (must always be higher than minimum value) [default=60]").translation("clib.config.alum.max").defineInRange("alum_max", 60, 0, 255);
        BUILDER.pop();
        BUILDER.comment("Tin Settings").push("Tin Ore");
        ClibConfig.tin_gen = BUILDER.comment("Set to false to disable spawns [default=true]").translation("clib.config.tin.generate").define("tin_gen", true);
        ClibConfig.tin_chance = BUILDER.comment("Maximum number of ore veins per chunk (set 0 to disable spawns) [deafult=15]").translation("clib.config.tin.chance").defineInRange("tin_chance", 15, 0, 50);
        ClibConfig.tin_min = BUILDER.comment("Minimum y value the ore can generate at (must always be lower than maximum value) [default=5]").translation("clib.config.tin.min").defineInRange("tin_min", 0, 0, 255);
        ClibConfig.tin_max = BUILDER.comment("Maximum y value the ore can generate at (must always be higher than minimum value) [default=60]").translation("clib.config.tin.max").defineInRange("tin_max", 60, 0, 255);
        BUILDER.pop();
        BUILDER.comment("Copper Settings").push("Copper Ore");
        ClibConfig.copper_gen = BUILDER.comment("Set to false to disable spawns [default=true]").translation("clib.config.copper.generate").define("copper_gen", true);
        ClibConfig.copper_chance = BUILDER.comment("Maximum number of ore veins per chunk (set 0 to disable spawns) [deafult=15]").translation("clib.config.copper.chance").defineInRange("copper_chance", 15, 0, 50);
        ClibConfig.copper_min = BUILDER.comment("Minimum y value the ore can generate at (must always be lower than maximum value) [default=5]").translation("clib.config.copper.min").defineInRange("copper_min", 0, 0, 255);
        ClibConfig.copper_max = BUILDER.comment("Maximum y value the ore can generate at (must always be higher than minimum value) [default=60]").translation("clib.config.copper.max").defineInRange("copper_max", 60, 0, 255);
        BUILDER.pop();
        BUILDER.comment("Ruby Settings").push("Ruby Ore");
        ClibConfig.ruby_gen = BUILDER.comment("Set to false to disable spawns [default=true]").translation("clib.config.ruby.generate").define("ruby_gen", true);
        ClibConfig.ruby_chance = BUILDER.comment("Maximum number of ore veins per chunk (set 0 to disable spawns) [deafult=15]").translation("clib.config.ruby.chance").defineInRange("ruby_chance", 3, 0, 50);
        ClibConfig.ruby_min = BUILDER.comment("Minimum y value the ore can generate at (must always be lower than maximum value) [default=5]").translation("clib.config.ruby.min").defineInRange("ruby_min", 8, 0, 255);
        ClibConfig.ruby_max = BUILDER.comment("Maximum y value the ore can generate at (must always be higher than minimum value) [default=60]").translation("clib.config.ruby.max").defineInRange("ruby_max", 20, 0, 255);
        BUILDER.pop();
        BUILDER.comment("Lead Settings").push("Lead Ore");
        ClibConfig.lead_gen = BUILDER.comment("Set to false to disable spawns [default=true]").translation("clib.config.lead.generate").define("lead_gen", true);
        ClibConfig.lead_chance = BUILDER.comment("Maximum number of ore veins per chunk (set 0 to disable spawns) [deafult=15]").translation("lead_chance_comment").defineInRange("lead_chance", 3, 0, 50);
        ClibConfig.lead_min = BUILDER.comment("Minimum y value the ore can generate at (must always be lower than maximum value) [default=5]").translation("lead_min_comment").defineInRange("lead_min", 8, 0, 255);
        ClibConfig.lead_max = BUILDER.comment("Maximum y value the ore can generate at (must always be higher than minimum value) [default=60]").translation("lead_max_comment").defineInRange("lead_max", 20, 0, 255);
        BUILDER.pop();
        BUILDER.pop();
        ClibConfig.spec = BUILDER.build();
    }
}
