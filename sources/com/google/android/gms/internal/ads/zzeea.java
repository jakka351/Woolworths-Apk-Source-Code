package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
public final class zzeea implements zzedz {

    @VisibleForTesting
    public final zzedz zza;
    private final zzggr zzb;

    public zzeea(zzedz zzedzVar, zzggr zzggrVar) {
        this.zza = zzedzVar;
        this.zzb = zzggrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final boolean zza(zzfcu zzfcuVar, zzfcj zzfcjVar) {
        return this.zza.zza(zzfcuVar, zzfcjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final ListenableFuture zzb(zzfcu zzfcuVar, zzfcj zzfcjVar) {
        return zzgot.zzk(this.zza.zzb(zzfcuVar, zzfcjVar), this.zzb, zzbzh.zza);
    }
}
