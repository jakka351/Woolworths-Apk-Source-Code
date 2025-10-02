package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
abstract class ModernAsyncTask<Result> {
    public static Handler h;
    public volatile Status e = Status.d;
    public final AtomicBoolean f = new AtomicBoolean();
    public final AtomicBoolean g = new AtomicBoolean();
    public final FutureTask d = new FutureTask<Object>(new Callable<Object>() { // from class: androidx.loader.content.ModernAsyncTask.1
        @Override // java.util.concurrent.Callable
        public final Object call() {
            ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
            modernAsyncTask.g.set(true);
            Object objA = null;
            try {
                Process.setThreadPriority(10);
                objA = modernAsyncTask.a();
                Binder.flushPendingCommands();
                return objA;
            } finally {
            }
        }
    }) { // from class: androidx.loader.content.ModernAsyncTask.2
        @Override // java.util.concurrent.FutureTask
        public final void done() {
            ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
            AtomicBoolean atomicBoolean = modernAsyncTask.g;
            try {
                Object obj = get();
                if (atomicBoolean.get()) {
                    return;
                }
                modernAsyncTask.d(obj);
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (CancellationException unused) {
                if (atomicBoolean.get()) {
                    return;
                }
                modernAsyncTask.d(null);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    };

    /* renamed from: androidx.loader.content.ModernAsyncTask$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2822a;

        static {
            int[] iArr = new int[Status.values().length];
            f2822a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2822a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Status {
        public static final Status d;
        public static final Status e;
        public static final Status f;
        public static final /* synthetic */ Status[] g;

        static {
            Status status = new Status("PENDING", 0);
            d = status;
            Status status2 = new Status("RUNNING", 1);
            e = status2;
            Status status3 = new Status("FINISHED", 2);
            f = status3;
            g = new Status[]{status, status2, status3};
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) g.clone();
        }
    }

    public abstract Object a();

    public void b(Object obj) {
    }

    public void c(Object obj) {
    }

    public final void d(final Object obj) {
        Handler handler;
        synchronized (ModernAsyncTask.class) {
            try {
                if (h == null) {
                    h = new Handler(Looper.getMainLooper());
                }
                handler = h;
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new Runnable() { // from class: androidx.loader.content.ModernAsyncTask.3
            @Override // java.lang.Runnable
            public final void run() {
                ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
                Object obj2 = obj;
                if (modernAsyncTask.f.get()) {
                    modernAsyncTask.b(obj2);
                } else {
                    modernAsyncTask.c(obj2);
                }
                modernAsyncTask.e = Status.f;
            }
        });
    }
}
