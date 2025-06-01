package es.elite.forestenigma.item;

import es.elite.forestenigma.ForestEnigma;
import es.elite.forestenigma.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ForestEnigma.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FOREST_ENIGMA_TAB = CREATIVE_MODE_TABS.register("forest_enigma_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.MOSSY_WOOD_LOG.get()))
                    .title(Component.translatable("creativetab.forestenigma.forestenigmatab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.MOSSY_WOOD_LOG.get());
                        output.accept(ModBlocks.MOSSY_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_MOSSY_WOOD_LOG.get());
                        output.accept(ModBlocks.STRIPPED_MOSSY_WOOD.get());
                        output.accept(ModBlocks.MOSSY_WOOD_PLANKS.get());
                        output.accept(ModBlocks.MOSSY_TREE_LEAVES.get());
                        output.accept(ModBlocks.MOSSY_WOOD_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.MOSSY_WOOD_BUTTON.get());
                        output.accept(ModBlocks.MOSSY_WOOD_STAIRS.get());
                        output.accept(ModBlocks.MOSSY_WOOD_SLAB.get());
                        output.accept(ModBlocks.MOSSY_WOOD_FENCE.get());
                        output.accept(ModBlocks.MOSSY_WOOD_FENCE_GATE.get());
                        output.accept(ModBlocks.MOSSY_WOOD_DOOR.get());
                        output.accept(ModBlocks.MOSSY_WOOD_TRAPDOOR.get());
                        output.accept(ModBlocks.SYLVANITE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_SYLVANITE_ORE.get());
                        output.accept(ModItems.SYLVANITE.get());
                        output.accept(ModItems.SYLVANITE_SWORD.get());
                        output.accept(ModItems.SYLVANITE_AXE.get());
                        output.accept(ModItems.SYLVANITE_HOE.get());
                        output.accept(ModItems.SYLVANITE_PICKAXE.get());
                        output.accept(ModItems.SYLVANITE_SHOVEL.get());
                        output.accept(ModBlocks.SYLVANITE_BLOCK.get());
                        output.accept(ModBlocks.MOSSY_SAPLING.get());
                        output.accept(ModBlocks.ANCIENT_STONE.get());
                        output.accept(ModBlocks.HOLY_EYE_BLOCK.get());
                        output.accept(ModBlocks.RARE_MOSSY_BLOCK.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
