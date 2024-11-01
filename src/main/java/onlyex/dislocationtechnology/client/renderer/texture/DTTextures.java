package onlyex.dislocationtechnology.client.renderer.texture;

import codechicken.lib.texture.TextureUtils;
import onlyex.dislocationtechnology.api.utils.DTUtils;
import gregtech.client.renderer.texture.cube.OrientedOverlayRenderer;
import gregtech.client.renderer.texture.cube.SimpleOverlayRenderer;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;

public class DTTextures {
//public static final OrientedOverlayRenderer ;
/*
SimpleSidedCubeRenderer
SimpleOverlayRenderer
OrientedOverlayRenderer
*/
    //dislocationtechnology-

    //-casings
    /*public static DTOverlayRenderer PACKAGING_LINE =
            new DTOverlayRenderer("casings/solid/machine_packaging_line");
    public static DTOverlayRenderer ADVANCED_ASSEMBLY_LINE =
            new DTOverlayRenderer("casings/solid/advanced_assembly_line");
    public static DTOverlayRenderer QUANTUM_CONSTRAINT_CASING =
            new DTOverlayRenderer("casings/quantum_force_transformer_casing/quantum_constraint_casing");
    public static DTOverlayRenderer ADVANCED_INVAR_CASING =
            new DTOverlayRenderer("casings/solid/advanced_invar_casing");
    public static DTOverlayRenderer ADVANCED_ALUMINIUM_CASING =
            new DTOverlayRenderer("casings/solid/advanced_aluminium_casing");
    public static DTOverlayRenderer PRECISE_ASSEMBLER_CASING_MK1 =
            new DTOverlayRenderer("casings/solid/precise_assembler_casing_mk1");
    public static DTOverlayRenderer PRECISE_ASSEMBLER_CASING_MK2 =
            new DTOverlayRenderer("casings/solid/precise_assembler_casing_mk2");
    public static DTOverlayRenderer PRECISE_ASSEMBLER_CASING_MK3 =
            new DTOverlayRenderer("casings/solid/precise_assembler_casing_mk3");
    public static DTOverlayRenderer IRIDIUM_CASING =
            new DTOverlayRenderer("casings/solid/advanced_assembly_line");
    public static DTOverlayRenderer FLOTATION_CASING =
            new DTOverlayRenderer("casings/solid/flotation_casing");
    public static DTOverlayRenderer ISA_MILL_CASING =
            new DTOverlayRenderer("casings/solid/isa_mill_casing");

    //-multiparts
    public static DTOverlayRenderer MULTIPART_CATALYST_HATCH =
            new DTOverlayRenderer("multiparts/overlay_catalyst_hatch");
    public static DTOverlayRenderer MULTIPART_BUFFER_HATCH =
            new DTOverlayRenderer("multiparts/overlay_buffer_hatch");
    public static DTOverlayRenderer INF_WATER =
            new DTOverlayRenderer("multiparts/overlay_water");*/

    public static final SimpleOverlayRenderer RESEARCH_DATA_ACCESS_HATCH =
            new SimpleOverlayRenderer("overlay/machine/overlay_data_hatch_optical");


    //gregtech-
    public static OrientedOverlayRenderer ISA_MILL_OVERLAY =
            new OrientedOverlayRenderer("multiblock/isa_mill");
    public static OrientedOverlayRenderer CRYOGENIC_REACTOR_OVERLAY =
            new OrientedOverlayRenderer("multiblock/cryogenic_reactor");
    public static OrientedOverlayRenderer CVD_UNIT_OVERLAY =
            new OrientedOverlayRenderer("multiblock/cvd_unit");
    public static OrientedOverlayRenderer CHEMICAL_PLANT_OVERLAY =
            new OrientedOverlayRenderer("multiblock/chemical_plant");



//    public static IsaMillRenderer ISA_MILL = new IsaMillRenderer();

    public static TextureAtlasSprite HALO;
    public static TextureAtlasSprite HALO_NOISE;

    public static TextureAtlasSprite MASK_INGOT;
    public static TextureAtlasSprite ETERNAL_SINGULARITY;
    public static TextureAtlasSprite COMBINED_SINGULARITY;
    public static TextureAtlasSprite SUPRA_DIMENSION_RESEARCH_DATA_CARD_HALO;


