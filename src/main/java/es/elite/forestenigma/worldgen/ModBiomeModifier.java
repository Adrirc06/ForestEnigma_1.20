package es.elite.forestenigma.worldgen;

import es.elite.forestenigma.ForestEnigma;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomeModifier {

    public static final ResourceKey<BiomeModifier> ADD_SYLVANITE_ORE = registerKey("add_sylvanite_ore");

    //public static final ResourceKey<BiomeModifier> ADD_MOSSY_TREE = registerKey("add_mossy_tree");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeature = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_SYLVANITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.LUSH_CAVES)),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.SYLVANITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

//        context.register(ADD_MOSSY_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
//                HolderSet.direct(biomes.getOrThrow(Biomes.PLAINS)),
//                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.MOSSY_TREE_PLACED_KEY)),
//                GenerationStep.Decoration.VEGETAL_DECORATION
//        ));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(ForestEnigma.MOD_ID, name));
    }

}
