package io.reactivex.android.schedulers;

import android.os.Handler;
import android.os.Looper;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.Exceptions;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class AndroidSchedulers {

    /* renamed from: a, reason: collision with root package name */
    public static final Scheduler f24220a;

    /* renamed from: io.reactivex.android.schedulers.AndroidSchedulers$1, reason: invalid class name */
    public static class AnonymousClass1 implements Callable<Scheduler> {
        @Override // java.util.concurrent.Callable
        public final Scheduler call() {
            return MainHolder.f24221a;
        }
    }

    public static final class MainHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final Scheduler f24221a = new HandlerScheduler(new Handler(Looper.getMainLooper()));
    }

    static {
        try {
            Scheduler scheduler = MainHolder.f24221a;
            if (scheduler == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            f24220a = scheduler;
        } catch (Throwable th) {
            Exceptions.a(th);
            throw null;
        }
    }

    public static Scheduler a() {
        Scheduler scheduler = f24220a;
        if (scheduler != null) {
            return scheduler;
        }
        throw new NullPointerException("scheduler == null");
    }
}
