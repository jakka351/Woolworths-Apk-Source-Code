package com.google.zxing.qrcode.detector;

import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
final class AlignmentPatternFinder {

    /* renamed from: a, reason: collision with root package name */
    public final BitMatrix f16230a;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final float g;
    public final ResultPointCallback i;
    public final ArrayList b = new ArrayList(5);
    public final int[] h = new int[3];

    public AlignmentPatternFinder(BitMatrix bitMatrix, int i, int i2, int i3, int i4, float f, ResultPointCallback resultPointCallback) {
        this.f16230a = bitMatrix;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = f;
        this.i = resultPointCallback;
    }

    public final boolean a(int[] iArr) {
        float f = this.g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - iArr[i]) >= f2) {
                return false;
            }
        }
        return true;
    }

    public final AlignmentPattern b(int i, int i2, int[] iArr) {
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = i3 + i4 + iArr[2];
        float f = (i2 - r5) - (i4 / 2.0f);
        int i6 = (int) f;
        int i7 = i4 * 2;
        BitMatrix bitMatrix = this.f16230a;
        int i8 = bitMatrix.e;
        int[] iArr2 = this.h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        int i9 = i;
        while (i9 >= 0 && bitMatrix.b(i6, i9)) {
            int i10 = iArr2[1];
            if (i10 > i7) {
                break;
            }
            iArr2[1] = i10 + 1;
            i9--;
        }
        float f2 = Float.NaN;
        if (i9 >= 0 && iArr2[1] <= i7) {
            while (i9 >= 0 && !bitMatrix.b(i6, i9)) {
                int i11 = iArr2[0];
                if (i11 > i7) {
                    break;
                }
                iArr2[0] = i11 + 1;
                i9--;
            }
            if (iArr2[0] <= i7) {
                int i12 = i + 1;
                while (i12 < i8 && bitMatrix.b(i6, i12)) {
                    int i13 = iArr2[1];
                    if (i13 > i7) {
                        break;
                    }
                    iArr2[1] = i13 + 1;
                    i12++;
                }
                if (i12 != i8 && iArr2[1] <= i7) {
                    while (i12 < i8 && !bitMatrix.b(i6, i12)) {
                        int i14 = iArr2[2];
                        if (i14 > i7) {
                            break;
                        }
                        iArr2[2] = i14 + 1;
                        i12++;
                    }
                    int i15 = iArr2[2];
                    if (i15 <= i7 && Math.abs(((iArr2[0] + iArr2[1]) + i15) - i5) * 5 < i5 * 2 && a(iArr2)) {
                        f2 = (i12 - iArr2[2]) - (iArr2[1] / 2.0f);
                    }
                }
            }
        }
        if (Float.isNaN(f2)) {
            return null;
        }
        float f3 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        ArrayList arrayList = this.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AlignmentPattern alignmentPattern = (AlignmentPattern) it.next();
            float f4 = alignmentPattern.c;
            float f5 = alignmentPattern.f16132a;
            float f6 = alignmentPattern.b;
            if (Math.abs(f2 - f6) <= f3 && Math.abs(f - f5) <= f3) {
                float fAbs = Math.abs(f3 - f4);
                if (fAbs <= 1.0f || fAbs <= f4) {
                    return new AlignmentPattern((f5 + f) / 2.0f, (f6 + f2) / 2.0f, (alignmentPattern.c + f3) / 2.0f);
                }
            }
        }
        arrayList.add(new AlignmentPattern(f, f2, f3));
        ResultPointCallback resultPointCallback = this.i;
        if (resultPointCallback == null) {
            return null;
        }
        resultPointCallback.a();
        return null;
    }
}
