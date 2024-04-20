package net.heyadrian02.tutorial.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.heyadrian02.tutorial.Tutorial;
import net.heyadrian02.tutorial.items.custom.BigSwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BIG_SWORD = registerItem("big_sword",  new BigSwordItem(ToolMaterials.NETHERITE, 5, 4f,new FabricItemSettings().maxCount(1).maxDamage(1000)));

    private static void addItemToCreativeTab(FabricItemGroupEntries entries) {
        entries.add(BIG_SWORD);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Tutorial.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Tutorial.LOGGER.info("Registering mod items for " + Tutorial.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemToCreativeTab);
    }
}
