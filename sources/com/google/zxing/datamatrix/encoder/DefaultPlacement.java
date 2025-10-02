package com.google.zxing.datamatrix.encoder;

import java.util.Arrays;

/* loaded from: classes6.dex */
public class DefaultPlacement {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f16163a;
    public final int b;
    public final int c;
    public final byte[] d;

    public DefaultPlacement(String str, int i, int i2) {
        this.f16163a = str;
        this.c = i;
        this.b = i2;
        byte[] bArr = new byte[i * i2];
        this.d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    public final void a(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.b;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        int i6 = this.c;
        if (i2 < 0) {
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        this.d[(i * i6) + i2] = (byte) ((this.f16163a.charAt(i3) & (1 << (8 - i4))) == 0 ? 0 : 1);
    }

    public final void b(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        a(i4, i5, i3, 1);
        int i6 = i2 - 1;
        a(i4, i6, i3, 2);
        int i7 = i - 1;
        a(i7, i5, i3, 3);
        a(i7, i6, i3, 4);
        a(i7, i2, i3, 5);
        a(i, i5, i3, 6);
        a(i, i6, i3, 7);
        a(i, i2, i3, 8);
    }
}
