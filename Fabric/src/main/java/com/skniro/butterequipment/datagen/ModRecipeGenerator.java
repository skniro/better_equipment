package com.skniro.butterequipment.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {

    public ModRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            @Override
            public void generate() {
                createShaped(RecipeCategory.MISC, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                        .input('#', ItemTags.PLANKS)
                        .input('G', Items.COBBLESTONE)
                        .pattern("###")
                        .pattern("#G#")
                        .pattern("###")
                        .group("misc")
                        .criterion("has_base_item", conditionsFromTag(ItemTags.PLANKS))
                        .criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE))
                        .offerTo(exporter, "mod_netherite_upgrade_smithing_template");

                SmithingTransformRecipeJsonBuilder.create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(Items.GOLDEN_AXE),
                                Ingredient.ofItems(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_AXE
                        )
                        .criterion("has_base_item", conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .criterion("has_base_item2", conditionsFromItem(Items.GOLDEN_AXE))
                        .criterion("has_base_item3", conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter, "diamond_gold_axe_from_smithing");

                SmithingTransformRecipeJsonBuilder.create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(Items.GOLDEN_BOOTS),
                                Ingredient.ofItems(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_BOOTS
                        )
                        .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .criterion(hasItem(Items.GOLDEN_BOOTS), conditionsFromItem(Items.GOLDEN_BOOTS))
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter, "diamond_gold_boots_from_smithing");


                SmithingTransformRecipeJsonBuilder.create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(Items.GOLDEN_CHESTPLATE),
                                Ingredient.ofItems(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_CHESTPLATE
                        )
                        .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .criterion(hasItem(Items.GOLDEN_CHESTPLATE), conditionsFromItem(Items.GOLDEN_CHESTPLATE))
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter, "diamond_gold_chestplate_from_smithing");


                SmithingTransformRecipeJsonBuilder.create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(Items.GOLDEN_HELMET),
                                Ingredient.ofItems(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_HELMET
                        )
                        .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .criterion(hasItem(Items.GOLDEN_HELMET), conditionsFromItem(Items.GOLDEN_HELMET))
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter, "diamond_gold_helmet_from_smithing");


                SmithingTransformRecipeJsonBuilder.create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(Items.GOLDEN_HOE),
                                Ingredient.ofItems(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_HOE
                        )
                        .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .criterion(hasItem(Items.GOLDEN_HOE), conditionsFromItem(Items.GOLDEN_HOE))
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter, "diamond_gold_hoe_from_smithing");


                SmithingTransformRecipeJsonBuilder.create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(Items.GOLDEN_LEGGINGS),
                                Ingredient.ofItems(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_LEGGINGS
                        )
                        .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .criterion(hasItem(Items.GOLDEN_LEGGINGS), conditionsFromItem(Items.GOLDEN_LEGGINGS))
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter, "diamond_gold_leggings_from_smithing");


                SmithingTransformRecipeJsonBuilder.create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(Items.GOLDEN_PICKAXE),
                                Ingredient.ofItems(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_PICKAXE
                        )
                        .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .criterion(hasItem(Items.GOLDEN_PICKAXE), conditionsFromItem(Items.GOLDEN_PICKAXE))
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter, "diamond_gold_pickaxe_from_smithing");


                SmithingTransformRecipeJsonBuilder.create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(Items.GOLDEN_SHOVEL),
                                Ingredient.ofItems(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_SHOVEL
                        )
                        .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .criterion(hasItem(Items.GOLDEN_SHOVEL), conditionsFromItem(Items.GOLDEN_SHOVEL))
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter, "diamond_gold_shovel_from_smithing");


                SmithingTransformRecipeJsonBuilder.create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(Items.GOLDEN_SWORD),
                                Ingredient.ofItems(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_SWORD
                        )
                        .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .criterion(hasItem(Items.GOLDEN_SWORD), conditionsFromItem(Items.GOLDEN_SWORD))
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter, "diamond_gold_sword_from_smithing");


                SmithingTransformRecipeJsonBuilder.create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(Items.IRON_AXE),
                                Ingredient.ofItems(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_AXE
                        )
                        .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .criterion(hasItem(Items.IRON_AXE), conditionsFromItem(Items.IRON_AXE))
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter, "diamond_iron_axe_from_smithing");


                SmithingTransformRecipeJsonBuilder.create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(Items.IRON_BOOTS),
                                Ingredient.ofItems(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_BOOTS
                        )
                        .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .criterion(hasItem(Items.IRON_BOOTS), conditionsFromItem(Items.IRON_BOOTS))
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter, "diamond_iron_boots_from_smithing");


                SmithingTransformRecipeJsonBuilder.create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(Items.IRON_CHESTPLATE),
                                Ingredient.ofItems(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_CHESTPLATE
                        )
                        .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .criterion(hasItem(Items.IRON_CHESTPLATE), conditionsFromItem(Items.IRON_CHESTPLATE))
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter, "diamond_iron_chestplate_from_smithing");


                SmithingTransformRecipeJsonBuilder.create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(Items.IRON_HELMET),
                                Ingredient.ofItems(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_HELMET
                        )
                        .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .criterion(hasItem(Items.IRON_HELMET), conditionsFromItem(Items.IRON_HELMET))
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter, "diamond_iron_helmet_from_smithing");


                SmithingTransformRecipeJsonBuilder.create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(Items.IRON_HOE),
                                Ingredient.ofItems(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_HOE
                        )
                        .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .criterion(hasItem(Items.IRON_HOE), conditionsFromItem(Items.IRON_HOE))
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter, "diamond_iron_hoe_from_smithing");


                SmithingTransformRecipeJsonBuilder.create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(Items.IRON_LEGGINGS),
                                Ingredient.ofItems(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_LEGGINGS
                        )
                        .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .criterion(hasItem(Items.IRON_LEGGINGS), conditionsFromItem(Items.IRON_LEGGINGS))
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter, "diamond_iron_leggings_from_smithing");


                SmithingTransformRecipeJsonBuilder.create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(Items.IRON_PICKAXE),
                                Ingredient.ofItems(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_PICKAXE
                        )
                        .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .criterion(hasItem(Items.IRON_PICKAXE), conditionsFromItem(Items.IRON_PICKAXE))
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter, "diamond_iron_pickaxe_from_smithing");


                SmithingTransformRecipeJsonBuilder.create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(Items.IRON_SHOVEL),
                                Ingredient.ofItems(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_SHOVEL
                        )
                        .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .criterion(hasItem(Items.IRON_SHOVEL), conditionsFromItem(Items.IRON_SHOVEL))
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter, "diamond_iron_shovel_from_smithing");


                SmithingTransformRecipeJsonBuilder.create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(Items.IRON_SWORD),
                                Ingredient.ofItems(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_SWORD
                        )
                        .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .criterion(hasItem(Items.IRON_SWORD), conditionsFromItem(Items.IRON_SWORD))
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter, "diamond_iron_sword_from_smithing");

                SmithingTransformRecipeJsonBuilder.create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(Items.STONE_AXE),
                                Ingredient.ofItems(Items.IRON_INGOT),
                                RecipeCategory.MISC,
                                Items.IRON_AXE
                        )
                        .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .criterion(hasItem(Items.STONE_AXE), conditionsFromItem(Items.STONE_AXE))
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(exporter, "iron_axe_from_smithing");


                SmithingTransformRecipeJsonBuilder.create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(Items.LEATHER_BOOTS),
                                Ingredient.ofItems(Items.IRON_INGOT),
                                RecipeCategory.MISC,
                                Items.IRON_BOOTS
                        )
                        .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .criterion(hasItem(Items.LEATHER_BOOTS), conditionsFromItem(Items.LEATHER_BOOTS))
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(exporter, "iron_boots_from_smithing");


                SmithingTransformRecipeJsonBuilder.create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(Items.LEATHER_CHESTPLATE),
                                Ingredient.ofItems(Items.IRON_INGOT),
                                RecipeCategory.MISC,
                                Items.IRON_CHESTPLATE
                        )
                        .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .criterion(hasItem(Items.LEATHER_CHESTPLATE), conditionsFromItem(Items.LEATHER_CHESTPLATE))
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(exporter, "iron_chestplate_from_smithing");


                SmithingTransformRecipeJsonBuilder.create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(Items.LEATHER_HELMET),
                                Ingredient.ofItems(Items.IRON_INGOT),
                                RecipeCategory.MISC,
                                Items.IRON_HELMET
                        )
                        .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .criterion(hasItem(Items.LEATHER_HELMET), conditionsFromItem(Items.LEATHER_HELMET))
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(exporter, "iron_helmet_from_smithing");


                SmithingTransformRecipeJsonBuilder.create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(Items.STONE_HOE),
                                Ingredient.ofItems(Items.IRON_INGOT),
                                RecipeCategory.MISC,
                                Items.IRON_HOE
                        )
                        .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .criterion(hasItem(Items.STONE_HOE), conditionsFromItem(Items.STONE_HOE))
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(exporter, "iron_hoe_from_smithing");


                SmithingTransformRecipeJsonBuilder.create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(Items.LEATHER_LEGGINGS),
                                Ingredient.ofItems(Items.IRON_INGOT),
                                RecipeCategory.MISC,
                                Items.IRON_LEGGINGS
                        )
                        .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .criterion(hasItem(Items.LEATHER_LEGGINGS), conditionsFromItem(Items.LEATHER_LEGGINGS))
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(exporter, "iron_leggings_from_smithing");


                SmithingTransformRecipeJsonBuilder.create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(Items.STONE_PICKAXE),
                                Ingredient.ofItems(Items.IRON_INGOT),
                                RecipeCategory.MISC,
                                Items.IRON_PICKAXE
                        )
                        .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .criterion(hasItem(Items.STONE_PICKAXE), conditionsFromItem(Items.STONE_PICKAXE))
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(exporter, "iron_pickaxe_from_smithing");


                SmithingTransformRecipeJsonBuilder.create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(Items.STONE_SHOVEL),
                                Ingredient.ofItems(Items.IRON_INGOT),
                                RecipeCategory.MISC,
                                Items.IRON_SHOVEL
                        )
                        .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .criterion(hasItem(Items.STONE_SHOVEL), conditionsFromItem(Items.STONE_SHOVEL))
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(exporter, "iron_shovel_from_smithing");


                SmithingTransformRecipeJsonBuilder.create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(Items.STONE_SWORD),
                                Ingredient.ofItems(Items.IRON_INGOT),
                                RecipeCategory.MISC,
                                Items.IRON_SWORD
                        )
                        .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .criterion(hasItem(Items.STONE_SWORD), conditionsFromItem(Items.STONE_SWORD))
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(exporter, "iron_sword_from_smithing");
            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}
