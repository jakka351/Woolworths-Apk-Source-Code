package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes5.dex */
final class zzdys implements zzgoq {
    final /* synthetic */ Context zza;

    public zzdys(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        if (((Boolean) zzbea.zzh.zze()).booleanValue() && (th instanceof com.google.android.gms.ads.internal.util.zzaz)) {
            zzbbt.zze(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        if (((Boolean) zzbea.zzj.zze()).booleanValue()) {
            zzbbt.zze(this.zza);
        }
    }
}
