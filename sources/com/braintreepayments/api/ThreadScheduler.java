package com.braintreepayments.api;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
class ThreadScheduler implements Scheduler {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f13750a;
    public final ExecutorService b;

    public ThreadScheduler() {
        Handler handler = new Handler(Looper.getMainLooper());
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.f13750a = handler;
        this.b = executorServiceNewCachedThreadPool;
    }

    public final void a(Runnable runnable) {
        this.f13750a.post(runnable);
    }
}
