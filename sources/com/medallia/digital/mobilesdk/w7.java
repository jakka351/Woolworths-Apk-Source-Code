package com.medallia.digital.mobilesdk;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
final class w7 {
    private static w7 c;

    /* renamed from: a, reason: collision with root package name */
    private final Executor f16761a = Executors.newSingleThreadExecutor();
    private final Executor b = new b();

    public static class b implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f16762a;

        private b() {
            this.f16762a = new Handler(Looper.getMainLooper());
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f16762a.post(runnable);
        }
    }

    private w7() {
    }

    public static w7 b() {
        if (c == null) {
            c = new w7();
        }
        return c;
    }

    public Executor a() {
        return this.f16761a;
    }

    public Executor c() {
        return this.b;
    }
}
