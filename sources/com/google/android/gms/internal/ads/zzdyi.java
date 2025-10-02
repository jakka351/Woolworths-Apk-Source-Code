package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzdyi implements zzgoq {
    final /* synthetic */ zzdyo zza;

    public zzdyi(zzdyo zzdyoVar) {
        Objects.requireNonNull(zzdyoVar);
        this.zza = zzdyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfcu zzfcuVar = (zzfcu) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcw)).booleanValue()) {
            this.zza.zzf().zzdU(zzfcuVar);
        }
    }
}
