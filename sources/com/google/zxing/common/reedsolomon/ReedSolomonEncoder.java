package com.google.zxing.common.reedsolomon;

import YU.a;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class ReedSolomonEncoder {

    /* renamed from: a, reason: collision with root package name */
    public final GenericGF f16152a;
    public final ArrayList b;

    public ReedSolomonEncoder(GenericGF genericGF) {
        this.f16152a = genericGF;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(new GenericGFPoly(genericGF, new int[]{1}));
    }

    public final void a(int i, int[] iArr) {
        if (i == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        GenericGF genericGF = this.f16152a;
        if (i >= size) {
            GenericGFPoly genericGFPolyG = (GenericGFPoly) a.c(1, arrayList);
            for (int size2 = arrayList.size(); size2 <= i; size2++) {
                genericGFPolyG = genericGFPolyG.g(new GenericGFPoly(genericGF, new int[]{1, genericGF.f16149a[(size2 - 1) + genericGF.g]}));
                arrayList.add(genericGFPolyG);
            }
        }
        GenericGFPoly genericGFPoly = (GenericGFPoly) arrayList.get(i);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        GenericGFPoly genericGFPolyH = new GenericGFPoly(genericGF, iArr2).h(i, 1);
        GenericGF genericGF2 = genericGFPolyH.f16150a;
        if (!genericGF2.equals(genericGFPoly.f16150a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (genericGFPoly.e()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        GenericGFPoly genericGFPolyA = genericGF2.c;
        int iB = genericGF2.b(genericGFPoly.c(genericGFPoly.d()));
        while (genericGFPolyH.d() >= genericGFPoly.d() && !genericGFPolyH.e()) {
            int iD = genericGFPolyH.d() - genericGFPoly.d();
            int iC = genericGF2.c(genericGFPolyH.c(genericGFPolyH.d()), iB);
            GenericGFPoly genericGFPolyH2 = genericGFPoly.h(iD, iC);
            genericGFPolyA = genericGFPolyA.a(genericGF2.a(iD, iC));
            genericGFPolyH = genericGFPolyH.a(genericGFPolyH2);
        }
        int[] iArr3 = new GenericGFPoly[]{genericGFPolyA, genericGFPolyH}[1].b;
        int length2 = i - iArr3.length;
        for (int i2 = 0; i2 < length2; i2++) {
            iArr[length + i2] = 0;
        }
        System.arraycopy(iArr3, 0, iArr, length + length2, iArr3.length);
    }
}
