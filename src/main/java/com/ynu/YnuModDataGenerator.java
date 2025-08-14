package com.ynu;
import com.ynu.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class YnuModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack1 = fabricDataGenerator.createPack();
		pack1.addProvider(ModModelsProvider::new);
		pack1.addProvider(ModENLangProvider::new);
		pack1.addProvider(ModLootTableProvider::new);
		pack1.addProvider(ModRecipesProvider::new);
		pack1.addProvider(ModCNLangProvider::new);
		pack1.addProvider(ModAdProvider::new);
	}
}
