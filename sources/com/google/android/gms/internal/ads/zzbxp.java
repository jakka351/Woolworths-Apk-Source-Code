package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
final class zzbxp implements ThreadFactory {
    private final AtomicInteger zza;

    public zzbxp(zzbxr zzbxrVar) {
        Objects.requireNonNull(zzbxrVar);
        this.zza = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@NonNull Runnable runnable) {
        int andIncrement = this.zza.getAndIncrement();
        return new Thread(runnable, YU.a.n(new StringBuilder(String.valueOf(andIncrement).length() + 31), "AdWorker(SCION_TASK_EXECUTOR) #", andIncrement));
    }
}
