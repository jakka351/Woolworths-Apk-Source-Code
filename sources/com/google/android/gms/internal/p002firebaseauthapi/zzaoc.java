package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
final class zzaoc {
    private static boolean zza(byte b) {
        return b > -65;
    }

    public static /* synthetic */ void zza(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzall {
        if (!zza(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !zza(b3) && !zza(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw zzall.zzd();
    }

    public static /* synthetic */ void zza(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    public static /* synthetic */ void zza(byte b, byte b2, byte b3, char[] cArr, int i) throws zzall {
        if (!zza(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !zza(b3)))) {
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
            return;
        }
        throw zzall.zzd();
    }

    public static /* synthetic */ void zza(byte b, byte b2, char[] cArr, int i) throws zzall {
        if (b >= -62 && !zza(b2)) {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
            return;
        }
        throw zzall.zzd();
    }
}
