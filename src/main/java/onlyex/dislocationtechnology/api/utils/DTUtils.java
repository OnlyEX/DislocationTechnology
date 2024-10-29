package onlyex.dislocationtechnology.api.utils;

import net.minecraft.util.ResourceLocation;

import static com.onlyex.dislocationtechnology.Tags.MOD_ID;

public class DTUtils {//TODO @NotNull
    public static ResourceLocation naxId(String path) {
            return new ResourceLocation(MOD_ID, path);
    }
}
