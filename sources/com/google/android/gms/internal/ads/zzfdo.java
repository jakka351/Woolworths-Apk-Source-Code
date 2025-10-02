package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzfdo implements zzgoq {
    final /* synthetic */ zzfdp zza;
    final /* synthetic */ int zzb;

    public zzfdo(zzfdp zzfdpVar, int i) {
        this.zzb = i;
        Objects.requireNonNull(zzfdpVar);
        this.zza = zzfdpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zza.zzc((String) obj, this.zzb, null);
    }
}
