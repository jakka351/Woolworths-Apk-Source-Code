package com.fasterxml.jackson.core.io;

import java.util.Arrays;
import org.bouncycastle.asn1.BERTags;

/* loaded from: classes4.dex */
public final class CharTypes {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f14195a;
    public static final char[] b;
    public static final byte[] c;
    public static final byte[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;
    public static final int[] h;
    public static final int[] i;
    public static final int[] j;
    public static final int[] k;

    public static class AltEscapes {
        public static final AltEscapes b;

        /* renamed from: a, reason: collision with root package name */
        public int[][] f14196a;

        static {
            AltEscapes altEscapes = new AltEscapes();
            altEscapes.f14196a = new int[128][];
            b = altEscapes;
        }
    }

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        f14195a = charArray;
        b = "0123456789abcdef".toCharArray();
        int length = charArray.length;
        c = new byte[length];
        d = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            c[i2] = (byte) f14195a[i2];
            d[i2] = (byte) b[i2];
        }
        int[] iArr = new int[256];
        for (int i3 = 0; i3 < 32; i3++) {
            iArr[i3] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        e = iArr;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        for (int i4 = 128; i4 < 256; i4++) {
            iArr2[i4] = (i4 & BERTags.FLAGS) == 192 ? 2 : (i4 & 240) == 224 ? 3 : (i4 & 248) == 240 ? 4 : -1;
        }
        f = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i5 = 33; i5 < 256; i5++) {
            if (Character.isJavaIdentifierPart((char) i5)) {
                iArr3[i5] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        g = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        h = iArr4;
        int[] iArr5 = new int[256];
        int[] iArr6 = f;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        i = iArr5;
        int[] iArr7 = new int[256];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        int[] iArr8 = new int[128];
        for (int i6 = 0; i6 < 32; i6++) {
            iArr8[i6] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        j = iArr8;
        int[] iArr9 = new int[256];
        k = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i7 = 0; i7 < 10; i7++) {
            k[i7 + 48] = i7;
        }
        for (int i8 = 0; i8 < 6; i8++) {
            int[] iArr10 = k;
            int i9 = i8 + 10;
            iArr10[i8 + 97] = i9;
            iArr10[i8 + 65] = i9;
        }
    }

    public static int a(int i2) {
        return k[i2 & 255];
    }

    public static byte[] b(boolean z) {
        return (byte[]) (z ? c.clone() : d.clone());
    }

    public static char[] c(boolean z) {
        return (char[]) (z ? f14195a.clone() : b.clone());
    }

    public static int[] d(int i2) {
        int[] iArr = j;
        if (i2 == 34) {
            return iArr;
        }
        int[][] iArr2 = AltEscapes.b.f14196a;
        int[] iArr3 = iArr2[i2];
        if (iArr3 != null) {
            return iArr3;
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, 128);
        if (iArrCopyOf[i2] == 0) {
            iArrCopyOf[i2] = -1;
        }
        iArr2[i2] = iArrCopyOf;
        return iArrCopyOf;
    }
}
