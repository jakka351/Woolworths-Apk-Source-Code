package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes5.dex */
final class zzahe implements zzahi {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzahe(long[] jArr, long[] jArr2, long j) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j == -9223372036854775807L ? zzeo.zzq(jArr2[jArr2.length - 1]) : j;
    }

    public static zzahe zzd(long j, zzagk zzagkVar, long j2) {
        int length = zzagkVar.zzd.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += zzagkVar.zzb + r0[i3];
            j3 += zzagkVar.zzc + zzagkVar.zze[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new zzahe(jArr, jArr2, j2);
    }

    private static Pair zzh(long j, long[] jArr, long[] jArr2) {
        int iZzm = zzeo.zzm(jArr, j, true, true);
        long j2 = jArr[iZzm];
        long j3 = jArr2[iZzm];
        int i = iZzm + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j) {
        String str = zzeo.zza;
        Pair pairZzh = zzh(zzeo.zzp(Math.max(0L, Math.min(j, this.zzc))), this.zzb, this.zza);
        zzadw zzadwVar = new zzadw(zzeo.zzq(((Long) pairZzh.first).longValue()), ((Long) pairZzh.second).longValue());
        return new zzadt(zzadwVar, zzadwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final long zze(long j) {
        return zzeo.zzq(((Long) zzh(j, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final long zzf() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final int zzg() {
        return -2147483647;
    }
}
