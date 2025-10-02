package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;

@UnstableApi
/* loaded from: classes2.dex */
public interface Clock {

    /* renamed from: a, reason: collision with root package name */
    public static final SystemClock f2906a = new SystemClock();

    long a();

    HandlerWrapper b(Looper looper, Handler.Callback callback);

    long currentTimeMillis();

    long elapsedRealtime();

    long nanoTime();
}
