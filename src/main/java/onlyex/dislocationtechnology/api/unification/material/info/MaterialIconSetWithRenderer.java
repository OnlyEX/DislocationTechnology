package onlyex.dislocationtechnology.api.unification.material.info;

import onlyex.dislocationtechnology.api.items.metaitem.IRenderer;
import onlyex.dislocationtechnology.api.items.metaitem.stats.renderer.IItemRendererManager;
import gregtech.api.unification.material.info.MaterialIconSet;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class MaterialIconSetWithRenderer extends MaterialIconSet implements IRenderer, IItemRendererManager {

    private final IItemRendererManager rendererManager;

    public MaterialIconSetWithRenderer(@Nonnull String name, IItemRendererManager rendererManager) {
        super(name);
        this.rendererManager = rendererManager;
    }

    public MaterialIconSetWithRenderer(@Nonnull String name, @Nonnull MaterialIconSet parentIconset, IItemRendererManager rendererManager) {
        super(name, parentIconset);
        this.rendererManager = rendererManager;
    }

    public MaterialIconSetWithRenderer(@Nonnull String name, @Nullable MaterialIconSet parentIconset, boolean isRootIconset, IItemRendererManager rendererManager) {
        super(name, parentIconset, isRootIconset);
        this.rendererManager = rendererManager;
    }


    @Override
    public IItemRendererManager getRendererManager() {
        return rendererManager;
    }

    @Override
    public void onRendererRegistry(ResourceLocation location) {
        rendererManager.onRendererRegistry(location);
    }
}
