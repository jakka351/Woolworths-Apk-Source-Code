package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzkl {
    public final long zza;
    public final float zzb;
    public final long zzc;

    public /* synthetic */ zzkl(zzkk zzkkVar, byte[] bArr) {
        this.zza = zzkkVar.zze();
        this.zzb = zzkkVar.zzf();
        this.zzc = zzkkVar.zzg();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkl)) {
            return false;
        }
        zzkl zzklVar = (zzkl) obj;
        return this.zza == zzklVar.zza && this.zzb == zzklVar.zzb && this.zzc == zzklVar.zzc;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Float.valueOf(this.zzb), Long.valueOf(this.zzc));
    }

    public final zzkk zza() {
        return new zzkk(this, null);
    }
}
