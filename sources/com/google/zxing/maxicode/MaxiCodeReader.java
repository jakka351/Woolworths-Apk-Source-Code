package com.google.zxing.maxicode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.maxicode.decoder.Decoder;
import java.util.Map;

/* loaded from: classes6.dex */
public final class MaxiCodeReader implements Reader {
    public static final ResultPoint[] b = new ResultPoint[0];

    /* renamed from: a, reason: collision with root package name */
    public final Decoder f16167a = new Decoder();

    @Override // com.google.zxing.Reader
    public final Result a(BinaryBitmap binaryBitmap, Map map) throws NotFoundException, ChecksumException, FormatException {
        BitMatrix bitMatrixB = binaryBitmap.b();
        int i = bitMatrixB.d;
        int i2 = bitMatrixB.e;
        int i3 = -1;
        int i4 = i2;
        int i5 = -1;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = 0;
            while (true) {
                int i8 = bitMatrixB.f;
                if (i7 < i8) {
                    int i9 = bitMatrixB.g[(i8 * i6) + i7];
                    if (i9 != 0) {
                        if (i6 < i4) {
                            i4 = i6;
                        }
                        if (i6 > i5) {
                            i5 = i6;
                        }
                        int i10 = i7 << 5;
                        if (i10 < i) {
                            int i11 = 0;
                            while ((i9 << (31 - i11)) == 0) {
                                i11++;
                            }
                            int i12 = i11 + i10;
                            if (i12 < i) {
                                i = i12;
                            }
                        }
                        if (i10 + 31 > i3) {
                            int i13 = 31;
                            while ((i9 >>> i13) == 0) {
                                i13--;
                            }
                            int i14 = i10 + i13;
                            if (i14 > i3) {
                                i3 = i14;
                            }
                        }
                    }
                    i7++;
                }
            }
        }
        int[] iArr = (i3 < i || i5 < i4) ? null : new int[]{i, i4, (i3 - i) + 1, (i5 - i4) + 1};
        if (iArr == null) {
            throw NotFoundException.f;
        }
        int i15 = iArr[0];
        int i16 = iArr[1];
        int i17 = iArr[2];
        int i18 = iArr[3];
        BitMatrix bitMatrix = new BitMatrix(30, 33);
        for (int i19 = 0; i19 < 33; i19++) {
            int i20 = (((i18 / 2) + (i19 * i18)) / 33) + i16;
            for (int i21 = 0; i21 < 30; i21++) {
                if (bitMatrixB.b((((((i19 & 1) * i17) / 2) + ((i17 / 2) + (i21 * i17))) / 30) + i15, i20)) {
                    bitMatrix.f(i21, i19);
                }
            }
        }
        DecoderResult decoderResultB = this.f16167a.b(bitMatrix);
        Result result = new Result(decoderResultB.b, decoderResultB.f16143a, b, BarcodeFormat.m);
        String str = decoderResultB.d;
        if (str != null) {
            result.b(ResultMetadataType.f, str);
        }
        return result;
    }

    @Override // com.google.zxing.Reader
    public final void reset() {
    }
}
