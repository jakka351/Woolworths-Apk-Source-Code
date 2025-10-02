package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class zztt implements zzun, zzum {
    public final zzun zza;
    long zzb;

    @Nullable
    private zzum zzc;
    private zzts[] zzd = new zzts[0];
    private long zze = 0;

    public zztt(zzun zzunVar, boolean z, long j, long j2) {
        this.zza = zzunVar;
        this.zzb = j2;
    }

    private static long zzq(long j, long j2, long j3) {
        long jMax = Math.max(j, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    public final void zza(long j, long j2) {
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzb(zzum zzumVar, long j) {
        this.zzc = zzumVar;
        this.zza.zzb(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final zzwq zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zze(zzyf[] zzyfVarArr, boolean[] zArr, zzwf[] zzwfVarArr, boolean[] zArr2, long j) {
        int length = zzwfVarArr.length;
        this.zzd = new zzts[length];
        zzwf[] zzwfVarArr2 = new zzwf[length];
        int i = 0;
        while (true) {
            zzwf zzwfVar = null;
            if (i >= zzwfVarArr.length) {
                break;
            }
            zzts[] zztsVarArr = this.zzd;
            zzts zztsVar = (zzts) zzwfVarArr[i];
            zztsVarArr[i] = zztsVar;
            if (zztsVar != null) {
                zzwfVar = zztsVar.zza;
            }
            zzwfVarArr2[i] = zzwfVar;
            i++;
        }
        long jZze = this.zza.zze(zzyfVarArr, zArr, zzwfVarArr2, zArr2, j);
        long jZzq = zzq(jZze, j, this.zzb);
        long j2 = -9223372036854775807L;
        if (zzo()) {
            if (jZze < j) {
                j2 = jZzq;
                break;
            }
            if (jZze != 0) {
                for (zzyf zzyfVar : zzyfVarArr) {
                    if (zzyfVar != null) {
                        zzu zzuVarZzc = zzyfVar.zzc();
                        if (!zzar.zzd(zzuVarZzc.zzo, zzuVarZzc.zzk)) {
                            j2 = jZzq;
                            break;
                        }
                    }
                }
            }
        }
        this.zze = j2;
        for (int i2 = 0; i2 < zzwfVarArr.length; i2++) {
            zzwf zzwfVar2 = zzwfVarArr2[i2];
            if (zzwfVar2 == null) {
                this.zzd[i2] = null;
            } else {
                zzts[] zztsVarArr2 = this.zzd;
                zzts zztsVar2 = zztsVarArr2[i2];
                if (zztsVar2 == null || zztsVar2.zza != zzwfVar2) {
                    zztsVarArr2[i2] = new zzts(this, zzwfVar2);
                }
            }
            zzwfVarArr[i2] = this.zzd[i2];
        }
        return jZzq;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzf(long j, boolean z) {
        this.zza.zzf(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final void zzg(long j) {
        this.zza.zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzh() {
        if (zzo()) {
            long j = this.zze;
            this.zze = -9223372036854775807L;
            long jZzh = zzh();
            return jZzh != -9223372036854775807L ? jZzh : j;
        }
        long jZzh2 = this.zza.zzh();
        if (jZzh2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzq(jZzh2, 0L, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final long zzi() {
        long jZzi = this.zza.zzi();
        if (jZzi != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || jZzi < j) {
                return jZzi;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzj(long j) {
        this.zze = -9223372036854775807L;
        for (zzts zztsVar : this.zzd) {
            if (zztsVar != null) {
                zztsVar.zza();
            }
        }
        return zzq(this.zza.zzj(j), 0L, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzk(long j, zzlt zzltVar) {
        if (j == 0) {
            return 0L;
        }
        long j2 = zzltVar.zzc;
        String str = zzeo.zza;
        long jMax = Math.max(0L, Math.min(j2, j));
        long j3 = zzltVar.zzd;
        long j4 = this.zzb;
        long jMax2 = Math.max(0L, Math.min(j3, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j));
        if (jMax != j2 || jMax2 != j3) {
            zzltVar = new zzlt(jMax, jMax2);
        }
        return this.zza.zzk(j, zzltVar);
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final long zzl() {
        long jZzl = this.zza.zzl();
        if (jZzl != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || jZzl < j) {
                return jZzl;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final boolean zzm(zzkl zzklVar) {
        return this.zza.zzm(zzklVar);
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final boolean zzn() {
        return this.zza.zzn();
    }

    public final boolean zzo() {
        return this.zze != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzum
    public final void zzp(zzun zzunVar) {
        zzum zzumVar = this.zzc;
        zzumVar.getClass();
        zzumVar.zzp(this);
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final /* bridge */ /* synthetic */ void zzs(zzwh zzwhVar) {
        zzum zzumVar = this.zzc;
        zzumVar.getClass();
        zzumVar.zzs(this);
    }
}
