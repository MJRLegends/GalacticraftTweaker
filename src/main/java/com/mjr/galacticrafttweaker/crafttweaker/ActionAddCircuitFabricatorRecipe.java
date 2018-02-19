package com.mjr.galacticrafttweaker.crafttweaker;

import micdoodle8.mods.galacticraft.api.recipe.CircuitFabricatorRecipes;
import minetweaker.IUndoableAction;
import minetweaker.api.item.IItemStack;
import minetweaker.api.minecraft.MineTweakerMC;
import net.minecraft.util.NonNullList;

public class ActionAddCircuitFabricatorRecipe implements IUndoableAction {

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
		inputs.add(MineTweakerMC.getItemStack(this.input1));
		inputs.add(MineTweakerMC.getItemStack(this.input2));
		inputs.add(MineTweakerMC.getItemStack(this.input3));
		inputs.add(MineTweakerMC.getItemStack(this.input4));
		inputs.add(MineTweakerMC.getItemStack(this.input5));
		CircuitFabricatorRecipes.addRecipe(MineTweakerMC.getItemStack(this.output), inputs);
	}

	@Override
	public String describe() {
		return "Adding CircuitFabricator Recipe: Input 1 " + this.input1 + " Input 2 " + this.input2 + " Input 3 " + this.input3 + " Input 4 " + this.input4 + " Input 5 " + this.input5 + " to Output " + this.output;
	}

	@Override
	public boolean canUndo() {
		return true;
	}

	@Override
	public String describeUndo() {
		return "Removing CircuitFabricator Recipe: with Output " + this.output;
	}

	@Override
	public Object getOverrideKey() {
		return null;
	}

	@Override
	public void undo() {
		CircuitFabricatorRecipes.removeRecipe(MineTweakerMC.getItemStack(this.output));
	}
}
