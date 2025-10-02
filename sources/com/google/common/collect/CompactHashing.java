package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Objects;
import org.bouncycastle.crypto.hpke.HPKE;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class CompactHashing {
    public static Object a(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(YU.a.d(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static int b(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static int c(int i) {
        return (i + 1) * (i < 32 ? 4 : 2);
    }

    public static int d(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int iC = Hashing.c(obj);
        int i4 = iC & i;
        int iE = e(i4, obj3);
        if (iE != 0) {
            int i5 = ~i;
            int i6 = iC & i5;
            int i7 = -1;
            while (true) {
                i2 = iE - 1;
                i3 = iArr[i2];
                if ((i3 & i5) == i6 && Objects.a(obj, objArr[i2]) && (objArr2 == null || Objects.a(obj2, objArr2[i2]))) {
                    break;
                }
                int i8 = i3 & i;
                if (i8 == 0) {
                    break;
                }
                i7 = i2;
                iE = i8;
            }
            int i9 = i3 & i;
            if (i7 == -1) {
                f(i4, i9, obj3);
                return i2;
            }
            iArr[i7] = b(iArr[i7], i9, i);
            return i2;
        }
        return -1;
    }

    public static int e(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? ((short[]) obj)[i] & HPKE.aead_EXPORT_ONLY : ((int[]) obj)[i];
    }

    public static void f(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
