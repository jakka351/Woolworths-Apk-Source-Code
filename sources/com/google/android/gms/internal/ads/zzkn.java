package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
final class zzkn {
    public final zzun zza;
    public final Object zzb;
    public final zzwf[] zzc;
    public boolean zzd;
    public boolean zze;
    public boolean zzf;
    public zzko zzg;
    public boolean zzh;
    private final boolean[] zzi;
    private final zzln[] zzj;
    private final zzym zzk;
    private final zzlc zzl;

    @Nullable
    private zzkn zzm;
    private zzwq zzn;
    private zzyn zzo;
    private long zzp;

    public zzkn(zzln[] zzlnVarArr, long j, zzym zzymVar, zzyv zzyvVar, zzlc zzlcVar, zzko zzkoVar, zzyn zzynVar, long j2) {
        this.zzj = zzlnVarArr;
        this.zzp = j;
        this.zzk = zzymVar;
        this.zzl = zzlcVar;
        zzup zzupVar = zzkoVar.zza;
        this.zzb = zzupVar.zza;
        this.zzg = zzkoVar;
        this.zzn = zzwq.zza;
        this.zzo = zzynVar;
        this.zzc = new zzwf[2];
        this.zzi = new boolean[2];
        long j3 = zzkoVar.zzb;
        long j4 = zzkoVar.zzd;
        zzun zzunVarZzp = zzlcVar.zzp(zzupVar, zzyvVar, j3);
        this.zza = j4 != -9223372036854775807L ? new zztt(zzunVarZzp, true, 0L, j4) : zzunVarZzp;
    }

    private final void zzu() {
        if (!zzw()) {
            return;
        }
        int i = 0;
        while (true) {
            zzyn zzynVar = this.zzo;
            if (i >= zzynVar.zza) {
                return;
            }
            zzynVar.zza(i);
            zzyf zzyfVar = this.zzo.zzc[i];
            i++;
        }
    }

    private final void zzv() {
        if (!zzw()) {
            return;
        }
        int i = 0;
        while (true) {
            zzyn zzynVar = this.zzo;
            if (i >= zzynVar.zza) {
                return;
            }
            zzynVar.zza(i);
            zzyf zzyfVar = this.zzo.zzc[i];
            i++;
        }
    }

    private final boolean zzw() {
        return this.zzm == null;
    }

    public final long zza() {
        return this.zzp;
    }

    public final void zzb(long j) {
        this.zzp = j;
    }

    public final long zzc() {
        return this.zzg.zzb + this.zzp;
    }

    public final boolean zzd() {
        if (this.zze) {
            return !this.zzf || this.zza.zzi() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean zze() {
        if (this.zze) {
            return zzd() || zzf() - this.zzg.zzb >= -9223372036854775807L;
        }
        return false;
    }

    public final long zzf() {
        if (!this.zze) {
            return this.zzg.zzb;
        }
        long jZzi = this.zzf ? this.zza.zzi() : Long.MIN_VALUE;
        return jZzi == Long.MIN_VALUE ? this.zzg.zze : jZzi;
    }

    public final long zzg() {
        if (this.zze) {
            return this.zza.zzl();
        }
        return 0L;
    }

    public final void zzh(float f, zzbe zzbeVar, boolean z) throws zzhz {
        this.zze = true;
        this.zzn = this.zza.zzd();
        zzyn zzynVarZzk = zzk(f, zzbeVar, z);
        zzko zzkoVar = this.zzg;
        long jMax = zzkoVar.zzb;
        long j = zzkoVar.zze;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jZzl = zzl(zzynVarZzk, jMax, false);
        long j2 = this.zzp;
        zzko zzkoVar2 = this.zzg;
        this.zzp = (zzkoVar2.zzb - jZzl) + j2;
        this.zzg = zzkoVar2.zza(jZzl);
    }

    public final void zzi(long j) {
        zzghc.zzh(zzw());
        if (this.zze) {
            this.zza.zzg(j - this.zzp);
        }
    }

    public final void zzj(zzkl zzklVar) {
        zzghc.zzh(zzw());
        this.zza.zzm(zzklVar);
    }

    public final zzyn zzk(float f, zzbe zzbeVar, boolean z) throws zzhz {
        zzwq zzwqVar = this.zzn;
        zzup zzupVar = this.zzg.zza;
        zzym zzymVar = this.zzk;
        zzln[] zzlnVarArr = this.zzj;
        zzyn zzynVarZzq = zzymVar.zzq(zzlnVarArr, zzwqVar, zzupVar, zzbeVar);
        for (int i = 0; i < zzynVarZzq.zza; i++) {
            if (zzynVarZzq.zza(i)) {
                if (zzynVarZzq.zzc[i] == null) {
                    zzlnVarArr[i].zza();
                    z = false;
                }
                zzghc.zzh(z);
            } else {
                zzghc.zzh(zzynVarZzq.zzc[i] == null);
            }
        }
        for (zzyf zzyfVar : zzynVarZzq.zzc) {
        }
        return zzynVarZzq;
    }

    public final long zzl(zzyn zzynVar, long j, boolean z) {
        return zzm(zzynVar, j, false, new boolean[2]);
    }

    public final long zzm(zzyn zzynVar, long j, boolean z, boolean[] zArr) {
        zzln[] zzlnVarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzynVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzi;
            if (z || !zzynVar.zzb(this.zzo, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            zzlnVarArr = this.zzj;
            if (i2 >= 2) {
                break;
            }
            zzlnVarArr[i2].zza();
            i2++;
        }
        zzv();
        this.zzo = zzynVar;
        zzu();
        zzun zzunVar = this.zza;
        zzyf[] zzyfVarArr = zzynVar.zzc;
        boolean[] zArr3 = this.zzi;
        zzwf[] zzwfVarArr = this.zzc;
        long jZze = zzunVar.zze(zzyfVarArr, zArr3, zzwfVarArr, zArr, j);
        for (int i3 = 0; i3 < 2; i3++) {
            zzlnVarArr[i3].zza();
        }
        this.zzf = false;
        for (int i4 = 0; i4 < 2; i4++) {
            if (zzwfVarArr[i4] != null) {
                zzghc.zzh(zzynVar.zza(i4));
                zzlnVarArr[i4].zza();
                this.zzf = true;
            } else {
                zzghc.zzh(zzyfVarArr[i4] == null);
            }
        }
        return jZze;
    }

    public final void zzn() {
        zzv();
        zzun zzunVar = this.zza;
        try {
            boolean z = zzunVar instanceof zztt;
            zzlc zzlcVar = this.zzl;
            if (z) {
                zzlcVar.zze(((zztt) zzunVar).zza);
            } else {
                zzlcVar.zze(zzunVar);
            }
        } catch (RuntimeException e) {
            zzds.zzf("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void zzo(@Nullable zzkn zzknVar) {
        if (zzknVar == this.zzm) {
            return;
        }
        zzv();
        this.zzm = zzknVar;
        zzu();
    }

    @Nullable
    public final zzkn zzp() {
        return this.zzm;
    }

    public final zzwq zzq() {
        return this.zzn;
    }

    public final zzyn zzr() {
        return this.zzo;
    }

    public final void zzs() {
        zzun zzunVar = this.zza;
        if (zzunVar instanceof zztt) {
            long j = this.zzg.zzd;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((zztt) zzunVar).zza(0L, j);
        }
    }

    public final void zzt(zzum zzumVar, long j) {
        this.zzd = true;
        this.zza.zzb(zzumVar, j);
    }
}
