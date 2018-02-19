package com.mjr.galacticrafttweaker.crafttweaker;

import micdoodle8.mods.galacticraft.api.recipe.CircuitFabricatorRecipes;
import minetweaker.IUndoableAction;
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
