package com.ynu.item;

import com.ynu.YnuMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup YNU_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(YnuMod.MOD_ID, "ynu_group"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.ynu_group"))
                    .icon(() -> new ItemStack(ModItems.GINKGO)).entries((displayContext, entries) -> {
                        entries.add(ModItems.GINKGO);
                        entries.add(ModItems.SHABBY_GINKGO);
                    }).build());
    public static void registerModItemGroups() {
        YnuMod.LOGGER.info("Registering Item Groups");
    }
}
