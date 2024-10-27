package onlyex.dislocationtechnology.client;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import onlyex.dislocationtechnology.common.CommonProxy;

import static com.onlyex.dislocationtechnology.Tags.MOD_ID;

@Mod.EventBusSubscriber({Side.CLIENT})
public class ClientProxy extends CommonProxy {
    public ClientProxy() {
    }
    public void preLoad() {
        super.preLoad();
    }
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {

    }
}
