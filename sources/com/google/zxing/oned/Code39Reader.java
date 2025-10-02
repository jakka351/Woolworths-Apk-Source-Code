package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes6.dex */
public final class Code39Reader extends OneDReader {
    public static final int[] d = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16173a;
    public final StringBuilder b = new StringBuilder(20);
    public final int[] c = new int[9];

    public Code39Reader(boolean z) {
        this.f16173a = z;
    }

    public static int g(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if ((i10 << 1) >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            }
            if (i4 <= 3) {
                return -1;
            }
            i = i2;
        }
    }

    @Override // com.google.zxing.oned.OneDReader
    public final Result b(int i, BitArray bitArray, Map map) throws NotFoundException, ChecksumException {
        int i2;
        char cCharAt;
        int[] iArr = this.c;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.b;
        sb.setLength(0);
        int i3 = bitArray.e;
        int iE = bitArray.e(0);
        int length = iArr.length;
        boolean z = false;
        int i4 = 0;
        int i5 = iE;
        while (iE < i3) {
            boolean z2 = true;
            if (bitArray.d(iE) != z) {
                iArr[i4] = iArr[i4] + 1;
            } else {
                if (i4 != length - 1) {
                    i2 = 1;
                    i4++;
                } else if (g(iArr) == 148 && bitArray.h(Math.max(0, i5 - ((iE - i5) / 2)), i5)) {
                    int iE2 = bitArray.e(new int[]{i5, iE}[1]);
                    int i6 = bitArray.e;
                    while (true) {
                        OneDReader.e(iE2, bitArray, iArr);
                        int iG = g(iArr);
                        if (iG < 0) {
                            throw NotFoundException.f;
                        }
                        int i7 = 0;
                        while (true) {
                            if (i7 < 43) {
                                if (d[i7] == iG) {
                                    cCharAt = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i7);
                                    break;
                                }
                                i7++;
                            } else {
                                if (iG != 148) {
                                    throw NotFoundException.f;
                                }
                                cCharAt = '*';
                            }
                        }
                        sb.append(cCharAt);
                        boolean z3 = z2;
                        int i8 = iE2;
                        for (int i9 : iArr) {
                            i8 += i9;
                        }
                        int iE3 = bitArray.e(i8);
                        if (cCharAt == '*') {
                            sb.setLength(sb.length() - 1);
                            int i10 = 0;
                            for (int i11 : iArr) {
                                i10 += i11;
                            }
                            int i12 = (iE3 - iE2) - i10;
                            if (iE3 != i6 && (i12 << 1) < i10) {
                                throw NotFoundException.f;
                            }
                            if (this.f16173a) {
                                int length2 = sb.length() - 1;
                                int iIndexOf = 0;
                                for (int i13 = 0; i13 < length2; i13++) {
                                    iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(sb.charAt(i13));
                                }
                                if (sb.charAt(length2) != "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(iIndexOf % 43)) {
                                    throw ChecksumException.a();
                                }
                                sb.setLength(length2);
                            }
                            if (sb.length() == 0) {
                                throw NotFoundException.f;
                            }
                            float f = (r5[z3 ? 1 : 0] + r5[0]) / 2.0f;
                            float f2 = (i10 / 2.0f) + iE2;
                            float f3 = i;
                            return new Result(sb.toString(), null, new ResultPoint[]{new ResultPoint(f, f3), new ResultPoint(f2, f3)}, BarcodeFormat.f);
                        }
                        z2 = z3 ? 1 : 0;
                        iE2 = iE3;
                    }
                } else {
                    i2 = 1;
                    i5 += iArr[0] + iArr[1];
                    int i14 = i4 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i14);
                    iArr[i14] = 0;
                    iArr[i4] = 0;
                    i4--;
                }
                iArr[i4] = i2;
                z = !z;
            }
            iE++;
        }
        throw NotFoundException.f;
    }
}
