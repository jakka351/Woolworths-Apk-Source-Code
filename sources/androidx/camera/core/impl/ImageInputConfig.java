package androidx.camera.core.impl;

import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.Config;

/* loaded from: classes2.dex */
public interface ImageInputConfig extends ReadableConfig {
    public static final Config.Option f = new AutoValue_Config_Option(Integer.TYPE, null, "camerax.core.imageInput.inputFormat");
    public static final Config.Option g = new AutoValue_Config_Option(DynamicRange.class, null, "camerax.core.imageInput.inputDynamicRange");

    public interface Builder<B> {
    }

    default int j() {
        return ((Integer) a(f)).intValue();
    }

    default DynamicRange u() {
        DynamicRange dynamicRange = (DynamicRange) c(g, DynamicRange.c);
        dynamicRange.getClass();
        return dynamicRange;
    }

    default boolean w() {
        return d(g);
    }
}
