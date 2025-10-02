package com.auth0.android.request.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/auth0/android/request/internal/DefaultThreadSwitcher;", "Lcom/auth0/android/request/internal/ThreadSwitcher;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultThreadSwitcher implements ThreadSwitcher {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f13683a;
    public volatile Handler b;

    public DefaultThreadSwitcher() {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(4);
        Intrinsics.g(executorServiceNewFixedThreadPool, "newFixedThreadPool(MAX_CONCURRENT_THREADS)");
        this.f13683a = executorServiceNewFixedThreadPool;
    }

    public final void a(Runnable runnable) {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    Looper mainLooper = Looper.getMainLooper();
                    Intrinsics.g(mainLooper, "getMainLooper()");
                    Handler handlerCreateAsync = Handler.createAsync(mainLooper);
                    Intrinsics.g(handlerCreateAsync, "createAsync(looper)");
                    this.b = handlerCreateAsync;
                }
            }
        }
        Handler handler = this.b;
        if (handler != null) {
            handler.post(runnable);
        }
    }
}
