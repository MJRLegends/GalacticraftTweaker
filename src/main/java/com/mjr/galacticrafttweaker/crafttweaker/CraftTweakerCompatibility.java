package com.mjr.galacticrafttweaker.crafttweaker;

import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;
import crafttweaker.CraftTweakerAPI;
import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.item.IItemStack;

@ZenRegister
@ZenClass("mods.GalacticraftTweaker")
public class CraftTweakerCompatibility {

	@ZenMethod
	public static void addCircuitFabricatorRecipe(IItemStack output, IItemStack input1, IItemStack input2, IItemStack input3, IItemStack input4, IItemStack input5) {
		CraftTweakerAPI.apply(new ActionAddCircuitFabricatorRecipe(input1, input2, input3, input4, input5, output));
	}

	@ZenMethod
	public static void removeCircuitFabricatorRecipe(IItemStack output) {
		CraftTweakerAPI.apply(new ActionRemoveCircuitFabricatorRecipe(output));
	}
}