    public static TextureAtlasSprite[] COSMIC;
    public static TextureAtlasSprite COSMIC_0;
    public static TextureAtlasSprite COSMIC_1;
    public static TextureAtlasSprite COSMIC_2;
    public static TextureAtlasSprite COSMIC_3;
    public static TextureAtlasSprite COSMIC_4;
    public static TextureAtlasSprite COSMIC_5;
    public static TextureAtlasSprite COSMIC_6;
    public static TextureAtlasSprite COSMIC_7;
    public static TextureAtlasSprite COSMIC_8;
    public static TextureAtlasSprite COSMIC_9;

    public static TextureAtlasSprite FORCE_FIELD;


    public static TextureAtlasSprite RESEARCH_PIPE_IN;
    public static TextureAtlasSprite RESEARCH_PIPE_SIDE;
    public static TextureAtlasSprite RESEARCH_PIPE_SIDE_OVERLAY;
    public static TextureAtlasSprite RESEARCH_PIPE_SIDE_OVERLAY_ACTIVE;

    public DTTextures() {}

    public static void register(TextureMap textureMap) {

        HALO = textureMap.registerSprite(DTUtils.ID("items/halo"));
        HALO_NOISE = textureMap.registerSprite(DTUtils.ID("items/halo_noise"));

        SUPRA_DIMENSION_RESEARCH_DATA_CARD_HALO = textureMap.registerSprite(DTUtils.ID("items/supra_dimension_research_data_card_halo"));

        MASK_INGOT = textureMap.registerSprite(DTUtils.ID( "items/mask_ingot"));

        ETERNAL_SINGULARITY = textureMap.registerSprite(DTUtils.ID( "items/eternal_singularity_mask"));
        COMBINED_SINGULARITY = textureMap.registerSprite(DTUtils.ID( "items/combined_singularity_mask"));

        COSMIC_0 = textureMap.registerSprite(DTUtils.ID("shader/cosmic_0"));
        COSMIC_1 = textureMap.registerSprite(DTUtils.ID("shader/cosmic_1"));
        COSMIC_2 = textureMap.registerSprite(DTUtils.ID("shader/cosmic_2"));
        COSMIC_3 = textureMap.registerSprite(DTUtils.ID("shader/cosmic_3"));
        COSMIC_4 = textureMap.registerSprite(DTUtils.ID("shader/cosmic_4"));
        COSMIC_5 = textureMap.registerSprite(DTUtils.ID("shader/cosmic_5"));
        COSMIC_6 = textureMap.registerSprite(DTUtils.ID("shader/cosmic_6"));
        COSMIC_7 = textureMap.registerSprite(DTUtils.ID("shader/cosmic_7"));
        COSMIC_8 = textureMap.registerSprite(DTUtils.ID("shader/cosmic_8"));
        COSMIC_9 = textureMap.registerSprite(DTUtils.ID("shader/cosmic_9"));

        FORCE_FIELD = textureMap.registerSprite(DTUtils.ID("blocks/force_field"));

        COSMIC = new TextureAtlasSprite[] {
                COSMIC_0,
                COSMIC_1,
                COSMIC_2,
                COSMIC_3,
                COSMIC_4,
                COSMIC_5,
                COSMIC_6,
                COSMIC_7,
                COSMIC_8,
                COSMIC_9
        };

        //TODO 材质
        RESEARCH_PIPE_IN = textureMap.registerSprite(DTUtils.ID("blocks/pipe/pipe_research_in"));
        RESEARCH_PIPE_SIDE = textureMap.registerSprite(DTUtils.ID("blocks/pipe/pipe_research_side"));
        RESEARCH_PIPE_SIDE_OVERLAY = textureMap.registerSprite(DTUtils.ID("blocks/pipe/pipe_research_side_overlay"));
        RESEARCH_PIPE_SIDE_OVERLAY_ACTIVE = textureMap.registerSprite(DTUtils.ID("blocks/pipe/pipe_research_side_overlay_active"));
    }
    public static void preInit() {TextureUtils.addIconRegister(DTTextures::register);}
}
