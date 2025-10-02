package com.google.zxing.aztec.detector;

import YU.a;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.PerspectiveTransform;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.common.detector.WhiteRectangleDetector;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;

/* loaded from: classes6.dex */
public final class Detector {
    public static final int[] g = {3808, 476, 2107, 1799};

    /* renamed from: a, reason: collision with root package name */
    public final BitMatrix f16135a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;

    public static final class Point {

        /* renamed from: a, reason: collision with root package name */
        public final int f16136a;
        public final int b;

        public Point(int i, int i2) {
            this.f16136a = i;
            this.b = i2;
        }

        public final ResultPoint a() {
            return new ResultPoint(this.f16136a, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(this.f16136a);
            sb.append(' ');
            return a.l(sb, this.b, '>');
        }
    }

    public Detector(BitMatrix bitMatrix) {
        this.f16135a = bitMatrix;
    }

    public static ResultPoint[] b(ResultPoint[] resultPointArr, int i, int i2) {
        float f = i2 / (i * 2.0f);
        ResultPoint resultPoint = resultPointArr[0];
        float f2 = resultPoint.f16132a;
        ResultPoint resultPoint2 = resultPointArr[2];
        float f3 = resultPoint2.f16132a;
        float f4 = f2 - f3;
        float f5 = resultPoint.b;
        float f6 = resultPoint2.b;
        float f7 = f5 - f6;
        float f8 = (f2 + f3) / 2.0f;
        float f9 = (f5 + f6) / 2.0f;
        float f10 = f4 * f;
        float f11 = f7 * f;
        ResultPoint resultPoint3 = new ResultPoint(f8 + f10, f9 + f11);
        ResultPoint resultPoint4 = new ResultPoint(f8 - f10, f9 - f11);
        ResultPoint resultPoint5 = resultPointArr[1];
        float f12 = resultPoint5.f16132a;
        ResultPoint resultPoint6 = resultPointArr[3];
        float f13 = resultPoint6.f16132a;
        float f14 = f12 - f13;
        float f15 = resultPoint5.b;
        float f16 = resultPoint6.b;
        float f17 = f15 - f16;
        float f18 = (f12 + f13) / 2.0f;
        float f19 = (f15 + f16) / 2.0f;
        float f20 = f14 * f;
        float f21 = f * f17;
        return new ResultPoint[]{resultPoint3, new ResultPoint(f18 + f20, f19 + f21), resultPoint4, new ResultPoint(f18 - f20, f19 - f21)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AztecDetectorResult a(boolean z) {
        ResultPoint resultPointA;
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3;
        ResultPoint resultPointA2;
        ResultPoint resultPointA3;
        ResultPoint resultPoint4;
        ResultPoint resultPoint5;
        int i;
        int i2;
        char c;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        int i9;
        BitMatrix bitMatrix = this.f16135a;
        char c2 = 3;
        int i10 = -1;
        int i11 = 1;
        int i12 = 0;
        try {
            ResultPoint[] resultPointArrB = new WhiteRectangleDetector(bitMatrix).b();
            resultPoint2 = resultPointArrB[0];
            resultPoint3 = resultPointArrB[1];
            resultPoint = resultPointArrB[2];
            resultPointA = resultPointArrB[3];
        } catch (NotFoundException unused) {
            int i13 = bitMatrix.d / 2;
            int i14 = bitMatrix.e / 2;
            int i15 = i13 + 7;
            int i16 = i14 - 7;
            ResultPoint resultPointA4 = e(new Point(i15, i16), false, 1, -1).a();
            int i17 = i14 + 7;
            ResultPoint resultPointA5 = e(new Point(i15, i17), false, 1, 1).a();
            int i18 = i13 - 7;
            ResultPoint resultPointA6 = e(new Point(i18, i17), false, -1, 1).a();
            resultPointA = e(new Point(i18, i16), false, -1, -1).a();
            resultPoint = resultPointA6;
            resultPoint2 = resultPointA4;
            resultPoint3 = resultPointA5;
        }
        int iC = MathUtils.c((((resultPoint2.f16132a + resultPointA.f16132a) + resultPoint3.f16132a) + resultPoint.f16132a) / 4.0f);
        int iC2 = MathUtils.c((((resultPoint2.b + resultPointA.b) + resultPoint3.b) + resultPoint.b) / 4.0f);
        char c3 = 15;
        try {
            ResultPoint[] resultPointArrB2 = new WhiteRectangleDetector(bitMatrix, 15, iC, iC2).b();
            resultPoint5 = resultPointArrB2[0];
            resultPoint4 = resultPointArrB2[1];
            resultPointA2 = resultPointArrB2[2];
            resultPointA3 = resultPointArrB2[3];
        } catch (NotFoundException unused2) {
            int i19 = iC + 7;
            int i20 = iC2 - 7;
            ResultPoint resultPointA7 = e(new Point(i19, i20), false, 1, -1).a();
            int i21 = iC2 + 7;
            ResultPoint resultPointA8 = e(new Point(i19, i21), false, 1, 1).a();
            int i22 = iC - 7;
            resultPointA2 = e(new Point(i22, i21), false, -1, 1).a();
            resultPointA3 = e(new Point(i22, i20), false, -1, -1).a();
            resultPoint4 = resultPointA8;
            resultPoint5 = resultPointA7;
        }
        Point point = new Point(MathUtils.c((((resultPoint5.f16132a + resultPointA3.f16132a) + resultPoint4.f16132a) + resultPointA2.f16132a) / 4.0f), MathUtils.c((((resultPoint5.b + resultPointA3.b) + resultPoint4.b) + resultPointA2.b) / 4.0f));
        this.e = 1;
        boolean z2 = true;
        Point point2 = point;
        Point point3 = point2;
        Point point4 = point3;
        while (true) {
            i = point4.b;
            i2 = point4.f16136a;
            c = c2;
            i3 = point.b;
            i4 = i12;
            i5 = point.f16136a;
            char c4 = c3;
            if (this.e >= 9) {
                i6 = i11;
                break;
            }
            Point pointE = e(point, z2, i11, i10);
            int i23 = pointE.b;
            int i24 = pointE.f16136a;
            Point pointE2 = e(point2, z2, i11, i11);
            Point pointE3 = e(point3, z2, i10, i11);
            Point pointE4 = e(point4, z2, i10, i10);
            int i25 = pointE4.b;
            i6 = i11;
            int i26 = pointE4.f16136a;
            boolean z3 = z2;
            if (this.e > 2) {
                double dB = (MathUtils.b(i26, i25, i24, i23) * this.e) / (MathUtils.b(i2, i, i5, i3) * (this.e + 2));
                if (dB < 0.75d || dB > 1.25d) {
                    break;
                }
                Point point5 = new Point(i24 - 3, i23 + 3);
                Point point6 = new Point(pointE2.f16136a - 3, pointE2.b - 3);
                Point point7 = new Point(pointE3.f16136a + 3, pointE3.b - 3);
                Point point8 = new Point(i26 + 3, i25 + 3);
                int iC3 = c(point8, point5);
                if (iC3 == 0 || c(point5, point6) != iC3 || c(point6, point7) != iC3 || c(point7, point8) != iC3) {
                    break;
                }
            }
            z2 = !z3;
            this.e++;
            point2 = pointE2;
            point3 = pointE3;
            c2 = c;
            i12 = i4;
            c3 = c4;
            point = pointE;
            i11 = i6;
            point4 = pointE4;
            i10 = -1;
        }
        int i27 = this.e;
        if (i27 != 5 && i27 != 7) {
            throw NotFoundException.f;
        }
        this.b = i27 == 5 ? i6 : i4;
        int i28 = i27 * 2;
        ResultPoint[] resultPointArrB3 = b(new ResultPoint[]{new ResultPoint(i5 + 0.5f, i3 - 0.5f), new ResultPoint(point2.f16136a + 0.5f, point2.b + 0.5f), new ResultPoint(point3.f16136a - 0.5f, point3.b + 0.5f), new ResultPoint(i2 - 0.5f, i - 0.5f)}, i28 - 3, i28);
        if (z) {
            ResultPoint resultPoint6 = resultPointArrB3[i4];
            resultPointArrB3[i4] = resultPointArrB3[2];
            resultPointArrB3[2] = resultPoint6;
        }
        if (!g(resultPointArrB3[i4]) || !g(resultPointArrB3[i6]) || !g(resultPointArrB3[2]) || !g(resultPointArrB3[c])) {
            throw NotFoundException.f;
        }
        int i29 = this.e * 2;
        int[] iArr = {h(resultPointArrB3[i4], resultPointArrB3[i6], i29), h(resultPointArrB3[i6], resultPointArrB3[2], i29), h(resultPointArrB3[2], resultPointArrB3[c], i29), h(resultPointArrB3[c], resultPointArrB3[i4], i29)};
        int i30 = i4;
        int i31 = i30;
        while (i30 < 4) {
            int i32 = iArr[i30];
            i31 = (i31 << 3) + ((i32 >> (i29 - 2)) << 1) + (i32 & 1);
            i30++;
        }
        int i33 = ((i31 & 1) << 11) + (i31 >> 1);
        for (int i34 = i4; i34 < 4; i34++) {
            if (Integer.bitCount(g[i34] ^ i33) <= 2) {
                this.f = i34;
                long j2 = 0;
                int i35 = i4;
                while (true) {
                    i7 = 10;
                    if (i35 >= 4) {
                        break;
                    }
                    int i36 = iArr[(this.f + i35) % 4];
                    if (this.b) {
                        j = j2 << 7;
                        i9 = (i36 >> 1) & 127;
                    } else {
                        j = j2 << 10;
                        i9 = ((i36 >> 2) & 992) + ((i36 >> 1) & 31);
                    }
                    j2 = j + i9;
                    i35++;
                }
                if (this.b) {
                    i7 = 7;
                    i8 = 2;
                } else {
                    i8 = 4;
                }
                int i37 = i7 - i8;
                int[] iArr2 = new int[i7];
                for (int i38 = i7 - 1; i38 >= 0; i38--) {
                    iArr2[i38] = ((int) j2) & 15;
                    j2 >>= 4;
                }
                try {
                    new ReedSolomonDecoder(GenericGF.k).a(i37, iArr2);
                    int i39 = i4;
                    for (int i40 = i39; i40 < i8; i40++) {
                        i39 = (i39 << 4) + iArr2[i40];
                    }
                    if (this.b) {
                        this.c = (i39 >> 6) + 1;
                        this.d = (i39 & 63) + 1;
                    } else {
                        this.c = (i39 >> 11) + 1;
                        this.d = (i39 & 2047) + 1;
                    }
                    int i41 = this.f;
                    ResultPoint resultPoint7 = resultPointArrB3[i41 % 4];
                    ResultPoint resultPoint8 = resultPointArrB3[(i41 + 1) % 4];
                    ResultPoint resultPoint9 = resultPointArrB3[(i41 + 2) % 4];
                    ResultPoint resultPoint10 = resultPointArrB3[(i41 + 3) % 4];
                    int iD = d();
                    float f = iD / 2.0f;
                    float f2 = this.e;
                    float f3 = f - f2;
                    float f4 = f + f2;
                    return new AztecDetectorResult(GridSampler.f16145a.a(bitMatrix, iD, iD, PerspectiveTransform.a(f3, f3, f4, f3, f4, f4, f3, f4, resultPoint7.f16132a, resultPoint7.b, resultPoint8.f16132a, resultPoint8.b, resultPoint9.f16132a, resultPoint9.b, resultPoint10.f16132a, resultPoint10.b)), b(resultPointArrB3, this.e * 2, d()), this.b, this.d, this.c);
                } catch (ReedSolomonException unused3) {
                    throw NotFoundException.f;
                }
            }
        }
        throw NotFoundException.f;
    }

    public final int c(Point point, Point point2) {
        int i = point.f16136a;
        int i2 = point.b;
        float fB = MathUtils.b(i, i2, point2.f16136a, point2.b);
        float f = (r1 - i) / fB;
        float f2 = (r13 - i2) / fB;
        float f3 = i;
        float f4 = i2;
        BitMatrix bitMatrix = this.f16135a;
        boolean zB = bitMatrix.b(i, i2);
        int iCeil = (int) Math.ceil(fB);
        int i3 = 0;
        for (int i4 = 0; i4 < iCeil; i4++) {
            f3 += f;
            f4 += f2;
            if (bitMatrix.b(MathUtils.c(f3), MathUtils.c(f4)) != zB) {
                i3++;
            }
        }
        float f5 = i3 / fB;
        if (f5 <= 0.1f || f5 >= 0.9f) {
            return (f5 <= 0.1f) == zB ? 1 : -1;
        }
        return 0;
    }

    public final int d() {
        if (this.b) {
            return (this.c * 4) + 11;
        }
        int i = this.c;
        if (i <= 4) {
            return (i * 4) + 15;
        }
        return ((((i - 4) / 8) + 1) * 2) + (i * 4) + 15;
    }

    public final Point e(Point point, boolean z, int i, int i2) {
        BitMatrix bitMatrix;
        int i3 = point.f16136a + i;
        int i4 = point.b;
        while (true) {
            i4 += i2;
            boolean zF = f(i3, i4);
            bitMatrix = this.f16135a;
            if (!zF || bitMatrix.b(i3, i4) != z) {
                break;
            }
            i3 += i;
        }
        int i5 = i3 - i;
        int i6 = i4 - i2;
        while (f(i5, i6) && bitMatrix.b(i5, i6) == z) {
            i5 += i;
        }
        int i7 = i5 - i;
        while (f(i7, i6) && bitMatrix.b(i7, i6) == z) {
            i6 += i2;
        }
        return new Point(i7, i6 - i2);
    }

    public final boolean f(int i, int i2) {
        if (i < 0) {
            return false;
        }
        BitMatrix bitMatrix = this.f16135a;
        return i < bitMatrix.d && i2 > 0 && i2 < bitMatrix.e;
    }

    public final boolean g(ResultPoint resultPoint) {
        return f(MathUtils.c(resultPoint.f16132a), MathUtils.c(resultPoint.b));
    }

    public final int h(ResultPoint resultPoint, ResultPoint resultPoint2, int i) {
        float f = resultPoint.f16132a;
        float f2 = resultPoint.b;
        float f3 = resultPoint2.f16132a;
        float f4 = resultPoint2.b;
        float fA = MathUtils.a(f, f2, f3, f4);
        float f5 = fA / i;
        float f6 = resultPoint.f16132a;
        float f7 = ((resultPoint2.f16132a - f6) * f5) / fA;
        float f8 = ((f4 - f2) * f5) / fA;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f9 = i3;
            if (this.f16135a.b(MathUtils.c((f9 * f7) + f6), MathUtils.c((f9 * f8) + f2))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }
}
