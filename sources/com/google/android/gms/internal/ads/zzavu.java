package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzavu implements Runnable {
    final /* synthetic */ zzavx zza;

    public zzavu(zzavx zzavxVar) {
        Objects.requireNonNull(zzavxVar);
        this.zza = zzavxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzr();
    }
}
