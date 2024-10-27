package onlyex.dislocationtechnology;

import com.onlyex.dislocationtechnology.Tags;
import gregtech.api.worldgen.config.WorldGenRegistry;
import gregtech.common.ConfigHolder;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import onlyex.dislocationtechnology.api.utils.DTLog;
import onlyex.dislocationtechnology.common.CommonProxy;
import onlyex.dislocationtechnology.common.items.DTMetaItems;

import java.io.IOException;

@Mod(
        modid = Tags.MOD_ID,
        name = Tags.MOD_NAME,
        version = Tags.VERSION,
        acceptedMinecraftVersions = "[1.12.2,1.13)",
        dependencies = "required-after:gregtech@[2.8.10-beta,);")
public class DislocationTechnology {

    @SidedProxy(
            modId = Tags.MOD_ID,
            clientSide = "onlyex.dislocationtechnology.client.ClientProxy",
            serverSide = "onlyex.dislocationtechnology.common.CommonProxy"
    )
    public static CommonProxy proxy;
    @Mod.EventHandler
    public void onConstruction(FMLConstructionEvent event) {
        ConfigHolder.machines.highTierContent = true;
    }


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        DTLog.init(event.getModLog());
        ConfigHolder.machines.highTierContent = true;
        DTLog.logger.info("Enabled GregTechCEu highTierContent");
        DTMetaItems.init();

        proxy.onPreLoad();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {
        try {
            WorldGenRegistry.INSTANCE.reinitializeRegisteredVeins();
        } catch (IOException | RuntimeException exception) {
            DTLog.logger.fatal("Failed to initialize worldgen registry.", exception);
        }
    }
}
