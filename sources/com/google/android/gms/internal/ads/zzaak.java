package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
final class zzaak implements zzabr {
    final /* synthetic */ zzaaq zza;
    private zzgjz zzb;

    @Nullable
    private zzu zzc;
    private long zzd;
    private long zze;
    private int zzf;

    public zzaak(zzaaq zzaaqVar, Context context, int i) {
        Objects.requireNonNull(zzaaqVar);
        this.zza = zzaaqVar;
        zzeo.zzS(context);
        this.zzb = zzgjz.zzi();
        this.zze = -9223372036854775807L;
        zzabo zzaboVar = zzabo.zzb;
    }

    private static final void zzy(zzu zzuVar) {
        zzs zzsVarZza = zzuVar.zza();
        zzsVarZza.zzC(zzaaq.zzC(zzuVar.zzE));
        zzsVarZza.zzM();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zza() {
        zzaaq zzaaqVar = this.zza;
        if (zzaaqVar.zzt()) {
            zzaaqVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzb() {
        zzaaq zzaaqVar = this.zza;
        if (zzaaqVar.zzt()) {
            zzaaqVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzc(zzabo zzaboVar, Executor executor) {
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final boolean zzd(zzu zzuVar) throws zzabq {
        return this.zza.zzi(zzuVar, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzg(boolean z) {
        this.zze = -9223372036854775807L;
        this.zza.zzm(z);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final boolean zzh(boolean z) {
        return this.zza.zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzi() {
        zzaaq zzaaqVar = this.zza;
        zzaaqVar.zzA(this.zze);
        if (zzaaqVar.zzy() >= zzaaqVar.zzz()) {
            zzaaqVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final boolean zzj() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final Surface zzk() {
        zzghc.zzh(false);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzl(zzaar zzaarVar) {
        this.zza.zzp(zzaarVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzm(@FloatRange float f) {
        this.zza.zzq(f);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzn(List list) {
        if (this.zzb.equals(list)) {
            return;
        }
        this.zzb = zzgjz.zzq(list);
        zzu zzuVar = this.zzc;
        if (zzuVar != null) {
            zzy(zzuVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzo(long j) {
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzp(Surface surface, zzeg zzegVar) {
        this.zza.zzc(surface, zzegVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzq() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzr(int i) {
        this.zza.zzr(i);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzs(int i, zzu zzuVar, long j, int i2, List list) {
        zzghc.zzh(false);
        this.zzb = zzgjz.zzq(list);
        this.zzc = zzuVar;
        zzaaq zzaaqVar = this.zza;
        zzaaqVar.zzA(-9223372036854775807L);
        zzy(zzuVar);
        long j2 = this.zze;
        long j3 = -4611686018427387904L;
        if (zzaaqVar.zzt()) {
            if (j2 != -9223372036854775807L) {
                j3 = j2 + 1;
            }
        } else if (j2 != -9223372036854775807L) {
            return;
        }
        long j4 = j3;
        zzaaqVar.zzw().zza(j4, new zzaap(j + this.zzd, i2, j4));
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzt() {
        zzaaq zzaaqVar = this.zza;
        if (zzaaqVar.zzw().zzc() == 0) {
            zzaaqVar.zzo();
            return;
        }
        zzek zzekVar = new zzek(10);
        boolean z = true;
        while (zzaaqVar.zzw().zzc() > 0) {
            zzaap zzaapVar = (zzaap) zzaaqVar.zzw().zzd();
            zzaapVar.getClass();
            if (z) {
                int i = zzaapVar.zzb;
                if (i == 0 || i == 1) {
                    zzaapVar = new zzaap(zzaapVar.zza, 0, zzaapVar.zzc);
                } else {
                    zzaaqVar.zzo();
                }
            }
            zzekVar.zza(zzaapVar.zzc, zzaapVar);
            z = false;
        }
        zzaaqVar.zzx(zzekVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final boolean zzu(long j, zzabp zzabpVar) {
        int i;
        zzghc.zzh(false);
        long j2 = j + this.zzd;
        zzaaq zzaaqVar = this.zza;
        long jZzb = zzaaqVar.zzv().zzb(j2);
        if (jZzb == -9223372036854775807L || zzaaqVar.zzu() == -9223372036854775807L || jZzb >= zzaaqVar.zzu() || (i = this.zzf) >= 2) {
            if (zzaaqVar.zzs()) {
                throw null;
            }
            return false;
        }
        this.zzf = i + 1;
        zzabpVar.zzb();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzv(long j, long j2) throws zzabq {
        this.zza.zzl(j + this.zzd, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzw(boolean z) {
        zzaaq zzaaqVar = this.zza;
        if (zzaaqVar.zzt()) {
            zzaaqVar.zzn(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzx() {
        this.zza.zzg();
    }
}
