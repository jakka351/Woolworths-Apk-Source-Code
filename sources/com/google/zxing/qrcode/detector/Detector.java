package com.google.zxing.qrcode.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class Detector {

    /* renamed from: a, reason: collision with root package name */
    public final BitMatrix f16231a;
    public ResultPointCallback b;

    public Detector(BitMatrix bitMatrix) {
        this.f16231a = bitMatrix;
    }

    public final float a(FinderPattern finderPattern, FinderPattern finderPattern2) {
        int i = (int) finderPattern.f16132a;
        int i2 = (int) finderPattern.b;
        int i3 = (int) finderPattern2.f16132a;
        int i4 = (int) finderPattern2.b;
        float fD = d(i, i2, i3, i4);
        float fD2 = d((int) finderPattern2.f16132a, i4, (int) finderPattern.f16132a, i2);
        return Float.isNaN(fD) ? fD2 / 7.0f : Float.isNaN(fD2) ? fD / 7.0f : (fD + fD2) / 14.0f;
    }

    public final AlignmentPattern b(int i, float f, float f2, int i2) throws NotFoundException {
        AlignmentPattern alignmentPatternB;
        AlignmentPattern alignmentPatternB2;
        int i3 = (int) (f2 * f);
        int iMax = Math.max(0, i - i3);
        BitMatrix bitMatrix = this.f16231a;
        int iMin = Math.min(bitMatrix.d - 1, i + i3) - iMax;
        float f3 = 3.0f * f;
        if (iMin < f3) {
            throw NotFoundException.f;
        }
        int iMax2 = Math.max(0, i2 - i3);
        int iMin2 = Math.min(bitMatrix.e - 1, i2 + i3) - iMax2;
        if (iMin2 < f3) {
            throw NotFoundException.f;
        }
        ResultPointCallback resultPointCallback = this.b;
        BitMatrix bitMatrix2 = this.f16231a;
        AlignmentPatternFinder alignmentPatternFinder = new AlignmentPatternFinder(bitMatrix2, iMax, iMax2, iMin, iMin2, f, resultPointCallback);
        int i4 = alignmentPatternFinder.e;
        int i5 = alignmentPatternFinder.c;
        int i6 = i4 + i5;
        int i7 = alignmentPatternFinder.f;
        int i8 = (i7 / 2) + alignmentPatternFinder.d;
        int[] iArr = new int[3];
        for (int i9 = 0; i9 < i7; i9++) {
            int i10 = ((i9 & 1) == 0 ? (i9 + 1) / 2 : -((i9 + 1) / 2)) + i8;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i11 = i5;
            while (i11 < i6 && !bitMatrix2.b(i11, i10)) {
                i11++;
            }
            int i12 = 0;
            while (i11 < i6) {
                if (!bitMatrix2.b(i11, i10)) {
                    if (i12 == 1) {
                        i12++;
                    }
                    iArr[i12] = iArr[i12] + 1;
                } else if (i12 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i12 != 2) {
                    i12++;
                    iArr[i12] = iArr[i12] + 1;
                } else {
                    if (alignmentPatternFinder.a(iArr) && (alignmentPatternB2 = alignmentPatternFinder.b(i10, i11, iArr)) != null) {
                        return alignmentPatternB2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i12 = 1;
                }
                i11++;
            }
            if (alignmentPatternFinder.a(iArr) && (alignmentPatternB = alignmentPatternFinder.b(i10, i6, iArr)) != null) {
                return alignmentPatternB;
            }
        }
        ArrayList arrayList = alignmentPatternFinder.b;
        if (arrayList.isEmpty()) {
            throw NotFoundException.f;
        }
        return (AlignmentPattern) arrayList.get(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0084, code lost:
    
        if (r15 != r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008a, code lost:
    
        return com.google.zxing.common.detector.MathUtils.b(r5, r6, r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
    
        return Float.NaN;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float c(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            int r0 = r21 - r19
            int r0 = java.lang.Math.abs(r0)
            int r1 = r20 - r18
            int r1 = java.lang.Math.abs(r1)
            r3 = 1
            if (r0 <= r1) goto L11
            r0 = r3
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L1d
            r4 = r18
            r1 = r19
            r6 = r20
            r5 = r21
            goto L25
        L1d:
            r1 = r18
            r4 = r19
            r5 = r20
            r6 = r21
        L25:
            int r7 = r5 - r1
            int r7 = java.lang.Math.abs(r7)
            int r8 = r6 - r4
            int r8 = java.lang.Math.abs(r8)
            int r9 = -r7
            r10 = 2
            int r9 = r9 / r10
            r11 = -1
            if (r1 >= r5) goto L39
            r12 = r3
            goto L3a
        L39:
            r12 = r11
        L3a:
            if (r4 >= r6) goto L3d
            r11 = r3
        L3d:
            int r5 = r5 + r12
            r13 = r1
            r14 = r4
            r15 = 0
        L41:
            if (r13 == r5) goto L81
            if (r0 == 0) goto L47
            r2 = r14
            goto L48
        L47:
            r2 = r13
        L48:
            if (r0 == 0) goto L4c
            r10 = r13
            goto L4d
        L4c:
            r10 = r14
        L4d:
            r16 = r0
            if (r15 != r3) goto L57
            r0 = r3
            r19 = r7
            r3 = r17
            goto L5c
        L57:
            r0 = 0
            r3 = r17
            r19 = r7
        L5c:
            com.google.zxing.common.BitMatrix r7 = r3.f16231a
            boolean r2 = r7.b(r2, r10)
            if (r0 != r2) goto L6e
            r0 = 2
            if (r15 != r0) goto L6c
            float r0 = com.google.zxing.common.detector.MathUtils.b(r13, r14, r1, r4)
            return r0
        L6c:
            int r15 = r15 + 1
        L6e:
            int r9 = r9 + r8
            if (r9 <= 0) goto L79
            if (r14 == r6) goto L77
            int r14 = r14 + r11
            int r9 = r9 - r19
            goto L79
        L77:
            r0 = 2
            goto L84
        L79:
            int r13 = r13 + r12
            r7 = r19
            r0 = r16
            r3 = 1
            r10 = 2
            goto L41
        L81:
            r3 = r17
            r0 = r10
        L84:
            if (r15 != r0) goto L8b
            float r0 = com.google.zxing.common.detector.MathUtils.b(r5, r6, r1, r4)
            return r0
        L8b:
            r0 = 2143289344(0x7fc00000, float:NaN)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.detector.Detector.c(int, int, int, int):float");
    }

    public final float d(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float fC = c(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        BitMatrix bitMatrix = this.f16231a;
        int i6 = 0;
        if (i5 < 0) {
            f = i / (i - i5);
            i5 = 0;
        } else {
            int i7 = bitMatrix.d;
            if (i5 >= i7) {
                float f3 = ((i7 - 1) - i) / (i5 - i);
                int i8 = i7 - 1;
                f = f3;
                i5 = i8;
            } else {
                f = 1.0f;
            }
        }
        float f4 = i2;
        int i9 = (int) (f4 - ((i4 - i2) * f));
        if (i9 < 0) {
            f2 = f4 / (i2 - i9);
        } else {
            int i10 = bitMatrix.e;
            if (i9 >= i10) {
                f2 = ((i10 - 1) - i2) / (i9 - i2);
                i6 = i10 - 1;
            } else {
                i6 = i9;
                f2 = 1.0f;
            }
        }
        return (c(i, i2, (int) (((i5 - i) * f2) + i), i6) + fC) - 1.0f;
    }
}
