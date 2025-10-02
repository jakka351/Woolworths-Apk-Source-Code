package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzme {
    public final long zza;
    public final zzbe zzb;
    public final int zzc;

    @Nullable
    public final zzup zzd;
    public final long zze;
    public final zzbe zzf;
    public final int zzg;

    @Nullable
    public final zzup zzh;
    public final long zzi;
    public final long zzj;

    public zzme(long j, zzbe zzbeVar, int i, @Nullable zzup zzupVar, long j2, zzbe zzbeVar2, int i2, @Nullable zzup zzupVar2, long j3, long j4) {
        this.zza = j;
        this.zzb = zzbeVar;
        this.zzc = i;
        this.zzd = zzupVar;
        this.zze = j2;
        this.zzf = zzbeVar2;
        this.zzg = i2;
        this.zzh = zzupVar2;
        this.zzi = j3;
        this.zzj = j4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzme.class == obj.getClass()) {
            zzme zzmeVar = (zzme) obj;
            if (this.zza == zzmeVar.zza && this.zzc == zzmeVar.zzc && this.zze == zzmeVar.zze && this.zzg == zzmeVar.zzg && this.zzi == zzmeVar.zzi && this.zzj == zzmeVar.zzj && Objects.equals(this.zzb, zzmeVar.zzb) && Objects.equals(this.zzd, zzmeVar.zzd) && Objects.equals(this.zzf, zzmeVar.zzf) && Objects.equals(this.zzh, zzmeVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj));
    }
}
