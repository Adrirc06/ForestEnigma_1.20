package es.elite.forestenigma.worldgen;

import es.elite.forestenigma.ForestEnigma;
import es.elite.forestenigma.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.ThreeLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.DarkOakFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.DarkOakTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;
import java.util.OptionalInt;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> MOSSY_KEY = registerKey("mossy");

    public static final ResourceKey<ConfiguredFeature<?, ?>> SYLVANITE_ORE_KEY = registerKey("sylvanite_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {

        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceable = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> sylvaniteOres = List.of(OreConfiguration.target(stoneReplaceable,
                ModBlocks.SYLVANITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_SYLVANITE_ORE.get().defaultBlockState()));

        register(context, SYLVANITE_ORE_KEY, Feature.ORE, new OreConfiguration(sylvaniteOres, 12));

        register(context, MOSSY_KEY, Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.MOSSY_WOOD_LOG.get()),
                new DarkOakTrunkPlacer(8, 2, 3),

                BlockStateProvider.simple(ModBlocks.MOSSY_TREE_LEAVES.get()),
                new DarkOakFoliagePlacer(ConstantInt.of(1), ConstantInt.of(0)),

                new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty()))).ignoreVines().build());


    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(ForestEnigma.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
