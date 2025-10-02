package com.google.android.play.core.review.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes6.dex */
public abstract class zzj implements Runnable {
    public final TaskCompletionSource d;

    public zzj() {
        this.d = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            TaskCompletionSource taskCompletionSource = this.d;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e);
            }
        }
    }

    public zzj(TaskCompletionSource taskCompletionSource) {
        this.d = taskCompletionSource;
    }
}
