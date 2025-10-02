package androidx.camera.core.internal;

import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ReadableConfig;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public interface ThreadConfig extends ReadableConfig {
    public static final Config.Option F = Config.Option.a(Executor.class, "camerax.core.thread.backgroundExecutor");

    public interface Builder<B> {
    }
}
