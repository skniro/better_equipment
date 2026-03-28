package com.skniro.butterequipment.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;


import java.util.concurrent.CompletableFuture;

public class ModRecipeGenerator extends FabricRecipeProvider {

    public ModRecipeGenerator(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput exporter) {
        return new RecipeProvider(registryLookup, exporter) {
            @Override
            public void buildRecipes() {
                shaped(RecipeCategory.MISC, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                        .define('#', ItemTags.PLANKS)
                        .define('G', Items.COBBLESTONE)
                        .pattern("###")
                        .pattern("#G#")
                        .pattern("###")
                        .group("misc")
                        .unlockedBy("has_base_item", has(ItemTags.PLANKS))
                        .unlockedBy(getHasName(Items.COBBLESTONE), has(Items.COBBLESTONE))
                        .save(exporter, "mod_netherite_upgrade_smithing_template");

                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.GOLDEN_AXE),
                                Ingredient.of(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_AXE
                        )
                        .unlocks("has_base_item", has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlocks("has_base_item2", has(Items.GOLDEN_AXE))
                        .unlocks("has_base_item3", has(Items.DIAMOND))
                        .save(exporter, "diamond_gold_axe_from_smithing");

                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.GOLDEN_BOOTS),
                                Ingredient.of(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_BOOTS
                        )
                        .unlocks(getHasName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlocks(getHasName(Items.GOLDEN_BOOTS), has(Items.GOLDEN_BOOTS))
                        .unlocks(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(exporter, "diamond_gold_boots_from_smithing");


                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.GOLDEN_CHESTPLATE),
                                Ingredient.of(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_CHESTPLATE
                        )
                        .unlocks(getHasName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlocks(getHasName(Items.GOLDEN_CHESTPLATE), has(Items.GOLDEN_CHESTPLATE))
                        .unlocks(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(exporter, "diamond_gold_chestplate_from_smithing");


                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.GOLDEN_HELMET),
                                Ingredient.of(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_HELMET
                        )
                        .unlocks(getHasName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlocks(getHasName(Items.GOLDEN_HELMET), has(Items.GOLDEN_HELMET))
                        .unlocks(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(exporter, "diamond_gold_helmet_from_smithing");


                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.GOLDEN_HOE),
                                Ingredient.of(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_HOE
                        )
                        .unlocks(getHasName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlocks(getHasName(Items.GOLDEN_HOE), has(Items.GOLDEN_HOE))
                        .unlocks(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(exporter, "diamond_gold_hoe_from_smithing");


                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.GOLDEN_LEGGINGS),
                                Ingredient.of(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_LEGGINGS
                        )
                        .unlocks(getHasName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlocks(getHasName(Items.GOLDEN_LEGGINGS), has(Items.GOLDEN_LEGGINGS))
                        .unlocks(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(exporter, "diamond_gold_leggings_from_smithing");


                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.GOLDEN_PICKAXE),
                                Ingredient.of(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_PICKAXE
                        )
                        .unlocks(getHasName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlocks(getHasName(Items.GOLDEN_PICKAXE), has(Items.GOLDEN_PICKAXE))
                        .unlocks(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(exporter, "diamond_gold_pickaxe_from_smithing");


                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.GOLDEN_SHOVEL),
                                Ingredient.of(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_SHOVEL
                        )
                        .unlocks(getHasName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlocks(getHasName(Items.GOLDEN_SHOVEL), has(Items.GOLDEN_SHOVEL))
                        .unlocks(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(exporter, "diamond_gold_shovel_from_smithing");


                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.GOLDEN_SWORD),
                                Ingredient.of(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_SWORD
                        )
                        .unlocks(getHasName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlocks(getHasName(Items.GOLDEN_SWORD), has(Items.GOLDEN_SWORD))
                        .unlocks(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(exporter, "diamond_gold_sword_from_smithing");


                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.IRON_AXE),
                                Ingredient.of(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_AXE
                        )
                        .unlocks(getHasName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlocks(getHasName(Items.IRON_AXE), has(Items.IRON_AXE))
                        .unlocks(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(exporter, "diamond_iron_axe_from_smithing");


                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.IRON_BOOTS),
                                Ingredient.of(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_BOOTS
                        )
                        .unlocks(getHasName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlocks(getHasName(Items.IRON_BOOTS), has(Items.IRON_BOOTS))
                        .unlocks(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(exporter, "diamond_iron_boots_from_smithing");


                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.IRON_CHESTPLATE),
                                Ingredient.of(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_CHESTPLATE
                        )
                        .unlocks(getHasName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlocks(getHasName(Items.IRON_CHESTPLATE), has(Items.IRON_CHESTPLATE))
                        .unlocks(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(exporter, "diamond_iron_chestplate_from_smithing");


                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.IRON_HELMET),
                                Ingredient.of(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_HELMET
                        )
                        .unlocks(getHasName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlocks(getHasName(Items.IRON_HELMET), has(Items.IRON_HELMET))
                        .unlocks(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(exporter, "diamond_iron_helmet_from_smithing");


                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.IRON_HOE),
                                Ingredient.of(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_HOE
                        )
                        .unlocks(getHasName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlocks(getHasName(Items.IRON_HOE), has(Items.IRON_HOE))
                        .unlocks(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(exporter, "diamond_iron_hoe_from_smithing");


                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.IRON_LEGGINGS),
                                Ingredient.of(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_LEGGINGS
                        )
                        .unlocks(getHasName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlocks(getHasName(Items.IRON_LEGGINGS), has(Items.IRON_LEGGINGS))
                        .unlocks(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(exporter, "diamond_iron_leggings_from_smithing");


                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.IRON_PICKAXE),
                                Ingredient.of(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_PICKAXE
                        )
                        .unlocks(getHasName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlocks(getHasName(Items.IRON_PICKAXE), has(Items.IRON_PICKAXE))
                        .unlocks(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(exporter, "diamond_iron_pickaxe_from_smithing");


                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.IRON_SHOVEL),
                                Ingredient.of(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_SHOVEL
                        )
                        .unlocks(getHasName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlocks(getHasName(Items.IRON_SHOVEL), has(Items.IRON_SHOVEL))
                        .unlocks(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(exporter, "diamond_iron_shovel_from_smithing");


                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.IRON_SWORD),
                                Ingredient.of(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_SWORD
                        )
                        .unlocks(getHasName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlocks(getHasName(Items.IRON_SWORD), has(Items.IRON_SWORD))
                        .unlocks(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(exporter, "diamond_iron_sword_from_smithing");

                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.STONE_AXE),
                                Ingredient.of(Items.IRON_INGOT),
                                RecipeCategory.MISC,
                                Items.IRON_AXE
                        )
                        .unlocks(getHasName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlocks(getHasName(Items.STONE_AXE), has(Items.STONE_AXE))
                        .unlocks(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                        .save(exporter, "iron_axe_from_smithing");


                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.LEATHER_BOOTS),
                                Ingredient.of(Items.IRON_INGOT),
                                RecipeCategory.MISC,
                                Items.IRON_BOOTS
                        )
                        .unlocks(getHasName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlocks(getHasName(Items.LEATHER_BOOTS), has(Items.LEATHER_BOOTS))
                        .unlocks(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                        .save(exporter, "iron_boots_from_smithing");


                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.LEATHER_CHESTPLATE),
                                Ingredient.of(Items.IRON_INGOT),
                                RecipeCategory.MISC,
                                Items.IRON_CHESTPLATE
                        )
                        .unlocks(getHasName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlocks(getHasName(Items.LEATHER_CHESTPLATE), has(Items.LEATHER_CHESTPLATE))
                        .unlocks(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                        .save(exporter, "iron_chestplate_from_smithing");


                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.LEATHER_HELMET),
                                Ingredient.of(Items.IRON_INGOT),
                                RecipeCategory.MISC,
                                Items.IRON_HELMET
                        )
                        .unlocks(getHasName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlocks(getHasName(Items.LEATHER_HELMET), has(Items.LEATHER_HELMET))
                        .unlocks(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                        .save(exporter, "iron_helmet_from_smithing");


                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.STONE_HOE),
                                Ingredient.of(Items.IRON_INGOT),
                                RecipeCategory.MISC,
                                Items.IRON_HOE
                        )
                        .unlocks(getHasName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlocks(getHasName(Items.STONE_HOE), has(Items.STONE_HOE))
                        .unlocks(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                        .save(exporter, "iron_hoe_from_smithing");


                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.LEATHER_LEGGINGS),
                                Ingredient.of(Items.IRON_INGOT),
                                RecipeCategory.MISC,
                                Items.IRON_LEGGINGS
                        )
                        .unlocks(getHasName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlocks(getHasName(Items.LEATHER_LEGGINGS), has(Items.LEATHER_LEGGINGS))
                        .unlocks(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                        .save(exporter, "iron_leggings_from_smithing");


                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.STONE_PICKAXE),
                                Ingredient.of(Items.IRON_INGOT),
                                RecipeCategory.MISC,
                                Items.IRON_PICKAXE
                        )
                        .unlocks(getHasName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlocks(getHasName(Items.STONE_PICKAXE), has(Items.STONE_PICKAXE))
                        .unlocks(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                        .save(exporter, "iron_pickaxe_from_smithing");


                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.STONE_SHOVEL),
                                Ingredient.of(Items.IRON_INGOT),
                                RecipeCategory.MISC,
                                Items.IRON_SHOVEL
                        )
                        .unlocks(getHasName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlocks(getHasName(Items.STONE_SHOVEL), has(Items.STONE_SHOVEL))
                        .unlocks(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                        .save(exporter, "iron_shovel_from_smithing");


                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.STONE_SWORD),
                                Ingredient.of(Items.IRON_INGOT),
                                RecipeCategory.MISC,
                                Items.IRON_SWORD
                        )
                        .unlocks(getHasName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlocks(getHasName(Items.STONE_SWORD), has(Items.STONE_SWORD))
                        .unlocks(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                        .save(exporter, "iron_sword_from_smithing");

                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.COPPER_HELMET),
                                Ingredient.of(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_HELMET
                        )
                        .unlocks(getHasName(Items.COPPER_HELMET), has(Items.COPPER_HELMET))
                        .unlocks(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(exporter, "diamond_from_copper_helmet");

                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.COPPER_CHESTPLATE),
                                Ingredient.of(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_CHESTPLATE
                        )
                        .unlocks(getHasName(Items.COPPER_CHESTPLATE), has(Items.COPPER_CHESTPLATE))
                        .unlocks(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(exporter, "diamond_from_copper_chestplate");

                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.COPPER_LEGGINGS),
                                Ingredient.of(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_LEGGINGS
                        )
                        .unlocks(getHasName(Items.COPPER_LEGGINGS), has(Items.COPPER_LEGGINGS))
                        .unlocks(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(exporter, "diamond_from_copper_leggings");

                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.COPPER_BOOTS),
                                Ingredient.of(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_BOOTS
                        )
                        .unlocks(getHasName(Items.COPPER_BOOTS), has(Items.COPPER_BOOTS))
                        .unlocks(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(exporter, "diamond_from_copper_boots");

                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.COPPER_AXE),
                                Ingredient.of(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_AXE
                        )
                        .unlocks(getHasName(Items.COPPER_AXE), has(Items.COPPER_AXE))
                        .unlocks(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(exporter, "diamond_from_copper_axe");

                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.COPPER_PICKAXE),
                                Ingredient.of(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_PICKAXE
                        )
                        .unlocks(getHasName(Items.COPPER_PICKAXE), has(Items.COPPER_PICKAXE))
                        .unlocks(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(exporter, "diamond_from_copper_pickaxe");

                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.COPPER_SHOVEL),
                                Ingredient.of(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_SHOVEL
                        )
                        .unlocks(getHasName(Items.COPPER_SHOVEL), has(Items.COPPER_SHOVEL))
                        .unlocks(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(exporter, "diamond_from_copper_shovel");

                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.COPPER_HOE),
                                Ingredient.of(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_HOE
                        )
                        .unlocks(getHasName(Items.COPPER_HOE), has(Items.COPPER_HOE))
                        .unlocks(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(exporter, "diamond_from_copper_hoe");

                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.COPPER_SWORD),
                                Ingredient.of(Items.DIAMOND),
                                RecipeCategory.MISC,
                                Items.DIAMOND_SWORD
                        )
                        .unlocks(getHasName(Items.COPPER_SWORD), has(Items.COPPER_SWORD))
                        .unlocks(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(exporter, "diamond_from_copper_sword");
            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}
