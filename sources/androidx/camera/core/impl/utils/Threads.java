package androidx.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.core.util.Preconditions;

/* loaded from: classes2.dex */
public final class Threads {
    public static void a() {
        Preconditions.f("Not in application's main thread", b());
    }

    public static boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void c(Runnable runnable) {
        if (b()) {
            runnable.run();
        } else {
            Preconditions.f("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }
}
