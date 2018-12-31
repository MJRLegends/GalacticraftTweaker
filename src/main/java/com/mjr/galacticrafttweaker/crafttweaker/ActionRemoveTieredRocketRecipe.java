package com.mjr.galacticrafttweaker.crafttweaker;

import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import minetweaker.IUndoableAction;

public class ActionRemoveTieredRocketRecipe implements IUndoableAction  {
	private final int tier;

	public ActionRemoveTieredRocketRecipe(int tier) {
		this.tier = tier;
	}

	@Override
	public void apply() {
		switch(tier){
		case 1:
			GalacticraftRegistry.removeAllT1RocketRecipes();
			break;
		case 2:
			GalacticraftRegistry.removeAllT2RocketRecipes();
			break;
		case 3:
			GalacticraftRegistry.removeAllT3RocketRecipes();
			break;
		}
	}

	@Override
	public String describe() {
		return "Removing Tier " + tier + " Rocket recipe from NASA Workbench";
	}

	@Override
	public boolean canUndo() {
		return false;
	}

	@Override
	public String describeUndo() {
		return null;
	}

	@Override
	public Object getOverrideKey() {
		return null;
	}

	@Override
	public void undo() {
		
	}

}
