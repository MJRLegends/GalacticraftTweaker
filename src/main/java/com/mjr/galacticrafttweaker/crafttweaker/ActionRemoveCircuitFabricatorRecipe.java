package com.mjr.galacticrafttweaker.crafttweaker;

import java.util.List;

import micdoodle8.mods.galacticraft.api.recipe.CircuitFabricatorRecipes;
import micdoodle8.mods.galacticraft.core.client.jei.RecipeCategories;
import micdoodle8.mods.galacticraft.core.client.jei.circuitfabricator.CircuitFabricatorRecipeWrapper;
import minetweaker.IUndoableAction;
import minetweaker.MineTweakerAPI;
import minetweaker.api.item.IItemStack;
import minetweaker.api.minecraft.MineTweakerMC;

public class ActionRemoveCircuitFabricatorRecipe implements IUndoableAction {

	private final IItemStack output;

	public ActionRemoveCircuitFabricatorRecipe(IItemStack output) {
		this.output = output;
	}

	@Override
	public void apply() {
		CircuitFabricatorRecipes.removeRecipe(MineTweakerMC.getItemStack(this.output));
		int count = 0;
		for (List<Object> entry : CircuitFabricatorRecipes.getRecipes()) {
			if (CircuitFabricatorRecipes.getOutput(count).equals(this.output))
				MineTweakerAPI.getIjeiRecipeRegistry().removeRecipe(new CircuitFabricatorRecipeWrapper(entry, CircuitFabricatorRecipes.getOutput(count)), RecipeCategories.CIRCUIT_FABRICATOR_ID);
			else
				count++;
		}
	}

	@Override
	public String describe() {
		return "Removing CircuitFabricator Recipe: With Output " + this.output;
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
