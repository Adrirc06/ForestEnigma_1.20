package es.elite.forestenigma.datagen;

import es.elite.forestenigma.ForestEnigma;
import es.elite.forestenigma.block.ModBlocks;
import es.elite.forestenigma.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider,
                              CompletableFuture<TagLookup<Block>> pBlockTags,
                              @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, ForestEnigma.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.MOSSY_WOOD_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_MOSSY_WOOD_LOG.get().asItem())
                .add(ModBlocks.MOSSY_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_MOSSY_WOOD.get().asItem());

        tag(ItemTags.PLANKS)
                .add(ModBlocks.MOSSY_WOOD_PLANKS.get().asItem());

        tag(ModTags.Items.MOSSY_WOOD_BLOCKS)
                .add(ModBlocks.MOSSY_WOOD_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_MOSSY_WOOD_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_MOSSY_WOOD.get().asItem())
                .add(ModBlocks.MOSSY_WOOD.get().asItem());
    }
}
