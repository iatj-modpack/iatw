package com.kckarnige.iatw.items;

import com.kckarnige.iatw.Iatw;

import io.wispforest.lavender.book.LavenderBookItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

    public static final Item IATJGuideBook = LavenderBookItem.registerForBook(Identifier.of(Iatw.MOD_ID,"iatjourney_getting_started"), new Item.Settings().rarity(Rarity.UNCOMMON).maxCount(1));

    private static void addItemToItemGroup(FabricItemGroupEntries entries) {
        entries.add(IATJGuideBook);
    }

    private static Item registerItem (String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Iatw.MOD_ID, name), item);
    }

    public static void registerModItems () {
        Iatw.LOGGER.info("[It's About The...What?] This is your captain speaking, you're in good hands! ^^");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemToItemGroup);
    }
}