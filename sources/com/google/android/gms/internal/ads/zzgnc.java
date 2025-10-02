package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzgnc implements Serializable {
    private static final zzgnc zza = new zzgnc(new int[0], 0, 0);
    private final int[] zzb;
    private final int zzc;

    private zzgnc(int[] iArr, int i, int i2) {
        this.zzb = iArr;
        this.zzc = i2;
    }

    public static zzgnc zza() {
        return zza;
    }

    public static zzgnc zzb(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        return new zzgnc(iArrCopyOf, 0, iArrCopyOf.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgnc)) {
            return false;
        }
        zzgnc zzgncVar = (zzgnc) obj;
        int i = this.zzc;
        if (i != zzgncVar.zzc) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (zzd(i2) != zzgncVar.zzd(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i = 0; i < this.zzc; i++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.zzb[i]);
        }
        return iHashCode;
    }

    public final String toString() {
        int i = this.zzc;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.zzb;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd(int i) {
        zzghc.zzm(i, this.zzc, "index");
        return this.zzb[i];
    }
}
