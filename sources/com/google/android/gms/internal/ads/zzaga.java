package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzaga extends zzagh {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzagh[] zze;

    public zzaga(String str, boolean z, boolean z2, String[] strArr, zzagh[] zzaghVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = strArr;
        this.zze = zzaghVarArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaga.class == obj.getClass()) {
            zzaga zzagaVar = (zzaga) obj;
            if (this.zzb == zzagaVar.zzb && this.zzc == zzagaVar.zzc && Objects.equals(this.zza, zzagaVar.zza) && Arrays.equals(this.zzd, zzagaVar.zzd) && Arrays.equals(this.zze, zzagaVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.zzb ? 1 : 0) + 527;
        String str = this.zza;
        return str.hashCode() + (((i * 31) + (this.zzc ? 1 : 0)) * 31);
    }
}
