package com.mjr.galacticrafttweaker.crafttweaker;

import crafttweaker.IAction;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import net.minecraft.item.ItemStack;

public class ActionAddDungeonLoot implements IAction {
	private final int tier;
	private final IItemStack input;
	
	public ActionAddDungeonLoot(int tier, IItemStack input) {
		this.tier = tier;
		this.input = input;
	}

	@Override
	public void apply() {
		GalacticraftRegistry.addDungeonLoot(tier, new ItemStack(CraftTweakerMC.getItemStack(input).getItem(), CraftTweakerMC.getItemStack(input).getCount(), CraftTweakerMC.getItemStack(input).getMetadata()));
	}

	@Override
	public String describe() {
		return "Adding dungeon loot to tier " + tier;
	}

}
