package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes5.dex */
public final class zzuj extends zzbe {
    private final zzaj zzb;

    public zzuj(zzaj zzajVar) {
        this.zzb = zzajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final zzbd zzb(int i, zzbd zzbdVar, long j) {
        zzbdVar.zza(zzbd.zza, this.zzb, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        zzbdVar.zzk = true;
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final zzbc zzd(int i, zzbc zzbcVar, boolean z) {
        zzbcVar.zza(z ? 0 : null, z ? zzui.zzc : null, 0, -9223372036854775807L, 0L, zzb.zza, true);
        return zzbcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zze(Object obj) {
        return obj == zzui.zzc ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final Object zzf(int i) {
        return zzui.zzc;
    }
}
