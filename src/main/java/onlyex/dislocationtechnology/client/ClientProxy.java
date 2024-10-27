package onlyex.dislocationtechnology.client;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import onlyex.dislocationtechnology.common.CommonProxy;

@SideOnly(Side.CLIENT)
@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    public ClientProxy() {
    }
    public void onPreLoad() {
        super.onPreLoad();
    }
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
    }
}
