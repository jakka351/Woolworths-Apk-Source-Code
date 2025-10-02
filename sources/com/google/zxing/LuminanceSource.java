package com.google.zxing;

import io.jsonwebtoken.JwtParser;

/* loaded from: classes6.dex */
public abstract class LuminanceSource {

    /* renamed from: a, reason: collision with root package name */
    public final int f16128a;
    public final int b;

    public LuminanceSource(int i, int i2) {
        this.f16128a = i;
        this.b = i2;
    }

    public LuminanceSource a(int i, int i2, int i3, int i4) {
        throw new UnsupportedOperationException("This luminance source does not support cropping.");
    }

    public abstract byte[] b();

    public abstract byte[] c(int i, byte[] bArr);

    public boolean d() {
        return false;
    }

    public LuminanceSource e() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i = this.f16128a;
        byte[] bArrC = new byte[i];
        int i2 = this.b;
        StringBuilder sb = new StringBuilder((i + 1) * i2);
        for (int i3 = 0; i3 < i2; i3++) {
            bArrC = c(i3, bArrC);
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = bArrC[i4] & 255;
                sb.append(i5 < 64 ? '#' : i5 < 128 ? '+' : i5 < 192 ? JwtParser.SEPARATOR_CHAR : ' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
