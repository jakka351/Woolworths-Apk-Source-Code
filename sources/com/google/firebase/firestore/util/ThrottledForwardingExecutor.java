package com.google.firebase.firestore.util;

import android.os.AsyncTask;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;

/* loaded from: classes6.dex */
class ThrottledForwardingExecutor implements Executor {
    public final Executor d;
    public final Semaphore e;

    public ThrottledForwardingExecutor() {
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        this.e = new Semaphore(4);
        this.d = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (!this.e.tryAcquire()) {
            runnable.run();
            return;
        }
        try {
            this.d.execute(new d(0, this, runnable));
        } catch (RejectedExecutionException unused) {
            runnable.run();
        }
    }
}
