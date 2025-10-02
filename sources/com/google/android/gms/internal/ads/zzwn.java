package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes5.dex */
final class zzwn implements zzun, zzum {
    private final zzun zza;
    private final long zzb;
    private zzum zzc;

    public zzwn(zzun zzunVar, long j) {
        this.zza = zzunVar;
        this.zzb = j;
    }

    public final zzun zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzb(zzum zzumVar, long j) {
        this.zzc = zzumVar;
        this.zza.zzb(this, j - this.zzb);
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
        zzwf[] zzwfVarArr2 = new zzwf[zzwfVarArr.length];
        int i = 0;
        while (true) {
            zzwf zzwfVarZza = null;
            if (i >= zzwfVarArr.length) {
                break;
            }
            zzwm zzwmVar = (zzwm) zzwfVarArr[i];
            if (zzwmVar != null) {
                zzwfVarZza = zzwmVar.zza();
            }
            zzwfVarArr2[i] = zzwfVarZza;
            i++;
        }
        zzun zzunVar = this.zza;
        long j2 = this.zzb;
        long jZze = zzunVar.zze(zzyfVarArr, zArr, zzwfVarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < zzwfVarArr.length; i2++) {
            zzwf zzwfVar = zzwfVarArr2[i2];
            if (zzwfVar == null) {
                zzwfVarArr[i2] = null;
            } else {
                zzwf zzwfVar2 = zzwfVarArr[i2];
                if (zzwfVar2 == null || ((zzwm) zzwfVar2).zza() != zzwfVar) {
                    zzwfVarArr[i2] = new zzwm(zzwfVar, j2);
                }
            }
        }
        return jZze + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzf(long j, boolean z) {
        this.zza.zzf(j - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final void zzg(long j) {
        this.zza.zzg(j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzh() {
        long jZzh = this.zza.zzh();
        if (jZzh == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzh + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final long zzi() {
        long jZzi = this.zza.zzi();
        if (jZzi == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzi + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzj(long j) {
        long j2 = this.zzb;
        return this.zza.zzj(j - j2) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzk(long j, zzlt zzltVar) {
        long j2 = this.zzb;
        return this.zza.zzk(j - j2, zzltVar) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final long zzl() {
        long jZzl = this.zza.zzl();
        if (jZzl == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzl + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final boolean zzm(zzkl zzklVar) {
        long j = zzklVar.zza;
        long j2 = this.zzb;
        zzkk zzkkVarZza = zzklVar.zza();
        zzkkVarZza.zza(j - j2);
        return this.zza.zzm(zzkkVarZza.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final boolean zzn() {
        return this.zza.zzn();
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
