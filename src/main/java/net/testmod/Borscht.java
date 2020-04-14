package net.testmod;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.world.World;

public class Borscht extends Item {
    public Borscht() {
        super(new Item.Settings().group(ItemGroup.FOOD).maxCount(1).food(new FoodComponent.Builder()
                .hunger(16).saturationModifier(0.625f).meat().statusEffect(new StatusEffectInstance(
                        StatusEffects.HEALTH_BOOST, 20*60, 0), 0.8f).build()));
    }

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack itemStack = super.finishUsing(stack, world, user);
        return user instanceof PlayerEntity && ((PlayerEntity)user).abilities.creativeMode ? itemStack : new ItemStack(Items.BOWL);
    }

}
