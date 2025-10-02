package com.google.zxing.common.reedsolomon;

/* loaded from: classes6.dex */
final class GenericGFPoly {

    /* renamed from: a, reason: collision with root package name */
    public final GenericGF f16150a;
    public final int[] b;

    public GenericGFPoly(GenericGF genericGF, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f16150a = genericGF;
        int length = iArr.length;
        int i = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.b = iArr;
            return;
        }
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.b = new int[]{0};
            return;
        }
        int i2 = length - i;
        int[] iArr2 = new int[i2];
        this.b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, i2);
    }

    public final GenericGFPoly a(GenericGFPoly genericGFPoly) {
        GenericGF genericGF = genericGFPoly.f16150a;
        GenericGF genericGF2 = this.f16150a;
        if (!genericGF2.equals(genericGF)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (e()) {
            return genericGFPoly;
        }
        if (genericGFPoly.e()) {
            return this;
        }
        int[] iArr = genericGFPoly.b;
        int[] iArr2 = this.b;
        if (iArr2.length > iArr.length) {
            iArr2 = iArr;
            iArr = iArr2;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = iArr2[i - length] ^ iArr[i];
        }
        return new GenericGFPoly(genericGF2, iArr3);
    }

    public final int b(int i) {
        if (i == 0) {
            return c(0);
        }
        int[] iArr = this.b;
        if (i != 1) {
            int iC = iArr[0];
            int length = iArr.length;
            for (int i2 = 1; i2 < length; i2++) {
                iC = this.f16150a.c(i, iC) ^ iArr[i2];
            }
            return iC;
        }
        int i3 = 0;
        for (int i4 : iArr) {
            GenericGF genericGF = GenericGF.h;
            i3 ^= i4;
        }
        return i3;
    }

    public final int c(int i) {
        return this.b[(r0.length - 1) - i];
    }

    public final int d() {
        return this.b.length - 1;
    }

    public final boolean e() {
        return this.b[0] == 0;
    }

    public final GenericGFPoly f(int i) {
        GenericGF genericGF = this.f16150a;
        if (i == 0) {
            return genericGF.c;
        }
        if (i == 1) {
            return this;
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = genericGF.c(iArr[i2], i);
        }
        return new GenericGFPoly(genericGF, iArr2);
    }

    public final GenericGFPoly g(GenericGFPoly genericGFPoly) {
        GenericGF genericGF = genericGFPoly.f16150a;
        GenericGF genericGF2 = this.f16150a;
        if (!genericGF2.equals(genericGF)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (e() || genericGFPoly.e()) {
            return genericGF2.c;
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = genericGFPoly.b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = iArr3[i4] ^ genericGF2.c(i2, iArr2[i3]);
            }
        }
        return new GenericGFPoly(genericGF2, iArr3);
    }

    public final GenericGFPoly h(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        GenericGF genericGF = this.f16150a;
        if (i2 == 0) {
            return genericGF.c;
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr2[i3] = genericGF.c(iArr[i3], i2);
        }
        return new GenericGFPoly(genericGF, iArr2);
    }

    public final String toString() {
        if (e()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(d() * 8);
        for (int iD = d(); iD >= 0; iD--) {
            int iC = c(iD);
            if (iC != 0) {
                if (iC < 0) {
                    if (iD == d()) {
                        sb.append("-");
                    } else {
                        sb.append(" - ");
                    }
                    iC = -iC;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iD == 0 || iC != 1) {
                    GenericGF genericGF = this.f16150a;
                    if (iC == 0) {
                        genericGF.getClass();
                        throw new IllegalArgumentException();
                    }
                    int i = genericGF.b[iC];
                    if (i == 0) {
                        sb.append('1');
                    } else if (i == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i);
                    }
                }
                if (iD != 0) {
                    if (iD == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iD);
                    }
                }
            }
        }
        return sb.toString();
    }
}
