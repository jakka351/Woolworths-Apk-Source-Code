package com.google.zxing.qrcode.encoder;

import java.lang.reflect.Array;

/* loaded from: classes6.dex */
public final class ByteMatrix {

    /* renamed from: a, reason: collision with root package name */
    public final byte[][] f16235a;
    public final int b;
    public final int c;

    public ByteMatrix(int i, int i2) {
        this.f16235a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.b = i;
        this.c = i2;
    }

    public final byte a(int i, int i2) {
        return this.f16235a[i2][i];
    }

    public final void b(int i, int i2, int i3) {
        this.f16235a[i2][i] = (byte) i3;
    }

    public final void c(int i, int i2, boolean z) {
        this.f16235a[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        StringBuilder sb = new StringBuilder((i * 2 * i2) + 2);
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr = this.f16235a[i3];
            for (int i4 = 0; i4 < i; i4++) {
                byte b = bArr[i4];
                if (b == 0) {
                    sb.append(" 0");
                } else if (b != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
