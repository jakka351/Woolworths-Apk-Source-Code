package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzafz extends zzagh {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzagh[] zzg;

    public zzafz(String str, int i, int i2, long j, long j2, zzagh[] zzaghVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = j2;
        this.zzg = zzaghVarArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafz.class == obj.getClass()) {
            zzafz zzafzVar = (zzafz) obj;
            if (this.zzb == zzafzVar.zzb && this.zzc == zzafzVar.zzc && this.zzd == zzafzVar.zzd && this.zze == zzafzVar.zze && Objects.equals(this.zza, zzafzVar.zza) && Arrays.equals(this.zzg, zzafzVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb + 527;
        String str = this.zza;
        long j = this.zze;
        return str.hashCode() + (((((((i * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) j)) * 31);
    }
}
