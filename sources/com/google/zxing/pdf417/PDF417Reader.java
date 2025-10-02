package com.google.zxing.pdf417;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.multi.MultipleBarcodeReader;
import com.google.zxing.pdf417.decoder.PDF417ScanningDecoder;
import com.google.zxing.pdf417.detector.Detector;
import com.google.zxing.pdf417.detector.PDF417DetectorResult;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes6.dex */
public final class PDF417Reader implements Reader, MultipleBarcodeReader {

    /* renamed from: a, reason: collision with root package name */
    public static final Result[] f16197a = new Result[0];

    public static int b(ResultPoint resultPoint, ResultPoint resultPoint2) {
        if (resultPoint == null || resultPoint2 == null) {
            return 0;
        }
        return (int) Math.abs(resultPoint.f16132a - resultPoint2.f16132a);
    }

    public static int c(ResultPoint resultPoint, ResultPoint resultPoint2) {
        if (resultPoint == null || resultPoint2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(resultPoint.f16132a - resultPoint2.f16132a);
    }

    @Override // com.google.zxing.Reader
    public final Result a(BinaryBitmap binaryBitmap, Map map) throws NotFoundException {
        Result result;
        ArrayList arrayList = new ArrayList();
        BitMatrix bitMatrixB = binaryBitmap.b();
        ArrayList<ResultPoint[]> arrayListA = Detector.a(bitMatrixB);
        char c = 0;
        char c2 = 2;
        if (arrayListA.isEmpty()) {
            int i = bitMatrixB.d;
            int i2 = bitMatrixB.e;
            BitMatrix bitMatrix = new BitMatrix(i, i2, bitMatrixB.f, (int[]) bitMatrixB.g.clone());
            BitArray bitArray = new BitArray(i);
            BitArray bitArray2 = new BitArray(i);
            for (int i3 = 0; i3 < (i2 + 1) / 2; i3++) {
                bitArray = bitMatrix.d(i3, bitArray);
                int i4 = (i2 - 1) - i3;
                bitArray2 = bitMatrix.d(i4, bitArray2);
                bitArray.i();
                bitArray2.i();
                int[] iArr = bitArray2.d;
                int i5 = bitMatrix.f;
                int[] iArr2 = bitMatrix.g;
                System.arraycopy(iArr, 0, iArr2, i3 * i5, i5);
                System.arraycopy(bitArray.d, 0, iArr2, i4 * i5, i5);
            }
            arrayListA = Detector.a(bitMatrix);
            bitMatrixB = bitMatrix;
        }
        PDF417DetectorResult pDF417DetectorResult = new PDF417DetectorResult(bitMatrixB, arrayListA);
        for (ResultPoint[] resultPointArr : arrayListA) {
            ResultPoint resultPoint = resultPointArr[4];
            char c3 = c;
            char c4 = c2;
            DecoderResult decoderResultB = PDF417ScanningDecoder.b(pDF417DetectorResult.f16213a, resultPoint, resultPointArr[5], resultPointArr[6], resultPointArr[7], Math.min(Math.min(c(resultPointArr[c], resultPoint), (c(resultPointArr[6], resultPointArr[c2]) * 17) / 18), Math.min(c(resultPointArr[1], resultPointArr[5]), (c(resultPointArr[7], resultPointArr[3]) * 17) / 18)), Math.max(Math.max(b(resultPointArr[c3], resultPointArr[4]), (b(resultPointArr[6], resultPointArr[c4]) * 17) / 18), Math.max(b(resultPointArr[1], resultPointArr[5]), (b(resultPointArr[7], resultPointArr[3]) * 17) / 18)));
            Result result2 = new Result(decoderResultB.b, null, resultPointArr, BarcodeFormat.n);
            result2.b(ResultMetadataType.f, decoderResultB.d);
            PDF417ResultMetadata pDF417ResultMetadata = (PDF417ResultMetadata) decoderResultB.e;
            if (pDF417ResultMetadata != null) {
                result2.b(ResultMetadataType.k, pDF417ResultMetadata);
            }
            arrayList.add(result2);
            c = c3;
            c2 = c4;
        }
        char c5 = c;
        Result[] resultArr = (Result[]) arrayList.toArray(f16197a);
        if (resultArr.length == 0 || (result = resultArr[c5]) == null) {
            throw NotFoundException.f;
        }
        return result;
    }

    @Override // com.google.zxing.Reader
    public final void reset() {
    }
}
