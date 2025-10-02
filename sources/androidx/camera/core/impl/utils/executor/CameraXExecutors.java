package androidx.camera.core.impl.utils.executor;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class CameraXExecutors {
    public static Executor a() {
        if (DirectExecutor.d != null) {
            return DirectExecutor.d;
        }
        synchronized (DirectExecutor.class) {
            try {
                if (DirectExecutor.d == null) {
                    DirectExecutor.d = new DirectExecutor();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return DirectExecutor.d;
    }

    public static Executor b() {
        if (HighPriorityExecutor.e != null) {
            return HighPriorityExecutor.e;
        }
        synchronized (HighPriorityExecutor.class) {
            try {
                if (HighPriorityExecutor.e == null) {
                    HighPriorityExecutor.e = new HighPriorityExecutor();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return HighPriorityExecutor.e;
    }

    public static Executor c() {
        if (IoExecutor.e != null) {
            return IoExecutor.e;
        }
        synchronized (IoExecutor.class) {
            try {
                if (IoExecutor.e == null) {
                    IoExecutor.e = new IoExecutor();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return IoExecutor.e;
    }

    public static ScheduledExecutorService d() {
        if (MainThreadExecutor.f523a != null) {
            return MainThreadExecutor.f523a;
        }
        synchronized (MainThreadExecutor.class) {
            try {
                if (MainThreadExecutor.f523a == null) {
                    MainThreadExecutor.f523a = new HandlerScheduledExecutorService(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return MainThreadExecutor.f523a;
    }

    public static ScheduledExecutorService e(Handler handler) {
        return new HandlerScheduledExecutorService(handler);
    }

    public static Executor f(Executor executor) {
        return new SequentialExecutor(executor);
    }
}
