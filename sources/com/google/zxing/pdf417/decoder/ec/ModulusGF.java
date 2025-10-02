package com.google.zxing.pdf417.decoder.ec;

/* loaded from: classes6.dex */
public final class ModulusGF {
    public static final ModulusGF e = new ModulusGF();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f16210a = new int[929];
    public final int[] b = new int[929];
    public final ModulusPoly c;
    public final ModulusPoly d;

    public ModulusGF() {
        int i = 1;
        for (int i2 = 0; i2 < 929; i2++) {
            this.f16210a[i2] = i;
            i = (i * 3) % 929;
        }
        for (int i3 = 0; i3 < 928; i3++) {
            this.b[this.f16210a[i3]] = i3;
        }
        this.c = new ModulusPoly(this, new int[]{0});
        this.d = new ModulusPoly(this, new int[]{1});
    }

    public final int a(int i) {
        if (i == 0) {
            throw new ArithmeticException();
        }
        return this.f16210a[928 - this.b[i]];
    }

    public final int b(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.b;
        return this.f16210a[(iArr[i] + iArr[i2]) % 928];
    }
}
