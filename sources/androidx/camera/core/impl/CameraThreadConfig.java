package androidx.camera.core.impl;

import android.os.Handler;
import com.google.auto.value.AutoValue;
import java.util.concurrent.Executor;

@AutoValue
/* loaded from: classes2.dex */
public abstract class CameraThreadConfig {
    public static CameraThreadConfig a(Executor executor, Handler handler) {
        return new AutoValue_CameraThreadConfig(executor, handler);
    }

    public abstract Executor b();

    public abstract Handler c();
}
