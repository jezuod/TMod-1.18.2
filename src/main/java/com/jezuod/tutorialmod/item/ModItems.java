package com.jezuod.tutorialmod.item;

import com.jezuod.tutorialmod.TutorialMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.awt.event.InputEvent;

public class ModItems {
    //alt +  enter --> import
    //method to let know forge that the items are of this mod
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> RAW_CITRINE = ITEMS.register("raw_citrine",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> INGOT_STEEL = ITEMS.register("ingot_steel",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static void register(IEventBus eventbus)
    {
        ITEMS.register(eventbus);
    }
}
