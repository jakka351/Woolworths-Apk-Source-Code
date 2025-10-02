package com.google.zxing.common;

import YU.a;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class BitMatrix implements Cloneable {
    public final int d;
    public final int e;
    public final int f;
    public final int[] g;

    public BitMatrix(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.d = i;
        this.e = i2;
        int i3 = (i + 31) / 32;
        this.f = i3;
        this.g = new int[i3 * i2];
    }

    public final void a(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.f);
        int[] iArr = this.g;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    public final boolean b(int i, int i2) {
        return ((this.g[(i / 32) + (i2 * this.f)] >>> (i & 31)) & 1) != 0;
    }

    public final int[] c() {
        int[] iArr = this.g;
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.f;
        int i2 = length / i;
        int i3 = (length % i) << 5;
        int i4 = iArr[length];
        int i5 = 31;
        while ((i4 >>> i5) == 0) {
            i5--;
        }
        return new int[]{i3 + i5, i2};
    }

    public final Object clone() {
        return new BitMatrix(this.d, this.e, this.f, (int[]) this.g.clone());
    }

    public final BitArray d(int i, BitArray bitArray) {
        int i2 = bitArray.e;
        int i3 = this.d;
        if (i2 < i3) {
            bitArray = new BitArray(i3);
        } else {
            int length = bitArray.d.length;
            for (int i4 = 0; i4 < length; i4++) {
                bitArray.d[i4] = 0;
            }
        }
        int i5 = this.f;
        int i6 = i * i5;
        for (int i7 = 0; i7 < i5; i7++) {
            bitArray.d[(i7 << 5) / 32] = this.g[i6 + i7];
        }
        return bitArray;
    }

    public final int[] e() {
        int[] iArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.g;
            if (i2 >= iArr.length || iArr[i2] != 0) {
                break;
            }
            i2++;
        }
        if (i2 == iArr.length) {
            return null;
        }
        int i3 = this.f;
        int i4 = i2 / i3;
        int i5 = (i2 % i3) << 5;
        while ((iArr[i2] << (31 - i)) == 0) {
            i++;
        }
        return new int[]{i5 + i, i4};
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BitMatrix)) {
            return false;
        }
        BitMatrix bitMatrix = (BitMatrix) obj;
        return this.d == bitMatrix.d && this.e == bitMatrix.e && this.f == bitMatrix.f && Arrays.equals(this.g, bitMatrix.g);
    }

    public final void f(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.f);
        int[] iArr = this.g;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public final void g(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.e || i5 > this.d) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i2 < i6) {
            int i7 = this.f * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int i9 = (i8 / 32) + i7;
                int[] iArr = this.g;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public final int hashCode() {
        int i = this.d;
        return Arrays.hashCode(this.g) + ((((a.B(i, 31, i, 31) + this.e) * 31) + this.f) * 31);
    }

    public final String toString() {
        int i = this.d;
        int i2 = this.e;
        StringBuilder sb = new StringBuilder((i + 1) * i2);
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                sb.append(b(i4, i3) ? "X " : "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public BitMatrix(int i, int i2, int i3, int[] iArr) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = iArr;
    }
}
