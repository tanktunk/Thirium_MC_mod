package com.tank.thirium;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPotions {
    public static final Potion BLUE_BLOOD =
            Registry.register(Registries.POTION, Identifier.of(ThiriumMain.MOD_ID, "blue_blood"),
                    new Potion("blue_blood",
                    new StatusEffectInstance(StatusEffects.SPEED, 600, 3),
                    new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 0),
                    new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 0)));

    public static void initialize() {
        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
            builder.registerPotionRecipe(
                    Potions.WATER,
                    ModItems.THIRIUM,
                    Registries.POTION.getEntry(BLUE_BLOOD)
            );
        });
    }
}
