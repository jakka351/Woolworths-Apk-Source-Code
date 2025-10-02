package com.google.zxing.common.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

/* loaded from: classes6.dex */
public final class WhiteRectangleDetector {

    /* renamed from: a, reason: collision with root package name */
    public final BitMatrix f16148a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public WhiteRectangleDetector(BitMatrix bitMatrix, int i, int i2, int i3) throws NotFoundException {
        this.f16148a = bitMatrix;
        int i4 = bitMatrix.e;
        this.b = i4;
        int i5 = bitMatrix.d;
        this.c = i5;
        int i6 = i / 2;
        int i7 = i2 - i6;
        this.d = i7;
        int i8 = i2 + i6;
        this.e = i8;
        int i9 = i3 - i6;
        this.g = i9;
        int i10 = i3 + i6;
        this.f = i10;
        if (i9 < 0 || i7 < 0 || i10 >= i4 || i8 >= i5) {
            throw NotFoundException.f;
        }
    }

    public final boolean a(int i, int i2, int i3, boolean z) {
        BitMatrix bitMatrix = this.f16148a;
        if (z) {
            while (i <= i2) {
                if (bitMatrix.b(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (bitMatrix.b(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    public final ResultPoint[] b() throws NotFoundException {
        int i;
        int i2;
        int i3 = this.d;
        int i4 = this.e;
        int i5 = this.g;
        int i6 = this.f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = true;
        do {
            i = this.c;
            if (!z6) {
                break;
            }
            boolean z7 = false;
            boolean zA = true;
            while (true) {
                if ((!zA && z2) || i4 >= i) {
                    break;
                }
                zA = a(i5, i6, i4, false);
                if (zA) {
                    i4++;
                    z2 = true;
                    z7 = true;
                } else if (!z2) {
                    i4++;
                }
            }
            if (i4 >= i) {
                break;
            }
            boolean zA2 = true;
            while (true) {
                i2 = this.b;
                if ((!zA2 && z3) || i6 >= i2) {
                    break;
                }
                zA2 = a(i3, i4, i6, true);
                if (zA2) {
                    i6++;
                    z3 = true;
                    z7 = true;
                } else if (!z3) {
                    i6++;
                }
            }
            if (i6 >= i2) {
                break;
            }
            boolean zA3 = true;
            while (true) {
                if ((!zA3 && z4) || i3 < 0) {
                    break;
                }
                zA3 = a(i5, i6, i3, false);
                if (zA3) {
                    i3--;
                    z4 = true;
                    z7 = true;
                } else if (!z4) {
                    i3--;
                }
            }
            if (i3 < 0) {
                break;
            }
            z6 = z7;
            boolean zA4 = true;
            while (true) {
                if ((!zA4 && z5) || i5 < 0) {
                    break;
                }
                zA4 = a(i3, i4, i5, true);
                if (zA4) {
                    i5--;
                    z6 = true;
                    z5 = true;
                } else if (!z5) {
                    i5--;
                }
            }
        } while (i5 >= 0);
        z = true;
        if (z) {
            throw NotFoundException.f;
        }
        int i7 = i4 - i3;
        ResultPoint resultPointC = null;
        ResultPoint resultPointC2 = null;
        for (int i8 = 1; resultPointC2 == null && i8 < i7; i8++) {
            resultPointC2 = c(i3, i6 - i8, i3 + i8, i6);
        }
        if (resultPointC2 == null) {
            throw NotFoundException.f;
        }
        ResultPoint resultPointC3 = null;
        for (int i9 = 1; resultPointC3 == null && i9 < i7; i9++) {
            resultPointC3 = c(i3, i5 + i9, i3 + i9, i5);
        }
        if (resultPointC3 == null) {
            throw NotFoundException.f;
        }
        ResultPoint resultPointC4 = null;
        for (int i10 = 1; resultPointC4 == null && i10 < i7; i10++) {
            resultPointC4 = c(i4, i5 + i10, i4 - i10, i5);
        }
        if (resultPointC4 == null) {
            throw NotFoundException.f;
        }
        for (int i11 = 1; resultPointC == null && i11 < i7; i11++) {
            resultPointC = c(i4, i6 - i11, i4 - i11, i6);
        }
        if (resultPointC == null) {
            throw NotFoundException.f;
        }
        float f = resultPointC.f16132a;
        float f2 = resultPointC.b;
        float f3 = resultPointC2.f16132a;
        float f4 = resultPointC2.b;
        float f5 = resultPointC4.f16132a;
        float f6 = resultPointC4.b;
        float f7 = resultPointC3.f16132a;
        float f8 = resultPointC3.b;
        return f < ((float) i) / 2.0f ? new ResultPoint[]{new ResultPoint(f7 - 1.0f, f8 + 1.0f), new ResultPoint(f3 + 1.0f, f4 + 1.0f), new ResultPoint(f5 - 1.0f, f6 - 1.0f), new ResultPoint(f + 1.0f, f2 - 1.0f)} : new ResultPoint[]{new ResultPoint(f7 + 1.0f, f8 + 1.0f), new ResultPoint(f3 + 1.0f, f4 - 1.0f), new ResultPoint(f5 - 1.0f, f6 + 1.0f), new ResultPoint(f - 1.0f, f2 - 1.0f)};
    }

    public final ResultPoint c(float f, float f2, float f3, float f4) {
        int iC = MathUtils.c(MathUtils.a(f, f2, f3, f4));
        float f5 = iC;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < iC; i++) {
            float f8 = i;
            int iC2 = MathUtils.c((f8 * f6) + f);
            int iC3 = MathUtils.c((f8 * f7) + f2);
            if (this.f16148a.b(iC2, iC3)) {
                return new ResultPoint(iC2, iC3);
            }
        }
        return null;
    }

    public WhiteRectangleDetector(BitMatrix bitMatrix) {
        this(bitMatrix, 10, bitMatrix.d / 2, bitMatrix.e / 2);
    }
}
