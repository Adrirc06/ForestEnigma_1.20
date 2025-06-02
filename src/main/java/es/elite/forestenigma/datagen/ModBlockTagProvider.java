package es.elite.forestenigma.datagen;

import es.elite.forestenigma.ForestEnigma;
import es.elite.forestenigma.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ForestEnigma.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.MOSSY_WOOD_LOG.get())
                .add(ModBlocks.MOSSY_WOOD.get())
                .add(ModBlocks.STRIPPED_MOSSY_WOOD_LOG.get())
                .add(ModBlocks.STRIPPED_MOSSY_WOOD.get())
                .add(ModBlocks.MOSSY_WOOD_PLANKS.get())
                .add(ModBlocks.MOSSY_WOOD_STAIRS.get())
                .add(ModBlocks.MOSSY_WOOD_SLAB.get())
                .add(ModBlocks.MOSSY_WOOD_PRESSURE_PLATE.get())
                .add(ModBlocks.MOSSY_WOOD_BUTTON.get())
                .add(ModBlocks.MOSSY_WOOD_FENCE.get())
                .add(ModBlocks.MOSSY_WOOD_FENCE_GATE.get())
                .add(ModBlocks.MOSSY_WOOD_DOOR.get())
                .add(ModBlocks.MOSSY_WOOD_TRAPDOOR.get());

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SYLVANITE_BLOCK.get())
                .add(ModBlocks.SYLVANITE_ORE.get())
                .add(ModBlocks.DEEPSLATE_SYLVANITE_ORE.get())
                .add(ModBlocks.ANCIENT_STONE.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SYLVANITE_BLOCK.get())
                .add(ModBlocks.SYLVANITE_ORE.get())
                .add(ModBlocks.DEEPSLATE_SYLVANITE_ORE.get())
                .add(ModBlocks.ANCIENT_STONE.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.MOSSY_WOOD_LOG.get())
                .add(ModBlocks.STRIPPED_MOSSY_WOOD_LOG.get())
                .add(ModBlocks.MOSSY_WOOD.get())
                .add(ModBlocks.STRIPPED_MOSSY_WOOD.get());

        tag(BlockTags.PLANKS)
                .add(ModBlocks.MOSSY_WOOD_PLANKS.get());

        tag(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.MOSSY_WOOD_FENCE.get());

        tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.MOSSY_WOOD_FENCE_GATE.get());
    }
}
