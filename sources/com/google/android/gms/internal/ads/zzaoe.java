package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes5.dex */
final class zzaoe implements zzadv {
    private final zzaob zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzaoe(zzaob zzaobVar, int i, long j, long j2) {
        this.zza = zzaobVar;
        this.zzb = i;
        this.zzc = j;
        long j3 = (j2 - j) / zzaobVar.zzd;
        this.zzd = j3;
        this.zze = zzd(j3);
    }

    private final long zzd(long j) {
        return zzeo.zzt(j * this.zzb, 1000000L, this.zza.zzc, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j) {
        long j2 = this.zzb;
        zzaob zzaobVar = this.zza;
        long j3 = (zzaobVar.zzc * j) / (j2 * 1000000);
        String str = zzeo.zza;
        long j4 = this.zzd - 1;
        long jMax = Math.max(0L, Math.min(j3, j4));
        long j5 = zzaobVar.zzd;
        long jZzd = zzd(jMax);
        long j6 = this.zzc;
        zzadw zzadwVar = new zzadw(jZzd, (jMax * j5) + j6);
        if (jZzd >= j || jMax == j4) {
            return new zzadt(zzadwVar, zzadwVar);
        }
        long j7 = jMax + 1;
        return new zzadt(zzadwVar, new zzadw(zzd(j7), (j5 * j7) + j6));
    }
}
