package com.google.zxing.pdf417.decoder.ec;

/* loaded from: classes6.dex */
final class ModulusPoly {

    /* renamed from: a, reason: collision with root package name */
    public final ModulusGF f16211a;
    public final int[] b;

    public ModulusPoly(ModulusGF modulusGF, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f16211a = modulusGF;
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

    public final ModulusPoly a(ModulusPoly modulusPoly) {
        ModulusGF modulusGF = modulusPoly.f16211a;
        ModulusGF modulusGF2 = this.f16211a;
        if (!modulusGF2.equals(modulusGF)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (e()) {
            return modulusPoly;
        }
        if (modulusPoly.e()) {
            return this;
        }
        int[] iArr = modulusPoly.b;
        int[] iArr2 = this.b;
        if (iArr2.length > iArr.length) {
            iArr2 = iArr;
            iArr = iArr2;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = (iArr2[i - length] + iArr[i]) % 929;
        }
        return new ModulusPoly(modulusGF2, iArr3);
    }

    public final int b(int i) {
        if (i == 0) {
            return c(0);
        }
        ModulusGF modulusGF = this.f16211a;
        int[] iArr = this.b;
        if (i != 1) {
            int iB = iArr[0];
            int length = iArr.length;
            for (int i2 = 1; i2 < length; i2++) {
                iB = (modulusGF.b(i, iB) + iArr[i2]) % 929;
            }
            return iB;
        }
        int i3 = 0;
        for (int i4 : iArr) {
            modulusGF.getClass();
            i3 = (i3 + i4) % 929;
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

    public final ModulusPoly f(int i) {
        ModulusGF modulusGF = this.f16211a;
        if (i == 0) {
            return modulusGF.c;
        }
        if (i == 1) {
            return this;
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = modulusGF.b(iArr[i2], i);
        }
        return new ModulusPoly(modulusGF, iArr2);
    }

    public final ModulusPoly g(ModulusPoly modulusPoly) {
        ModulusGF modulusGF = modulusPoly.f16211a;
        ModulusGF modulusGF2 = this.f16211a;
        if (!modulusGF2.equals(modulusGF)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (e() || modulusPoly.e()) {
            return modulusGF2.c;
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = modulusPoly.b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = (modulusGF2.b(i2, iArr2[i3]) + iArr3[i4]) % 929;
            }
        }
        return new ModulusPoly(modulusGF2, iArr3);
    }

    public final ModulusPoly h(ModulusPoly modulusPoly) {
        if (!this.f16211a.equals(modulusPoly.f16211a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (modulusPoly.e()) {
            return this;
        }
        ModulusGF modulusGF = modulusPoly.f16211a;
        int[] iArr = modulusPoly.b;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            modulusGF.getClass();
            iArr2[i] = (929 - i2) % 929;
        }
        return a(new ModulusPoly(modulusGF, iArr2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(d() * 8);
        for (int iD = d(); iD >= 0; iD--) {
            int iC = c(iD);
            if (iC != 0) {
                if (iC < 0) {
                    sb.append(" - ");
                    iC = -iC;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iD == 0 || iC != 1) {
                    sb.append(iC);
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
