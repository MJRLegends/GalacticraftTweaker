package com.mjr.galacticrafttweaker.crafttweaker;

import java.util.HashMap;

import crafttweaker.CraftTweakerAPI;
import crafttweaker.IAction;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import micdoodle8.mods.galacticraft.core.GCItems;
import micdoodle8.mods.galacticraft.core.recipe.NasaWorkbenchRecipe;
import micdoodle8.mods.galacticraft.planets.asteroids.items.AsteroidsItems;
import micdoodle8.mods.galacticraft.planets.mars.items.MarsItems;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class ActionAddNASATieredRocketRecipe implements IAction {
	private final int tier;
	private final IItemStack[] inputs;
	public ActionAddNASATieredRocketRecipe(int tier, IItemStack[] inputs) {
		this.tier = tier;
		this.inputs = inputs;
	}

	@Override
	public void apply() {
		if(tier == 1 && inputs.length != 14)
			CraftTweakerAPI.logError("Invalid Input Array for adding Tier 1 Rocket Recipe! Amount of inputs needs to be 14!");
		if(tier == 2 && inputs.length != 18)
			CraftTweakerAPI.logError("Invalid Input Array for adding Tier 2 Rocket Recipe! Amount of inputs needs to be 18!");
		if(tier == 3 && inputs.length != 18)
			CraftTweakerAPI.logError("Invalid Input Array for adding Tier 3 Rocket Recipe! Amount of inputs needs to be 18!");
		
		HashMap<Integer, ItemStack> input = new HashMap<>();
        HashMap<Integer, ItemStack> input2;
		for(int i = 1; i < inputs.length + 1; i++) {
			input.put(i, CraftTweakerMC.getItemStack(this.inputs[i - 1]));
		}
		switch(tier) {
			case 1:
		        input.put(15, ItemStack.EMPTY);
		        input.put(16, ItemStack.EMPTY);
		        input.put(17, ItemStack.EMPTY);
				GalacticraftRegistry.addT1RocketRecipe(new NasaWorkbenchRecipe(new ItemStack(GCItems.rocketTier1, 1, 0), input));
		        input2 = new HashMap<Integer, ItemStack>(input);
		        input2.put(15, new ItemStack(Blocks.CHEST));
		        input2.put(16, ItemStack.EMPTY);
		        input2.put(17, ItemStack.EMPTY);
				GalacticraftRegistry.addT1RocketRecipe(new NasaWorkbenchRecipe(new ItemStack(GCItems.rocketTier1, 1, 1), input2));

		        input2 = new HashMap<Integer, ItemStack>(input);
		        input2.put(15, ItemStack.EMPTY);
		        input2.put(16, new ItemStack(Blocks.CHEST));
		        input2.put(17, ItemStack.EMPTY);
				GalacticraftRegistry.addT1RocketRecipe(new NasaWorkbenchRecipe(new ItemStack(GCItems.rocketTier1, 1, 1), input2));

		        input2 = new HashMap<Integer, ItemStack>(input);
		        input2.put(15, ItemStack.EMPTY);
		        input2.put(16, ItemStack.EMPTY);
		        input2.put(17, new ItemStack(Blocks.CHEST));
				GalacticraftRegistry.addT1RocketRecipe(new NasaWorkbenchRecipe(new ItemStack(GCItems.rocketTier1, 1, 1), input2));

		        input2 = new HashMap<Integer, ItemStack>(input);
		        input2.put(15, new ItemStack(Blocks.CHEST));
		        input2.put(16, new ItemStack(Blocks.CHEST));
		        input2.put(17, ItemStack.EMPTY);
				GalacticraftRegistry.addT1RocketRecipe(new NasaWorkbenchRecipe(new ItemStack(GCItems.rocketTier1, 1, 2), input2));

		        input2 = new HashMap<Integer, ItemStack>(input);
		        input2.put(15, new ItemStack(Blocks.CHEST));
		        input2.put(16, ItemStack.EMPTY);
		        input2.put(17, new ItemStack(Blocks.CHEST));
				GalacticraftRegistry.addT1RocketRecipe(new NasaWorkbenchRecipe(new ItemStack(GCItems.rocketTier1, 1, 2), input2));

		        input2 = new HashMap<Integer, ItemStack>(input);
		        input2.put(15, ItemStack.EMPTY);
		        input2.put(16, new ItemStack(Blocks.CHEST));
		        input2.put(17, new ItemStack(Blocks.CHEST));
				GalacticraftRegistry.addT1RocketRecipe(new NasaWorkbenchRecipe(new ItemStack(GCItems.rocketTier1, 1, 2), input2));

		        input2 = new HashMap<Integer, ItemStack>(input);
		        input2.put(15, new ItemStack(Blocks.CHEST));
		        input2.put(16, new ItemStack(Blocks.CHEST));
		        input2.put(17, new ItemStack(Blocks.CHEST));
				GalacticraftRegistry.addT1RocketRecipe(new NasaWorkbenchRecipe(new ItemStack(GCItems.rocketTier1, 1, 3), input2));
				break;
			case 2:
				input.put(19, ItemStack.EMPTY);
		        input.put(20, ItemStack.EMPTY);
		        input.put(21, ItemStack.EMPTY);
				GalacticraftRegistry.addT2RocketRecipe(new NasaWorkbenchRecipe(new ItemStack(MarsItems.rocketMars, 1, 0), input));
		        input2 = new HashMap<Integer, ItemStack>(input);
		        input2.put(19, new ItemStack(Blocks.CHEST));
		        input2.put(20, ItemStack.EMPTY);
		        input2.put(21, ItemStack.EMPTY);
				GalacticraftRegistry.addT2RocketRecipe(new NasaWorkbenchRecipe(new ItemStack(MarsItems.rocketMars, 1, 1), input2));

		        input2 = new HashMap<Integer, ItemStack>(input);
		        input2.put(19, ItemStack.EMPTY);
		        input2.put(20, new ItemStack(Blocks.CHEST));
		        input2.put(21, ItemStack.EMPTY);
				GalacticraftRegistry.addT2RocketRecipe(new NasaWorkbenchRecipe(new ItemStack(MarsItems.rocketMars, 1, 1), input2));

		        input2 = new HashMap<Integer, ItemStack>(input);
		        input2.put(19, ItemStack.EMPTY);
		        input2.put(20, ItemStack.EMPTY);
		        input2.put(21, new ItemStack(Blocks.CHEST));
				GalacticraftRegistry.addT2RocketRecipe(new NasaWorkbenchRecipe(new ItemStack(MarsItems.rocketMars, 1, 1), input2));

		        input2 = new HashMap<Integer, ItemStack>(input);
		        input2.put(19, new ItemStack(Blocks.CHEST));
		        input2.put(20, new ItemStack(Blocks.CHEST));
		        input2.put(21, ItemStack.EMPTY);
				GalacticraftRegistry.addT2RocketRecipe(new NasaWorkbenchRecipe(new ItemStack(MarsItems.rocketMars, 1, 2), input2));

		        input2 = new HashMap<Integer, ItemStack>(input);
		        input2.put(19, new ItemStack(Blocks.CHEST));
		        input2.put(20, ItemStack.EMPTY);
		        input2.put(21, new ItemStack(Blocks.CHEST));
				GalacticraftRegistry.addT2RocketRecipe(new NasaWorkbenchRecipe(new ItemStack(MarsItems.rocketMars, 1, 2), input2));

		        input2 = new HashMap<Integer, ItemStack>(input);
		        input2.put(19, ItemStack.EMPTY);
		        input2.put(20, new ItemStack(Blocks.CHEST));
		        input2.put(21, new ItemStack(Blocks.CHEST));
				GalacticraftRegistry.addT2RocketRecipe(new NasaWorkbenchRecipe(new ItemStack(MarsItems.rocketMars, 1, 2), input2));

		        input2 = new HashMap<Integer, ItemStack>(input);
		        input2.put(19, new ItemStack(Blocks.CHEST));
		        input2.put(20, new ItemStack(Blocks.CHEST));
		        input2.put(21, new ItemStack(Blocks.CHEST));
				GalacticraftRegistry.addT2RocketRecipe(new NasaWorkbenchRecipe(new ItemStack(MarsItems.rocketMars, 1, 3), input2));
				break;
			case 3: 
				input.put(19, ItemStack.EMPTY);
		        input.put(20, ItemStack.EMPTY);
		        input.put(21, ItemStack.EMPTY);
				GalacticraftRegistry.addT3RocketRecipe(new NasaWorkbenchRecipe(new ItemStack(AsteroidsItems.tier3Rocket, 1, 0), input));
		        input2 = new HashMap<Integer, ItemStack>(input);
		        input2.put(19, new ItemStack(Blocks.CHEST));
		        input2.put(20, ItemStack.EMPTY);
		        input2.put(21, ItemStack.EMPTY);
				GalacticraftRegistry.addT3RocketRecipe(new NasaWorkbenchRecipe(new ItemStack(AsteroidsItems.tier3Rocket, 1, 1), input2));

		        input2 = new HashMap<Integer, ItemStack>(input);
		        input2.put(19, ItemStack.EMPTY);
		        input2.put(20, new ItemStack(Blocks.CHEST));
		        input2.put(21, ItemStack.EMPTY);
				GalacticraftRegistry.addT3RocketRecipe(new NasaWorkbenchRecipe(new ItemStack(AsteroidsItems.tier3Rocket, 1, 1), input2));

		        input2 = new HashMap<Integer, ItemStack>(input);
		        input2.put(19, ItemStack.EMPTY);
		        input2.put(20, ItemStack.EMPTY);
		        input2.put(21, new ItemStack(Blocks.CHEST));
				GalacticraftRegistry.addT3RocketRecipe(new NasaWorkbenchRecipe(new ItemStack(AsteroidsItems.tier3Rocket, 1, 1), input2));

		        input2 = new HashMap<Integer, ItemStack>(input);
		        input2.put(19, new ItemStack(Blocks.CHEST));
		        input2.put(20, new ItemStack(Blocks.CHEST));
		        input2.put(21, ItemStack.EMPTY);
				GalacticraftRegistry.addT3RocketRecipe(new NasaWorkbenchRecipe(new ItemStack(AsteroidsItems.tier3Rocket, 1, 2), input2));

		        input2 = new HashMap<Integer, ItemStack>(input);
		        input2.put(19, new ItemStack(Blocks.CHEST));
		        input2.put(20, ItemStack.EMPTY);
		        input2.put(21, new ItemStack(Blocks.CHEST));
				GalacticraftRegistry.addT3RocketRecipe(new NasaWorkbenchRecipe(new ItemStack(AsteroidsItems.tier3Rocket, 1, 2), input2));

		        input2 = new HashMap<Integer, ItemStack>(input);
		        input2.put(19, ItemStack.EMPTY);
		        input2.put(20, new ItemStack(Blocks.CHEST));
		        input2.put(21, new ItemStack(Blocks.CHEST));
				GalacticraftRegistry.addT3RocketRecipe(new NasaWorkbenchRecipe(new ItemStack(AsteroidsItems.tier3Rocket, 1, 2), input2));

		        input2 = new HashMap<Integer, ItemStack>(input);
		        input2.put(19, new ItemStack(Blocks.CHEST));
		        input2.put(20, new ItemStack(Blocks.CHEST));
		        input2.put(21, new ItemStack(Blocks.CHEST));
				GalacticraftRegistry.addT3RocketRecipe(new NasaWorkbenchRecipe(new ItemStack(AsteroidsItems.tier3Rocket, 1, 3), input2));
				break;
		}
	}

	@Override
	public String describe() {
		return "Adding recipe for Tier " + tier + " Rocket for the NASAWorkbench";
	}

}
