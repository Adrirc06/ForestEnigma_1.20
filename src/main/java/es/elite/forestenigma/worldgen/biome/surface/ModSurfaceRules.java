package es.elite.forestenigma.worldgen.biome.surface;


import es.elite.forestenigma.block.ModBlocks;
import es.elite.forestenigma.worldgen.biome.ModBiomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;

public class ModSurfaceRules {
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);
    private static final SurfaceRules.RuleSource GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final SurfaceRules.RuleSource MOSSY_WOOD_LOG = makeStateRule(ModBlocks.MOSSY_WOOD_LOG.get());
    private static final SurfaceRules.RuleSource MOSSY_WOOD_PLANKS = makeStateRule(ModBlocks.MOSSY_WOOD_PLANKS.get());


    public static SurfaceRules.RuleSource makeRules() {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);

        SurfaceRules.RuleSource grassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);

        return SurfaceRules.sequence(

                //Reglas para cambiar el tipo de los bloques
                SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.MOSSY_BIOME),
                                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, MOSSY_WOOD_PLANKS)),
                        SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, MOSSY_WOOD_LOG)),


                // Default to a grass and dirt surface
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, grassSurface)
        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
}
