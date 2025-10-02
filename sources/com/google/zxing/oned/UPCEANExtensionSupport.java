package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.EnumMap;

/* loaded from: classes6.dex */
final class UPCEANExtensionSupport {
    public static final int[] c = {1, 1, 2};

    /* renamed from: a, reason: collision with root package name */
    public final UPCEANExtension2Support f16183a = new UPCEANExtension2Support();
    public final UPCEANExtension5Support b = new UPCEANExtension5Support();

    public final Result a(int i, int i2, BitArray bitArray) {
        EnumMap enumMap;
        int[] iArrM = UPCEANReader.m(bitArray, i2, false, c, new int[3]);
        try {
            return this.b.a(i, bitArray, iArrM);
        } catch (ReaderException unused) {
            UPCEANExtension2Support uPCEANExtension2Support = this.f16183a;
            StringBuilder sb = uPCEANExtension2Support.b;
            sb.setLength(0);
            int[] iArr = uPCEANExtension2Support.f16181a;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            int i3 = bitArray.e;
            int iF = iArrM[1];
            int i4 = 0;
            for (int i5 = 0; i5 < 2 && iF < i3; i5++) {
                int i6 = UPCEANReader.i(bitArray, iArr, iF, UPCEANReader.h);
                sb.append((char) ((i6 % 10) + 48));
                for (int i7 : iArr) {
                    iF += i7;
                }
                if (i6 >= 10) {
                    i4 |= 1 << (1 - i5);
                }
                if (i5 != 1) {
                    iF = bitArray.f(bitArray.e(iF));
                }
            }
            if (sb.length() != 2) {
                throw NotFoundException.f;
            }
            if (Integer.parseInt(sb.toString()) % 4 != i4) {
                throw NotFoundException.f;
            }
            String string = sb.toString();
            if (string.length() != 2) {
                enumMap = null;
            } else {
                enumMap = new EnumMap(ResultMetadataType.class);
                enumMap.put((EnumMap) ResultMetadataType.g, (ResultMetadataType) Integer.valueOf(string));
            }
            float f = i;
            Result result = new Result(string, null, new ResultPoint[]{new ResultPoint((iArrM[0] + iArrM[1]) / 2.0f, f), new ResultPoint(iF, f)}, BarcodeFormat.t);
            if (enumMap != null) {
                result.a(enumMap);
            }
            return result;
        }
    }
}
