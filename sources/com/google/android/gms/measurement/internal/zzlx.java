package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzlx implements Runnable {
    final /* synthetic */ zzmb zza;

    public zzlx(zzmb zzmbVar) {
        Objects.requireNonNull(zzmbVar);
        this.zza = zzmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmb zzmbVar = this.zza;
        zzmbVar.zza = zzmbVar.zzw();
    }
}
