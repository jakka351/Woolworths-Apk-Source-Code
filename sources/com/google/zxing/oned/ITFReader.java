package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Map;

/* loaded from: classes6.dex */
public final class ITFReader extends OneDReader {
    public static final int[] b = {6, 8, 10, 12, 14};
    public static final int[] c = {1, 1, 1, 1};
    public static final int[][] d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};
    public static final int[][] e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a, reason: collision with root package name */
    public int f16176a = -1;

    public static int g(int[] iArr) throws NotFoundException {
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < 20; i2++) {
            float fD = OneDReader.d(iArr, e[i2], 0.5f);
            if (fD < f) {
                i = i2;
                f = fD;
            } else if (fD == f) {
                i = -1;
            }
        }
        if (i >= 0) {
            return i % 10;
        }
        throw NotFoundException.f;
    }

    public static int[] h(int i, BitArray bitArray, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i2 = bitArray.e;
        int i3 = i;
        boolean z = false;
        int i4 = 0;
        while (i < i2) {
            if (bitArray.d(i) != z) {
                iArr2[i4] = iArr2[i4] + 1;
            } else {
                if (i4 != length - 1) {
                    i4++;
                } else {
                    if (OneDReader.d(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i3, i};
                    }
                    i3 += iArr2[0] + iArr2[1];
                    int i5 = i4 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i4] = 0;
                    i4--;
                }
                iArr2[i4] = 1;
                z = !z;
            }
            i++;
        }
        throw NotFoundException.f;
    }

    @Override // com.google.zxing.oned.OneDReader
    public final Result b(int i, BitArray bitArray, Map map) throws NotFoundException, FormatException {
        int[] iArrH;
        boolean z;
        int i2 = bitArray.e;
        int iE = bitArray.e(0);
        if (iE == i2) {
            throw NotFoundException.f;
        }
        int[] iArrH2 = h(iE, bitArray, c);
        int i3 = iArrH2[1];
        int i4 = iArrH2[0];
        this.f16176a = (i3 - i4) / 4;
        i(i4, bitArray);
        int[][] iArr = d;
        bitArray.i();
        try {
            int i5 = bitArray.e;
            int iE2 = bitArray.e(0);
            if (iE2 == i5) {
                throw NotFoundException.f;
            }
            try {
                iArrH = h(iE2, bitArray, iArr[0]);
            } catch (NotFoundException unused) {
                iArrH = h(iE2, bitArray, iArr[1]);
            }
            i(iArrH[0], bitArray);
            int i6 = iArrH[0];
            int i7 = bitArray.e;
            iArrH[0] = i7 - iArrH[1];
            iArrH[1] = i7 - i6;
            bitArray.i();
            StringBuilder sb = new StringBuilder(20);
            int i8 = iArrH2[1];
            int i9 = iArrH[0];
            int[] iArr2 = new int[10];
            int[] iArr3 = new int[5];
            int[] iArr4 = new int[5];
            while (i8 < i9) {
                OneDReader.e(i8, bitArray, iArr2);
                for (int i10 = 0; i10 < 5; i10++) {
                    int i11 = i10 * 2;
                    iArr3[i10] = iArr2[i11];
                    iArr4[i10] = iArr2[i11 + 1];
                }
                sb.append((char) (g(iArr3) + 48));
                sb.append((char) (g(iArr4) + 48));
                for (int i12 = 0; i12 < 10; i12++) {
                    i8 += iArr2[i12];
                }
            }
            String string = sb.toString();
            int[] iArr5 = map != null ? (int[]) map.get(DecodeHintType.h) : null;
            if (iArr5 == null) {
                iArr5 = b;
            }
            int length = string.length();
            int length2 = iArr5.length;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (i13 >= length2) {
                    z = false;
                    break;
                }
                int i15 = iArr5[i13];
                if (length == i15) {
                    z = true;
                    break;
                }
                if (i15 > i14) {
                    i14 = i15;
                }
                i13++;
            }
            if (!z && length > i14) {
                z = true;
            }
            if (!z) {
                throw FormatException.a();
            }
            float f = i;
            return new Result(string, null, new ResultPoint[]{new ResultPoint(iArrH2[1], f), new ResultPoint(iArrH[0], f)}, BarcodeFormat.l);
        } catch (Throwable th) {
            bitArray.i();
            throw th;
        }
    }

    public final void i(int i, BitArray bitArray) throws NotFoundException {
        int i2 = this.f16176a * 10;
        if (i2 >= i) {
            i2 = i;
        }
        for (int i3 = i - 1; i2 > 0 && i3 >= 0 && !bitArray.d(i3); i3--) {
            i2--;
        }
        if (i2 != 0) {
            throw NotFoundException.f;
        }
    }
}
