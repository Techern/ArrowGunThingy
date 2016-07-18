package info.zthings.agt.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * An extension of {@link CommonProxy} for the client
 *
 * @since 0.0.1
 */
public class ClientProxy extends CommonProxy {

    /**
     * Registers an {@link Item} in the {@link ItemModelMesher}
     *
     * @param item     The {@link Item} being registered
     * @param metadata The metadata of said item
     * @param itemName The item's name
     *
     * @since 0.0.1
     */
    @Override
    public void registerItemModelMesher(Item item, int metadata) {
    	System.out.println(new ModelResourceLocation("agt:" + item.getUnlocalizedName()).toString());
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, metadata, new ModelResourceLocation("agt:" + item.getUnlocalizedName()));
    }

}
