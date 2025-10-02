package androidx.camera.core.internal;

import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ReadableConfig;

/* loaded from: classes2.dex */
public interface TargetConfig<T> extends ReadableConfig {
    public static final Config.Option D = Config.Option.a(String.class, "camerax.core.target.name");
    public static final Config.Option E = Config.Option.a(Class.class, "camerax.core.target.class");

    public interface Builder<T, B> {
    }

    default String B() {
        return (String) a(D);
    }

    default String m(String str) {
        return (String) c(D, str);
    }
}
