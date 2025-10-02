package androidx.camera.core.internal;

import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ReadableConfig;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public interface IoConfig extends ReadableConfig {
    public static final Config.Option C = Config.Option.a(Executor.class, "camerax.core.io.ioExecutor");

    public interface Builder<B> {
    }
}
