package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzcal implements Runnable {
    final /* synthetic */ zzcar zza;

    public zzcal(zzcar zzcarVar) {
        Objects.requireNonNull(zzcarVar);
        this.zza = zzcarVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzI("surfaceCreated", new String[0]);
    }
}
