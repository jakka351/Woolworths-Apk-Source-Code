package com.google.zxing.pdf417.decoder;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;

/* loaded from: classes6.dex */
final class Codeword {

    /* renamed from: a, reason: collision with root package name */
    public final int f16202a;
    public final int b;
    public final int c;
    public final int d;
    public int e = -1;

    public Codeword(int i, int i2, int i3, int i4) {
        this.f16202a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean a(int i) {
        if (i != -1) {
            return this.c == (i % 3) * 3;
        }
        return false;
    }

    public final void b() {
        this.e = (this.c / 3) + ((this.d / 30) * 3);
    }

    public final String toString() {
        return this.e + lllqqql.c0063ccc0063c + this.d;
    }
}
