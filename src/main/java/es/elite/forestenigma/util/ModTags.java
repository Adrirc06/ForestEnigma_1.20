package es.elite.forestenigma.util;

import es.elite.forestenigma.ForestEnigma;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_SYLVANITE_TOOL = createTag("needs_sylvanite_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(ForestEnigma.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> MOSSY_WOOD_BLOCKS = createTag("mossy_wood_blocks");


        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(ForestEnigma.MOD_ID, name));
        }
    }
}
