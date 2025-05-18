package es.elite.forestenigma.datagen.loot;

import es.elite.forestenigma.block.ModBlocks;
import es.elite.forestenigma.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.MOSSY_WOOD_LOG.get());
        dropSelf(ModBlocks.STRIPPED_MOSSY_WOOD_LOG.get());
        dropSelf(ModBlocks.MOSSY_WOOD_PLANKS.get());
        dropSelf(ModBlocks.CARITA_BLOCK.get());
        dropSelf(ModBlocks.MOSSY_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_MOSSY_WOOD.get());
        dropSelf(ModBlocks.MOSSY_SAPLING.get());
        add(ModBlocks.POTTED_MOSSY_SAPLING.get(), createPotFlowerItemTable(ModBlocks.MOSSY_SAPLING.get()));

        this.add(ModBlocks.MOSSY_TREE_LEAVES.get(), block ->
                createLeavesDrops(block, Blocks.OAK_SAPLING, NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.MOSSY_TREE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.MOSSY_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.MOSSY_WOOD_BUTTON.get());
        dropSelf(ModBlocks.MOSSY_WOOD_FENCE.get());
        dropSelf(ModBlocks.MOSSY_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.MOSSY_WOOD_TRAPDOOR.get());
        dropSelf(ModBlocks.MOSSY_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.MOSSY_WOOD_STAIRS.get());

        this.add(ModBlocks.MOSSY_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MOSSY_WOOD_SLAB.get()));

        this.add(ModBlocks.MOSSY_WOOD_DOOR.get(),
                block -> createDoorTable(ModBlocks.MOSSY_WOOD_DOOR.get()));

        this.add(ModBlocks.SYLVANITE_ORE.get(),
                block -> createOreDrop(ModBlocks.SYLVANITE_ORE.get(), ModItems.SYLVANITE.get()));
        this.add(ModBlocks.DEEPSLATE_SYLVANITE_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_SYLVANITE_ORE.get(), ModItems.SYLVANITE.get()));
        dropSelf(ModBlocks.SYLVANITE_BLOCK.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
