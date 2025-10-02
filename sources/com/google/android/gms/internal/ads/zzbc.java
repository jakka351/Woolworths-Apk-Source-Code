package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzbc {

    @Nullable
    public Object zza;

    @Nullable
    public Object zzb;
    public int zzc;
    public long zzd;
    public long zze;
    public boolean zzf;
    public zzb zzg = zzb.zza;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbc.class.equals(obj.getClass())) {
            zzbc zzbcVar = (zzbc) obj;
            if (Objects.equals(this.zza, zzbcVar.zza) && Objects.equals(this.zzb, zzbcVar.zzb) && this.zzc == zzbcVar.zzc && this.zzd == zzbcVar.zzd && this.zzf == zzbcVar.zzf && Objects.equals(this.zzg, zzbcVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.zza;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.zzb;
        int iHashCode2 = ((((iHashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.zzc;
        long j = this.zzd;
        return this.zzg.hashCode() + (((((iHashCode2 * 31) + ((int) (j ^ (j >>> 32)))) * 961) + (this.zzf ? 1 : 0)) * 31);
    }

    public final zzbc zza(@Nullable Object obj, @Nullable Object obj2, int i, long j, long j2, zzb zzbVar, boolean z) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = i;
        this.zzd = j;
        this.zze = 0L;
        this.zzg = zzbVar;
        this.zzf = z;
        return this;
    }

    public final int zzb() {
        int i = this.zzg.zzb;
        return 0;
    }

    public final long zzc(int i) {
        long j = this.zzg.zza(i).zza;
        return 0L;
    }

    public final int zzd(int i) {
        return this.zzg.zza(i).zza(-1);
    }

    public final int zze(long j) {
        this.zzg.zzb(-1);
        return -1;
    }

    public final int zzf(long j) {
        return -1;
    }

    public final int zzg(int i) {
        return this.zzg.zza(i).zzb;
    }

    public final long zzh(int i, int i2) {
        zza zzaVarZza = this.zzg.zza(i);
        if (zzaVarZza.zzb != -1) {
            return zzaVarZza.zzf[i2];
        }
        return -9223372036854775807L;
    }

    public final boolean zzi(int i) {
        zzb();
        if (i != -1) {
            return false;
        }
        this.zzg.zzb(-1);
        return false;
    }

    public final long zzj() {
        long j = this.zzg.zzc;
        return 0L;
    }

    public final boolean zzk(int i) {
        boolean z = this.zzg.zza(i).zzi;
        return false;
    }
}
