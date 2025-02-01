package com.skniro.butterequipment.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                .input('#', ItemTags.PLANKS)
                .input('G', Items.COBBLESTONE)
                .pattern("###")
                .pattern("#G#")
                .pattern("###")
                .group("misc")
                .criterion("has_base_item",  RecipeProvider.conditionsFromTag(ItemTags.PLANKS))
                .criterion(FabricRecipeProvider.hasItem(Items.COBBLESTONE),  RecipeProvider.conditionsFromItem(Items.COBBLESTONE))
                .offerTo(exporter,"mod_netherite_upgrade_smithing_template");

        SmithingTransformRecipeJsonBuilder.create(
                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Items.GOLDEN_AXE),
                Ingredient.ofItems(Items.DIAMOND),
                RecipeCategory.MISC,
                Items.DIAMOND_AXE
        )
                .criterion("has_base_item",  RecipeProvider.conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion("has_base_item2",  RecipeProvider.conditionsFromItem(Items.GOLDEN_AXE))
                .criterion("has_base_item3",  RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, "diamond_gold_axe_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.GOLDEN_BOOTS),
                        Ingredient.ofItems(Items.DIAMOND),
                        RecipeCategory.MISC,
                        Items.DIAMOND_BOOTS
                )
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), RecipeProvider.conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.GOLDEN_BOOTS), RecipeProvider.conditionsFromItem(Items.GOLDEN_BOOTS))
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND), RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, "diamond_gold_boots_from_smithing");


        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.GOLDEN_CHESTPLATE),
                        Ingredient.ofItems(Items.DIAMOND),
                        RecipeCategory.MISC,
                        Items.DIAMOND_CHESTPLATE
                )
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), RecipeProvider.conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.GOLDEN_CHESTPLATE), RecipeProvider.conditionsFromItem(Items.GOLDEN_CHESTPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND), RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, "diamond_gold_chestplate_from_smithing");


        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.GOLDEN_HELMET),
                        Ingredient.ofItems(Items.DIAMOND),
                        RecipeCategory.MISC,
                        Items.DIAMOND_HELMET
                )
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), RecipeProvider.conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.GOLDEN_HELMET), RecipeProvider.conditionsFromItem(Items.GOLDEN_HELMET))
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND), RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, "diamond_gold_helmet_from_smithing");


        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.GOLDEN_HOE),
                        Ingredient.ofItems(Items.DIAMOND),
                        RecipeCategory.MISC,
                        Items.DIAMOND_HOE
                )
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), RecipeProvider.conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.GOLDEN_HOE), RecipeProvider.conditionsFromItem(Items.GOLDEN_HOE))
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND), RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, "diamond_gold_hoe_from_smithing");


        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.GOLDEN_LEGGINGS),
                        Ingredient.ofItems(Items.DIAMOND),
                        RecipeCategory.MISC,
                        Items.DIAMOND_LEGGINGS
                )
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), RecipeProvider.conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.GOLDEN_LEGGINGS), RecipeProvider.conditionsFromItem(Items.GOLDEN_LEGGINGS))
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND), RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, "diamond_gold_leggings_from_smithing");


        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.GOLDEN_PICKAXE),
                        Ingredient.ofItems(Items.DIAMOND),
                        RecipeCategory.MISC,
                        Items.DIAMOND_PICKAXE
                )
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), RecipeProvider.conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.GOLDEN_PICKAXE), RecipeProvider.conditionsFromItem(Items.GOLDEN_PICKAXE))
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND), RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, "diamond_gold_pickaxe_from_smithing");


        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.GOLDEN_SHOVEL),
                        Ingredient.ofItems(Items.DIAMOND),
                        RecipeCategory.MISC,
                        Items.DIAMOND_SHOVEL
                )
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), RecipeProvider.conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.GOLDEN_SHOVEL), RecipeProvider.conditionsFromItem(Items.GOLDEN_SHOVEL))
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND), RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, "diamond_gold_shovel_from_smithing");


        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.GOLDEN_SWORD),
                        Ingredient.ofItems(Items.DIAMOND),
                        RecipeCategory.MISC,
                        Items.DIAMOND_SWORD
                )
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), RecipeProvider.conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.GOLDEN_SWORD), RecipeProvider.conditionsFromItem(Items.GOLDEN_SWORD))
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND), RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, "diamond_gold_sword_from_smithing");


        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_AXE),
                        Ingredient.ofItems(Items.DIAMOND),
                        RecipeCategory.MISC,
                        Items.DIAMOND_AXE
                )
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), RecipeProvider.conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_AXE), RecipeProvider.conditionsFromItem(Items.IRON_AXE))
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND), RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, "diamond_iron_axe_from_smithing");


        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_BOOTS),
                        Ingredient.ofItems(Items.DIAMOND),
                        RecipeCategory.MISC,
                        Items.DIAMOND_BOOTS
                )
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), RecipeProvider.conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_BOOTS), RecipeProvider.conditionsFromItem(Items.IRON_BOOTS))
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND), RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, "diamond_iron_boots_from_smithing");


        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_CHESTPLATE),
                        Ingredient.ofItems(Items.DIAMOND),
                        RecipeCategory.MISC,
                        Items.DIAMOND_CHESTPLATE
                )
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), RecipeProvider.conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_CHESTPLATE), RecipeProvider.conditionsFromItem(Items.IRON_CHESTPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND), RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, "diamond_iron_chestplate_from_smithing");


        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_HELMET),
                        Ingredient.ofItems(Items.DIAMOND),
                        RecipeCategory.MISC,
                        Items.DIAMOND_HELMET
                )
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), RecipeProvider.conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_HELMET), RecipeProvider.conditionsFromItem(Items.IRON_HELMET))
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND), RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, "diamond_iron_helmet_from_smithing");


        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_HOE),
                        Ingredient.ofItems(Items.DIAMOND),
                        RecipeCategory.MISC,
                        Items.DIAMOND_HOE
                )
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), RecipeProvider.conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_HOE), RecipeProvider.conditionsFromItem(Items.IRON_HOE))
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND), RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, "diamond_iron_hoe_from_smithing");


        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_LEGGINGS),
                        Ingredient.ofItems(Items.DIAMOND),
                        RecipeCategory.MISC,
                        Items.DIAMOND_LEGGINGS
                )
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), RecipeProvider.conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_LEGGINGS), RecipeProvider.conditionsFromItem(Items.IRON_LEGGINGS))
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND), RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, "diamond_iron_leggings_from_smithing");


        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_PICKAXE),
                        Ingredient.ofItems(Items.DIAMOND),
                        RecipeCategory.MISC,
                        Items.DIAMOND_PICKAXE
                )
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), RecipeProvider.conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_PICKAXE), RecipeProvider.conditionsFromItem(Items.IRON_PICKAXE))
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND), RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, "diamond_iron_pickaxe_from_smithing");


        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_SHOVEL),
                        Ingredient.ofItems(Items.DIAMOND),
                        RecipeCategory.MISC,
                        Items.DIAMOND_SHOVEL
                )
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), RecipeProvider.conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_SHOVEL), RecipeProvider.conditionsFromItem(Items.IRON_SHOVEL))
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND), RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, "diamond_iron_shovel_from_smithing");


        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_SWORD),
                        Ingredient.ofItems(Items.DIAMOND),
                        RecipeCategory.MISC,
                        Items.DIAMOND_SWORD
                )
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), RecipeProvider.conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_SWORD), RecipeProvider.conditionsFromItem(Items.IRON_SWORD))
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND), RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, "diamond_iron_sword_from_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.STONE_AXE),
                        Ingredient.ofItems(Items.IRON_INGOT),
                        RecipeCategory.MISC,
                        Items.IRON_AXE
                )
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), RecipeProvider.conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.STONE_AXE), RecipeProvider.conditionsFromItem(Items.STONE_AXE))
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT), RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, "iron_axe_from_smithing");


        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.LEATHER_BOOTS),
                        Ingredient.ofItems(Items.IRON_INGOT),
                        RecipeCategory.MISC,
                        Items.IRON_BOOTS
                )
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), RecipeProvider.conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.LEATHER_BOOTS), RecipeProvider.conditionsFromItem(Items.LEATHER_BOOTS))
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT), RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, "iron_boots_from_smithing");


        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.LEATHER_CHESTPLATE),
                        Ingredient.ofItems(Items.IRON_INGOT),
                        RecipeCategory.MISC,
                        Items.IRON_CHESTPLATE
                )
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), RecipeProvider.conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.LEATHER_CHESTPLATE), RecipeProvider.conditionsFromItem(Items.LEATHER_CHESTPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT), RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, "iron_chestplate_from_smithing");


        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.LEATHER_HELMET),
                        Ingredient.ofItems(Items.IRON_INGOT),
                        RecipeCategory.MISC,
                        Items.IRON_HELMET
                )
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), RecipeProvider.conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.LEATHER_HELMET), RecipeProvider.conditionsFromItem(Items.LEATHER_HELMET))
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT), RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, "iron_helmet_from_smithing");


        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.STONE_HOE),
                        Ingredient.ofItems(Items.IRON_INGOT),
                        RecipeCategory.MISC,
                        Items.IRON_HOE
                )
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), RecipeProvider.conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.STONE_HOE), RecipeProvider.conditionsFromItem(Items.STONE_HOE))
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT), RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, "iron_hoe_from_smithing");


        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.LEATHER_LEGGINGS),
                        Ingredient.ofItems(Items.IRON_INGOT),
                        RecipeCategory.MISC,
                        Items.IRON_LEGGINGS
                )
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), RecipeProvider.conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.LEATHER_LEGGINGS), RecipeProvider.conditionsFromItem(Items.LEATHER_LEGGINGS))
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT), RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, "iron_leggings_from_smithing");


        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.STONE_PICKAXE),
                        Ingredient.ofItems(Items.IRON_INGOT),
                        RecipeCategory.MISC,
                        Items.IRON_PICKAXE
                )
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), RecipeProvider.conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.STONE_PICKAXE), RecipeProvider.conditionsFromItem(Items.STONE_PICKAXE))
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT), RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, "iron_pickaxe_from_smithing");


        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.STONE_SHOVEL),
                        Ingredient.ofItems(Items.IRON_INGOT),
                        RecipeCategory.MISC,
                        Items.IRON_SHOVEL
                )
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), RecipeProvider.conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.STONE_SHOVEL), RecipeProvider.conditionsFromItem(Items.STONE_SHOVEL))
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT), RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, "iron_shovel_from_smithing");


        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.STONE_SWORD),
                        Ingredient.ofItems(Items.IRON_INGOT),
                        RecipeCategory.MISC,
                        Items.IRON_SWORD
                )
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), RecipeProvider.conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .criterion(FabricRecipeProvider.hasItem(Items.STONE_SWORD), RecipeProvider.conditionsFromItem(Items.STONE_SWORD))
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT), RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, "iron_sword_from_smithing");
    }
}
