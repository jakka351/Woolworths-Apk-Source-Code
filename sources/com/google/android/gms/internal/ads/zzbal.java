package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzbal implements Runnable {
    final /* synthetic */ zzbap zza;

    public zzbal(zzbap zzbapVar) {
        Objects.requireNonNull(zzbapVar);
        this.zza = zzbapVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzg();
    }
}
