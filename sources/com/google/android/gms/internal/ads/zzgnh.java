package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzgnh {
    public static long[] zza(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += jArr2.length;
        }
        int i = (int) length;
        zzghc.zze(length == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", length);
        long[] jArr3 = new long[i];
        int i2 = 0;
        for (long[] jArr4 : jArr) {
            int length2 = jArr4.length;
            System.arraycopy(jArr4, 0, jArr3, i2, length2);
            i2 += length2;
        }
        return jArr3;
    }
}
