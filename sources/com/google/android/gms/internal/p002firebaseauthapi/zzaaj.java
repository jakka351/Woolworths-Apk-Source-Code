package com.google.android.gms.internal.p002firebaseauthapi;

import YU.a;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzaaj {
    private final byte[] zza;

    private zzaaj(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaaj) {
            return Arrays.equals(((zzaaj) obj).zza, this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return a.h("Bytes(", zzzx.zza(this.zza), ")");
    }

    public final int zza() {
        return this.zza.length;
    }

    public final byte[] zzb() {
        byte[] bArr = this.zza;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static zzaaj zza(byte[] bArr) {
        if (bArr != null) {
            return zza(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static zzaaj zza(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if (i2 > bArr.length) {
                i2 = bArr.length;
            }
            return new zzaaj(bArr, 0, i2);
        }
        throw new NullPointerException("data must be non-null");
    }
}
