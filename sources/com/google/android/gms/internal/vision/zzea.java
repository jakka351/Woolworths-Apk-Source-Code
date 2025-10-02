package com.google.android.gms.internal.vision;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import org.bouncycastle.crypto.hpke.HPKE;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes5.dex */
final class zzea {
    public static int zza(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static int zzb(int i) {
        return (i + 1) * (i < 32 ? 4 : 2);
    }

    public static Object zza(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(c.k(52, i, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static int zza(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i] & HPKE.aead_EXPORT_ONLY;
        }
        return ((int[]) obj)[i];
    }

    public static void zza(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static int zza(@NullableDecl Object obj, @NullableDecl Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, @NullableDecl Object[] objArr2) {
        int i2;
        int i3;
        int iZza = zzec.zza(obj);
        int i4 = iZza & i;
        int iZza2 = zza(obj3, i4);
        if (iZza2 == 0) {
            return -1;
        }
        int i5 = ~i;
        int i6 = iZza & i5;
        int i7 = -1;
        while (true) {
            i2 = iZza2 - 1;
            i3 = iArr[i2];
            if ((i3 & i5) == i6 && zzcz.zza(obj, objArr[i2]) && (objArr2 == null || zzcz.zza(obj2, objArr2[i2]))) {
                break;
            }
            int i8 = i3 & i;
            if (i8 == 0) {
                return -1;
            }
            i7 = i2;
            iZza2 = i8;
        }
        int i9 = i3 & i;
        if (i7 == -1) {
            zza(obj3, i4, i9);
            return i2;
        }
        iArr[i7] = zza(iArr[i7], i9, i);
        return i2;
    }
}
