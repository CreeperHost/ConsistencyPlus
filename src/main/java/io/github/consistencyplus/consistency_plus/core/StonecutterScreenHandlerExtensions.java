package io.github.consistencyplus.consistency_plus.core;

import net.minecraft.item.ItemStack;

import java.util.List;

public interface StonecutterScreenHandlerExtensions {
	boolean optimizedRecipeMode();
	
	List<ItemStack> getRecipeStacks();
}
