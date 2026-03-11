package com.nocere.bettercamels;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nocere.bettercamels.items.ModItems;

public class BetterCamels implements ModInitializer {
	public static final String MOD_ID = "bettercamels";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}