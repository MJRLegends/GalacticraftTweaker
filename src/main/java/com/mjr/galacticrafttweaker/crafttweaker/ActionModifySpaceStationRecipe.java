package com.mjr.galacticrafttweaker.crafttweaker;

import java.util.HashMap;

import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import minetweaker.IUndoableAction;
import minetweaker.api.item.IItemStack;
import minetweaker.api.minecraft.MineTweakerMC;

public class ActionModifySpaceStationRecipe implements IUndoableAction  {

	private final int id;
	private final IItemStack input1;
	private final IItemStack input2;
	private final IItemStack input3;
	private final IItemStack input4;
	private final IItemStack input5;

	public ActionModifySpaceStationRecipe(int id, IItemStack input1, IItemStack input2, IItemStack input3, IItemStack input4, IItemStack input5) {
		this.id = id;
		this.input1 = input1;
		this.input2 = input2;
		this.input3 = input3;
		this.input4 = input4;
		this.input5 = input5;
	}

	@Override
	public void apply() {
		final HashMap<Object, Integer> spaceStationRequirements = new HashMap<Object, Integer>();
		if (this.input1 != null)
			spaceStationRequirements.put(MineTweakerMC.getItemStack(this.input1.amount(1)), MineTweakerMC.getItemStack(this.input1).getCount());
		if (this.input2 != null)
			spaceStationRequirements.put(MineTweakerMC.getItemStack(this.input2.amount(1)), MineTweakerMC.getItemStack(this.input2).getCount());
		if (this.input3 != null)
			spaceStationRequirements.put(MineTweakerMC.getItemStack(this.input3.amount(1)), MineTweakerMC.getItemStack(this.input3).getCount());
		if (this.input4 != null)
			spaceStationRequirements.put(MineTweakerMC.getItemStack(this.input4.amount(1)), MineTweakerMC.getItemStack(this.input4).getCount());
		if (this.input5 != null)
			spaceStationRequirements.put(MineTweakerMC.getItemStack(this.input5.amount(1)), MineTweakerMC.getItemStack(this.input5).getCount());
		GalacticraftRegistry.replaceSpaceStationRecipe(this.id, spaceStationRequirements);
	}

	@Override
	public String describe() {
		return "Replacing SpaceStation recipe for station with id: " + this.id + " Input 1 " + this.input1 + " Input 2 " + this.input2 + " Input 3 " + this.input3 + " Input 4 " + this.input4 + " Input 5 ";
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
