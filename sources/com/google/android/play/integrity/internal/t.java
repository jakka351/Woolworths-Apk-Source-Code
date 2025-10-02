package com.google.android.play.integrity.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes6.dex */
public abstract class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final TaskCompletionSource f14776a;

    public t() {
        this.f14776a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f14776a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    @Nullable
    public final TaskCompletionSource c() {
        return this.f14776a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e) {
            a(e);
        }
    }

    public t(TaskCompletionSource taskCompletionSource) {
        this.f14776a = taskCompletionSource;
    }
}
