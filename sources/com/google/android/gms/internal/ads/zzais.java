package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzais {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final zzu zzg;
    public final int zzh;

    @Nullable
    public final long[] zzi;

    @Nullable
    public final long[] zzj;
    public final int zzk;

    @Nullable
    private final zzait[] zzl;

    public zzais(int i, int i2, long j, long j2, long j3, long j4, zzu zzuVar, int i3, @Nullable zzait[] zzaitVarArr, int i4, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = j3;
        this.zzf = j4;
        this.zzg = zzuVar;
        this.zzh = i3;
        this.zzl = zzaitVarArr;
        this.zzk = i4;
        this.zzi = jArr;
        this.zzj = jArr2;
    }

    @Nullable
    public final zzait zza(int i) {
        return this.zzl[i];
    }

    public final zzais zzb(zzu zzuVar) {
        return new zzais(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, zzuVar, this.zzh, this.zzl, this.zzk, this.zzi, this.zzj);
    }
}
