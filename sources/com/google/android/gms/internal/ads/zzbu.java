package com.google.android.gms.internal.ads;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzbu {
    public static final zzbu zza = new zzbu(0, 0, 1.0f);

    @IntRange
    public final int zzb;

    @IntRange
    public final int zzc;

    @FloatRange
    public final float zzd;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public zzbu(@IntRange int i, @IntRange int i2, @FloatRange float f) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbu) {
            zzbu zzbuVar = (zzbu) obj;
            if (this.zzb == zzbuVar.zzb && this.zzc == zzbuVar.zzc && this.zzd == zzbuVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb + 217;
        float f = this.zzd;
        return Float.floatToRawIntBits(f) + (((i * 31) + this.zzc) * 31);
    }
}
