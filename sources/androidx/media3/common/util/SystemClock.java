package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;

@UnstableApi
/* loaded from: classes2.dex */
public class SystemClock implements Clock {
    @Override // androidx.media3.common.util.Clock
    public final long a() {
        return android.os.SystemClock.uptimeMillis();
    }

    @Override // androidx.media3.common.util.Clock
    public final HandlerWrapper b(Looper looper, Handler.Callback callback) {
        return new SystemHandlerWrapper(new Handler(looper, callback));
    }

    @Override // androidx.media3.common.util.Clock
    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // androidx.media3.common.util.Clock
    public final long elapsedRealtime() {
        return android.os.SystemClock.elapsedRealtime();
    }

    @Override // androidx.media3.common.util.Clock
    public final long nanoTime() {
        return System.nanoTime();
    }
}
