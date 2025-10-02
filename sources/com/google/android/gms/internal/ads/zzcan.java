package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzcan implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcar zzb;

    public zzcan(zzcar zzcarVar, boolean z) {
        this.zza = z;
        Objects.requireNonNull(zzcarVar);
        this.zzb = zzcarVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzI("windowVisibilityChanged", new String[]{"isVisible", String.valueOf(this.zza)});
    }
}
