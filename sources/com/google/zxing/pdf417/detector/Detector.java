package com.google.zxing.pdf417.detector;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class Detector {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f16212a = {0, 4, 1, 5};
    public static final int[] b = {6, 2, 7, 3};
    public static final int[] c = {8, 1, 1, 1, 1, 1, 1, 3};
    public static final int[] d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    public static ArrayList a(BitMatrix bitMatrix) {
        ArrayList arrayList = new ArrayList();
        int i = bitMatrix.e;
        if (i > 0) {
            int i2 = bitMatrix.d;
            ResultPoint[] resultPointArr = new ResultPoint[8];
            int i3 = 0;
            int i4 = 0;
            ResultPoint[] resultPointArrC = c(bitMatrix, i, i2, 0, 0, c);
            for (int i5 = 0; i5 < 4; i5++) {
                resultPointArr[f16212a[i5]] = resultPointArrC[i5];
            }
            ResultPoint resultPoint = resultPointArr[4];
            if (resultPoint != null) {
                i4 = (int) resultPoint.f16132a;
                i3 = (int) resultPoint.b;
            }
            ResultPoint[] resultPointArrC2 = c(bitMatrix, i, i2, i3, i4, d);
            for (int i6 = 0; i6 < 4; i6++) {
                resultPointArr[b[i6]] = resultPointArrC2[i6];
            }
            if (resultPointArr[0] != null || resultPointArr[3] != null) {
                arrayList.add(resultPointArr);
            }
        }
        return arrayList;
    }

    public static int[] b(BitMatrix bitMatrix, int i, int i2, int i3, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i4 = 0;
        while (bitMatrix.b(i, i2) && i > 0) {
            int i5 = i4 + 1;
            if (i4 >= 3) {
                break;
            }
            i--;
            i4 = i5;
        }
        int length = iArr.length;
        int i6 = i;
        int i7 = 0;
        boolean z = false;
        while (i < i3) {
            if (bitMatrix.b(i, i2) != z) {
                iArr2[i7] = iArr2[i7] + 1;
            } else {
                if (i7 != length - 1) {
                    i7++;
                } else {
                    if (d(iArr2, iArr) < 0.42f) {
                        return new int[]{i6, i};
                    }
                    i6 += iArr2[0] + iArr2[1];
                    int i8 = i7 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i8);
                    iArr2[i8] = 0;
                    iArr2[i7] = 0;
                    i7--;
                }
                iArr2[i7] = 1;
                z = !z;
            }
            i++;
        }
        if (i7 != length - 1 || d(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i6, i - 1};
    }

    public static ResultPoint[] c(BitMatrix bitMatrix, int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        boolean z;
        int[] iArrB;
        ResultPoint[] resultPointArr = new ResultPoint[4];
        int[] iArr2 = iArr;
        int[] iArr3 = new int[iArr2.length];
        int i6 = i3;
        while (true) {
            if (i6 >= i) {
                i5 = i6;
                z = false;
                break;
            }
            int[] iArrB2 = b(bitMatrix, i4, i6, i2, iArr2, iArr3);
            if (iArrB2 != null) {
                int[] iArr4 = iArrB2;
                while (true) {
                    i5 = i6;
                    if (i5 <= 0 || (iArrB = b(bitMatrix, i4, i5 - 1, i2, iArr, iArr3)) == null) {
                        break;
                    }
                    iArr4 = iArrB;
                }
                float f = i5;
                resultPointArr[0] = new ResultPoint(iArr4[0], f);
                resultPointArr[1] = new ResultPoint(iArr4[1], f);
                z = true;
            } else {
                i6 += 5;
                iArr2 = iArr;
            }
        }
        int i7 = i5 + 1;
        if (z) {
            int[] iArr5 = {(int) resultPointArr[0].f16132a, (int) resultPointArr[1].f16132a};
            int i8 = i7;
            int i9 = 0;
            while (i8 < i) {
                int[] iArrB3 = b(bitMatrix, iArr5[0], i8, i2, iArr, iArr3);
                if (iArrB3 != null && Math.abs(iArr5[0] - iArrB3[0]) < 5 && Math.abs(iArr5[1] - iArrB3[1]) < 5) {
                    iArr5 = iArrB3;
                    i9 = 0;
                } else {
                    if (i9 > 25) {
                        break;
                    }
                    i9++;
                }
                i8++;
            }
            i7 = i8 - (i9 + 1);
            float f2 = i7;
            resultPointArr[2] = new ResultPoint(iArr5[0], f2);
            resultPointArr[3] = new ResultPoint(iArr5[1], f2);
        }
        if (i7 - i5 < 10) {
            Arrays.fill(resultPointArr, (Object) null);
        }
        return resultPointArr;
    }

    public static float d(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f = i;
        float f2 = f / i2;
        float f3 = 0.8f * f2;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        for (int i4 = 0; i4 < length; i4++) {
            float f5 = iArr2[i4] * f2;
            float f6 = iArr[i4];
            float f7 = f6 > f5 ? f6 - f5 : f5 - f6;
            if (f7 > f3) {
                return Float.POSITIVE_INFINITY;
            }
            f4 += f7;
        }
        return f4 / f;
    }
}
