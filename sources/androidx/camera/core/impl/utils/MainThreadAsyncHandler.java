package androidx.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class MainThreadAsyncHandler {

    /* renamed from: a, reason: collision with root package name */
    public static volatile Handler f520a;

    public static Handler a() {
        if (f520a != null) {
            return f520a;
        }
        synchronized (MainThreadAsyncHandler.class) {
            try {
                if (f520a == null) {
                    f520a = Handler.createAsync(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f520a;
    }
}
