package net.testmod.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

// reusable for all tool materials
public class PickaxeBase extends PickaxeItem {
    public PickaxeBase(ToolMaterial material) {
        super(material, 3, -2.0f, new Item.Settings().group(ItemGroup.TOOLS).maxCount(1));
    }

}
