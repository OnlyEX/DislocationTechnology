package onlyex.dislocationtechnology.client;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import onlyex.dislocationtechnology.client.event.DTClientEventHandler;
import onlyex.dislocationtechnology.client.renderer.texture.DTTextures;
import onlyex.dislocationtechnology.client.utils.ShaderHelper;
import onlyex.dislocationtechnology.common.CommonProxy;

@SideOnly(Side.CLIENT)
@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    public ClientProxy() {
    }
    public void onPreLoad() {
        super.onPreLoad();
        MinecraftForge.EVENT_BUS.register(new DTClientEventHandler());
        ShaderHelper.initShaders();
        DTTextures.preInit();
    }
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
    }
}
