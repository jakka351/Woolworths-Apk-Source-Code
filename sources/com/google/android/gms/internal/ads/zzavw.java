package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzavw implements Runnable {
    final /* synthetic */ zzavx zza;

    public zzavw(zzavx zzavxVar) {
        Objects.requireNonNull(zzavxVar);
        this.zza = zzavxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbci.zza(this.zza.zza);
    }
}
