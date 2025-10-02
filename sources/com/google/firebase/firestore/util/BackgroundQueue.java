package com.google.firebase.firestore.util;

import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* loaded from: classes6.dex */
public class BackgroundQueue implements Executor {
    public final Semaphore d = new Semaphore(0);
    public int e = 0;

    public final void a() throws InterruptedException {
        try {
            this.d.acquire(this.e);
            this.e = 0;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Assert.a("Interrupted while waiting for background task", e);
            throw null;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.e++;
        ((ThrottledForwardingExecutor) Executors.c).execute(new d(2, this, runnable));
    }
}
