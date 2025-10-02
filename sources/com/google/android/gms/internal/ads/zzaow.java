package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
final class zzaow implements Executor {
    final /* synthetic */ Handler zza;

    public zzaow(zzaoy zzaoyVar, Handler handler) {
        this.zza = handler;
        Objects.requireNonNull(zzaoyVar);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}
