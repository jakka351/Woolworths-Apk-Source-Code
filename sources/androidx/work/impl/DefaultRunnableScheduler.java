package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.work.RunnableScheduler;

@RestrictTo
/* loaded from: classes.dex */
public class DefaultRunnableScheduler implements RunnableScheduler {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f3917a = Handler.createAsync(Looper.getMainLooper());

    @Override // androidx.work.RunnableScheduler
    public final void a(Runnable runnable, long j) {
        this.f3917a.postDelayed(runnable, j);
    }

    @Override // androidx.work.RunnableScheduler
    public final void b(Runnable runnable) {
        this.f3917a.removeCallbacks(runnable);
    }
}
