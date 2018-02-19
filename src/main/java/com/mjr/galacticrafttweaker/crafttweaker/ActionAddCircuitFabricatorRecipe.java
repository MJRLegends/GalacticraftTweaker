package com.mjr.galacticrafttweaker.crafttweaker;

import micdoodle8.mods.galacticraft.api.recipe.CircuitFabricatorRecipes;
import net.minecraft.util.NonNullList;
import crafttweaker.IAction;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;

public class ActionAddCircuitFabricatorRecipe implements IAction {

	private final IItemStack input1;
	private final IItemStack input2;
	private final IItemStack input3;
	private final IItemStack input4;
	private final IItemStack input5;
	private final IItemStack output;

	public ActionAddCircuitFabricatorRecipe(IItemStack input1, IItemStack input2, IItemStack input3, IItemStack input4, IItemStack input5, IItemStack output) {
		this.input1 = input1;
		this.input2 = input2;
		this.input3 = input3;
		this.input4 = input4;
		this.input5 = input5;
		this.output = output;
	}

	@Override
	public void apply() {
		NonNullList<Object> inputs = NonNullList.create();
		inputs.add(CraftTweakerMC.getItemStack(this.input1));
		inputs.add(CraftTweakerMC.getItemStack(this.input2));
		inputs.add(CraftTweakerMC.getItemStack(this.input3));
		inputs.add(CraftTweakerMC.getItemStack(this.input4));
		inputs.add(CraftTweakerMC.getItemStack(this.input5));
		CircuitFabricatorRecipes.addRecipe(CraftTweakerMC.getItemStack(this.output), inputs);
	}

	@Override
	public String describe() {
		return "Adding CircuitFabricator Recipe: Input 1 " + this.input1 + " Input 2 " + this.input2 + " Input 3 " + this.input3 + " Input 4 " + this.input4 + " Input 5 " + this.input5 + " to Output " + this.output;
	}

}
