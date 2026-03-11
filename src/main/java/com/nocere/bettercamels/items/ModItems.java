package com.nocere.bettercamels.items;
import com.nocere.bettercamels.BetterCamels;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item LEATHER_CAMEL_ARMOUR_ITEM = registerItem("leather_camel_armour_item", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(BetterCamels.MOD_ID, name), item);
    }
	
    public static void registerModItems(){
        BetterCamels.LOGGER.info("Registering Mod Items for: " + BetterCamels.MOD_ID);
    }

}