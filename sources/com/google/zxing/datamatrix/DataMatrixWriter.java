package com.google.zxing.datamatrix;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Dimension;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.datamatrix.encoder.DefaultPlacement;
import com.google.zxing.datamatrix.encoder.ErrorCorrection;
import com.google.zxing.datamatrix.encoder.HighLevelEncoder;
import com.google.zxing.datamatrix.encoder.SymbolInfo;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import java.util.Map;

/* loaded from: classes6.dex */
public final class DataMatrixWriter implements Writer {
    @Override // com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        SymbolInfo symbolInfo;
        int i3;
        int i4;
        int i5;
        byte[] bArr;
        BitMatrix bitMatrix;
        int i6;
        int i7;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.i) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(barcodeFormat)));
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i + 'x' + i2);
        }
        SymbolShapeHint symbolShapeHint = (SymbolShapeHint) map.get(EncodeHintType.f);
        if (symbolShapeHint == null) {
            symbolShapeHint = SymbolShapeHint.d;
        }
        Dimension dimension = (Dimension) map.get(EncodeHintType.g);
        if (dimension == null) {
            dimension = null;
        }
        Dimension dimension2 = (Dimension) map.get(EncodeHintType.h);
        Dimension dimension3 = dimension2 != null ? dimension2 : null;
        String strA = HighLevelEncoder.a(str, symbolShapeHint, dimension, dimension3);
        SymbolInfo symbolInfoF = SymbolInfo.f(strA.length(), symbolShapeHint, dimension, dimension3);
        int i8 = symbolInfoF.d;
        int i9 = symbolInfoF.e;
        int[] iArr = ErrorCorrection.f16165a;
        int length = strA.length();
        int i10 = symbolInfoF.b;
        int i11 = symbolInfoF.c;
        if (length != i10) {
            throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        StringBuilder sb = new StringBuilder(i10 + i11);
        sb.append(strA);
        int iC = symbolInfoF.c();
        if (iC == 1) {
            sb.append(ErrorCorrection.a(i11, strA));
        } else {
            sb.setLength(sb.capacity());
            int[] iArr2 = new int[iC];
            int[] iArr3 = new int[iC];
            int i12 = 0;
            while (i12 < iC) {
                int i13 = i12 + 1;
                iArr2[i12] = symbolInfoF.a(i13);
                iArr3[i12] = symbolInfoF.h;
                i12 = i13;
            }
            for (int i14 = 0; i14 < iC; i14++) {
                StringBuilder sb2 = new StringBuilder(iArr2[i14]);
                for (int i15 = i14; i15 < i10; i15 += iC) {
                    sb2.append(strA.charAt(i15));
                }
                String strA2 = ErrorCorrection.a(iArr3[i14], sb2.toString());
                int i16 = i14;
                int i17 = 0;
                while (i16 < iArr3[i14] * iC) {
                    sb.setCharAt(i10 + i16, strA2.charAt(i17));
                    i16 += iC;
                    i17++;
                }
            }
        }
        String string = sb.toString();
        int iB = symbolInfoF.b() * i8;
        int iE = symbolInfoF.e() * i9;
        DefaultPlacement defaultPlacement = new DefaultPlacement(string, iB, iE);
        int i18 = 0;
        int i19 = 4;
        int i20 = 0;
        while (true) {
            if (i19 == iE && i20 == 0) {
                int i21 = iE - 1;
                defaultPlacement.a(i21, 0, i18, 1);
                defaultPlacement.a(i21, 1, i18, 2);
                defaultPlacement.a(i21, 2, i18, 3);
                defaultPlacement.a(0, iB - 2, i18, 4);
                int i22 = iB - 1;
                defaultPlacement.a(0, i22, i18, 5);
                defaultPlacement.a(1, i22, i18, 6);
                defaultPlacement.a(2, i22, i18, 7);
                defaultPlacement.a(3, i22, i18, 8);
                i18++;
            }
            int i23 = iE - 2;
            if (i19 == i23 && i20 == 0 && iB % 4 != 0) {
                symbolInfo = symbolInfoF;
                defaultPlacement.a(iE - 3, 0, i18, 1);
                defaultPlacement.a(i23, 0, i18, 2);
                defaultPlacement.a(iE - 1, 0, i18, 3);
                defaultPlacement.a(0, iB - 4, i18, 4);
                defaultPlacement.a(0, iB - 3, i18, 5);
                defaultPlacement.a(0, iB - 2, i18, 6);
                int i24 = iB - 1;
                defaultPlacement.a(0, i24, i18, 7);
                defaultPlacement.a(1, i24, i18, 8);
                i18++;
            } else {
                symbolInfo = symbolInfoF;
            }
            if (i19 == i23 && i20 == 0 && iB % 8 == 4) {
                defaultPlacement.a(iE - 3, 0, i18, 1);
                defaultPlacement.a(i23, 0, i18, 2);
                defaultPlacement.a(iE - 1, 0, i18, 3);
                defaultPlacement.a(0, iB - 2, i18, 4);
                int i25 = iB - 1;
                defaultPlacement.a(0, i25, i18, 5);
                defaultPlacement.a(1, i25, i18, 6);
                i3 = 2;
                defaultPlacement.a(2, i25, i18, 7);
                defaultPlacement.a(3, i25, i18, 8);
                i18++;
            } else {
                i3 = 2;
            }
            if (i19 == iE + 4 && i20 == i3 && iB % 8 == 0) {
                int i26 = iE - 1;
                defaultPlacement.a(i26, 0, i18, 1);
                int i27 = iB - 1;
                defaultPlacement.a(i26, i27, i18, i3);
                int i28 = iB - 3;
                defaultPlacement.a(0, i28, i18, 3);
                int i29 = iB - 2;
                i4 = i23;
                defaultPlacement.a(0, i29, i18, 4);
                defaultPlacement.a(0, i27, i18, 5);
                defaultPlacement.a(1, i28, i18, 6);
                defaultPlacement.a(1, i29, i18, 7);
                defaultPlacement.a(1, i27, i18, 8);
                i18++;
            } else {
                i4 = i23;
            }
            while (true) {
                i5 = defaultPlacement.c;
                bArr = defaultPlacement.d;
                if (i19 < iE && i20 >= 0 && bArr[(i19 * i5) + i20] < 0) {
                    defaultPlacement.b(i19, i20, i18);
                    i18++;
                }
                int i30 = i19 - 2;
                int i31 = i20 + 2;
                if (i30 < 0 || i31 >= iB) {
                    break;
                }
                i19 = i30;
                i20 = i31;
            }
            int i32 = i19 - 1;
            int i33 = i20 + 5;
            while (true) {
                if (i32 >= 0 && i33 < iB && bArr[(i32 * i5) + i33] < 0) {
                    defaultPlacement.b(i32, i33, i18);
                    i18++;
                }
                int i34 = i32 + 2;
                int i35 = i33 - 2;
                if (i34 >= iE || i35 < 0) {
                    break;
                }
                i32 = i34;
                i33 = i35;
            }
            i19 = i32 + 5;
            i20 = i33 - 1;
            if (i19 >= iE && i20 >= iB) {
                break;
            }
            symbolInfoF = symbolInfo;
        }
        int i36 = iB - 1;
        int i37 = iE - 1;
        if (bArr[(i37 * i5) + i36] < 0) {
            int i38 = (i37 * i5) + i36;
            byte b = (byte) 1;
            bArr[i38] = b;
            bArr[(i4 * i5) + (iB - 2)] = b;
        }
        int iB2 = symbolInfo.b() * i8;
        int iE2 = symbolInfo.e() * i9;
        ByteMatrix byteMatrix = new ByteMatrix(symbolInfo.d(), (symbolInfo.e() * i9) + (symbolInfo.e() << 1));
        int i39 = 0;
        int i40 = 0;
        while (i40 < iE2) {
            int i41 = i40 % i9;
            if (i41 == 0) {
                int i42 = 0;
                for (int i43 = 0; i43 < symbolInfo.d(); i43++) {
                    byteMatrix.c(i42, i39, i43 % 2 == 0);
                    i42++;
                }
                i39++;
            }
            int i44 = 0;
            int i45 = 0;
            while (i44 < iB2) {
                int i46 = i44 % i8;
                if (i46 == 0) {
                    byteMatrix.c(i45, i39, true);
                    i45++;
                }
                int i47 = i5;
                byteMatrix.c(i45, i39, bArr[(i40 * i5) + i44] == 1);
                int i48 = i45 + 1;
                if (i46 == i8 - 1) {
                    byteMatrix.c(i48, i39, i40 % 2 == 0);
                    i45 += 2;
                } else {
                    i45 = i48;
                }
                i44++;
                i5 = i47;
            }
            int i49 = i5;
            int i50 = i39 + 1;
            if (i41 == i9 - 1) {
                int i51 = 0;
                for (int i52 = 0; i52 < symbolInfo.d(); i52++) {
                    byteMatrix.c(i51, i50, true);
                    i51++;
                }
                i39 += 2;
            } else {
                i39 = i50;
            }
            i40++;
            i5 = i49;
        }
        int i53 = byteMatrix.b;
        int iMax = Math.max(i, i53);
        int i54 = byteMatrix.c;
        int iMax2 = Math.max(i2, i54);
        int iMin = Math.min(iMax / i53, iMax2 / i54);
        int i55 = (iMax - (i53 * iMin)) / 2;
        int i56 = (iMax2 - (i54 * iMin)) / 2;
        if (i2 < i54 || i < i53) {
            bitMatrix = new BitMatrix(i53, i54);
            i6 = 0;
            i7 = 0;
        } else {
            bitMatrix = new BitMatrix(i, i2);
            i6 = i55;
            i7 = i56;
        }
        int[] iArr4 = bitMatrix.g;
        int length2 = iArr4.length;
        for (int i57 = 0; i57 < length2; i57++) {
            iArr4[i57] = 0;
        }
        int i58 = i7;
        int i59 = 0;
        while (i59 < i54) {
            int i60 = i6;
            int i61 = 0;
            while (i61 < i53) {
                if (byteMatrix.a(i61, i59) == 1) {
                    bitMatrix.g(i60, i58, iMin, iMin);
                }
                i61++;
                i60 += iMin;
            }
            i59++;
            i58 += iMin;
        }
        return bitMatrix;
    }
}
