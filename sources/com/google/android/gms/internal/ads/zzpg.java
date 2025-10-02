package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzpg {
    public static final zzpg zza = new zzpf().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    public /* synthetic */ zzpg(zzpf zzpfVar, byte[] bArr) {
        this.zzb = zzpfVar.zze();
        this.zzc = zzpfVar.zzf();
        this.zzd = zzpfVar.zzg();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzpg.class == obj.getClass()) {
            zzpg zzpgVar = (zzpg) obj;
            if (this.zzb == zzpgVar.zzb && this.zzc == zzpgVar.zzc && this.zzd == zzpgVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.zzb;
        boolean z2 = this.zzc;
        return (z2 ? 1 : 0) + (z2 ? 1 : 0) + ((z ? 1 : 0) << 2) + (this.zzd ? 1 : 0);
    }
}
