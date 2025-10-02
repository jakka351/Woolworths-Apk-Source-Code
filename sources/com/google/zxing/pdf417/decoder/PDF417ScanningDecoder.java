package com.google.zxing.pdf417.decoder;

import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.pdf417.decoder.ec.ErrorCorrection;

/* loaded from: classes6.dex */
public final class PDF417ScanningDecoder {

    /* renamed from: a, reason: collision with root package name */
    public static final ErrorCorrection f16208a = new ErrorCorrection();

    public static BoundingBox a(DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn) {
        int[] iArr;
        int i;
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3;
        ResultPoint resultPoint4;
        if (detectionResultRowIndicatorColumn == null) {
            return null;
        }
        boolean z = detectionResultRowIndicatorColumn.c;
        BoundingBox boundingBox = detectionResultRowIndicatorColumn.f16206a;
        Codeword[] codewordArr = detectionResultRowIndicatorColumn.b;
        BarcodeMetadata barcodeMetadataC = detectionResultRowIndicatorColumn.c();
        int iMax = -1;
        if (barcodeMetadataC == null) {
            iArr = null;
        } else {
            int i2 = barcodeMetadataC.e;
            int iB = detectionResultRowIndicatorColumn.b((int) (z ? boundingBox.c : boundingBox.e).b);
            int i3 = -1;
            int iMax2 = 1;
            int i4 = 0;
            for (int iB2 = detectionResultRowIndicatorColumn.b((int) (z ? boundingBox.b : boundingBox.d).b); iB2 < iB; iB2++) {
                Codeword codeword = codewordArr[iB2];
                if (codeword != null) {
                    codeword.b();
                    int i5 = codeword.e;
                    int i6 = i5 - i3;
                    if (i6 == 0) {
                        i4++;
                    } else if (i6 == 1) {
                        iMax2 = Math.max(iMax2, i4);
                        i3 = codeword.e;
                        i4 = 1;
                    } else if (i5 >= i2) {
                        codewordArr[iB2] = null;
                    } else {
                        i4 = 1;
                        i3 = i5;
                    }
                }
            }
            iArr = new int[i2];
            for (Codeword codeword2 : codewordArr) {
                if (codeword2 != null && (i = codeword2.e) < i2) {
                    iArr[i] = iArr[i] + 1;
                }
            }
        }
        if (iArr == null) {
            return null;
        }
        for (int i7 : iArr) {
            iMax = Math.max(iMax, i7);
        }
        int i8 = 0;
        for (int i9 : iArr) {
            i8 += iMax - i9;
            if (i9 > 0) {
                break;
            }
        }
        for (int i10 = 0; i8 > 0 && codewordArr[i10] == null; i10++) {
            i8--;
        }
        int i11 = 0;
        for (int length = iArr.length - 1; length >= 0; length--) {
            int i12 = iArr[length];
            i11 += iMax - i12;
            if (i12 > 0) {
                break;
            }
        }
        for (int length2 = codewordArr.length - 1; i11 > 0 && codewordArr[length2] == null; length2--) {
            i11--;
        }
        ResultPoint resultPoint5 = boundingBox.b;
        ResultPoint resultPoint6 = boundingBox.c;
        ResultPoint resultPoint7 = boundingBox.d;
        ResultPoint resultPoint8 = boundingBox.e;
        if (i8 > 0) {
            ResultPoint resultPoint9 = z ? resultPoint5 : resultPoint7;
            ResultPoint resultPoint10 = new ResultPoint(resultPoint9.f16132a, ((int) resultPoint9.b) - i8 >= 0 ? r11 : 0);
            if (z) {
                resultPoint2 = resultPoint7;
                resultPoint = resultPoint10;
            } else {
                resultPoint = resultPoint5;
                resultPoint2 = resultPoint10;
            }
        } else {
            resultPoint = resultPoint5;
            resultPoint2 = resultPoint7;
        }
        if (i11 > 0) {
            ResultPoint resultPoint11 = z ? resultPoint6 : resultPoint8;
            int i13 = ((int) resultPoint11.b) + i11;
            int i14 = boundingBox.f16201a.e;
            if (i13 >= i14) {
                i13 = i14 - 1;
            }
            ResultPoint resultPoint12 = new ResultPoint(resultPoint11.f16132a, i13);
            if (!z) {
                resultPoint3 = resultPoint6;
                resultPoint4 = resultPoint12;
                return new BoundingBox(boundingBox.f16201a, resultPoint, resultPoint3, resultPoint2, resultPoint4);
            }
            resultPoint3 = resultPoint12;
        } else {
            resultPoint3 = resultPoint6;
        }
        resultPoint4 = resultPoint8;
        return new BoundingBox(boundingBox.f16201a, resultPoint, resultPoint3, resultPoint2, resultPoint4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0184, code lost:
    
        r19 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0186, code lost:
    
        if (r4 == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0188, code lost:
    
        r0 = r14.c.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x018d, code lost:
    
        r0 = r14.c.g;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.zxing.common.DecoderResult b(com.google.zxing.common.BitMatrix r21, com.google.zxing.ResultPoint r22, com.google.zxing.ResultPoint r23, com.google.zxing.ResultPoint r24, com.google.zxing.ResultPoint r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.PDF417ScanningDecoder.b(com.google.zxing.common.BitMatrix, com.google.zxing.ResultPoint, com.google.zxing.ResultPoint, com.google.zxing.ResultPoint, com.google.zxing.ResultPoint, int, int):com.google.zxing.common.DecoderResult");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0165, code lost:
    
        throw com.google.zxing.FormatException.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bb A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.zxing.common.DecoderResult c(int[] r23, int r24, int[] r25) throws com.google.zxing.ChecksumException, java.lang.NumberFormatException, com.google.zxing.FormatException {
        /*
            Method dump skipped, instructions count: 788
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.PDF417ScanningDecoder.c(int[], int, int[]):com.google.zxing.common.DecoderResult");
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0032, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0032, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0032, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.zxing.pdf417.decoder.Codeword d(com.google.zxing.common.BitMatrix r19, int r20, int r21, boolean r22, int r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.PDF417ScanningDecoder.d(com.google.zxing.common.BitMatrix, int, int, boolean, int, int, int, int):com.google.zxing.pdf417.decoder.Codeword");
    }

    public static DetectionResultRowIndicatorColumn e(BitMatrix bitMatrix, BoundingBox boundingBox, ResultPoint resultPoint, boolean z, int i, int i2) {
        boolean z2 = z;
        DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn = new DetectionResultRowIndicatorColumn(boundingBox, z);
        int i3 = 0;
        while (i3 < 2) {
            int i4 = i3 == 0 ? 1 : -1;
            int i5 = (int) resultPoint.f16132a;
            int i6 = (int) resultPoint.b;
            while (i6 <= boundingBox.i && i6 >= boundingBox.h) {
                Codeword codewordD = d(bitMatrix, 0, bitMatrix.d, z2, i5, i6, i, i2);
                if (codewordD != null) {
                    detectionResultRowIndicatorColumn.b[detectionResultRowIndicatorColumn.b(i6)] = codewordD;
                    i5 = z ? codewordD.f16202a : codewordD.b;
                }
                i6 += i4;
                z2 = z;
            }
            i3++;
            z2 = z;
        }
        return detectionResultRowIndicatorColumn;
    }
}
