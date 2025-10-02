package com.google.zxing.common;

import com.google.zxing.Binarizer;
import com.google.zxing.LuminanceSource;
import java.lang.reflect.Array;

/* loaded from: classes6.dex */
public final class HybridBinarizer extends GlobalHistogramBinarizer {
    public BitMatrix e;

    @Override // com.google.zxing.common.GlobalHistogramBinarizer, com.google.zxing.Binarizer
    public final Binarizer a(LuminanceSource luminanceSource) {
        return new HybridBinarizer(luminanceSource);
    }

    @Override // com.google.zxing.common.GlobalHistogramBinarizer, com.google.zxing.Binarizer
    public final BitMatrix b() {
        BitMatrix bitMatrix = this.e;
        if (bitMatrix != null) {
            return bitMatrix;
        }
        LuminanceSource luminanceSource = this.f16126a;
        int i = luminanceSource.f16128a;
        int i2 = luminanceSource.b;
        if (i < 40 || i2 < 40) {
            this.e = super.b();
        } else {
            byte[] bArrB = luminanceSource.b();
            int i3 = i >> 3;
            if ((i & 7) != 0) {
                i3++;
            }
            int i4 = i2 >> 3;
            if ((i2 & 7) != 0) {
                i4++;
            }
            int i5 = i2 - 8;
            int i6 = i - 8;
            int i7 = 2;
            boolean z = true;
            int i8 = 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i4, i3);
            int i9 = 0;
            while (true) {
                int i10 = 8;
                if (i9 >= i4) {
                    break;
                }
                int i11 = i9 << 3;
                if (i11 > i5) {
                    i11 = i5;
                }
                boolean z2 = z;
                int i12 = i8;
                while (i12 < i3) {
                    int i13 = i12 << 3;
                    if (i13 > i6) {
                        i13 = i6;
                    }
                    int i14 = (i11 * i) + i13;
                    int i15 = i7;
                    int i16 = 255;
                    int i17 = 0;
                    int i18 = 0;
                    int i19 = 0;
                    while (i17 < i10) {
                        byte[] bArr = bArrB;
                        int i20 = i19;
                        int i21 = 0;
                        while (i21 < i10) {
                            int i22 = i21;
                            int i23 = bArr[i14 + i21] & 255;
                            i18 += i23;
                            if (i23 < i16) {
                                i16 = i23;
                            }
                            if (i23 > i20) {
                                i20 = i23;
                            }
                            i21 = i22 + 1;
                            i10 = 8;
                        }
                        if (i20 - i16 > 24) {
                            while (true) {
                                i17++;
                                i14 += i;
                                if (i17 < 8) {
                                    int i24 = 0;
                                    for (int i25 = 8; i24 < i25; i25 = 8) {
                                        i18 += bArr[i14 + i24] & 255;
                                        i24++;
                                        i16 = i16;
                                    }
                                }
                            }
                        }
                        i17++;
                        i14 += i;
                        i16 = i16;
                        bArrB = bArr;
                        i10 = 8;
                        i19 = i20;
                    }
                    byte[] bArr2 = bArrB;
                    int i26 = i18 >> 6;
                    if (i19 - i16 <= 24) {
                        i26 = i16 / 2;
                        if (i9 > 0 && i12 > 0) {
                            int[] iArr2 = iArr[i9 - 1];
                            int i27 = i12 - 1;
                            int i28 = (((iArr[i9][i27] * 2) + iArr2[i12]) + iArr2[i27]) / 4;
                            if (i16 < i28) {
                                i26 = i28;
                            }
                        }
                    }
                    iArr[i9][i12] = i26;
                    i12++;
                    i7 = i15;
                    bArrB = bArr2;
                    i10 = 8;
                }
                i9++;
                z = z2;
                i8 = 0;
            }
            byte[] bArr3 = bArrB;
            int i29 = i7;
            BitMatrix bitMatrix2 = new BitMatrix(i, i2);
            int i30 = 0;
            while (i30 < i4) {
                int i31 = i30 << 3;
                if (i31 > i5) {
                    i31 = i5;
                }
                int i32 = i4 - 3;
                if (i30 < i29) {
                    i32 = 2;
                } else if (i30 <= i32) {
                    i32 = i30;
                }
                int i33 = 0;
                while (i33 < i3) {
                    int i34 = i33 << 3;
                    if (i34 > i6) {
                        i34 = i6;
                    }
                    int i35 = i3 - 3;
                    if (i33 < 2) {
                        i35 = 2;
                    } else if (i33 <= i35) {
                        i35 = i33;
                    }
                    int i36 = -2;
                    int i37 = 0;
                    for (int i38 = 2; i36 <= i38; i38 = 2) {
                        int[] iArr3 = iArr[i32 + i36];
                        i37 = iArr3[i35 - 2] + iArr3[i35 - 1] + iArr3[i35] + iArr3[i35 + 1] + iArr3[i35 + 2] + i37;
                        i36++;
                    }
                    int i39 = i37 / 25;
                    int i40 = (i31 * i) + i34;
                    int i41 = i;
                    int i42 = 0;
                    while (true) {
                        if (i42 < 8) {
                            int i43 = i30;
                            int i44 = 0;
                            for (int i45 = 8; i44 < i45; i45 = 8) {
                                int i46 = i44;
                                if ((bArr3[i40 + i44] & 255) <= i39) {
                                    bitMatrix2.f(i34 + i46, i31 + i42);
                                }
                                i44 = i46 + 1;
                            }
                            i42++;
                            i40 += i41;
                            i30 = i43;
                        }
                    }
                    i33++;
                    i = i41;
                }
                i29 = 2;
                i30++;
            }
            this.e = bitMatrix2;
        }
        return this.e;
    }
}
