package onlyex.dislocationtechnology.common.items;

import gregtech.api.items.materialitem.MetaPrefixItem;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.common.items.MetaItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import onlyex.dislocationtechnology.common.CommonProxy;

import java.util.List;

public class DTMetaItems {

    //public static final List<MetaItem<?>> ITEMS = MetaItem.getMetaItems();
    static StandardMetaItem META_ITEM_DT;

    public static MetaItem<?>.MetaValueItem GOOWARE_PROCESSOR;
    public static MetaItem<?>.MetaValueItem GOOWARE_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem GOOWARE_COMPUTER;
    public static MetaItem<?>.MetaValueItem GOOWARE_MAINFRAME;
    public static MetaItem<?>.MetaValueItem OPTICAL_PROCESSOR;
    public static MetaItem<?>.MetaValueItem OPTICAL_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem OPTICAL_COMPUTER;
    public static MetaItem<?>.MetaValueItem OPTICAL_MAINFRAME;
    public static MetaItem<?>.MetaValueItem SPINTRONIC_PROCESSOR;
    public static MetaItem<?>.MetaValueItem SPINTRONIC_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem SPINTRONIC_COMPUTER;
    public static MetaItem<?>.MetaValueItem SPINTRONIC_MAINFRAME;
    public static MetaItem<?>.MetaValueItem COSMIC_PROCESSOR;
    public static MetaItem<?>.MetaValueItem COSMIC_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem COSMIC_COMPUTER;
    public static MetaItem<?>.MetaValueItem COSMIC_MAINFRAME;
    public static MetaItem<?>.MetaValueItem SUPRACAUSAL_PROCESSOR;
    public static MetaItem<?>.MetaValueItem SUPRACAUSAL_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem SUPRACAUSAL_COMPUTER;
    public static MetaItem<?>.MetaValueItem SUPRACAUSAL_MAINFRAME;



    // 20~59
    public static MetaItem<?>.MetaValueItem EU_DOPED_CUBIC_ZIRCONIA_BOULE;
    public static MetaItem<?>.MetaValueItem EU_DOPED_CUBIC_ZIRCONIA_WAFER;
    public static MetaItem<?>.MetaValueItem CRYSTAL_INTERFACE_WAFER;
    public static MetaItem<?>.MetaValueItem CRYSTAL_INTERFACE_PLATE;
    public static MetaItem<?>.MetaValueItem ENGRAVED_RUBY_CRYSTAL_CHIP;
    public static MetaItem<?>.MetaValueItem ENGRAVED_SAPPHIRE_CRYSTAL_CHIP;
    public static MetaItem<?>.MetaValueItem ENGRAVED_DIAMOND_CRYSTAL_CHIP;
    public static MetaItem<?>.MetaValueItem CRYSTAL_MODULATOR_RUBY;
    public static MetaItem<?>.MetaValueItem CRYSTAL_MODULATOR_DIAMOND;
    public static MetaItem<?>.MetaValueItem CRYSTAL_MODULATOR_SAPPHIRE;
    public static MetaItem<?>.MetaValueItem CRYSTAL_SYSTEM_ON_CHIP_SOCKET;
    public static MetaItem<?>.MetaValueItem GLASS_FIBER;
    public static MetaItem<?>.MetaValueItem EUROPIUM_DOPED_MONOCRYSTALLINE_SILICON_BOULE;
    public static MetaItem<?>.MetaValueItem EUROPIUM_DOPED_WAFER;
    public static MetaItem<?>.MetaValueItem AMERICIUM_DOPED_MONOCRYSTALLINE_SILICON_BOULE;
    public static MetaItem<?>.MetaValueItem AMERICIUM_DOPED_WAFER;
    public static MetaItem<?>.MetaValueItem STATION_MKI;
    public static MetaItem<?>.MetaValueItem STATION_MKII;
    public static MetaItem<?>.MetaValueItem STATION_MKIII;
    public static MetaItem<?>.MetaValueItem STATION_MKIV;
    public static MetaItem<?>.MetaValueItem STATION_MKV;
    public static MetaItem<?>.MetaValueItem CRYSTAL_ADVANCED_RAW_CHIP;
    public static MetaItem<?>.MetaValueItem CRYSTAL_OPTICAL_RAW_CHIP;
    public static MetaItem<?>.MetaValueItem CRYSTAL_SPINTRONIC_RAW_CHIP;
    public static MetaItem<?>.MetaValueItem CRYSTAL_COSMIC_RAW_CHIP;
    public static MetaItem<?>.MetaValueItem CRYSTAL_OPTICAL_INTERFACE_PLATE;
    //  Cosmic Components
    public static MetaItem<?>.MetaValueItem COSMIC_INFORMATION_MODULE;
    public static MetaItem<?>.MetaValueItem HOLOGRAPHIC_INFORMATION_IMC;
    public static MetaItem<?>.MetaValueItem CLADDED_OPTICAL_FIBER_CORE;
    public static MetaItem<?>.MetaValueItem CLOSED_TIMELIKE_CURVE_COMPUTATIONAL_UNIT;
    public static MetaItem<?>.MetaValueItem CLOSED_TIMELIKE_CURVE_GUIDANCE_UNIT;

    public static void init() {
        META_ITEM_DT = new DTMetaItem1();

    }
}
