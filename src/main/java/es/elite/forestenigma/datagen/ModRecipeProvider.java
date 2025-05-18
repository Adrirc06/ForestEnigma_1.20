package es.elite.forestenigma.datagen;

import es.elite.forestenigma.block.ModBlocks;
import es.elite.forestenigma.item.ModItems;
import es.elite.forestenigma.util.ModTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_WOOD_PLANKS.get(), 4)
                .requires(ModTags.Items.MOSSY_WOOD_BLOCKS)
                .unlockedBy(getHasName(ModBlocks.MOSSY_WOOD_LOG.get()), has(ModBlocks.MOSSY_WOOD_LOG.get())).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_WOOD.get(), 3)
                .pattern("AA")
                .pattern("AA")
                .define('A', ModBlocks.MOSSY_WOOD_LOG.get())
                .unlockedBy(getHasName(ModBlocks.MOSSY_WOOD_LOG.get()), has(ModBlocks.MOSSY_WOOD_LOG.get())).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_MOSSY_WOOD.get(), 3)
                .pattern("AA")
                .pattern("AA")
                .define('A', ModBlocks.STRIPPED_MOSSY_WOOD_LOG.get())
                .unlockedBy(getHasName(ModBlocks.STRIPPED_MOSSY_WOOD_LOG.get()), has(ModBlocks.STRIPPED_MOSSY_WOOD_LOG.get())).save(pWriter);

        stairBuilder(ModBlocks.MOSSY_WOOD_STAIRS.get(), Ingredient.of(ModBlocks.MOSSY_WOOD_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.MOSSY_WOOD_PLANKS.get()), has(ModBlocks.MOSSY_WOOD_PLANKS.get())).save(pWriter);

        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_WOOD_SLAB.get(), ModBlocks.MOSSY_WOOD_PLANKS.get());

        buttonBuilder(ModBlocks.MOSSY_WOOD_BUTTON.get(), Ingredient.of(ModBlocks.MOSSY_WOOD_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.MOSSY_WOOD_PLANKS.get()), has(ModBlocks.MOSSY_WOOD_PLANKS.get())).save(pWriter);

        pressurePlate(pWriter, ModBlocks.MOSSY_WOOD_PRESSURE_PLATE.get(), ModBlocks.MOSSY_WOOD_PLANKS.get());

        fenceBuilder(ModBlocks.MOSSY_WOOD_FENCE.get(), Ingredient.of(ModBlocks.MOSSY_WOOD_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.MOSSY_WOOD_PLANKS.get()), has(ModBlocks.MOSSY_WOOD_PLANKS.get())).save(pWriter);

        fenceGateBuilder(ModBlocks.MOSSY_WOOD_FENCE_GATE.get(), Ingredient.of(ModBlocks.MOSSY_WOOD_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.MOSSY_WOOD_PLANKS.get()), has(ModBlocks.MOSSY_WOOD_PLANKS.get())).save(pWriter);

        doorBuilder(ModBlocks.MOSSY_WOOD_DOOR.get(), Ingredient.of(ModBlocks.MOSSY_WOOD_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.MOSSY_WOOD_PLANKS.get()), has(ModBlocks.MOSSY_WOOD_PLANKS.get())).save(pWriter);

        trapdoorBuilder(ModBlocks.MOSSY_WOOD_TRAPDOOR.get(), Ingredient.of(ModBlocks.MOSSY_WOOD_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.MOSSY_WOOD_PLANKS.get()), has(ModBlocks.MOSSY_WOOD_PLANKS.get())).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SYLVANITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.SYLVANITE.get())
                .unlockedBy(getHasName(ModItems.SYLVANITE.get()), has(ModItems.SYLVANITE.get())).save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SYLVANITE.get(), 9)
                .requires(ModBlocks.SYLVANITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SYLVANITE_BLOCK.get()), has(ModBlocks.SYLVANITE_BLOCK.get())).save(pWriter);
    }

}
