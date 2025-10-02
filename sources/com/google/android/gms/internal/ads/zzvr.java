package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
final class zzvr {
    public final int zza;
    public final boolean zzb;

    public zzvr(int i, boolean z) {
        this.zza = i;
        this.zzb = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzvr.class == obj.getClass()) {
            zzvr zzvrVar = (zzvr) obj;
            if (this.zza == zzvrVar.zza && this.zzb == zzvrVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza * 31) + (this.zzb ? 1 : 0);
    }
}
