package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
final class zzzm implements zzzn {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzdf zzb;

    public zzzm(Executor executor, zzdf zzdfVar) {
        this.zza = executor;
        this.zzb = zzdfVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.execute(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzzn
    public final void zza() {
        this.zzb.zza(this.zza);
    }
}
