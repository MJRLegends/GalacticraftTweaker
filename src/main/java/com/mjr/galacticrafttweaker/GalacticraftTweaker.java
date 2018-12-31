package com.mjr.galacticrafttweaker;

import com.mjr.galacticrafttweaker.crafttweaker.CraftTweakerCompatibility;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = GalacticraftTweaker.MODID, version = GalacticraftTweaker.VERSION, dependencies = "required-after:galacticraftcore; required-after:galacticraftplanets; required-after:crafttweaker; required-after:mtlib")
public class GalacticraftTweaker {
	public static final String MODID = "galacticrafttweaker";
	public static final String VERSION = "1.0";

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		CraftTweakerCompatibility.init();
	}
}
