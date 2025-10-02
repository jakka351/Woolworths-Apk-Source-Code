package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzfnm implements Runnable {
    final /* synthetic */ zzfnr zza;

    public zzfnm(zzfnr zzfnrVar) {
        Objects.requireNonNull(zzfnrVar);
        this.zza = zzfnrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzh().zzc();
    }
}
