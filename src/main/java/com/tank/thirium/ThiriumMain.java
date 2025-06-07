package com.tank.thirium;

import net.fabricmc.api.ModInitializer;

public class ThiriumMain implements ModInitializer {
    public static final String MOD_ID = "thirium-mod-id";

    @Override
    public void onInitialize() {
        ModItems.initialize();
        ModPotions.initialize();
        ModBlocks.initialize();
    }
}
