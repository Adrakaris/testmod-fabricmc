package net.testmod;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialHammerSickle implements ToolMaterial {
    @Override
    public int getDurability() {
        return 1917;
    }

    @Override
    public float getMiningSpeed() {
        return 19.17f;
    }

    @Override
    public float getAttackDamage() {
        return 10.24f;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 19; // 17
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(TestMod.FABRIC_ITEM);
    }
}
