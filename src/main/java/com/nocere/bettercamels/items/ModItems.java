package com.nocere.bettercamels.items;
import com.nocere.bettercamels.BetterCamels;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static Item LEATHER_CAMEL_ARMOUR_ITEM;
    public static Item IRON_CAMEL_ARMOUR_ITEM;
    public static Item GOLD_CAMEL_ARMOUR_ITEM;
    public static Item DIAMOND_CAMEL_ARMOUR_ITEM;
    public static Item NETHERITE_CAMEL_ARMOUR_ITEM;

    private static Item registerItem(String name){
        Identifier id = Identifier.of(BetterCamels.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        Item.Settings settings = new Item.Settings().registryKey(key);

        return Registry.register(Registries.ITEM, key , new Item(settings));
    }
	
    public static void registerModItems(){
        BetterCamels.LOGGER.info("Registering Mod Items for: " + BetterCamels.MOD_ID);

        LEATHER_CAMEL_ARMOUR_ITEM = registerItem("leather_camel_armour_item");
        IRON_CAMEL_ARMOUR_ITEM = registerItem("iron_camel_armour_item");
        GOLD_CAMEL_ARMOUR_ITEM = registerItem("gold_camel_armour_item");
        DIAMOND_CAMEL_ARMOUR_ITEM = registerItem("diamond_camel_armour_item");
        NETHERITE_CAMEL_ARMOUR_ITEM = registerItem("netherite_camel_armour_item");


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(LEATHER_CAMEL_ARMOUR_ITEM);
            fabricItemGroupEntries.add(IRON_CAMEL_ARMOUR_ITEM);
            fabricItemGroupEntries.add(GOLD_CAMEL_ARMOUR_ITEM);
            fabricItemGroupEntries.add(DIAMOND_CAMEL_ARMOUR_ITEM);
            fabricItemGroupEntries.add(NETHERITE_CAMEL_ARMOUR_ITEM);
        });
    }
}