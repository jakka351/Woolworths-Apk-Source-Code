package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzfky implements Runnable {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zze zza;
    final /* synthetic */ zzflb zzb;

    public zzfky(zzflb zzflbVar, com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza = zzeVar;
        Objects.requireNonNull(zzflbVar);
        this.zzb = zzflbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzw(this.zza);
    }
}
