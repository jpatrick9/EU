package com.example.examplemod; 

import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.common.util.EnumHelper;

import java.awt.Color;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;


@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
	public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";
    public static final MyBlock mb = new MyBlock();
    public static final MyFood mf = new MyFood();
    public static final MySword ms = new MySword();
    public static final MultiBlock mub = new MultiBlock();
    
    @EventHandler
    public void preinit(FMLInitializationEvent event){
    	  }
    
    @EventHandler 
    public void init(FMLInitializationEvent event)
    {
    	MyBiome myb = new MyBiome(25);
    	BiomeDictionary.registerBiomeType(myb, Type.FOREST);
    	BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(myb, 100) );
    	BiomeManager.addSpawnBiome(myb);
    			
    }
}
