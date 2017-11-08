package org.russia9.updatedblocks.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import org.russia9.updatedblocks.updatedBlocks;

class ItemRabbitHide extends Item {
    ItemRabbitHide(String unlocalizedName) {
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(updatedBlocks.MODID + ":" + unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }
}