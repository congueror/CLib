package com.congueror.clib.init;

import com.congueror.clib.CLib;
import com.congueror.clib.items.CoalNuggetItem;
import com.congueror.clib.items.HammerItem;
import com.congueror.clib.items.HazmatSuitItem;
import com.congueror.clib.items.LeadDustItem;
import com.congueror.clib.items.TreeTapItem;
import com.congueror.clib.items.UraniumDustItem;
import com.congueror.clib.items.UraniumIngotItem;
import com.congueror.clib.items.UraniumNuggetItem;
import com.congueror.clib.util.ClibItemGroup;
import com.congueror.clib.util.ModArmorMaterial;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit 
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CLib.MOD_ID);
    
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> TIN_DUST = ITEMS.register("tin_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> STEEL_BLEND = ITEMS.register("steel_blend", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> STEEL_DUST = ITEMS.register("steel_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> ALUMINUM_DUST = ITEMS.register("aluminum_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
	public static final RegistryObject<Item> LEAD_DUST = ITEMS.register("lead_dust", ()-> new LeadDustItem(new Item.Properties().group(ClibItemGroup.instance).food(CLibFoods.LEAD_DUST)));
    
    public static final RegistryObject<Item> COAL_NUGGET = ITEMS.register("coal_nugget", ()-> new CoalNuggetItem(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> RUBY_DUST = ITEMS.register("ruby_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> SILVER_DUST = ITEMS.register("silver_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> LUMIUM_INGOT = ITEMS.register("lumium_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> LUMIUM_NUGGET = ITEMS.register("lumium_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> LUMIUM_BLEND = ITEMS.register("lumium_blend", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> LUMIUM_DUST = ITEMS.register("lumium_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> NICKEL_DUST = ITEMS.register("nickel_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> INVAR_INGOT = ITEMS.register("invar_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> INVAR_NUGGET = ITEMS.register("invar_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> INVAR_BLEND = ITEMS.register("invar_blend", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> INVAR_DUST = ITEMS.register("invar_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> ELECTRUM_INGOT = ITEMS.register("electrum_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> ELECTRUM_NUGGET = ITEMS.register("electrum_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> ELECTRUM_BLEND = ITEMS.register("electrum_blend", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> ELECTRUM_DUST = ITEMS.register("electrum_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> PYROTHEUM_DUST = ITEMS.register("pyrotheum_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> SULFUR_DUST = ITEMS.register("sulfur_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> PLATINUM_DUST = ITEMS.register("platinum_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> ENDERIUM_INGOT = ITEMS.register("enderium_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> ENDERIUM_NUGGET = ITEMS.register("enderium_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> ENDERIUM_BLEND = ITEMS.register("enderium_blend", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> ENDERIUM_DUST = ITEMS.register("enderium_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> SIGNALUM_INGOT = ITEMS.register("signalum_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> SIGNALUM_NUGGET = ITEMS.register("signalum_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> SIGNALUM_BLEND = ITEMS.register("signalum_blend", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> SIGNALUM_DUST = ITEMS.register("signalum_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> TUNGSTEN_NUGGET = ITEMS.register("tungsten_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> TUNGSTEN_DUST = ITEMS.register("tungsten_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> BRONZE_BLEND = ITEMS.register("bronze_blend", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> BRONZE_DUST = ITEMS.register("bronze_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> AMETHYST_DUST = ITEMS.register("amethyst_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> SAPPHIRE_DUST = ITEMS.register("sapphire_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> OPAL = ITEMS.register("opal", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> OPAL_DUST = ITEMS.register("opal_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> TITANIUM_SCRAP = ITEMS.register("titanium_scrap", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> TITANIUM_DUST = ITEMS.register("titanium_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot", ()-> new UraniumIngotItem(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> URANIUM_NUGGET = ITEMS.register("uranium_nugget", ()-> new UraniumNuggetItem(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> URANIUM_DUST = ITEMS.register("uranium_dust", ()-> new UraniumDustItem(new Item.Properties().group(ClibItemGroup.instance).food(CLibFoods.URANIUM_DUST)));
    
    public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> COBALT_NUGGET = ITEMS.register("cobalt_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> COBALT_DUST = ITEMS.register("cobalt_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> ZINC_DUST = ITEMS.register("zinc_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> SALTPETRE_DUST = ITEMS.register("saltpetre_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> RUBBER = ITEMS.register("rubber", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> TREE_TAP = ITEMS.register("tree_tap", ()-> new TreeTapItem(new Item.Properties().group(ClibItemGroup.instance).maxStackSize(1)));
    
    public static final RegistryObject<Item> HAZMAT_HELM = ITEMS.register("hazmat_scuba_helmet", ()-> new HazmatSuitItem(ModArmorMaterial.HAZMAT, EquipmentSlotType.HEAD, new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> HAZMAT_CHEST = ITEMS.register("hazmat_suit", ()-> new HazmatSuitItem(ModArmorMaterial.HAZMAT, EquipmentSlotType.CHEST, new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> HAZMAT_LEGS = ITEMS.register("hazmat_suit_legs", ()-> new HazmatSuitItem(ModArmorMaterial.HAZMAT, EquipmentSlotType.LEGS, new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> HAZMAT_BOOTS = ITEMS.register("rubber_boots", ()-> new HazmatSuitItem(ModArmorMaterial.HAZMAT, EquipmentSlotType.FEET, new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> BRASS_INGOT = ITEMS.register("brass_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> BRASS_NUGGET = ITEMS.register("brass_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> BRASS_BLEND = ITEMS.register("brass_blend", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> BRASS_DUST = ITEMS.register("brass_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> CHROMIUM_INGOT = ITEMS.register("chromium_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> CHROMIUM_NUGGET = ITEMS.register("chromium_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> CHROMIUM_DUST = ITEMS.register("chromium_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> THORIUM_INGOT = ITEMS.register("thorium_ingot", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> THORIUM_NUGGET = ITEMS.register("thorium_nugget", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> THORIUM_DUST = ITEMS.register("thorium_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    
    public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register("iron_hammer", ()-> new HammerItem(new Item.Properties().group(ClibItemGroup.instance).maxDamage(46)));
    public static final RegistryObject<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer", ()-> new HammerItem(new Item.Properties().group(ClibItemGroup.instance).maxDamage(96)));
    public static final RegistryObject<Item> NETHERITE_HAMMER = ITEMS.register("netherite_hammer", ()-> new HammerItem(new Item.Properties().group(ClibItemGroup.instance).maxDamage(146)));
    
    public static final RegistryObject<Item> COAL_DUST = ITEMS.register("coal_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> GOLD_DUST = ITEMS.register("gold_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> LAPIS_DUST = ITEMS.register("lapis_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> QUARTZ_DUST = ITEMS.register("quartz_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> DIAMOND_DUST = ITEMS.register("diamond_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> EMERALD_DUST = ITEMS.register("emerald_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
    public static final RegistryObject<Item> NETHERITE_DUST = ITEMS.register("netherite_dust", ()-> new Item(new Item.Properties().group(ClibItemGroup.instance)));
}
