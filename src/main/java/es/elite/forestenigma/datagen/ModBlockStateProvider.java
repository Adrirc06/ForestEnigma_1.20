package es.elite.forestenigma.datagen;

import es.elite.forestenigma.ForestEnigma;
import es.elite.forestenigma.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ForestEnigma.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.CARITA_BLOCK);
        blockWithItem(ModBlocks.MOSSY_WOOD_PLANKS);

        logBlock(ModBlocks.MOSSY_WOOD_LOG.get());
        axisBlock(ModBlocks.MOSSY_WOOD.get(), blockTexture(ModBlocks.MOSSY_WOOD_LOG.get()), blockTexture(ModBlocks.MOSSY_WOOD_LOG.get()));
        logBlock(ModBlocks.STRIPPED_MOSSY_WOOD_LOG.get());
        axisBlock(ModBlocks.STRIPPED_MOSSY_WOOD.get(), blockTexture(ModBlocks.STRIPPED_MOSSY_WOOD_LOG.get()), blockTexture(ModBlocks.STRIPPED_MOSSY_WOOD_LOG.get()));

        blockItem(ModBlocks.MOSSY_WOOD_LOG);
        blockItem(ModBlocks.MOSSY_WOOD);
        blockItem(ModBlocks.STRIPPED_MOSSY_WOOD_LOG);
        blockItem(ModBlocks.STRIPPED_MOSSY_WOOD);

        leavesBlock(ModBlocks.MOSSY_TREE_LEAVES);
        //saplingBlock(ModBlocks.MOSSY_SAPLING);

        stairsBlock(ModBlocks.MOSSY_WOOD_STAIRS.get(), blockTexture(ModBlocks.MOSSY_WOOD_PLANKS.get()));
        slabBlock(ModBlocks.MOSSY_WOOD_SLAB.get(), blockTexture(ModBlocks.MOSSY_WOOD_PLANKS.get()), blockTexture(ModBlocks.MOSSY_WOOD_PLANKS.get()));

        buttonBlock(ModBlocks.MOSSY_WOOD_BUTTON.get(), blockTexture(ModBlocks.MOSSY_WOOD_PLANKS.get()));
        pressurePlateBlock(ModBlocks.MOSSY_WOOD_PRESSURE_PLATE.get(), blockTexture(ModBlocks.MOSSY_WOOD_PLANKS.get()));

        fenceBlock(ModBlocks.MOSSY_WOOD_FENCE.get(), blockTexture(ModBlocks.MOSSY_WOOD_PLANKS.get()));
        fenceGateBlock(ModBlocks.MOSSY_WOOD_FENCE_GATE.get(), blockTexture(ModBlocks.MOSSY_WOOD_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.MOSSY_WOOD_DOOR.get(), modLoc("block/mossy_wood_door_bottom"), modLoc("block/mossy_wood_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.MOSSY_WOOD_TRAPDOOR.get(), modLoc("block/mossy_wood_trapdoor"), true, "cutout");

        blockItem(ModBlocks.MOSSY_WOOD_STAIRS);
        blockItem(ModBlocks.MOSSY_WOOD_SLAB);
        blockItem(ModBlocks.MOSSY_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.MOSSY_WOOD_FENCE_GATE);
        blockItem(ModBlocks.MOSSY_WOOD_TRAPDOOR, "_bottom");

        blockWithItem(ModBlocks.SYLVANITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SYLVANITE_ORE);
        blockWithItem(ModBlocks.SYLVANITE_BLOCK);

    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    @Override
    public void simpleBlockItem(Block block, ModelFile model) {
        super.simpleBlockItem(block, model);
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("forestenigma:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("forestenigma:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }
}
