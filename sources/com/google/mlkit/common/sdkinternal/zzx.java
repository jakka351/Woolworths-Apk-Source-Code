package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.Closeable;

/* loaded from: classes6.dex */
final class zzx implements Closeable {
    public final /* synthetic */ TaskQueue d;

    public /* synthetic */ zzx(TaskQueue taskQueue) {
        this.d = taskQueue;
        Preconditions.checkState(((Thread) taskQueue.d.getAndSet(Thread.currentThread())) == null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        TaskQueue taskQueue = this.d;
        taskQueue.d.set(null);
        taskQueue.b();
    }
}
