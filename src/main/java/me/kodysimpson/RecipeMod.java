package me.kodysimpson;

import me.kodysimpson.items.Moonshine;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RecipeMod implements ModInitializer {

	//You can find the list of item ids here: https://minecraft.fandom.com/wiki/Java_Edition_data_values#Items
	//You can see the information needed for each recipe type here: https://minecraft.fandom.com/wiki/Recipe#List_of_recipe_types
	public static final Item MOONSHINE = new Moonshine();

	@Override
	public void onInitialize() {

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
			entries.add(MOONSHINE);
		});

		Registry.register(Registries.ITEM, new Identifier("item-recipes", "moonshine"), MOONSHINE);
	}
}
