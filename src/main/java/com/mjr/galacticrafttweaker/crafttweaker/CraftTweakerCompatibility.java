package com.mjr.galacticrafttweaker.crafttweaker;

import minetweaker.MineTweakerAPI;
import minetweaker.api.item.IItemStack;
import stanhebben.zenscript.annotations.Optional;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenClass("mods.GalacticraftTweaker")
public class CraftTweakerCompatibility {

	public static void init() {
		MineTweakerAPI.registerClass(CraftTweakerCompatibility.class);
	}

	@ZenMethod
	public static void addCircuitFabricatorRecipe(IItemStack output, IItemStack input1, IItemStack input2, IItemStack input3, IItemStack input4, IItemStack input5) {
		MineTweakerAPI.apply(new ActionAddCircuitFabricatorRecipe(input1, input2, input3, input4, input5, output));
	}

	@ZenMethod
	public static void removeCircuitFabricatorRecipe(IItemStack output) {
		MineTweakerAPI.apply(new ActionRemoveCircuitFabricatorRecipe(output));
	}

	@ZenMethod
	public static void addCompressorShapelessRecipe(IItemStack output, @Optional IItemStack input1, @Optional IItemStack input2, @Optional IItemStack input3, @Optional IItemStack input4, @Optional IItemStack input5, @Optional IItemStack input6,
			@Optional IItemStack input7, @Optional IItemStack input8, @Optional IItemStack input9) {
		MineTweakerAPI.apply(new ActionAddCompressorShapelessRecipe(input1, input2, input3, input4, input5, input6, input7, input8, input9, output));
	}

	@ZenMethod
	public static void removeCompressorRecipe(IItemStack output) {
		MineTweakerAPI.apply(new ActionRemoveCompressorRecipe(output));
	}

	@ZenMethod
	public static void removeNASATier1RocketRecipe() {
		MineTweakerAPI.apply(new ActionRemoveTieredRocketRecipe(1));
	}

	@ZenMethod
	public static void removeNASATier2RocketRecipe() {
		MineTweakerAPI.apply(new ActionRemoveTieredRocketRecipe(2));
	}

	@ZenMethod
	public static void removeNASATier3RocketRecipe() {
		MineTweakerAPI.apply(new ActionRemoveTieredRocketRecipe(3));
	}

	@ZenMethod
	public static void addNASATieredRocketRecipe(int tier, IItemStack[] inputs) {
		MineTweakerAPI.apply(new ActionAddNASATieredRocketRecipe(tier, inputs));
	}

	@ZenMethod
	public static void addDungeonLoot(int tier, IItemStack input) {
		MineTweakerAPI.apply(new ActionAddDungeonLoot(tier, input));
	}

	@ZenMethod
	public static void modifySpaceStationRecipe(int spaceStationID, IItemStack input1, @Optional IItemStack input2, @Optional IItemStack input3, @Optional IItemStack input4, @Optional IItemStack input5) {
		MineTweakerAPI.apply(new ActionModifySpaceStationRecipe(spaceStationID, input1, input2, input3, input4, input5));
	}
}
