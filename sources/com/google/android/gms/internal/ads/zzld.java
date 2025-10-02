package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes5.dex */
final class zzld {
    private static final zzup zzu = new zzup(new Object(), -1);
    public final zzbe zza;
    public final zzup zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;

    @Nullable
    public final zzhz zzf;
    public final boolean zzg;
    public final zzwq zzh;
    public final zzyn zzi;
    public final List zzj;
    public final zzup zzk;
    public final boolean zzl;
    public final int zzm;
    public final int zzn;
    public final zzau zzo;
    public final boolean zzp = false;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;
    public volatile long zzt;

    public zzld(zzbe zzbeVar, zzup zzupVar, long j, long j2, int i, @Nullable zzhz zzhzVar, boolean z, zzwq zzwqVar, zzyn zzynVar, List list, zzup zzupVar2, boolean z2, int i2, int i3, zzau zzauVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.zza = zzbeVar;
        this.zzb = zzupVar;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
        this.zzf = zzhzVar;
        this.zzg = z;
        this.zzh = zzwqVar;
        this.zzi = zzynVar;
        this.zzj = list;
        this.zzk = zzupVar2;
        this.zzl = z2;
        this.zzm = i2;
        this.zzn = i3;
        this.zzo = zzauVar;
        this.zzq = j3;
        this.zzr = j4;
        this.zzs = j5;
        this.zzt = j6;
    }

    public static zzld zza(zzyn zzynVar) {
        zzbe zzbeVar = zzbe.zza;
        zzup zzupVar = zzu;
        return new zzld(zzbeVar, zzupVar, -9223372036854775807L, 0L, 1, null, false, zzwq.zza, zzynVar, zzgjz.zzi(), zzupVar, false, 1, 0, zzau.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzup zzb() {
        return zzu;
    }

    @CheckResult
    public final zzld zzc(zzup zzupVar, long j, long j2, long j3, long j4, zzwq zzwqVar, zzyn zzynVar, List list) {
        zzup zzupVar2 = this.zzk;
        boolean z = this.zzl;
        int i = this.zzm;
        int i2 = this.zzn;
        zzau zzauVar = this.zzo;
        long j5 = this.zzq;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new zzld(this.zza, zzupVar, j2, j3, this.zze, this.zzf, this.zzg, zzwqVar, zzynVar, list, zzupVar2, z, i, i2, zzauVar, j5, j4, j, jElapsedRealtime, false);
    }

    @CheckResult
    public final zzld zzd(zzbe zzbeVar) {
        return new zzld(zzbeVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzld zze(int i) {
        return new zzld(this.zza, this.zzb, this.zzc, this.zzd, i, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzld zzf(@Nullable zzhz zzhzVar) {
        return new zzld(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzhzVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzld zzg(boolean z) {
        return new zzld(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, z, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzld zzh(zzup zzupVar) {
        return new zzld(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzupVar, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzld zzi(boolean z, int i, int i2) {
        return new zzld(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z, i, i2, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final boolean zzj() {
        return this.zze == 3 && this.zzl && this.zzn == 0;
    }
}
