package com.mjr.galacticrafttweaker.crafttweaker;

import micdoodle8.mods.galacticraft.api.recipe.CompressorRecipes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import crafttweaker.IAction;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;

public class ActionAddCompressorShapelessRecipe implements IAction {

	private final IItemStack input1;
	private final IItemStack input2;
	private final IItemStack input3;
	private final IItemStack input4;
	private final IItemStack input5;
	private final IItemStack input6;
	private final IItemStack input7;
	private final IItemStack input8;
	private final IItemStack input9;
	private final IItemStack output;

	public ActionAddCompressorShapelessRecipe(IItemStack input1, IItemStack input2, IItemStack input3, IItemStack input4, IItemStack input5, IItemStack input6, IItemStack input7, IItemStack input8, IItemStack input9, IItemStack output) {
		this.input1 = input1;
		this.input2 = input2;
		this.input3 = input3;
		this.input4 = input4;
		this.input5 = input5;
		this.input6 = input6;
		this.input7 = input7;
		this.input8 = input8;
		this.input9 = input9;
		this.output = output;
	}

	@Override
	public void apply() {
		NonNullList<ItemStack> inputs = NonNullList.create();
		if (this.input1 != null)
			inputs.add(CraftTweakerMC.getItemStack(this.input1));
		if (this.input2 != null)
			inputs.add(CraftTweakerMC.getItemStack(this.input2));
		if (this.input3 != null)
			inputs.add(CraftTweakerMC.getItemStack(this.input3));
		if (this.input4 != null)
			inputs.add(CraftTweakerMC.getItemStack(this.input4));
		if (this.input5 != null)
			inputs.add(CraftTweakerMC.getItemStack(this.input5));
		if (this.input6 != null)
			inputs.add(CraftTweakerMC.getItemStack(this.input6));
		if (this.input7 != null)
			inputs.add(CraftTweakerMC.getItemStack(this.input7));
		if (this.input8 != null)
			inputs.add(CraftTweakerMC.getItemStack(this.input8));
		if (this.input9 != null)
			inputs.add(CraftTweakerMC.getItemStack(this.input9));
		CompressorRecipes.addShapelessRecipe(CraftTweakerMC.getItemStack(this.output), inputs.toArray());
	}

	@Override
	public String describe() {
		return "Adding Compressor Recipe: Input 1 " + this.input1 + " Input 2 " + this.input2 + " Input 3 " + this.input3 + " Input 4 " + this.input4 + " Input 5 " + this.input5 + " Input 6 " + this.input6 + " Input 7 " + this.input7 + " Input 8 "
				+ this.input8 + " Input 9 " + this.input9 + " to Output " + this.output;
	}

}
