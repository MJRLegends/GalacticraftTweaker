package com.mjr.galacticrafttweaker;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = GalacticraftTweaker.MODID, version = GalacticraftTweaker.VERSION, dependencies = "required-after:galacticraftcore; required-after:galacticraftplanets; required-after:crafttweaker@[3.0.25.,")
public class GalacticraftTweaker
{
    public static final String MODID = "galacticrafttweaker";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
}
