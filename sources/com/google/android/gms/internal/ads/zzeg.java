package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzeg {
    public static final zzeg zza = new zzeg(-1, -1);
    private final int zzb;
    private final int zzc;

    static {
        new zzeg(0, 0);
    }

    public zzeg(int i, int i2) {
        boolean z = false;
        if ((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0)) {
            z = true;
        }
        zzghc.zza(z);
        this.zzb = i;
        this.zzc = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzeg) {
            zzeg zzegVar = (zzeg) obj;
            if (this.zzb == zzegVar.zzb && this.zzc == zzegVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        return ((i >>> 16) | (i << 16)) ^ this.zzc;
    }

    public final String toString() {
        int i = this.zzb;
        int length = String.valueOf(i).length();
        int i2 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(i2).length());
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzc;
    }
}
