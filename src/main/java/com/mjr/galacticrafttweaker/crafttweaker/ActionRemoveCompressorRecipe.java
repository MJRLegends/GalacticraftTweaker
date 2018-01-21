package com.mjr.galacticrafttweaker.crafttweaker;

import micdoodle8.mods.galacticraft.api.recipe.CompressorRecipes;
import crafttweaker.IAction;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;

public class ActionRemoveCompressorRecipe implements IAction {

	private final IItemStack output;

	public ActionRemoveCompressorRecipe(IItemStack output) {
		this.output = output;
	}

	@Override
	public void apply() {
		CompressorRecipes.removeRecipe(CraftTweakerMC.getItemStack(this.output));
	}

	@Override
	public String describe() {
		return "Removing Compressor Recipe: for Output " + this.output;
	}

}
