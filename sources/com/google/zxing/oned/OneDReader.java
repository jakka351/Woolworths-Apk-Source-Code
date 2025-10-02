package com.google.zxing.oned;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.zxing.Binarizer;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.LuminanceSource;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class OneDReader implements Reader {
    public static float d(int[] iArr, int[] iArr2, float f) {
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
        float f2 = i;
        float f3 = f2 / i2;
        float f4 = f * f3;
        float f5 = BitmapDescriptorFactory.HUE_RED;
        for (int i4 = 0; i4 < length; i4++) {
            float f6 = iArr2[i4] * f3;
            float f7 = iArr[i4];
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    public static void e(int i, BitArray bitArray, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int i3 = bitArray.e;
        if (i >= i3) {
            throw NotFoundException.f;
        }
        boolean z = !bitArray.d(i);
        while (i < i3) {
            if (bitArray.d(i) == z) {
                i2++;
                if (i2 == length) {
                    break;
                }
                iArr[i2] = 1;
                z = !z;
            } else {
                iArr[i2] = iArr[i2] + 1;
            }
            i++;
        }
        if (i2 != length) {
            if (i2 != length - 1 || i != i3) {
                throw NotFoundException.f;
            }
        }
    }

    public static void f(int i, BitArray bitArray, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        boolean zD = bitArray.d(i);
        while (i > 0 && length >= 0) {
            i--;
            if (bitArray.d(i) != zD) {
                length--;
                zD = !zD;
            }
        }
        if (length >= 0) {
            throw NotFoundException.f;
        }
        e(i + 1, bitArray, iArr);
    }

    @Override // com.google.zxing.Reader
    public Result a(BinaryBitmap binaryBitmap, Map map) throws NotFoundException {
        Binarizer binarizer = binaryBitmap.f16127a;
        try {
            return c(binaryBitmap, map);
        } catch (NotFoundException e) {
            if (map == null || !map.containsKey(DecodeHintType.f) || !binarizer.f16126a.d()) {
                throw e;
            }
            Binarizer binarizerA = binarizer.a(binarizer.f16126a.e());
            Result resultC = c(new BinaryBitmap(binarizerA), map);
            Map map2 = resultC.e;
            ResultMetadataType resultMetadataType = ResultMetadataType.d;
            int iIntValue = SubsamplingScaleImageView.ORIENTATION_270;
            if (map2 != null && map2.containsKey(resultMetadataType)) {
                iIntValue = (((Integer) map2.get(resultMetadataType)).intValue() + SubsamplingScaleImageView.ORIENTATION_270) % 360;
            }
            resultC.b(resultMetadataType, Integer.valueOf(iIntValue));
            ResultPoint[] resultPointArr = resultC.c;
            if (resultPointArr != null) {
                int i = binarizerA.f16126a.b;
                for (int i2 = 0; i2 < resultPointArr.length; i2++) {
                    ResultPoint resultPoint = resultPointArr[i2];
                    resultPointArr[i2] = new ResultPoint((i - resultPoint.b) - 1.0f, resultPoint.f16132a);
                }
            }
            return resultC;
        }
    }

    public abstract Result b(int i, BitArray bitArray, Map map);

    public final Result c(BinaryBitmap binaryBitmap, Map map) throws NotFoundException {
        Binarizer binarizer;
        Map map2;
        int i;
        ResultPoint resultPoint;
        Map map3 = map;
        Binarizer binarizer2 = binaryBitmap.f16127a;
        LuminanceSource luminanceSource = binarizer2.f16126a;
        int i2 = luminanceSource.f16128a;
        int i3 = luminanceSource.b;
        BitArray bitArray = new BitArray(i2);
        int i4 = 1;
        boolean z = map3 != null && map3.containsKey(DecodeHintType.f);
        int iMax = Math.max(1, i3 >> (z ? 8 : 5));
        int i5 = z ? i3 : 15;
        int i6 = i3 / 2;
        int i7 = 0;
        while (i7 < i5) {
            int i8 = i7 + 1;
            int i9 = i8 / 2;
            if ((i7 & 1) != 0) {
                i9 = -i9;
            }
            int i10 = (i9 * iMax) + i6;
            if (i10 < 0 || i10 >= i3) {
                break;
            }
            try {
                bitArray = binarizer2.c(i10, bitArray);
                int i11 = 0;
                while (i11 < 2) {
                    if (i11 == i4) {
                        bitArray.i();
                        if (map3 != null) {
                            DecodeHintType decodeHintType = DecodeHintType.l;
                            if (map3.containsKey(decodeHintType)) {
                                EnumMap enumMap = new EnumMap(DecodeHintType.class);
                                enumMap.putAll(map3);
                                enumMap.remove(decodeHintType);
                                map3 = enumMap;
                            }
                        }
                    }
                    try {
                        Result resultB = b(i10, bitArray, map3);
                        if (i11 == i4) {
                            try {
                                resultB.b(ResultMetadataType.d, Integer.valueOf(SubsamplingScaleImageView.ORIENTATION_180));
                                ResultPoint[] resultPointArr = resultB.c;
                                if (resultPointArr != null) {
                                    i = i4;
                                    float f = i2;
                                    binarizer = binarizer2;
                                    try {
                                        resultPoint = resultPointArr[0];
                                        map2 = map3;
                                    } catch (ReaderException unused) {
                                        map2 = map3;
                                    }
                                    try {
                                        resultPointArr[0] = new ResultPoint((f - resultPoint.f16132a) - 1.0f, resultPoint.b);
                                        ResultPoint resultPoint2 = resultPointArr[i];
                                        resultPointArr[i] = new ResultPoint((f - resultPoint2.f16132a) - 1.0f, resultPoint2.b);
                                    } catch (ReaderException unused2) {
                                        continue;
                                        i11++;
                                        map3 = map2;
                                        i4 = i;
                                        binarizer2 = binarizer;
                                    }
                                }
                            } catch (ReaderException unused3) {
                                binarizer = binarizer2;
                                map2 = map3;
                                i = i4;
                            }
                        }
                        return resultB;
                    } catch (ReaderException unused4) {
                        binarizer = binarizer2;
                        map2 = map3;
                        i = i4;
                    }
                }
            } catch (NotFoundException unused5) {
            }
            i7 = i8;
            i4 = i4;
            binarizer2 = binarizer2;
        }
        throw NotFoundException.f;
    }

    @Override // com.google.zxing.Reader
    public void reset() {
    }
}
