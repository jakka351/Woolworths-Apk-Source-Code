package com.google.zxing.datamatrix.detector;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.detector.WhiteRectangleDetector;

/* loaded from: classes6.dex */
public final class Detector {

    /* renamed from: a, reason: collision with root package name */
    public final BitMatrix f16162a;
    public final WhiteRectangleDetector b;

    public Detector(BitMatrix bitMatrix) {
        this.f16162a = bitMatrix;
        this.b = new WhiteRectangleDetector(bitMatrix);
    }

    public static ResultPoint b(ResultPoint resultPoint, float f, float f2) {
        float f3 = resultPoint.f16132a;
        float f4 = resultPoint.b;
        return new ResultPoint(f3 < f ? f3 - 1.0f : f3 + 1.0f, f4 < f2 ? f4 - 1.0f : f4 + 1.0f);
    }

    public static ResultPoint c(ResultPoint resultPoint, ResultPoint resultPoint2, int i) {
        float f = resultPoint2.f16132a;
        float f2 = resultPoint.f16132a;
        float f3 = i + 1;
        float f4 = resultPoint2.b;
        float f5 = resultPoint.b;
        return new ResultPoint(f2 + ((f - f2) / f3), f5 + ((f4 - f5) / f3));
    }

    public final boolean a(ResultPoint resultPoint) {
        float f = resultPoint.f16132a;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            return false;
        }
        BitMatrix bitMatrix = this.f16162a;
        if (f >= bitMatrix.d) {
            return false;
        }
        float f2 = resultPoint.b;
        return f2 > BitmapDescriptorFactory.HUE_RED && f2 < ((float) bitMatrix.e);
    }

    public final int d(ResultPoint resultPoint, ResultPoint resultPoint2) {
        int i = (int) resultPoint.f16132a;
        int i2 = (int) resultPoint.b;
        int i3 = (int) resultPoint2.f16132a;
        int i4 = (int) resultPoint2.b;
        int i5 = 0;
        boolean z = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z) {
            i = i2;
            i2 = i;
            i3 = i4;
            i4 = i3;
        }
        int iAbs = Math.abs(i3 - i);
        int iAbs2 = Math.abs(i4 - i2);
        int i6 = (-iAbs) / 2;
        int i7 = i2 < i4 ? 1 : -1;
        int i8 = i >= i3 ? -1 : 1;
        int i9 = z ? i2 : i;
        int i10 = z ? i : i2;
        BitMatrix bitMatrix = this.f16162a;
        boolean zB = bitMatrix.b(i9, i10);
        while (i != i3) {
            boolean zB2 = bitMatrix.b(z ? i2 : i, z ? i : i2);
            if (zB2 != zB) {
                i5++;
                zB = zB2;
            }
            i6 += iAbs2;
            if (i6 > 0) {
                if (i2 == i4) {
                    return i5;
                }
                i2 += i7;
                i6 -= iAbs;
            }
            i += i8;
        }
        return i5;
    }
}
