package androidx.camera.core.impl;

import android.util.Size;
import androidx.camera.core.AspectRatio;
import androidx.camera.core.impl.Config;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public interface ImageOutputConfig extends ReadableConfig {
    public static final Config.Option h = new AutoValue_Config_Option(AspectRatio.class, null, "camerax.core.imageOutput.targetAspectRatio");
    public static final Config.Option i;
    public static final Config.Option j;
    public static final Config.Option k;
    public static final Config.Option l;
    public static final Config.Option m;
    public static final Config.Option n;
    public static final Config.Option o;
    public static final Config.Option p;
    public static final Config.Option q;

    public interface Builder<B> {
        Object a(int i);

        Object c(ResolutionSelector resolutionSelector);

        Object d(Size size);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface OptionalRotationValue {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RotationDegreesValue {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RotationValue {
    }

    static {
        Class cls = Integer.TYPE;
        i = new AutoValue_Config_Option(cls, null, "camerax.core.imageOutput.targetRotation");
        j = new AutoValue_Config_Option(cls, null, "camerax.core.imageOutput.appTargetRotation");
        k = new AutoValue_Config_Option(cls, null, "camerax.core.imageOutput.mirrorMode");
        l = new AutoValue_Config_Option(Size.class, null, "camerax.core.imageOutput.targetResolution");
        m = new AutoValue_Config_Option(Size.class, null, "camerax.core.imageOutput.defaultResolution");
        n = new AutoValue_Config_Option(Size.class, null, "camerax.core.imageOutput.maxResolution");
        o = new AutoValue_Config_Option(List.class, null, "camerax.core.imageOutput.supportedResolutions");
        p = new AutoValue_Config_Option(ResolutionSelector.class, null, "camerax.core.imageOutput.resolutionSelector");
        q = new AutoValue_Config_Option(List.class, null, "camerax.core.imageOutput.customOrderedResolutions");
    }

    static void J(ImageOutputConfig imageOutputConfig) {
        boolean zM = imageOutputConfig.M();
        boolean z = imageOutputConfig.n() != null;
        if (zM && z) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (imageOutputConfig.F() != null) {
            if (zM || z) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default int D() {
        return ((Integer) c(j, -1)).intValue();
    }

    default List E() {
        return (List) c(o, null);
    }

    default ResolutionSelector F() {
        return (ResolutionSelector) c(p, null);
    }

    default Size H() {
        return (Size) c(m, null);
    }

    default boolean M() {
        return d(h);
    }

    default int N() {
        return ((Integer) a(h)).intValue();
    }

    default ResolutionSelector l() {
        return (ResolutionSelector) a(p);
    }

    default Size n() {
        return (Size) c(l, null);
    }

    default Size q() {
        return (Size) c(n, null);
    }

    default int s(int i2) {
        return ((Integer) c(i, Integer.valueOf(i2))).intValue();
    }

    default int v() {
        return ((Integer) c(k, -1)).intValue();
    }

    default ArrayList z() {
        List list = (List) c(q, null);
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }
}
