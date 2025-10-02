package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
final class zzjv implements Executor {
    final /* synthetic */ zzlj zza;

    public zzjv(zzlj zzljVar) {
        Objects.requireNonNull(zzljVar);
        this.zza = zzljVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) throws IllegalStateException {
        this.zza.zzu.zzaW().zzj(runnable);
    }
}
