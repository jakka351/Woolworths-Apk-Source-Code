package androidx.media3.common.util;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@UnstableApi
/* loaded from: classes2.dex */
public final class BackgroundExecutor {

    /* renamed from: a, reason: collision with root package name */
    public static ExecutorService f2904a;

    public static synchronized Executor a() {
        try {
            if (f2904a == null) {
                int i = Util.f2928a;
                f2904a = Executors.newSingleThreadExecutor(new e("ExoPlayer:BackgroundExecutor"));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2904a;
    }
}
