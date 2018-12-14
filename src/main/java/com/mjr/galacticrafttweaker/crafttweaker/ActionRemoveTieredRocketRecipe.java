package com.mjr.galacticrafttweaker.crafttweaker;

import crafttweaker.IAction;
import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;

public class ActionRemoveTieredRocketRecipe implements IAction {
	private final int tier;

	public ActionRemoveTieredRocketRecipe(int tier) {
		this.tier = tier;
	}

	@Override
	public void apply() {
		switch(tier){
		case 1:
			GalacticraftRegistry.getRocketT1Recipes().removeAll(GalacticraftRegistry.getRocketT1Recipes());
			break;
		case 2:
			GalacticraftRegistry.getRocketT2Recipes().removeAll(GalacticraftRegistry.getRocketT2Recipes());
			break;
		case 3:
			GalacticraftRegistry.getRocketT3Recipes().removeAll(GalacticraftRegistry.getRocketT3Recipes());
			break;
		}
	}

	@Override
	public String describe() {
		return "Removing Tier " + tier + " Rocket recipe from NASA Workbench";
	}

}
