package net.testmod;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;

public class FabricBlock extends Block {
    public FabricBlock() {
        // .strength sets Hardness, Resistance together
        // uses Fabric API block settings not MC ones
        super(Settings.copy(Blocks.RED_WOOL));
        // super(FabricBlockSettings.of(Material.WOOL).breakByHand(true).breakByTool(FabricToolTags.SWORDS).sounds(BlockSoundGroup.WOOL).strength(0.8F, 0.8F).build());
    }


}
