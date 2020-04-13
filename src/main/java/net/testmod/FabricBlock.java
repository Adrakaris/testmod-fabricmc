package net.testmod;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class FabricBlock extends Block {
    public FabricBlock() {
        // .strength sets Hardness, Resistance together
        // uses Fabric API block settings not MC ones
        super(FabricBlockSettings.of(Material.WOOL).breakByHand(true).breakByTool(FabricToolTags.HOES).sounds(BlockSoundGroup.WOOL).strength(0.8F, 0.8F).build());
        // super(FabricBlockSettings.copy(Material.WHITE_WOOL) to directly copy a block settings
    }

}
