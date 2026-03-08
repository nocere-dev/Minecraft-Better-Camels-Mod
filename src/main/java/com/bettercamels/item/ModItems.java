package com.bettercamels.item;

import com.bettercamels.BetterCamels;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;

public class ModItems {

    private static Item registerItem(String name, Item item){
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.From);
    }
    public static void registerModItems(){
        BetterCamels.LOGGER.info("Registering Mod Items for " + BetterCamels.MOD_ID);
    }
}
