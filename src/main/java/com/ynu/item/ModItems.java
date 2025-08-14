package com.ynu.item;

import com.ynu.YnuMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item GINKGO = registerItems("ginkgo", new Item(new Item.Settings()));
    public static final Item SHABBY_GINKGO = registerItems("shabby_ginkgo", new Item(new Item.Settings()));






    private static Item registerItems(String name, Item item) {

        return Registry.register(Registries.ITEM, Identifier.of(YnuMod.MOD_ID, name), item);
    }

    // 初始化方法
    public static void registerModItems() {
        YnuMod.LOGGER.info("Registering Items");
    }
}
