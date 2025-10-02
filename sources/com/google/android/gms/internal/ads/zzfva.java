package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfva {
    public static byte[] zza(String str, boolean z) throws IllegalArgumentException {
        byte[] bArrZzk = zzgmk.zzl().zzk(str);
        if (bArrZzk.length != 0 || str.length() <= 0) {
            return bArrZzk;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }
}
