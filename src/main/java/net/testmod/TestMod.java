package net.testmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

// mate wtf is this
public class TestMod implements ModInitializer {

    // creates item
    // public static final Item <item name>
    // new Item.Settings().group(ItemGroup.MISC) makes it show up in the MISC section of the creative menu
    // new FabricItem is the class in the same directory
    public static final Item FABRIC_ITEM = new FabricItem(new Item.Settings().group(ItemGroup.MISC));
    // borscht is a food
    public static final Item BORSCHT = new Borscht(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(16).saturationModifier(30f).meat().statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 20*60, 0), 0.8f).build()));
    // amerikan flag bad lol
    public static final Item INGLORIOUS_FABRIC = new IngloriousItem(new Item.Settings().group(ItemGroup.MISC));

    // creats block
    public static final Block FABRIC_BLOCK = new FabricBlock();

    // to make sure the main class doesn't scream at us
    @Override
    public void onInitialize() {
        // registers the item in the game as testmod:fabric_item
        Registry.register(Registry.ITEM, new Identifier("testmod", "fabric_item"), FABRIC_ITEM);
        // registers the fabric block and its creative item
        Registry.register(Registry.BLOCK, new Identifier("testmod", "fabric_block"), FABRIC_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("testmod", "fabric_block"), new BlockItem(FABRIC_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        // registers borscht
        Registry.register(Registry.ITEM, new Identifier("testmod", "borscht"), BORSCHT);
        // registers inglorious item
        Registry.register(Registry.ITEM, new Identifier("testmod", "inglorious_fabric"), INGLORIOUS_FABRIC);
        FuelRegistry.INSTANCE.add(INGLORIOUS_FABRIC, 340);  // adds this item as fuel
        // register pickaxe
        Registry.register(Registry.ITEM, new Identifier("testmod", "glorious_pickaxe"), new PickaxeBase(new ToolMaterialFabric()));
        // register hammersickle
        Registry.register(Registry.ITEM, new Identifier("testmod", "hammer_sickle"), new HammerSickle(new ToolMaterialHammerSickle()));
    }

}
