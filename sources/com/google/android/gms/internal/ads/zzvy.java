package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;

/* loaded from: classes5.dex */
final class zzvy implements zzyp {
    public long zza;
    public long zzb;

    @Nullable
    public zzyo zzc;

    @Nullable
    public zzvy zzd;

    public zzvy(long j, int i) {
        zza(j, 65536);
    }

    public final void zza(long j, int i) {
        zzghc.zzh(this.zzc == null);
        this.zza = j;
        this.zzb = j + llqqqql.c0063ccc00630063;
    }

    public final int zzb(long j) {
        long j2 = j - this.zza;
        int i = this.zzc.zzb;
        return (int) j2;
    }

    public final zzvy zzc() {
        this.zzc = null;
        zzvy zzvyVar = this.zzd;
        this.zzd = null;
        return zzvyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final zzyo zzd() {
        zzyo zzyoVar = this.zzc;
        zzyoVar.getClass();
        return zzyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    @Nullable
    public final zzyp zze() {
        zzvy zzvyVar = this.zzd;
        if (zzvyVar == null || zzvyVar.zzc == null) {
            return null;
        }
        return zzvyVar;
    }
}
