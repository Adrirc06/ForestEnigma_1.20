package es.elite.forestenigma.worldgen.biome;

import es.elite.forestenigma.ForestEnigma;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class ModTerrablender {
    public static void registerBiomes() {
        Regions.register(new ModOverworldRegion(new ResourceLocation(ForestEnigma.MOD_ID, "overworld"),5));
    }
}
