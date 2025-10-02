package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.camera.core.impl.b;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;

/* loaded from: classes5.dex */
final class zzaoa {
    private static final zzaob zza;

    static {
        if (zzanz.zzc()) {
            zzanz.zzd();
        }
        zza = new zzaoe();
    }

    public static /* synthetic */ int zza(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            byte b2 = bArr[i];
            if (b > -12 || b2 > -65) {
                return -1;
            }
            return (b2 << 8) ^ b;
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        byte b3 = bArr[i];
        byte b4 = bArr[i + 1];
        if (b > -12 || b3 > -65 || b4 > -65) {
            return -1;
        }
        return (b4 << 16) ^ ((b3 << 8) ^ b);
    }

    public static String zzb(byte[] bArr, int i, int i2) throws zzall {
        return zza.zza(bArr, i, i2);
    }

    public static boolean zzc(byte[] bArr, int i, int i2) {
        return zza.zza(0, bArr, i, i2) == 0;
    }

    public static int zza(String str, byte[] bArr, int i, int i2) {
        return zza.zza(str, bArr, i, i2);
    }

    public static int zza(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) < 65536) {
                                throw new zzaod(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException(b.k(i3 + llqqqql.a00610061aaaa, "UTF-8 length does not fit in int: "));
    }
}
