package com.mjr.galacticrafttweaker.crafttweaker;

import crafttweaker.IAction;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import micdoodle8.mods.galacticraft.api.recipe.CircuitFabricatorRecipes;

public class ActionRemoveCircuitFabricatorRecipe implements IAction {

	private final IItemStack output;

	public ActionRemoveCircuitFabricatorRecipe(IItemStack output) {
		this.output = output;
	}

	@Override
	public void apply() {
		CircuitFabricatorRecipes.removeRecipe(CraftTweakerMC.getItemStack(this.output));

	}

	@Override
	public String describe() {
		return "Removing CircuitFabricator Recipe: With Output " + this.output;
	}

}
