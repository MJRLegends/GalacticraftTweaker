package com.mjr.galacticrafttweaker.crafttweaker;

import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import minetweaker.IUndoableAction;
import minetweaker.api.item.IItemStack;
import minetweaker.api.minecraft.MineTweakerMC;
import net.minecraft.item.ItemStack;

public class ActionAddDungeonLoot implements IUndoableAction  {
	private final int tier;
	private final IItemStack input;
	
	public ActionAddDungeonLoot(int tier, IItemStack input) {
		this.tier = tier;
		this.input = input;
	}

	@Override
	public void apply() {
		GalacticraftRegistry.addDungeonLoot(tier, new ItemStack(MineTweakerMC.getItemStack(input).getItem(), MineTweakerMC.getItemStack(input).getCount(), MineTweakerMC.getItemStack(input).getMetadata()));
	}

	@Override
	public String describe() {
		return "Adding dungeon loot to tier " + tier;
	}


	@Override
	public boolean canUndo() {
		return false;
	}

	@Override
	public String describeUndo() {
		return null;
	}

	@Override
	public Object getOverrideKey() {
		return null;
	}

	@Override
	public void undo() {
		
	}
}
