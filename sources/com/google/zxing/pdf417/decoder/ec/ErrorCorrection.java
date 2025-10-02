package com.google.zxing.pdf417.decoder.ec;

import com.google.zxing.ChecksumException;

/* loaded from: classes6.dex */
public final class ErrorCorrection {

    /* renamed from: a, reason: collision with root package name */
    public final ModulusGF f16209a = ModulusGF.e;

    public final int a(int[] iArr, int i, int[] iArr2) throws ChecksumException {
        int i2;
        int i3;
        ModulusPoly modulusPoly;
        ModulusPoly modulusPoly2;
        int i4 = i;
        ModulusGF modulusGF = this.f16209a;
        ModulusPoly modulusPoly3 = new ModulusPoly(modulusGF, iArr);
        int[] iArr3 = new int[i4];
        int i5 = 0;
        int i6 = i4;
        boolean z = false;
        while (true) {
            i2 = 1;
            if (i6 <= 0) {
                break;
            }
            int iB = modulusPoly3.b(modulusGF.f16210a[i6]);
            iArr3[i4 - i6] = iB;
            if (iB != 0) {
                z = true;
            }
            i6--;
        }
        if (!z) {
            return 0;
        }
        ModulusPoly modulusPolyG = modulusGF.d;
        ModulusPoly modulusPoly4 = modulusGF.c;
        for (int i7 : iArr2) {
            modulusPolyG = modulusPolyG.g(new ModulusPoly(modulusGF, new int[]{(929 - modulusGF.f16210a[(iArr.length - 1) - i7]) % 929, 1}));
        }
        ModulusPoly modulusPoly5 = new ModulusPoly(modulusGF, iArr3);
        if (i4 < 0) {
            throw new IllegalArgumentException();
        }
        int[] iArr4 = new int[i4 + 1];
        iArr4[0] = 1;
        ModulusPoly modulusPoly6 = new ModulusPoly(modulusGF, iArr4);
        if (modulusPoly6.d() >= modulusPoly5.d()) {
            modulusPoly6 = modulusPoly5;
            modulusPoly5 = modulusPoly6;
        }
        ModulusPoly modulusPolyH = modulusPoly5;
        ModulusPoly modulusPoly7 = modulusPoly6;
        ModulusPoly modulusPoly8 = modulusGF.d;
        ModulusPoly modulusPoly9 = modulusPoly4;
        while (modulusPoly7.d() >= i4 / 2) {
            if (modulusPoly7.e()) {
                throw ChecksumException.a();
            }
            int iA = modulusGF.a(modulusPoly7.c(modulusPoly7.d()));
            ModulusPoly modulusPolyA = modulusPoly4;
            while (modulusPolyH.d() >= modulusPoly7.d() && !modulusPolyH.e()) {
                int iD = modulusPolyH.d() - modulusPoly7.d();
                int iB2 = modulusGF.b(modulusPolyH.c(modulusPolyH.d()), iA);
                if (iD < 0) {
                    throw new IllegalArgumentException();
                }
                if (iB2 == 0) {
                    modulusPoly = modulusPoly4;
                    i3 = i2;
                } else {
                    i3 = i2;
                    int[] iArr5 = new int[iD + 1];
                    iArr5[i5] = iB2;
                    modulusPoly = new ModulusPoly(modulusGF, iArr5);
                }
                modulusPolyA = modulusPolyA.a(modulusPoly);
                int[] iArr6 = modulusPoly7.b;
                ModulusGF modulusGF2 = modulusPoly7.f16211a;
                if (iD < 0) {
                    throw new IllegalArgumentException();
                }
                if (iB2 == 0) {
                    modulusPoly2 = modulusGF2.c;
                } else {
                    int length = iArr6.length;
                    int[] iArr7 = new int[iD + length];
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = i8;
                        iArr7[i9] = modulusGF2.b(iArr6[i9], iB2);
                        i8 = i9 + 1;
                    }
                    modulusPoly2 = new ModulusPoly(modulusGF2, iArr7);
                }
                modulusPolyH = modulusPolyH.h(modulusPoly2);
                i2 = i3;
                i5 = 0;
            }
            int i10 = i2;
            ModulusPoly modulusPolyH2 = modulusPolyA.g(modulusPoly8).h(modulusPoly9);
            ModulusGF modulusGF3 = modulusPolyH2.f16211a;
            int[] iArr8 = modulusPolyH2.b;
            int length2 = iArr8.length;
            int[] iArr9 = new int[length2];
            for (int i11 = 0; i11 < length2; i11++) {
                int i12 = iArr8[i11];
                modulusGF3.getClass();
                iArr9[i11] = (929 - i12) % 929;
            }
            ModulusPoly modulusPoly10 = new ModulusPoly(modulusGF3, iArr9);
            ModulusPoly modulusPoly11 = modulusPolyH;
            modulusPolyH = modulusPoly7;
            modulusPoly7 = modulusPoly11;
            modulusPoly9 = modulusPoly8;
            i2 = i10;
            i5 = 0;
            modulusPoly8 = modulusPoly10;
            i4 = i;
        }
        int i13 = i5;
        int i14 = i2;
        int iC = modulusPoly8.c(i13);
        if (iC == 0) {
            throw ChecksumException.a();
        }
        int iA2 = modulusGF.a(iC);
        ModulusPoly[] modulusPolyArr = {modulusPoly8.f(iA2), modulusPoly7.f(iA2)};
        ModulusPoly modulusPoly12 = modulusPolyArr[i13];
        ModulusPoly modulusPoly13 = modulusPolyArr[i14];
        int iD2 = modulusPoly12.d();
        int[] iArr10 = new int[iD2];
        int i15 = i13;
        for (int i16 = i14; i16 < 929 && i15 < iD2; i16++) {
            if (modulusPoly12.b(i16) == 0) {
                iArr10[i15] = modulusGF.a(i16);
                i15++;
            }
        }
        if (i15 != iD2) {
            throw ChecksumException.a();
        }
        int iD3 = modulusPoly12.d();
        int[] iArr11 = new int[iD3];
        for (int i17 = i14; i17 <= iD3; i17++) {
            iArr11[iD3 - i17] = modulusGF.b(i17, modulusPoly12.c(i17));
        }
        ModulusPoly modulusPoly14 = new ModulusPoly(modulusGF, iArr11);
        int[] iArr12 = new int[iD2];
        for (int i18 = i13; i18 < iD2; i18++) {
            int iA3 = modulusGF.a(iArr10[i18]);
            iArr12[i18] = modulusGF.b((929 - modulusPoly13.b(iA3)) % 929, modulusGF.a(modulusPoly14.b(iA3)));
        }
        while (i13 < iD2) {
            int length3 = iArr.length - 1;
            int i19 = iArr10[i13];
            if (i19 == 0) {
                throw new IllegalArgumentException();
            }
            int i20 = length3 - modulusGF.b[i19];
            if (i20 < 0) {
                throw ChecksumException.a();
            }
            iArr[i20] = ((929 + iArr[i20]) - iArr12[i13]) % 929;
            i13++;
        }
        return iD2;
    }
}
