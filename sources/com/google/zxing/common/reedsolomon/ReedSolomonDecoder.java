package com.google.zxing.common.reedsolomon;

/* loaded from: classes6.dex */
public final class ReedSolomonDecoder {

    /* renamed from: a, reason: collision with root package name */
    public final GenericGF f16151a;

    public ReedSolomonDecoder(GenericGF genericGF) {
        this.f16151a = genericGF;
    }

    public final void a(int i, int[] iArr) throws ReedSolomonException {
        int[] iArr2;
        GenericGF genericGF = this.f16151a;
        GenericGFPoly genericGFPoly = new GenericGFPoly(genericGF, iArr);
        int[] iArr3 = new int[i];
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            int iB = genericGFPoly.b(genericGF.f16149a[genericGF.g + i2]);
            iArr3[(i - 1) - i2] = iB;
            if (iB != 0) {
                z = false;
            }
        }
        if (z) {
            return;
        }
        GenericGFPoly genericGFPoly2 = new GenericGFPoly(genericGF, iArr3);
        GenericGFPoly genericGFPolyA = genericGF.a(i, 1);
        GenericGFPoly genericGFPoly3 = genericGF.c;
        if (genericGFPolyA.d() >= genericGFPoly2.d()) {
            genericGFPolyA = genericGFPoly2;
            genericGFPoly2 = genericGFPolyA;
        }
        GenericGFPoly genericGFPoly4 = genericGF.d;
        GenericGFPoly genericGFPoly5 = genericGFPolyA;
        GenericGFPoly genericGFPolyA2 = genericGFPoly2;
        GenericGFPoly genericGFPoly6 = genericGFPoly5;
        GenericGFPoly genericGFPoly7 = genericGFPoly3;
        while (genericGFPoly6.d() >= i / 2) {
            if (genericGFPoly6.e()) {
                throw new ReedSolomonException("r_{i-1} was zero");
            }
            int iB2 = genericGF.b(genericGFPoly6.c(genericGFPoly6.d()));
            GenericGFPoly genericGFPolyA3 = genericGFPoly3;
            while (genericGFPolyA2.d() >= genericGFPoly6.d() && !genericGFPolyA2.e()) {
                int iD = genericGFPolyA2.d() - genericGFPoly6.d();
                int iC = genericGF.c(genericGFPolyA2.c(genericGFPolyA2.d()), iB2);
                genericGFPolyA3 = genericGFPolyA3.a(genericGF.a(iD, iC));
                genericGFPolyA2 = genericGFPolyA2.a(genericGFPoly6.h(iD, iC));
            }
            GenericGFPoly genericGFPolyA4 = genericGFPolyA3.g(genericGFPoly4).a(genericGFPoly7);
            if (genericGFPolyA2.d() >= genericGFPoly6.d()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
            }
            GenericGFPoly genericGFPoly8 = genericGFPolyA2;
            genericGFPolyA2 = genericGFPoly6;
            genericGFPoly6 = genericGFPoly8;
            genericGFPoly7 = genericGFPoly4;
            genericGFPoly4 = genericGFPolyA4;
        }
        int iC2 = genericGFPoly4.c(0);
        if (iC2 == 0) {
            throw new ReedSolomonException("sigmaTilde(0) was zero");
        }
        int iB3 = genericGF.b(iC2);
        GenericGFPoly[] genericGFPolyArr = {genericGFPoly4.f(iB3), genericGFPoly6.f(iB3)};
        GenericGFPoly genericGFPoly9 = genericGFPolyArr[0];
        GenericGFPoly genericGFPoly10 = genericGFPolyArr[1];
        int iD2 = genericGFPoly9.d();
        if (iD2 == 1) {
            iArr2 = new int[]{genericGFPoly9.c(1)};
        } else {
            int[] iArr4 = new int[iD2];
            int i3 = 0;
            for (int i4 = 1; i4 < genericGF.e && i3 < iD2; i4++) {
                if (genericGFPoly9.b(i4) == 0) {
                    iArr4[i3] = genericGF.b(i4);
                    i3++;
                }
            }
            if (i3 != iD2) {
                throw new ReedSolomonException("Error locator degree does not match number of roots");
            }
            iArr2 = iArr4;
        }
        int length = iArr2.length;
        int[] iArr5 = new int[length];
        for (int i5 = 0; i5 < length; i5++) {
            int iB4 = genericGF.b(iArr2[i5]);
            int iC3 = 1;
            for (int i6 = 0; i6 < length; i6++) {
                if (i5 != i6) {
                    int iC4 = genericGF.c(iArr2[i6], iB4);
                    iC3 = genericGF.c(iC3, (iC4 & 1) == 0 ? iC4 | 1 : iC4 & (-2));
                }
            }
            int iC5 = genericGF.c(genericGFPoly10.b(iB4), genericGF.b(iC3));
            iArr5[i5] = iC5;
            if (genericGF.g != 0) {
                iArr5[i5] = genericGF.c(iC5, iB4);
            }
        }
        for (int i7 = 0; i7 < iArr2.length; i7++) {
            int length2 = iArr.length - 1;
            int i8 = iArr2[i7];
            if (i8 == 0) {
                throw new IllegalArgumentException();
            }
            int i9 = length2 - genericGF.b[i8];
            if (i9 < 0) {
                throw new ReedSolomonException("Bad error location");
            }
            iArr[i9] = iArr[i9] ^ iArr5[i7];
        }
    }
}
