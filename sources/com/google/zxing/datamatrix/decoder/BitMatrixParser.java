package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;

/* loaded from: classes6.dex */
final class BitMatrixParser {

    /* renamed from: a, reason: collision with root package name */
    public final BitMatrix f16154a;
    public final BitMatrix b;
    public final Version c;

    public BitMatrixParser(BitMatrix bitMatrix) throws FormatException {
        int i;
        int i2;
        int i3 = bitMatrix.e;
        if (i3 < 8 || i3 > 144 || (i = i3 & 1) != 0) {
            throw FormatException.a();
        }
        int i4 = bitMatrix.d;
        Version[] versionArr = Version.h;
        if (i != 0 || (i4 & 1) != 0) {
            throw FormatException.a();
        }
        Version[] versionArr2 = Version.h;
        for (int i5 = 0; i5 < 30; i5++) {
            Version version = versionArr2[i5];
            int i6 = version.b;
            if (i6 == i3 && (i2 = version.c) == i4) {
                this.c = version;
                if (bitMatrix.e != i6) {
                    throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
                }
                int i7 = version.d;
                int i8 = version.e;
                int i9 = i6 / i7;
                int i10 = i2 / i8;
                BitMatrix bitMatrix2 = new BitMatrix(i10 * i8, i9 * i7);
                for (int i11 = 0; i11 < i9; i11++) {
                    int i12 = i11 * i7;
                    for (int i13 = 0; i13 < i10; i13++) {
                        int i14 = i13 * i8;
                        for (int i15 = 0; i15 < i7; i15++) {
                            int i16 = ((i7 + 2) * i11) + 1 + i15;
                            int i17 = i12 + i15;
                            for (int i18 = 0; i18 < i8; i18++) {
                                if (bitMatrix.b(((i8 + 2) * i13) + 1 + i18, i16)) {
                                    bitMatrix2.f(i14 + i18, i17);
                                }
                            }
                        }
                    }
                }
                this.f16154a = bitMatrix2;
                this.b = new BitMatrix(bitMatrix2.d, bitMatrix2.e);
                return;
            }
        }
        throw FormatException.a();
    }

    public final boolean a(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        this.b.f(i2, i);
        return this.f16154a.b(i2, i);
    }

    public final int b(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (a(i5, i6, i3, i4) ? 1 : 0) << 1;
        int i8 = i2 - 1;
        if (a(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (a(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (a(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (a(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (a(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (a(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        return a(i, i2, i3, i4) ? i15 | 1 : i15;
    }
}
