package net.testmod;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class FabricItem extends Item {
    // initialises the item - autodone by pycharm
    public FabricItem(Settings settings) {
        super(settings);
    }

    // Overrides the USE functionality of an item, with World referred to locally as world, PlayerE... et cetera
    // There are many overrides in net.minecraft.item.Item
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        // upon USE, playsound of wool breaking, at max volume and normal pitch
        playerEntity.playSound(SoundEvents.BLOCK_WOOL_BREAK, 1.0F, 1.0F);
        return new TypedActionResult<ItemStack>(ActionResult.SUCCESS, playerEntity.getStackInHand(hand));
    }
}
