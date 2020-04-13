package net.testmod;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialFabric implements ToolMaterial {

    @Override
    public int getDurability() {
        return 69;
    }

    @Override
    public float getMiningSpeed() {
        return 16.9f;
    }

    @Override
    public float getAttackDamage() {
        return 0.5f;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 24;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(TestMod.FABRIC_ITEM);
    }
}
