package com.google.firebase.firestore.util;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Date;

/* loaded from: classes6.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ThrottledForwardingExecutor throttledForwardingExecutor = (ThrottledForwardingExecutor) this.e;
                Runnable runnable = (Runnable) this.f;
                throttledForwardingExecutor.getClass();
                runnable.run();
                throttledForwardingExecutor.e.release();
                return;
            case 1:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.e;
                try {
                    ((b) this.f).call();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    throw new RuntimeException(e);
                }
            case 2:
                BackgroundQueue backgroundQueue = (BackgroundQueue) this.e;
                Runnable runnable2 = (Runnable) this.f;
                backgroundQueue.getClass();
                runnable2.run();
                backgroundQueue.d.release();
                return;
            default:
                ExponentialBackoff exponentialBackoff = (ExponentialBackoff) this.e;
                com.google.firebase.firestore.remote.a aVar = (com.google.firebase.firestore.remote.a) this.f;
                exponentialBackoff.getClass();
                exponentialBackoff.g = new Date().getTime();
                aVar.run();
                return;
        }
    }
}
