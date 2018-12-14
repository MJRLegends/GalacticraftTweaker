package com.mjr.galacticrafttweaker.crafttweaker;

import crafttweaker.CraftTweakerAPI;
import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.item.IItemStack;
import stanhebben.zenscript.annotations.Optional;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

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

	@ZenMethod
	public static void addCompressorShapelessRecipe(IItemStack output, @Optional IItemStack input1, @Optional IItemStack input2, @Optional IItemStack input3, @Optional IItemStack input4, @Optional IItemStack input5, @Optional IItemStack input6,
			@Optional IItemStack input7, @Optional IItemStack input8, @Optional IItemStack input9) {
		CraftTweakerAPI.apply(new ActionAddCompressorShapelessRecipe(input1, input2, input3, input4, input5, input6, input7, input8, input9, output));
	}

	@ZenMethod
	public static void removeCompressorRecipe(IItemStack output) {
		CraftTweakerAPI.apply(new ActionRemoveCompressorRecipe(output));
	}
	
	@ZenMethod
	public static void removeNASATier1RocketRecipe() {
		CraftTweakerAPI.apply(new ActionRemoveTieredRocketRecipe(1));
	}
	
	@ZenMethod
	public static void removeNASATier2RocketRecipe() {
		CraftTweakerAPI.apply(new ActionRemoveTieredRocketRecipe(2));
	}
	
	@ZenMethod
	public static void removeNASATier3RocketRecipe() {
		CraftTweakerAPI.apply(new ActionRemoveTieredRocketRecipe(3));
	}
	
	@ZenMethod
	public static void addNASATieredRocketRecipe(int tier, IItemStack[] inputs) {
		CraftTweakerAPI.apply(new ActionAddNASATieredRocketRecipe(tier, inputs));
	}
	
	@ZenMethod
	public static void addDungeonLoot(int tier, IItemStack input) {
		CraftTweakerAPI.apply(new ActionAddDungeonLoot(tier, input));
	}

	@ZenMethod
	public static void modifySpaceStationRecipe(int spaceStationID, IItemStack input1, @Optional IItemStack input2, @Optional IItemStack input3, @Optional IItemStack input4, @Optional IItemStack input5) {
		CraftTweakerAPI.apply(new ActionModifySpaceStationRecipe(spaceStationID, input1, input2, input3, input4, input5));
	}
}
