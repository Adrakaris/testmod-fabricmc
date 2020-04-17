package net.testmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.testmod.armour.BaseArmour;
import net.testmod.armour.FabricArmourMaterial;
import net.testmod.tools.HammerSickle;
import net.testmod.tools.PickaxeBase;
import net.testmod.tools.ToolMaterialFabric;
import net.testmod.tools.ToolMaterialHammerSickle;

// mate wtf is this
public class TestMod implements ModInitializer {

    // creates item
    // public static final Item <item name>
    // new Item.Settings().group(ItemGroup.MISC) makes it show up in the MISC section of the creative menu
    // new FabricItem is the class in the same directory
    public static final Item FABRIC_ITEM = new FabricItem(new Item.Settings().group(ItemGroup.MISC));
    public static final Item BORSCHT = new Borscht();  // has settings in class
    public static final Item INGLORIOUS_FABRIC = new IngloriousItem(new Item.Settings().group(ItemGroup.MISC));
    // creats block
    public static final Block FABRIC_BLOCK = new FabricBlock();

    // to make sure the main class doesn't scream at us
    @Override
    public void onInitialize() {
        /*ITEMS*/
        // registers the item in the game as testmod:fabric_item
        Registry.register(Registry.ITEM, new Identifier("testmod", "fabric_item"), FABRIC_ITEM);
        // registers borscht
        Registry.register(Registry.ITEM, new Identifier("testmod", "borscht"), BORSCHT);
        // registers inglorious item
        Registry.register(Registry.ITEM, new Identifier("testmod", "inglorious_fabric"), INGLORIOUS_FABRIC);
        FuelRegistry.INSTANCE.add(INGLORIOUS_FABRIC, 340);  // adds this item as fuel

        /*BLOCKS*/
        // registers the fabric block and its creative item
        Registry.register(Registry.BLOCK, new Identifier("testmod", "fabric_block"), FABRIC_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("testmod", "fabric_block"), new BlockItem(FABRIC_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

        /*TOOLS AND ARMOUR*/
        // register pickaxe
        Registry.register(Registry.ITEM, new Identifier("testmod", "glorious_pickaxe"), new PickaxeBase(new ToolMaterialFabric()));
        // register hammersickle
        Registry.register(Registry.ITEM, new Identifier("testmod", "hammer_sickle"), new HammerSickle(new ToolMaterialHammerSickle()));
        // register armour
        Registry.register(Registry.ITEM, new Identifier("testmod", "glorious_hat"), new BaseArmour(new FabricArmourMaterial(), EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier("testmod", "glorious_chestplate"), new BaseArmour(new FabricArmourMaterial(), EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier("testmod", "glorious_leggings"), new BaseArmour(new FabricArmourMaterial(), EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier("testmod", "glorious_boots"), new BaseArmour(new FabricArmourMaterial(), EquipmentSlot.FEET));

    }

}
