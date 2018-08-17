package com.mjr.galacticrafttweaker.crafttweaker;

import crafttweaker.IAction;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import micdoodle8.mods.galacticraft.api.recipe.CompressorRecipes;

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
