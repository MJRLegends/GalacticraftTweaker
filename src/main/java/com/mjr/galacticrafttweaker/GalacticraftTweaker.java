package com.mjr.galacticrafttweaker;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = GalacticraftTweaker.MODID, version = GalacticraftTweaker.VERSION, dependencies = "required-after:galacticraftcore@[4.0.1.181,); required-after:galacticraftplanets@[4.0.1.181,); required-after:crafttweaker@[3.0.25.,); after:extraplanets;", certificateFingerprint = "b02331787272ec3515ebe63ecdeea0d746653468")
public class GalacticraftTweaker {
	public static final String MODID = "galacticrafttweaker";
	public static final String VERSION = "1.12.2-1.0.2";
	public static final Logger logger = LogManager.getLogger("galacticrafttweaker");

	@EventHandler
	public void init(FMLInitializationEvent event) {
	}

	@EventHandler
	public void onFingerprintViolation(FMLFingerprintViolationEvent event) {
		logger.fatal(MODID + " Invalid fingerprint detected! The file " + event.getSource().getName() + " may have been tampered with. This version will NOT be supported!");
	}
}
