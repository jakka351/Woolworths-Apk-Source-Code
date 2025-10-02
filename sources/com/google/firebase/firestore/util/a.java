package com.google.firebase.firestore.util;

import com.google.firebase.firestore.util.AsyncQueue;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                Throwable th = (Throwable) this.e;
                if (!(th instanceof OutOfMemoryError)) {
                    throw new RuntimeException("Internal error in Cloud Firestore (26.0.0).", th);
                }
                OutOfMemoryError outOfMemoryError = new OutOfMemoryError("Firestore (26.0.0) ran out of memory. Check your queries to make sure they are not loading an excessive amount of data.");
                outOfMemoryError.initCause(th);
                throw outOfMemoryError;
            default:
                AsyncQueue.DelayedTask delayedTask = (AsyncQueue.DelayedTask) this.e;
                delayedTask.c.d();
                if (delayedTask.b != null) {
                    delayedTask.b();
                    delayedTask.f15595a.run();
                    return;
                }
                return;
        }
    }
}
