package com.google.zxing.pdf417.decoder;

import com.google.zxing.ResultPoint;
import java.util.Formatter;

/* loaded from: classes6.dex */
final class DetectionResult {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeMetadata f16205a;
    public final DetectionResultColumn[] b;
    public BoundingBox c;
    public final int d;

    public DetectionResult(BarcodeMetadata barcodeMetadata, BoundingBox boundingBox) {
        this.f16205a = barcodeMetadata;
        int i = barcodeMetadata.f16199a;
        this.d = i;
        this.c = boundingBox;
        this.b = new DetectionResultColumn[i + 2];
    }

    public final void a(DetectionResultColumn detectionResultColumn) {
        if (detectionResultColumn != null) {
            DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn = (DetectionResultRowIndicatorColumn) detectionResultColumn;
            Codeword[] codewordArr = detectionResultRowIndicatorColumn.b;
            for (Codeword codeword : codewordArr) {
                if (codeword != null) {
                    codeword.b();
                }
            }
            BarcodeMetadata barcodeMetadata = this.f16205a;
            detectionResultRowIndicatorColumn.d(codewordArr, barcodeMetadata);
            BoundingBox boundingBox = detectionResultRowIndicatorColumn.f16206a;
            boolean z = detectionResultRowIndicatorColumn.c;
            ResultPoint resultPoint = z ? boundingBox.b : boundingBox.d;
            ResultPoint resultPoint2 = z ? boundingBox.c : boundingBox.e;
            int iB = detectionResultRowIndicatorColumn.b((int) resultPoint.b);
            int iB2 = detectionResultRowIndicatorColumn.b((int) resultPoint2.b);
            int i = -1;
            int i2 = 0;
            int iMax = 1;
            while (iB < iB2) {
                Codeword codeword2 = codewordArr[iB];
                if (codeword2 != null) {
                    int i3 = codeword2.e;
                    int i4 = i3 - i;
                    if (i4 == 0) {
                        i2++;
                    } else {
                        if (i4 == 1) {
                            iMax = Math.max(iMax, i2);
                            i = codeword2.e;
                        } else if (i4 < 0 || i3 >= barcodeMetadata.e || i4 > iB) {
                            codewordArr[iB] = null;
                        } else {
                            if (iMax > 2) {
                                i4 *= iMax - 2;
                            }
                            boolean z2 = i4 >= iB;
                            for (int i5 = 1; i5 <= i4 && !z2; i5++) {
                                z2 = codewordArr[iB - i5] != null;
                            }
                            if (z2) {
                                codewordArr[iB] = null;
                            } else {
                                i = codeword2.e;
                            }
                        }
                        i2 = 1;
                    }
                }
                iB++;
            }
        }
    }

    public final String toString() {
        DetectionResultColumn[] detectionResultColumnArr = this.b;
        DetectionResultColumn detectionResultColumn = detectionResultColumnArr[0];
        int i = this.d;
        if (detectionResultColumn == null) {
            detectionResultColumn = detectionResultColumnArr[i + 1];
        }
        Formatter formatter = new Formatter();
        for (int i2 = 0; i2 < detectionResultColumn.b.length; i2++) {
            try {
                formatter.format("CW %3d:", Integer.valueOf(i2));
                for (int i3 = 0; i3 < i + 2; i3++) {
                    DetectionResultColumn detectionResultColumn2 = detectionResultColumnArr[i3];
                    if (detectionResultColumn2 == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        Codeword codeword = detectionResultColumn2.b[i2];
                        if (codeword == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", Integer.valueOf(codeword.e), Integer.valueOf(codeword.d));
                        }
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        formatter.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        String string = formatter.toString();
        formatter.close();
        return string;
    }
}
