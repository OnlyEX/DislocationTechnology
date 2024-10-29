package onlyex.dislocationtechnology.common.items;

import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.ore.OrePrefix;
import onlyex.dislocationtechnology.client.renderer.texture.DTTextures;
import onlyex.dislocationtechnology.common.CommonProxy;
import onlyex.dislocationtechnology.common.items.behaviors.renderer.HaloRenderItemBehavior;

import static onlyex.dislocationtechnology.common.items.DTMetaItems.*;

public class DTMetaItem1 extends StandardMetaItem {

    public DTMetaItem1() {
        this.setRegistryName("meta_item_dt");
        setCreativeTabs(CommonProxy.DT_TAB);
    }

    @Override
    public void registerSubItems() {

        //ID 0~19

        GOOWARE_PROCESSOR = this.addItem(0, "circuit.gooware_processor")
                .setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.ZPM);
        GOOWARE_ASSEMBLY = this.addItem(1, "circuit.gooware_assembly")
                .setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UV);
        GOOWARE_COMPUTER = this.addItem(2, "circuit.gooware_computer")
                .setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV);
        GOOWARE_MAINFRAME = this.addItem(3, "circuit.gooware_mainframe")
                .setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);

        OPTICAL_PROCESSOR = this.addItem(4, "circuit.optical_processor")
                .setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UV);
        OPTICAL_ASSEMBLY = this.addItem(5, "circuit.optical_assembly")
                .setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV);
        OPTICAL_COMPUTER = this.addItem(6, "circuit.optical_computer")
                .setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);
        OPTICAL_MAINFRAME = this.addItem(7, "circuit.optical_mainframe")
                .setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);

        SPINTRONIC_PROCESSOR = this.addItem(8, "circuit.spintronic_processor")
                .setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV);
        SPINTRONIC_ASSEMBLY = this.addItem(9, "circuit.spintronic_assembly")
                .setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);
        SPINTRONIC_COMPUTER = this.addItem(10, "circuit.spintronic_computer")
                .setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);
        SPINTRONIC_MAINFRAME = this.addItem(11, "circuit.spintronic_mainframe")
                .setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV);

        COSMIC_PROCESSOR = this.addItem(12, "circuit.cosmic_processor")
                .setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);
        COSMIC_ASSEMBLY = this.addItem(13, "circuit.cosmic_assembly")
                .setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);
        COSMIC_COMPUTER = this.addItem(14, "circuit.cosmic_computer")
                .setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV);
        COSMIC_MAINFRAME = this.addItem(15, "circuit.cosmic_mainframe")
                .setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.OpV);

        SUPRACAUSAL_PROCESSOR = this.addItem(16, "circuit.supracausal_processor")
                .setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV)
                .addComponents(new HaloRenderItemBehavior(10, 0xFF000000, () -> DTTextures.HALO, true));
        SUPRACAUSAL_ASSEMBLY = this.addItem(17, "circuit.supracausal_assembly")
                .setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV)
                .addComponents(new HaloRenderItemBehavior(10, 0xFF000000, () -> DTTextures.HALO, true));
        SUPRACAUSAL_COMPUTER = this.addItem(18, "circuit.supracausal_computer")
                .setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.OpV)
                .addComponents(new HaloRenderItemBehavior(10, 0xFF000000, () -> DTTextures.HALO, true));
        SUPRACAUSAL_MAINFRAME = this.addItem(19, "circuit.supracausal_mainframe")
                .setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.MAX)
                .addComponents(new HaloRenderItemBehavior(10, 0xFF000000, () -> DTTextures.HALO, true));

        //ID 20~59
        EU_DOPED_CUBIC_ZIRCONIA_BOULE = this.addItem(20, "boule.cubic_zirconia.europium");
        EU_DOPED_CUBIC_ZIRCONIA_WAFER = this.addItem(21, "wafer.cubic_zirconia.europium");
        CRYSTAL_INTERFACE_WAFER = this.addItem(22, "wafer.crystal.interface");
        CRYSTAL_INTERFACE_PLATE = this.addItem(23, "plate.crystal.interface");
        ENGRAVED_RUBY_CRYSTAL_CHIP = this.addItem(24, "engraved.crystal_chip.ruby");
        ENGRAVED_SAPPHIRE_CRYSTAL_CHIP = this.addItem(25, "engraved.crystal_chip.sapphire");
        ENGRAVED_DIAMOND_CRYSTAL_CHIP = this.addItem(26, "engraved.crystal_chip.diamond");
        CRYSTAL_MODULATOR_RUBY = this.addItem(27, "crystal.modulator.ruby");
        CRYSTAL_MODULATOR_SAPPHIRE = this.addItem(28, "crystal.modulator.sapphire");
        CRYSTAL_MODULATOR_DIAMOND = this.addItem(29, "crystal.modulator.diamond");
        CRYSTAL_SYSTEM_ON_CHIP_SOCKET = this.addItem(30, "crystal.system_on_chip.socket");
        GLASS_FIBER = this.addItem(31, "glass_fiber");
        EUROPIUM_DOPED_MONOCRYSTALLINE_SILICON_BOULE = this.addItem(32, "europium_doped_monocrystalline_silicon_boule");
        EUROPIUM_DOPED_WAFER = this.addItem(33, "europium_doped_wafer");
        AMERICIUM_DOPED_MONOCRYSTALLINE_SILICON_BOULE = this.addItem(34, "americium_doped_monocrystalline_silicon_boule");
        AMERICIUM_DOPED_WAFER = this.addItem(35, "americium_doped_wafer");
        STATION_MKI = this.addItem(36, "station_1");
        STATION_MKII = this.addItem(37, "station_2");
        STATION_MKIII = this.addItem(38, "station_3");
        STATION_MKIV = this.addItem(39, "station_4");
        STATION_MKV = this.addItem(40, "station_5");
        CRYSTAL_ADVANCED_RAW_CHIP = this.addItem(41, "crystal.advanced_raw_chip");
        /*GRINDBALL_SOAPSTONE = this.addItem(42, "mill.grindball_soapstone")
                .setMaxStackSize(1).addComponents(new MillBallBehavior());
        GRINDBALL_ALUMINIUM = this.addItem(43, "mill.grindball_aluminium")
                .setMaxStackSize(1).addComponents(new MillBallBehavior());
        NULL = this.addItem(44, "null")
                .addComponents(new CosmicRenderItemBehavior(() -> NTTextures.MASK_INGOT, 1));
        PINE_CONE = this.addItem(45, "item.pine_cone");
        PINE_FRAGMENT = this.addItem(46, "item.pine_fragment");
        BIOLOGY_INTEGRATED_CIRCUIT = this.addItem(47, "item.biology_integrated_circuit")
                .addComponents(new IntBcircuitBehavior());
        CHROMATIC_LENS = this.addItem(48, "chromatic_lens")
                .addOreDict("craftingLensChromatic");
        QCD_PROTECTIVE_PLATING = this.addItem(49, "qcd_protective_plating");
        COSMIC_FABRIC = this.addItem(50, "cosmic_fabric");
        CRYSTAL_OPTICAL_RAW_CHIP = this.addItem(51, "crystal.optical_raw_chip");
        CRYSTAL_SPINTRONIC_RAW_CHIP = this.addItem(52, "crystal.spintronic_raw_chip");
        CRYSTAL_COSMIC_RAW_CHIP = this.addItem(53, "crystal.cosmic_raw_chip");
        CRYSTAL_OPTICAL_INTERFACE_PLATE = this.addItem(54, "plate.crystal.optical_interface");*/

    }
}