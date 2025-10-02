package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
final class zzgna {
    public static long zza(String str, long j) {
        if (j >= 0) {
            return j;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + length + 2 + 14);
        sb.append(str);
        sb.append(" (");
        sb.append(j);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public static void zzb(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
