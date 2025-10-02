package com.google.android.gms.internal.ads;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzew implements zzan {
    public final float zza;
    public final float zzb;

    public zzew(@FloatRange float f, @FloatRange float f2) {
        boolean z = false;
        if (f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f) {
            z = true;
        }
        zzghc.zzb(z, "Invalid latitude or longitude");
        this.zza = f;
        this.zzb = f2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzew.class == obj.getClass()) {
            zzew zzewVar = (zzew) obj;
            if (this.zza == zzewVar.zza && this.zzb == zzewVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.zza) + 527;
        return Float.hashCode(this.zzb) + (iHashCode * 31);
    }

    public final String toString() {
        float f = this.zza;
        int length = String.valueOf(f).length();
        float f2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(f2).length());
        sb.append("xyz: latitude=");
        sb.append(f);
        sb.append(", longitude=");
        sb.append(f2);
        return sb.toString();
    }
}
