package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;

/* loaded from: classes6.dex */
final class BitMatrixParser {

    /* renamed from: a, reason: collision with root package name */
    public final BitMatrix f16221a;
    public Version b;
    public FormatInformation c;
    public boolean d;

    public BitMatrixParser(BitMatrix bitMatrix) throws FormatException {
        int i = bitMatrix.e;
        if (i < 21 || (i & 3) != 1) {
            throw FormatException.a();
        }
        this.f16221a = bitMatrix;
    }

    public final int a(int i, int i2, int i3) {
        boolean z = this.d;
        BitMatrix bitMatrix = this.f16221a;
        return z ? bitMatrix.b(i2, i) : bitMatrix.b(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    public final FormatInformation b() throws FormatException {
        FormatInformation formatInformation = this.c;
        if (formatInformation != null) {
            return formatInformation;
        }
        int iA = 0;
        int iA2 = 0;
        for (int i = 0; i < 6; i++) {
            iA2 = a(i, 8, iA2);
        }
        int iA3 = a(8, 7, a(8, 8, a(7, 8, iA2)));
        for (int i2 = 5; i2 >= 0; i2--) {
            iA3 = a(8, i2, iA3);
        }
        int i3 = this.f16221a.e;
        int i4 = i3 - 7;
        for (int i5 = i3 - 1; i5 >= i4; i5--) {
            iA = a(8, i5, iA);
        }
        for (int i6 = i3 - 8; i6 < i3; i6++) {
            iA = a(i6, 8, iA);
        }
        FormatInformation formatInformationA = FormatInformation.a(iA3, iA);
        if (formatInformationA == null) {
            formatInformationA = FormatInformation.a(iA3 ^ 21522, iA ^ 21522);
        }
        this.c = formatInformationA;
        if (formatInformationA != null) {
            return formatInformationA;
        }
        throw FormatException.a();
    }

    public final Version c() throws FormatException {
        Version version = this.b;
        if (version != null) {
            return version;
        }
        int i = this.f16221a.e;
        int i2 = (i - 17) / 4;
        if (i2 <= 6) {
            return Version.c(i2);
        }
        int i3 = i - 11;
        int iA = 0;
        int iA2 = 0;
        for (int i4 = 5; i4 >= 0; i4--) {
            for (int i5 = i - 9; i5 >= i3; i5--) {
                iA2 = a(i5, i4, iA2);
            }
        }
        Version versionB = Version.b(iA2);
        if (versionB != null && (versionB.f16227a * 4) + 17 == i) {
            this.b = versionB;
            return versionB;
        }
        for (int i6 = 5; i6 >= 0; i6--) {
            for (int i7 = i - 9; i7 >= i3; i7--) {
                iA = a(i6, i7, iA);
            }
        }
        Version versionB2 = Version.b(iA);
        if (versionB2 == null || (versionB2.f16227a * 4) + 17 != i) {
            throw FormatException.a();
        }
        this.b = versionB2;
        return versionB2;
    }

    public final void d() {
        if (this.c == null) {
            return;
        }
        DataMask dataMask = DataMask.values()[this.c.b];
        BitMatrix bitMatrix = this.f16221a;
        int i = bitMatrix.e;
        dataMask.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (dataMask.a(i2, i3)) {
                    bitMatrix.a(i3, i2);
                }
            }
        }
    }
}
