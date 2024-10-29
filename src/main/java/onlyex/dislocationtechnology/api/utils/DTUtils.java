package onlyex.dislocationtechnology.api.utils;

import org.jetbrains.annotations.NotNull;
import net.minecraft.util.ResourceLocation;
import onlyex.dislocationtechnology.api.DTValues;

public class DTUtils {
    @NotNull
    public static ResourceLocation ID(@NotNull String path) {
            return new ResourceLocation(DTValues.MOD_ID, path);
    }
}
