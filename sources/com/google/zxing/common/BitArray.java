package com.google.zxing.common;

import io.jsonwebtoken.JwtParser;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class BitArray implements Cloneable {
    public int[] d;
    public int e;

    public BitArray() {
        this.e = 0;
        this.d = new int[1];
    }

    public final void a(boolean z) {
        c(this.e + 1);
        if (z) {
            int[] iArr = this.d;
            int i = this.e;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.e++;
    }

    public final void b(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        c(this.e + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            a(z);
            i2--;
        }
    }

    public final void c(int i) {
        int[] iArr = this.d;
        if (i > (iArr.length << 5)) {
            int[] iArr2 = new int[(i + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.d = iArr2;
        }
    }

    public final Object clone() {
        int[] iArr = (int[]) this.d.clone();
        int i = this.e;
        BitArray bitArray = new BitArray();
        bitArray.d = iArr;
        bitArray.e = i;
        return bitArray;
    }

    public final boolean d(int i) {
        return ((1 << (i & 31)) & this.d[i / 32]) != 0;
    }

    public final int e(int i) {
        int i2 = this.e;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (-(1 << (i & 31))) & this.d[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.d;
            if (i3 == iArr.length) {
                return this.e;
            }
            i4 = iArr[i3];
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i4) + (i3 << 5);
        int i5 = this.e;
        return iNumberOfTrailingZeros > i5 ? i5 : iNumberOfTrailingZeros;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BitArray)) {
            return false;
        }
        BitArray bitArray = (BitArray) obj;
        return this.e == bitArray.e && Arrays.equals(this.d, bitArray.d);
    }

    public final int f(int i) {
        int i2 = this.e;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (-(1 << (i & 31))) & (~this.d[i3]);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.d;
            if (i3 == iArr.length) {
                return this.e;
            }
            i4 = ~iArr[i3];
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i4) + (i3 << 5);
        int i5 = this.e;
        return iNumberOfTrailingZeros > i5 ? i5 : iNumberOfTrailingZeros;
    }

    public final int g() {
        return (this.e + 7) / 8;
    }

    public final boolean h(int i, int i2) {
        if (i2 < i || i < 0 || i2 > this.e) {
            throw new IllegalArgumentException();
        }
        if (i2 != i) {
            int i3 = i2 - 1;
            int i4 = i / 32;
            int i5 = i3 / 32;
            int i6 = i4;
            while (i6 <= i5) {
                if ((((2 << (i6 >= i5 ? 31 & i3 : 31)) - (1 << (i6 > i4 ? 0 : i & 31))) & this.d[i6]) != 0) {
                    return false;
                }
                i6++;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d) + (this.e * 31);
    }

    public final void i() {
        int[] iArr = new int[this.d.length];
        int i = (this.e - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = this.d[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & 65535) << 16) | ((j5 >> 16) & 65535));
        }
        int i4 = this.e;
        int i5 = i2 << 5;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = iArr[0] >>> i6;
            for (int i8 = 1; i8 < i2; i8++) {
                int i9 = iArr[i8];
                iArr[i8 - 1] = i7 | (i9 << (32 - i6));
                i7 = i9 >>> i6;
            }
            iArr[i] = i7;
        }
        this.d = iArr;
    }

    public final void j(int i) {
        int[] iArr = this.d;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    public final String toString() {
        int i = this.e;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < this.e; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(d(i2) ? 'X' : JwtParser.SEPARATOR_CHAR);
        }
        return sb.toString();
    }

    public BitArray(int i) {
        this.e = i;
        this.d = new int[(i + 31) / 32];
    }
}
